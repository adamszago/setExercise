package sistema;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		System.out.println("How many students for course A: ");
		int courseA =  sc.nextInt();
		for (int i = 0; i < courseA; i++) {
			a.add(sc.nextInt());
		}
		
		Set<Integer> b = new HashSet<>();
		System.out.println("How many students for course B: ");
		int courseB =  sc.nextInt();
		for (int i = 0; i < courseB; i++) {
			b.add(sc.nextInt());
		}

		Set<Integer> c = new HashSet<>();
		System.out.println("How many students for course C: ");
		int courseC =  sc.nextInt();
		for (int i = 0; i < courseC; i++) {
			c.add(sc.nextInt());
		}
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total Students: " + total.size());
		
		
		sc.close();
	}

}
