package codeExcercisesBasic;

public class DayOfWeek {
  public static void main(String[] args) {
   printDayOfWeek(8);
  }
  public static void printDayOfWeek(int day){
    switch(day){
      case 0:
        System.out.println(" Its Sunday");
        break;
      case 1:
        System.out.println(" Its Monday");
        break;
      case 2:
        System.out.println(" Its Tuesday");
        break;
      case 3:
        System.out.println(" Its Wednesday");
        break;
      case 4:
        System.out.println(" Its Thrusday");
        break;
      case 5:
        System.out.println(" Its Friday");
        break;
      case 6:
        System.out.println(" Its Saturday");
        break;
      default:
        System.out.println("Invalid day entered");
    }
  }
}
