package OperatorChallenge;

public class OperatorExample {

  // create double variable with value 20.00
  // create second variable with value 80.00
  // add both variables together and multiply by 100
  // use remainder operator to figure out what remainder from result of operation in step 3 and 40.00
  // create boolean varuable that assigns true if remainder in #4 is 0 or false if not zero
  // Output the boolean variable
  // write if then statement that displays "got some remainder" if boolean in step 5 is not true.

  public static void main(String[] args) {
    double valueOne =20.00;
    double valueTwo = 80.00;
    double third = (valueOne+valueTwo)*100.00;
    double remainder = (int) (third %40.00);
    boolean isRemainder = (remainder == 0)? true: false;
    System.out.println(isRemainder);
    if(!isRemainder){
      System.out.println("got some remainder"+ remainder);
    }
  }
}
