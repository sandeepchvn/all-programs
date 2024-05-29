package assignment.texteditor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TextController {
	LinkedList<String> textList = new LinkedList<String>();
	ArrayList<String> dictionary=new ArrayList<String>();
	public Scanner read = new Scanner(System.in);
	int pointer = -1;

	public void saveText() {
		System.out.println("enter the text");
		String str=read.next();
		while (pointer < textList.size() - 1) 
		{
			textList.removeLast();
		}
		System.out.println("enter 1. for AutoSuggestion 2. for continue without autoSuggest");
		int selection =read.nextInt();
		if(selection==1) 
		{
			textList.add(autoSuggest());
		}
		if(selection == 2) 
		{
			String st=read.nextLine();
			textList.add(str);
		}
		pointer++;
	}

	public void undo() {
		if (pointer >= 0) {
			pointer--;
		}
	}

	public void redo() {
		if (pointer < textList.size() - 1) {
			pointer++;
		}
	}

	public void display() {
		for (int i = 0; i <= pointer; i++) {
			System.out.print(textList.get(i) + "\n");
		}
	}
	public void addWordsToDictionary() {
		System.out.println("enter exit to quit");
		System.out.println("enter the word to add Dictionary");
		
		String str="";
		while(true) {
			str=read.next();
			if(str.equalsIgnoreCase("exit")) 
			{
				break;
			}
			dictionary.add(str);
		}
		System.out.println(dictionary.size()+" words successfully added...!");
	}
	public String autoSuggest() {
		System.out.println("enter the prifix: ");
		String str=read.next();
		int i=0;
		System.out.println("select the word ");
		for(String word:dictionary) {
			i++;
			if(word.startsWith(str)) 
			{
				System.out.println(i+". "+word);
			}
		}
		int c=read.nextInt();
		int re=--c;
		System.out.println(dictionary.get(re));
		return dictionary.get(re);
	}
}