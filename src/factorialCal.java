import java.util.Scanner;

public class factorialCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Greeting
		System.out.println("Welcome to the Factorial Calculator!");
		
		//user input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer that's greater than 0 but less than 10: ");
		int x = input.nextInt();
		
		//call function method
		System.out.println(facMe(x));
		// Do you want to continue loop
		
	}

	// method goes here
	public static int facMe(int x){
		 
		if(x==1){
			return 1;	
		}else{
			return x*(x-1);
		}
	}

	
}
