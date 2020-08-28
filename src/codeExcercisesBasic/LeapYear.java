package codeExcercisesBasic;

public class LeapYear {
  public static void main(String[] args) {
    isLeapYear(1998);
  }

  public static boolean isLeapYear(int year) {
    if (year > 1 && year <= 9999) {
      if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        System.out.println("The  " + year + " is Leap Year and has 366 Days ");
        return true;
      } else {
        System.out.println("The  " + year + " is not  Leap Year and has 365 Days ");
        return false;
      }

    } else {
      System.out.println("Invalid year and not in range");
      return false;
    }
  }
}