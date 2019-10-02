import java.lang.Math;

 import java.util.Scanner;



 public class sr2 {



     public static void main(String[] args) {

         Scanner in = new Scanner(System.in);




                  System.out.print("Enter a diameter: ");

                  double diameter = in.nextDouble();

                  double radius = diameter/2;







                  double circArea = Math.PI*Math.pow(radius, 2);









                  System.out.printf("\nThe area of a circle with a diameter of "+diameter+" is %.2f.\n", circArea);



   in.close();

 }
}
