package primitiveCasting;

import java.net.SocketOption;
import java.util.Scanner;

public class Conversion {
  //convert given number of pounds to kilograms
  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the weight in pounds ");
    double weightInPounds = sc.nextDouble();
    double convertedKilograms = weightInPounds * 0.45359237;
    System.out.println("The weight in kilograms is " + convertedKilograms);
  }
}

