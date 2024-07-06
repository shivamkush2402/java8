package java8.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		// Double the Given Number
		Function<Integer, Integer> f1 = n -> n + n;

		// Cube the Given Number
		Function<Integer, Integer> f2 = n -> n * n * n;
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("double : "+f1.apply(n));
		System.out.println("cube   : "+f2.apply(n));
		
		System.out.println("first double then cube : "+f1.andThen(f2).apply(n));
		System.out.println("first cube then double : "+f1.compose(f2).apply(n));
	}

}
