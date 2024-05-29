package com.seria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\sande\\Desktop\\tyss\\demoo2");
			System.out.println("Serialization started");
			FileOutputStream fo = new FileOutputStream(file);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(new Car(43234));
			oo.flush();
			System.out.println("Serialization added");
			
			FileInputStream fi=new FileInputStream("C:\\Users\\sande\\Desktop\\tyss\\demoo2");
			ObjectInputStream oi=new ObjectInputStream(fi);
			Car c=(Car)oi.readObject();
			System.out.println(c.price);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
