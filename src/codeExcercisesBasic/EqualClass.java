package codeExcercisesBasic;

public class EqualClass {

  /*Write a method hasEqualSum with 3 parameters of type int.
The method should return boolean and it needs to return true if the sum of the first
and second parameter is equal to the third parameter. Otherwise, return false. */

  public static void main(String[] args) {
    System.out.println(hasEqualSum(1,-2,-1));
    System.out.println("Has teen :"+ hasTeen(40,39,17));
    System.out.println("Is Teen: "+ isTeen(79));
  }
  public static boolean hasEqualSum(int numOne, int numTwo, int numThree){
    if(numThree == numOne+numTwo){
      return true;
    }
    else{
      return false;
    }
  }
  /*We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
 Otherwise return false.
   */
  public static boolean hasTeen(int numberOne, int numberTwo, int numberThree){
    if(numberOne >12 && numberOne < 20 || numberTwo >12 && numberTwo < 20 || numberThree > 12 && numberThree < 20){
      return true;
    }
    else{
      return false;
    }
  }
  public static boolean isTeen(int num){
    if(num > 12 && num < 20){
      return true;
    }
    else{
      return false;
    }
  }
}
