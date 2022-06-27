package bridge;

public class LanguageSelector extends LanguageBridge{
	public LanguageSelector(Languages lang) {
		super(lang);
	}
	
	public void select() {
		lang.setLanguage();
	}

}
