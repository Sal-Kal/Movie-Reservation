package facade;

import java.util.*;

public class TheatreManager {
	public static Theatre theatreObj = new Theatre();
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int ch, i=1;
		while(i == 1) {
			System.out.println();
			System.out.println("Enter 1: Projector");
			System.out.println("Enter 2: Popcorn Machine");
			System.out.println("Enter 3: Sound System");
			System.out.println("Enter 4: Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1: projector(); break;
			case 2: popcorn(); break;
			case 3: sound(); break;
			case 4: i = 0; break;
			default: System.out.println("Entered Wrong choice!!"); break;
			}
		}
	}
	
	public static void projector() {
		int ch, i=1;
		while(i == 1) {
			System.out.println("Enter 1: Start");
			System.out.println("Enter 2: Pause");
			System.out.println("Enter 3: Stop");
			System.out.println("Enter 4: Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1: theatreObj.startProjector(); break;
			case 2: theatreObj.pauseProjector(); break;
			case 3: theatreObj.stopProjector(); break;
			case 4: i = 0; break;
			default: System.out.println("Entered Wrong choice!!"); break;
			}
		}
	}

	public static void popcorn() {
		int ch, i=1;
		while(i == 1) {
			System.out.println("Enter 1: Start");
			System.out.println("Enter 2: Pause");
			System.out.println("Enter 3: Stop");
			System.out.println("Enter 4: Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1: theatreObj.startPopcorn(); break;
			case 2: theatreObj.pausePopcorn(); break;
			case 3: theatreObj.stopPopcorn(); break;
			case 4: i = 0; break;
			default: System.out.println("Entered Wrong choice!!"); break;
			}
		}
	}

	public static void sound() {
		int ch, i=1;
		while(i == 1) {
			System.out.println("Enter 1: Start");
			System.out.println("Enter 2: Pause");
			System.out.println("Enter 3: Stop");
			System.out.println("Enter 4: Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1: theatreObj.startSound(); break;
			case 2: theatreObj.pauseSound(); break;
			case 3: theatreObj.stopSound(); break;
			case 4: i = 0; break;
			default: System.out.println("Entered Wrong choice!!"); break;
			}
		}
	}
}
