package com.RegexProgram;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUC6 {
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
		array.add("Shuteeka");
		array.add("HeighT");
		RegexUC6 obj = new RegexUC6();
		obj.Passwrd(array,"[A-Z]{1}[a-z]{7,}");
	}
}            



