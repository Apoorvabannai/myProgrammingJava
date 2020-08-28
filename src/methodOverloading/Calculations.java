package methodOverloading;

public class Calculations {
  public static void main(String[] args) {
   calcFeetAndInchesToCentimeters( 3 ,14);
    System.out.println("Inches to Centimeter"+ calcFeetAndInchesToCentimeters(46));
  }
  public static double  calcFeetAndInchesToCentimeters(double feet, double inches){
    if((feet > 0 ) &&  (inches  >= 0 && inches <= 12)){
     // one foot = 12 inches
      // one inch = 2.54 cms
     double centimeters = (feet * 12) *(2.54) + (inches *2.54);
      System.out.println("Centimeters are :"+ centimeters );
      return centimeters;
    }
    else{
      System.out.println("Invalid measurements");
      return -1;
    }
  }
  public static double calcFeetAndInchesToCentimeters(double inches){
    if(inches >= 0) {
      double feet  = inches/12;
      double  remainigInches = inches%12;
      System.out.println("Entered inches is"+ inches + " = "+ feet+" feet"+ remainigInches+ "inches");
      return 1;
    }
    else{
      System.out.println("Invalid measurements");
      return -1;
    }
  }
}
