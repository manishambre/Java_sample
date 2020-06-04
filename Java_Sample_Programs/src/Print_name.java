import java.util.Scanner;

public class Print_name {

	private static Scanner input_variable;

	public static void main(String[] args) {
		
		input_variable = new Scanner (System.in);
		
		System.out.println("Input your first name :");
		String fname = input_variable.next();
		
		System.out.println("Input your last name : ");
		String lname = input_variable.next();
		
		System.out.println("\n Welcome " + fname + " " + lname);
		
		

	}

}
