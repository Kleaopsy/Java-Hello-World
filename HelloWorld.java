package myProjects;

import java.util.Scanner;

public class HelloWorld {	
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String name = Input.next();
		
		System.out.println("Hello World And Hello " +  name);
	}
}
