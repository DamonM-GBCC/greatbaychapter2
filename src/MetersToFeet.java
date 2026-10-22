import java.util.Scanner;

public class MetersToFeet {

   public static double convert(double meters) {
      return meters * 3.28;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double meters = scnr.nextDouble();
      double feet = convert(meters);

      System.out.printf("%.2f", feet);
   }
}