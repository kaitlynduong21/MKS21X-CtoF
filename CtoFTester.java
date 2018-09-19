public class CtoFTester{
  public static double celsiusToFahrenheit(double tempC){
    return tempC * 1.8 + 32.0;
  }
  public static double fahrenheitToCelsius(double tempF){
    return (tempF + 32.0) * 5.0 / 9.0;
  }
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(43.9));
    System.out.println(celsiusToFahrenheit(-98.5));
    System.out.println(fahrenheitToCelsius(24.94));
    System.out.println(fahrenheitToCelsius(-53.851));
  }
}
