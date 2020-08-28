package codeExcercisesBasic;

public class DogBarking {
  public static void main(String[] args) {
    shouldWakeUp(false, 7);
  }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
      if(hourOfDay < 8 && ( hourOfDay == 23) && barking == true){
        System.out.println("The dog is barking");
        return  true;
      }
      else if((hourOfDay < 0 )&& (hourOfDay > 23) && barking == false){
        System.out.println("Invalid hour of day");
        return false;
      }
      else if (  hourOfDay <8 && hourOfDay > 22 && barking == false) {
        System.out.println("The dog is not barking");
        return false;
      }
      else{
        System.out.println("Dog is not barking  as the day of hour is "+ hourOfDay +" its  wake up condition is "+barking);
        return false;
      }
    }
}
