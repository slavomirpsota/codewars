/*
Make a program for calculating factorial using recursion.
Constrains are input number are in interval <2,20>;
*/


import java.io.*;
import java.util.Scanner;

public class recursionFactorial {
	static long solution(long n){
	if(n > 1) {
		return n * solution(n - 1);
	}else {
		return n;
	}
	}

public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter number you want factorial of: ");
	while(scanner.hasNext()){
	System.out.println(solution(scanner.nextInt()));
	System.out.println("Enter number you want factorial of: ");
	}
}
}
