// Last updated: 25/07/2026, 16:26:32
1import java.time.LocalDate;
2import java.time.temporal.ChronoUnit;
3class Solution {
4    public int daysBetweenDates(String date1, String date2) {
5        LocalDate d1 = LocalDate.parse(date1);
6        LocalDate d2 = LocalDate.parse(date2);
7        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
8    }
9}