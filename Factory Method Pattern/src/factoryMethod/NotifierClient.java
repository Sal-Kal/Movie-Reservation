package factoryMethod;

import java.util.*;

public class NotifierClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Notifier n;
		int type;
		int i = 1;
		while(i == 1) {
			System.out.println("Enter the type of notification you want to send");
			System.out.println("Enter 1 : SMS");
			System.out.println("Enter 2 : Email");
			System.out.println("Enter 3 : Exit");
			type = sc.nextInt();
			switch(type) {
			case 1:  n = GetNotifier.getNotifier("sms");
					 sendNotification(n); break;
			case 2:  n = GetNotifier.getNotifier("email");
					 sendNotification(n); break;
			case 3:  i = 0; break;
			default: System.out.println("Entered wrong intput"); break;
			}
		}
		sc.close();
	}
	
	public static void sendNotification(Notifier n) {
		n.notifyUser();
	}
}
