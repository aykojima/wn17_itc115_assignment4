import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {
		//display a welcome message
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		//Create the Grade object
		Grade grade = new Grade();
		String choice = "y";
		while(choice.equalsIgnoreCase("y"))
		{
		//get input from the user
			System.out.println("Enter numerical grade: ");
		//set user input as the number variable
			grade.setNumber(Integer.parseInt(sc.nextLine())); 
		//get letter grade
			grade.getLetter(); 
		//display the output
			String message = "Letter grade: " + grade.getLetter() + "\n";
			System.out.println(message);
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}//end of while loop
		sc.close();
		System.out.println("Bye!");
}// end of main method
	
}//end of class
