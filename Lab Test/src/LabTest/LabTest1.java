package LabTest;

import java.util.Scanner;
public class LabTest1 {
	
	private static Scanner input;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Question 1");
		System.out.print("Enter the number of items: ");
		int items = input.nextInt();
		
		System.out.print("Enter the price of first item: RM");
		int item1 = input.nextInt();
		System.out.print("Enter quantity of first item: ");
		int Q_item1 = input.nextInt();
		System.out.println();
		
		System.out.print("Enter price of second item: ");
		int item2 = input.nextInt();
		System.out.print("Enter quantity of second item: ");
		int Q_item2 = input.nextInt();
		System.out.println();
		
		
		System.out.print("Enter price of third item: ");
		int item3 = input.nextInt();
		System.out.print("Enter quantity of third item: ");
		int Q_item3 = input.nextInt();
		System.out.println();
		
		//totalprice
		double total1 = (item1 * Q_item1);
		double total2 = (item2 * Q_item2);
		double total3 = (item3 * Q_item3);
		double total = (total1 + total2 + total3);
		System.out.println("Total price: RM" + total);
		
		//Discount
		if (total > 100) {
			double discount = total * 0.2;
			double totalprice = (total - discount);
			System.out.println("Discount received: RM" + discount );
			System.out.println("price to be paid: RM" + totalprice);
		}
			else {
				//totalprice
				double discount = total * 0.1;
				double totalprice = (total - discount);
				System.out.println("Discount received: RM" + discount );
				System.out.println("price to be paid: RM" + totalprice);

			}
		
	
		
		//2
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		System.out.println("Question 2");
		System.out.print("Enter sales: RM");
		double SalesVolume = input.nextInt();
		
		System.out.print("Enter hours worked: ");
		double HoursWorked = input.nextDouble();
	
		if
			(150 <= SalesVolume && 300 >= SalesVolume) {
			double commission = (SalesVolume * 0.05);
			double DailyWages = ((HoursWorked * 5) + commission);
			System.out.println();
			System.out.println("Commission: RM" + commission);
			System.out.println("Daily wages: RM" + DailyWages);
			
		}
		if  (301 <= SalesVolume && 500 >= SalesVolume) {
			double commission = (SalesVolume * 0.10);
			double DailyWages = ((HoursWorked * 5) + commission);
			System.out.println();
			System.out.println("Commission: RM" + commission);
			System.out.println("Daily wages: RM" + DailyWages);
			
		}
		else if (SalesVolume > 500) {
			double commission = (SalesVolume * 0.15);
			double DailyWages = ((HoursWorked * 5) + commission);
			System.out.println();
			System.out.println("Commission: RM" + commission);
			System.out.println("Daily wages: RM" + DailyWages);
			
		}
		
	}
}



