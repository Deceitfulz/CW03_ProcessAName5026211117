import java.util.Scanner;

public class ProcessAName5026211117 {

	public static void main(String[] args){
		Scanner alpha = new Scanner(System.in);
		System.out.print("Type your name: ");
		
		String name = alpha.nextLine();
		int space = name.indexOf(' ');
		String firstName = name.substring(0,1);
		System.out.println(space);
		String surname = name.substring(space);
		
		System.out.println("Your name is: " +surname+ ", " +firstName+ ".");
	}
}