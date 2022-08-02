package com.RegexProgram;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexUC9 {
	public void Passwrd(ArrayList<String> user,String regx) {
		Pattern p = Pattern.compile(regx);
		for (int i = 0; i < user.size(); i++) {
			Matcher m = p.matcher(user.get(i));
			//	System.out.print("The Passwrd is :");
			System.out.println("  "+user.get(i) + "->" + m.matches());

		}
	}
	public static void main(String args[]) {
		ArrayList<String> array = new ArrayList<String>();
		RegexUC9 obj = new RegexUC9();

		System.out.println("Check Email 1st Passwrd is");
		array.add("abc@yahoo.com");
		obj.Passwrd(array,"[abc]{3}[@]{1}[yahoo]{5}[.]{1}[com]{3}");

		System.out.println("Check Email 2nd  Passwrd is");
		array.add("abc-100@yahoo.com");
		obj.Passwrd(array,"[abc]{3}[-]{1}[100]{3}[@]{1}[yahoo]{5}[.]{1}[com]{3}");

		System.out.println("Check Email 3rd  Passwrd is");
		array.add("abc.100@yahoo.com");
		obj.Passwrd(array,"[abc]{3}[.]{1}[100]{3}[@]{1}[yahoo]{5}[.]{1}[com]{3}");

		System.out.println("Check Email 4rth  Passwrd is");
		array.add("abc111@abc.com");
		obj.Passwrd(array,"[abc]{3}[1]{3}[@]{1}[abc]{3}[.]{1}[com]{3}");

		System.out.println("Check Email 5th  Passwrd is");
		array.add("abc-100@abc.net");
		obj.Passwrd(array,"[abc]{3}[-]{1}[100]{3}[@]{1}[abc]{3}[.]{1}[net]{3}");

		System.out.println("Check Email 6th  Passwrd is");
		array.add("abc.100@abc.com.au");
		obj.Passwrd(array,"[abc]{3}[.]{1}[100]{3}[@]{1}[abc]{3}[.]{1}[com]{3}[.]{1}[au]{2}");

		System.out.println("Check Email 7th  Passwrd is");
		array.add("abc@1.com");
		obj.Passwrd(array,"[abc]{3}[@]{1}[1]{1}[.]{1}[com]{3}");

		System.out.println("Check Email 8th  Passwrd is");
		array.add("abc@gmail.com.com");
		obj.Passwrd(array,"[abc]{3}[@]{1}[gmail]{5}[.]{1}[com]{3}[.]{1}[com]{3}");

		System.out.println("Check Email 9th  Passwrd is");
		array.add("abc+100@gmail.com");
		obj.Passwrd(array,"[abc]{3}[+]{1}[100]{3}[@]{1}[gmail]{5}[.]{1}[com]{3}");

	}
}            






