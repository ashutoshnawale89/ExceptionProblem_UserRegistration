package com.RegexProgram;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexUC3 {
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
		array.add("abc.xyz@bl.co.in");
		array.add("HeighT");
		RegexUC3 obj = new RegexUC3();
		obj.Passwrd(array,"[abc]{3}[.]{1}[xyz]*[@]{1}[bl]{2}[.]{1}[co]{2}[.]{1}[in]*");
	}
} 
