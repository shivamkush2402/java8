package java8.predicate;

import java.util.function.Predicate;

public class PredicatJoinExample {

	public static void main(String[] args) {

		int[] nums = { 0, 5, 4, 10, 12, 15, 17, 20 };

		// To check Number is Even or Odd
		Predicate<Integer> p1 = num -> num > 10;
		Predicate<Integer> p2 = num -> num % 2 == 0;

		System.out.println("All the Even Numbers are : ");
		display(p2, nums);

		System.out.println("All the Odd Numbers are : ");
		display(p2.negate(), nums);

		System.out.println("All the Numbers Greater than 10 are : ");
		display(p1, nums);

		System.out.println("All the Numbers Not Greater than 10 are : ");
		display(p1.negate(), nums);

		System.out.println("All the Numbers Greater than 10 and Even are : ");
		display(p1.and(p2), nums);

		System.out.println("All the Numbers Greater than 10 or Even are : ");
		display(p1.or(p2), nums);

		System.out.println("All the Numbers Greater than 10 and odd are : ");
		display(p1.and(p2.negate()), nums);

	}

	public static void display(Predicate p, int[] nums) {
		for (int n : nums) {
			if (p.test(n)) {
				System.out.println(n);
			}
		}
		System.out.println();
	}
}
