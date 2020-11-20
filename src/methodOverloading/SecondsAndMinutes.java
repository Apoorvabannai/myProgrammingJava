package methodOverloading;

public class SecondsAndMinutes {

  public static void main(String[] args) {
    System.out.println(getDurationString(62, 20));

  }

  public static String getDurationString(long minutes, long seconds) {
//    long hours =  minutes/60 + seconds/3600;
     if(minutes>=0 && (seconds >=0 && seconds<=59)){
//      minutes = hours/60;
//      seconds = hours/3600;
    long hours = minutes / 60;
    long remainingMinutes = minutes % 60;

    return hours + " h " + remainingMinutes + "m " + seconds + "s";
  }
    else

   {
    return "invalid value";
   }
 }
//  public static String getDurationString(long seconds){
//    if( seconds >= 0 && seconds <= 59){
//      getDurationString(4);
//    }
//  }
  
}
