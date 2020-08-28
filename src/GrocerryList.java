import java.util.ArrayList;

public class GrocerryList {

  private ArrayList<String> groceryList = new ArrayList<String>();
  public void addGroceryItem(String item){
    groceryList.add(item);
  }

  public void printGroceryList(){
    System.out.println("The items you have! :"+ groceryList.size());
    for(int i = 0; i <groceryList.size();i++){
      System.out.println((i+1)+ " ."+ groceryList.get(i));
    }
  }
  // update an item
  public void modifyGroceryItem(int position, String newItem){
    groceryList.set(position, newItem);
    System.out.println("You have modified the Grocery list and added :");
    System.out.println(position+1 + " :" + newItem);
  }

  public void removeGroceryItem(int position){
    String theItem = groceryList.get(position);
     groceryList.remove(position);
  }

  public String findItem(String searchItem){
    //boolean exists = groceryList.contains(searchItem);
     int position = groceryList.indexOf(searchItem); // returns index position of the item
    if(position >= 0 ){
      return groceryList.get(position);
    }
    return null;
  }
}
