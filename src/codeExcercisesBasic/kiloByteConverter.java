package codeExcercisesBasic;

public class kiloByteConverter {
 /* Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

  The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

  Then it needs to print a message in the format "XX KB = YY MB and ZZ KB"

  For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB" */
 public static void main(String[] args) {
   printMegaBytesAndKiloBytes(-90);
 }
 public static void printMegaBytesAndKiloBytes(int kiloBytes){
   if(kiloBytes <=  0){
     System.out.println("invalid Value");
   }
   else {
     int TotalmegaBytes = 1024 * kiloBytes;
     int megaBytes = kiloBytes / 1024;
     int remainder = kiloBytes % 1024;
     System.out.println(kiloBytes + " KB =" + megaBytes + "MB" + " and " + remainder + "KB");
   }
 }
}
