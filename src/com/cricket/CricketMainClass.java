package com.cricket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cricket.modelclass.Cricketer;
import com.cricket.service.CricketService;
import com.cricket.service.CricketServiceImpl;

public class CricketMainClass {

	static CricketService cricketService = new CricketServiceImpl();

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			List<Cricketer> list = new ArrayList<>();
			sc = new Scanner(System.in);

			System.out.println("Enter number of cricketer.");
			int size = sc.nextInt();

			for (int i = 0; i < size; i++) {

				System.out.println("Enter Cricket Id : ");
				long id = sc.nextLong();

				System.out.println("Enter Cricketer Name :");
				String name = sc.next();

				System.out.println("Enter Team Name :");
				String teamName = sc.next();

				System.out.println("Enter Cricketer Birth Date :");
				String birthDate = sc.next();

				System.out.println("Enter Cricket Phone Number : ");
				long pNumber = sc.nextLong();

				System.out.println("Enter Type of Cricketer :");
				String typeOfCricketer = sc.next();

				Cricketer cricketer = new Cricketer(id, name, teamName, birthDate, pNumber, typeOfCricketer);
				list.add(cricketer);
			}
			boolean isAdded = cricketService.addListOfCricketer(list);

			if (isAdded) {
				System.out.println("\n Added Successfully");
			} else {
				System.out.println("Something want to wrong");
				System.exit(0);
			}

			while (true) {
				System.out.println("\n Enter a choice");
				System.out.println("1.Get Cricketer Bases on type  2.Enter any number to exit");
				int num = sc.nextInt();

				if (num == 1) {
					System.out.println("\n Enter Type of Cricketer to get Cricketer");
					System.out.println("1.Batsman  2.Bowler");
					int choice = sc.nextInt();
					List<Cricketer> listOfCricketerByType = null;
					switch (choice) {
					case 1:
						listOfCricketerByType = cricketService.getListOfCricketerByType("Batsman");
						break;

					case 2:
						listOfCricketerByType = cricketService.getListOfCricketerByType("Bowler");
						break;

					default:
						System.out.println("Enter valid number");
						break;
					}

					for (Cricketer cricketer : listOfCricketerByType) {
						System.out.println(cricketer);
					}

				} else {
					System.exit(0);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null)
				sc.close();
		}

	}

}
