package codeExcercisesBasic;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class MinutesToYears {
  public static void main(String[] args) {
    printYearsAndDays(1051200);
  }



  public static void printYearsAndDays(long minutes){
    if(minutes < 0 ){
     System.out.println("Invalid Value");
    }
    else{

     long hours = minutes/60;
      long days = hours/24;
      long years = days/365;
      long remainingDays = days % 365;

      System.out.println(minutes + " minutes is " + years+ " y and "  +  remainingDays + " d ");
    }

  }


}
