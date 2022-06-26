package factoryMethod;

public class GetNotifier {
	public static Notifier getNotifier(String type) {
		if(type == null) {
			return null;
		}
		if(type.equalsIgnoreCase("sms")) {
			return new SMS();
		}
		if(type.equalsIgnoreCase("email")) {
			return new Email();
		}
		return null;
	}
}
