package com.lexxstudy.Localizer;

import org.springframework.stereotype.Component;

@Component
public class LocalizerImpl implements Localizer {

	private String Strings;

	@Override
	public String getStrings(String message) {
		this.Strings = getBundle(message);
		return "String is " + this.Strings;
	}

	@Override
	public void setStrings(String message) {
		this.Strings = message;
		setBundle(message);
	}

	private String getBundle(String key) {
		return "RU(" + key + ")";
	}

	private void setBundle(String key) {
		System.out.println("bundle set " + key);
	}

}
