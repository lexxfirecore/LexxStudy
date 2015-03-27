package com.lexxstudy.Localizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Triangle {
	@Autowired
	Point pointA;

	public Point getPointA() {
		return pointA;
	}


}
