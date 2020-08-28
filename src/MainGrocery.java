import java.util.ArrayList;
import java.util.Scanner;

public class MainGrocery {
  private static Scanner scanner = new Scanner(System.in);
  private static GrocerryList grocerryList = new GrocerryList();

  public static void main(String[]args){
    boolean quit = false;
    int choice = 0;
    printInstructions();
    while(!quit){
      System.out.println("Enter the choice:");
      choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice){
        case 0:
          printInstructions();
          break;
        case 1:
          grocerryList.printGroceryList();
          break;
        case 2 :
          addItem();
          break;
        case 3:
          modifyItem();
          break;
        case 4:
          removeItem();
          break;
        case 5:
          searchForItem();
        case 6:
          quit = true;
          break;
      }
    }
  }

  public static  void printInstructions(){
    // Use loggers
    System.out.println("\n press");
    System.out.println("\t 0 - To print choice items ");
    System.out.println("\t 1 - To print list of Grocery  items ");
    System.out.println("\t 2 - To add item to the list ");
    System.out.println("\t 3 - To modify item to the list");
    System.out.println("\t 4 - To remove an item from grocery list");
    System.out.println("\t 5 - To  search for item in the list ");
    System.out.println("\t 6 - To  quit the application");

  }
  public static void addItem(){
    System.out.print("Please enter the Grocery item");
    grocerryList.addGroceryItem(scanner.nextLine());
    scanner.nextLine();
  }
  public static void modifyItem(){
    System.out.print("Enter the item  number");
    int itemNo = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the replacement item.");
    String newItem = scanner.nextLine();
    grocerryList.modifyGroceryItem(itemNo-1,newItem);
  }
  public static void removeItem(){
    System.out.print("Enter the item  number");
    int itemNo = scanner.nextInt();
    scanner.nextLine();
    grocerryList.removeGroceryItem(itemNo-1);
  }
  public static void searchForItem(){
    System.out.println("Enter the item");
    String searchItem = scanner.nextLine();
    if(grocerryList.findItem(searchItem) != null){
      System.out.println("Found"+ searchItem+"in the list");
    } else{
      System.out.println(searchItem+" didnt find the item in the Grocery list");
    }
  }

}
