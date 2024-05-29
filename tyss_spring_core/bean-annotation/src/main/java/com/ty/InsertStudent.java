package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "in")
public class InsertStudent {
	@Autowired
	Student student;
}
