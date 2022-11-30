package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented ?:  ");
		int n = sc.nextInt();

		Rent[] vect = new Rent[10];

		for (int i = 0; i < n; i++) {
			System.out.println("\nRent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();

			vect[roomNumber] = new Rent(name, email, roomNumber);
		}

		System.out.println("\nBusy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {

				System.out.println(vect[i].getRoomNumber() + ": " + vect[i].getName() + ", " + vect[i].getEmail());

			}
		}

		sc.close();

	}

}
