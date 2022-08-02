package com.RegexProgram;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUC2 {

	public void Lastname(ArrayList<String> user,String regx) {
		Pattern p = Pattern.compile(regx);
		for (int i = 0; i < user.size(); i++) {
			Matcher m = p.matcher(user.get(i));
			System.out.println("The Last name is :");
			System.out.println(user.get(i) + "->" + m.matches());
		}
	}
	public static void main(String args[]) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("ASHU");
		array.add("Height");
		RegexUC2 obj = new RegexUC2();
		obj.Lastname(array,"[A-Z]{3,}");
	}
}                        


