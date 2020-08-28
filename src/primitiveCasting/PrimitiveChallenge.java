package primitiveCasting;

public class PrimitiveChallenge {
  public static void main(String[]args){
    byte myByteValue = 4;
    short myShortValue = 10;
    int myIntValue = 200;
    long myLongValve = 50000L+ 10L*(myByteValue+ myShortValue+ myIntValue);
    System.out.println("The long value is "+myLongValve);
    byte newByte = (byte) (myByteValue+myShortValue*(1000+50));
    // here we have to type cast explicitly.
    // we dont have to mention double, in case of float we have to mention 10f

  }
}