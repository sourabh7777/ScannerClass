package scannerclass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter your First Name");
		String firstName = sc.next();
		
		System.out.println("Please Enter your Last Name");
		String lastName = sc.next();
		
		System.out.println("Please Enter House Number");
		int houseNumber = sc.nextInt();
		
		System.out.println("Please Enter Street name");
		String streetName = sc.nextLine();
		
		System.out.println("Please Enter Street type");
		String streetType = sc.nextLine();
		
		System.out.println("Please Enter City Name");
		String cityName = sc.nextLine();
		
		System.out.println(firstName + "  " + lastName +  " " + houseNumber);
		System.out.println(streetName + "  " + streetType + " " + cityName);
		
		

	}

}
