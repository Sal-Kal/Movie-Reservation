package decorator;

import java.util.*;

public class Client {
	public static HallDecorator hall;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ch;
		int i = 1;
		String type;
		int n; 
		System.out.println("Enter the type of hall and number of tickets:");
		type = sc.next();
		n = sc.nextInt();
		hall = GetHallObject.getObj(n, type);
		while(i == 1) {
			System.out.println();
			System.out.println("Enter 1 : Calculate Price");
			System.out.println("Enter 2 : Get Price");
			System.out.println("Enter 3 : Get Description");
			System.out.println("Enter 4 : Change Room");
			System.out.println("Enter 5 : Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1:  hall.calculatePrice(); break;
			case 2:  hall.getPrice(); break;
			case 3:  hall.getDescription(); break;
			case 4:  changeRoom(); break;
			case 5:  i = 0; break;
			default: System.out.println("Entered wrong intput"); break;
			}
		}
	}
	public static void changeRoom() {
		String type;
		int n;
		System.out.println("Enter the type of hall and number of tickets:");
		type = sc.next();
		n = sc.nextInt();
		hall = GetHallObject.getObj(n, type);
	}
}

