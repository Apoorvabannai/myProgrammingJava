import java.sql.Array;
import java.util.Scanner;

public class ArraysSortingWithMethods {
 private static Scanner sc = new Scanner(System.in);


  public static void main(String[]args) {
    int[] values = getIntegersValue(5);


  }
    public static int[] getIntegersValue ( int numbers){
      int[] array = new int[numbers];
      System.out.println("Enter the numbers  \r");
      for (int i = 0; i < numbers; i++) {
        array[i] = sc.nextInt();
      }
      return array;
    }
    public static void printArray ( int[] array){
      for (int i = 0; i < array.length; i++) {
        System.out.println("The element is " + array[i]);
      }
    }
//    public int[] sortIntegers(int[] array){
//      for (int i = 0; i < array.length; i++) {
//        System.out.println("The element is " + array[i]);
//        if (array[i] < array[i + 1]) {
//          int temp = array[i + 1];
//          array[i + 1] = array[i];
//          array[i] = temp;
//        }
//        return array;
//      }
//      return array;
//  }
}
