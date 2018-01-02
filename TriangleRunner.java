//Tsagan Garyaeva
//COMP-271
//lab 3 triangle


package java271;
import java.util.Scanner;
public class TriangleRunner{

	public static void main(String[] args) {
		
	
	
	
	
	@SuppressWarnings("resource")
	Scanner myScanner = new Scanner(System.in);
	System.out.println(" Please, enter a digit for side 1: ");
	double side1 = myScanner.nextDouble();
	
	System.out.println(" Please, enter a digit for side 2: ");
	double side2 = myScanner.nextDouble();
	
	
	System.out.println(" Please, enter a digit for side 3: ");
	double side3 = myScanner.nextDouble();
	
	
	System.out.println(" Please, enter color: ");
	String color= myScanner.next();
	
	System.out.println(" Is Triangle filled (true or false): ");
	boolean filled = myScanner.nextBoolean();
	
	Triangle myTr = new Triangle(side1, side2, side3);

	myTr.setFilled(filled );
	myTr.setColor(color);
	
	System.out.println(myTr.toString() + "\nArea is "+ myTr.getArea() +
	"\nPerimeter is "  + myTr.getPerimeter());
	
	
	
    System.out.println("The Triangle's Color is " + myTr.getColor().toUpperCase());
    System.out.printf("Is the Triangle filled? " + myTr.isFilled());
	
	
	}

}
