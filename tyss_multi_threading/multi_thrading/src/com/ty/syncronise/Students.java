package com.ty.syncronise;

public class Students extends Thread {
	String name;
	Trainer trainer;

	Students(String name, Trainer trainer) {
		this.name = name;
		this.trainer = trainer;
	}

	@Override
	public void run() {
		Trainer.askQ(name);
	}
}