package codeExcercisesBasic;

public class DecimalComparrator {
  /*Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to
 three decimal places.
 Otherwise, return false.
   */

  public static void main(String[] args) {
    System.out.println(areEqualByThreeDecimalPlaces( 3.176, 3.175));
  }
  public static boolean areEqualByThreeDecimalPlaces(double first, double second){
    first = (int)(first * 1000); // int(first)*1000 -> means it would consider int for 3.175 as 3 and 3.176 as 3 which is wrong.
    System.out.println(first);
    second = (int)( second*1000);
    System.out.println(second);
    if(first == second){
      return true;
    }
    else{
      return false;
    }
  }
}
