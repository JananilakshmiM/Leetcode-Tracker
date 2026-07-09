// Last updated: 09/07/2026, 15:08:03
import java.util.*;

class Encrypter {

    private Map<Character, String> enc = new HashMap<>();
    private Map<String, List<Character>> dec = new HashMap<>();
    private Map<String, Integer> freq = new HashMap<>();

    public Encrypter(char[] keys, String[] values, String[] dictionary) {

        for (int i = 0; i < keys.length; i++) {
            enc.put(keys[i], values[i]);
            dec.computeIfAbsent(values[i], k -> new ArrayList<>()).add(keys[i]);
        }
        for (String word : dictionary) {
            String e = encrypt(word);
            if (!e.isEmpty()) {
                freq.put(e, freq.getOrDefault(e, 0) + 1);
            }
        }
    }

    public String encrypt(String word1) {
        StringBuilder sb = new StringBuilder();

        for (char c : word1.toCharArray()) {
            if (!enc.containsKey(c)) return "";
            sb.append(enc.get(c));
        }

        return sb.toString();
    }

    public int decrypt(String word2) {
        return freq.getOrDefault(word2, 0);
    }
}
/**
 * Your Encrypter object will be instantiated and called as such:
 * Encrypter obj = new Encrypter(keys, values, dictionary);
 * String param_1 = obj.encrypt(word1);
 * int param_2 = obj.decrypt(word2);
 */