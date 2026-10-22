import java.util.Scanner;

public class CelsiusToKelvin {

   public static double convert(double degreesCelsius) {
      return degreesCelsius + 273.15;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double degreesCelsius = scnr.nextDouble();
      double kelvin = convert(degreesCelsius);

      System.out.printf("%.2f", kelvin);
   }
}
