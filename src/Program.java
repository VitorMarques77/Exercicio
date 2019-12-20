import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Func;
import entities.FuncTerceiro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Func> func = new ArrayList<>();
		System.out.print("Enter the number of employees: ");
		int x = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= x; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char check = sc.nextLine().charAt(0);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if(check=='y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				sc.nextLine();
				func.add(new FuncTerceiro(name, hours, valuePerHour, additionalCharge));
			}
			else {
				func.add(new Func(name, hours, valuePerHour));
			}
			sc.nextLine();
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Func show : func) {
			System.out.println(show);
		}
		sc.close();
	}

}
