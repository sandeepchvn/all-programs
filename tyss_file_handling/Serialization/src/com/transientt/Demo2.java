package com.transientt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Demo2 {
	public static void main(String[] args) {

		System.out.println("Serialization added");
		try {
			File file = new File("C:\\Users\\sande\\Desktop\\tyss\\person_demo");
			System.out.println("Serialization started");
			FileOutputStream fo=new FileOutputStream(file);
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(new Person(43234, 66));
			oo.flush();
			System.out.println("Serialization added");

			FileInputStream fi=new FileInputStream("C:\\Users\\sande\\Desktop\\tyss\\person_demo");
			ObjectInputStream oi=new ObjectInputStream(fi);
			Person p=(Person)oi.readObject();
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}