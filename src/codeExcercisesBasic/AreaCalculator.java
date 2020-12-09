package codeExcercisesBasic;

public class AreaCalculator {
  public static void main(String[] args) {

  }
  public static double area(double radius){
    if(radius <0){
      return -1.0;
    }
    else{
        return (radius*radius)* Math.PI;
    }
  }public static double are(double x, double y){
    if(x < 0 || y < 0){
      return -1.0;
    }
    else{
      return x*y;
    }
  }

}
