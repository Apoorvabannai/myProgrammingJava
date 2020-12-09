import java.util.Scanner;

public class MinimumElementChallenge {
  private static Scanner sc = new Scanner(System.in);

  public static  int[] readIntegers(int count) {
    int[] arrayStore = new int[count];

    for (int i = 0; i < arrayStore.length; i++) {
      System.out.println("Enter the array element");
       int  integer = sc.nextInt();

      sc.nextLine();
      arrayStore[i] = integer;
    }
    return  arrayStore;

  }
   public  static int  findMin(int[] arrayStore) {
    int min = Integer.MAX_VALUE;
    for(int i = 0; i <arrayStore.length;i++){
      int value = arrayStore[i];
      if(value < min){
        min = arrayStore[i];
      }
    }
    return min;
   }


  public static void main(String[]args){
    System.out.println("Enter Count ");
    int count = sc.nextInt();
    sc.nextLine();
    int [] returned =  readIntegers(5);
     int minnumber =   findMin(returned);
       System.out.println(minnumber);
  }

}
