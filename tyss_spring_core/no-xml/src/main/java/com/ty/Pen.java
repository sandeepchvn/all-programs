package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {

	int price;

	public Pen(@Value(value = "67")int price) {
		this.price = price;
	}
}
