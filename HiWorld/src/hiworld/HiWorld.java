package hiworld;

import java.io.IOException;
import java.util.Scanner;

public class HiWorld {

	public static void main(String[] args) throws IOException {
		boolean exit=true;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while (exit){
			System.out.println("hello world");
			if (input.nextLine().equals("a")){ 
				System.out.println("Exit");
				exit=false;}
		}

	}

}
