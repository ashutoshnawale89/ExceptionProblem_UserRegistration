package com.RegexProgram;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUC5 {
	public void Passwrd(ArrayList<String> user,String regx) {
		Pattern p = Pattern.compile(regx);
		for (int i = 0; i < user.size(); i++) {
			Matcher m = p.matcher(user.get(i));
			System.out.println("The Passwrd is :");
			System.out.println(user.get(i) + "->" + m.matches());

		}
	}
	public static void main(String args[]) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("ShRutika");
		array.add("He2ight");
		RegexUC5 obj = new RegexUC5();
		obj.Passwrd(array,"[A-Za-z]{8,}");
	}
}            

