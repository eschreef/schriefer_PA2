package schriefer_p1;
import java.util.Scanner;

public class Application
{
	public static void main(String[] args)
	{	
		//creates an empty array for the user to fill
		int[] arr = new int[4];
				
		//prompts the user to enter a 4 digit number
		System.out.print("Enter a 4 digit number with spaces: ");
		
		//reads in a 4 digit number from the user and fills the array
		Scanner userInput = new Scanner(System.in);
		for(int x = 0; x < 4; x++)
		{
			arr[x] = userInput.nextInt();
		}
		
		//runs encryption and decryption
		Encryption.encrypt();
		Decryption.decrypt();
	}
}
