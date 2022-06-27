package bridge;

import java.util.*;
public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LanguageBridge language;
		int ch, i=1;
		while(i == 1) {
			System.out.println();
			System.out.println("Enter 1: English");
			System.out.println("Enter 2: Hindi");
			System.out.println("Enter 3: Kannada");
			System.out.println("Enter 4: Exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1: language = new LanguageSelector(new English());
					set(language); break;
			case 2: language = new LanguageSelector(new Hindi());
					set(language); break;
			case 3: language = new LanguageSelector(new Kannada());
					set(language); break;
			case 4: i = 0; break;
			default: System.out.println("Entered Wrong choice!!"); break;
			}
		}
		sc.close();
	}
	public static void set(LanguageBridge language) {
		language.select();
	}

}
