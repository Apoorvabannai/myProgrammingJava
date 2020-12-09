package arrayListGrossery;

import java.util.ArrayList;

public class GroceryList {
  // we are creating grocery list where we add, delete, search and check for items
  // step 1: creating a list with type String

 private  ArrayList<String> groceryList = new ArrayList<>();

 // Step 2: create a method called adding groceries to list

  public void addGroceryList (String item){
    groceryList.add(item);
  }
  //  Step 3: create method to print the Grocery List
  public void printGroceryList(){
    System.out.println("You  have "+ groceryList.size()+" items in your Grocery List");
    for(int i = 0; i <groceryList.size();i++){
      System.out.println((i+1)+ "."+ groceryList.get(i));
    }
  }
  //Step 4: create method to modify the grocery list
  public void modifyGroceryList(int position, String newItem){
    groceryList.set(position,newItem);
    System.out.println("The Grocery List "+ (position+1)+ " has been modified");
  }
  //Step 5 : remove one from grocery item
  public void removeGroceryItem(int position){
    String  item = groceryList.get(position);
    groceryList.remove(position);
  }
  // Step 6: find item  or search item (we can use . contains also
  // command hower and click to open the class
  public String  findItem(String  searchItem){
    int position = groceryList.indexOf(searchItem);
    if(position>=0){
      return groceryList.get(position);
    }
    return null;
  }

}
