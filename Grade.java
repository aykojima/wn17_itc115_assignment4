import java.util.Scanner;

public class Grade {
//	This application should use a class named Grade to store the data for each grade. 
//  This class should include these three methods:
//	void setNumber(int number)
//	int getNumber()
//	String getLetter()

	//the instance variables
	
	private int number = 0;
	private String grade;
	//the constructor
	
	//the set and get methods for the number variable
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	
	//getLetter method
	public String getLetter(){
		
		if (number >=88)
		{
			grade = "A";
		}else if (number >=80)
		{
			grade = "B";
		}else if (number >=67)
		{
			grade = "C";
		}else if (number >=60)
		{
			grade = "D";
		}else
		{
			grade = "F";
		}//end of if statement
		return grade;
		}//end of getLetter method
	
}//end of class
