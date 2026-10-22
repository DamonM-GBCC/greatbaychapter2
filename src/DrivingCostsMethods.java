import java.util.Scanner;

public class DrivingCostsMethod {

   public double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
      return (drivenMiles / milesPerGallon) * dollarsPerGallon;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double milesPerGallon = scnr.nextDouble();
      double dollarsPerGallon = scnr.nextDouble();

      DrivingCostsMethod car = new DrivingCostsMethod();

      System.out.printf("%.2f %.2f %.2f\n",
              car.drivingCost(10, milesPerGallon, dollarsPerGallon),
              car.drivingCost(50, milesPerGallon, dollarsPerGallon),
              car.drivingCost(400, milesPerGallon, dollarsPerGallon));
   }
}
