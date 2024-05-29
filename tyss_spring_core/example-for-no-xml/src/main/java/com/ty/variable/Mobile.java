package com.ty.variable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value(value = "899")
	public int price;
}
