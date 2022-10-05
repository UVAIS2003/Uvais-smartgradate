//  2. JAVA PROGRAM TO PRINT AN INTEGER (ENTERED BY THE USER)

package smartgraduates;

import java.util.Scanner;

public class PrintNo2 {
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter a number:");
		int number =reader.nextInt();
		System.out.println("You entered:"+number);
	}

}
