// Last updated: 09/07/2026, 15:06:54
class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double Fahrenheit = celsius * 1.80 + 32.00;
        return new double[] {kelvin, Fahrenheit};
        
    }
}