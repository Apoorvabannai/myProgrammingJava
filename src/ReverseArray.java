import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
  private static Scanner  sc = new Scanner(System.in);
  public static void main(String[]args) {
  int [] array = {1,3,5,7,8};
  System.out.println("The array before sorting is "+ Arrays.toString(array));
  reverse(array);
  System.out.println("The reverse array is "+ Arrays.toString(array));

  }
  public static  void reverse(int[]array){
    int maxIndex = array.length-1;
    int halfLength = array.length/2;
    for(int i = 0; i <halfLength; i++){
      int temp = array[i];
      array[i] = array[maxIndex-i];
      array[maxIndex -i] = temp;
    }
  }
}
