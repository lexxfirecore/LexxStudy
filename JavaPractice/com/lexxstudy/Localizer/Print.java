package com.lexxstudy.Localizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Print {
	@Autowired
	private Localizer bean;

	public void Write() {

		System.out.println(bean.getStrings("aaassssdddfff"));
	}
}
