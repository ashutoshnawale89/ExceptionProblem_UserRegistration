package com.RegexProgram;
import java.util.ArrayList;
import java.util.regex.*;
public class RegexUC1 {

	public void firstname(ArrayList<String> user,String regx) {
		Pattern p = Pattern.compile(regx);
		for (int i = 0; i < user.size(); i++) {
			Matcher m = p.matcher(user.get(i));
			System.out.println("The Last name is :");
			System.out.println(user.get(i) + "->" + m.matches());

		}
	}
	public static void main(String args[]) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("NAWALE");
		array.add("Height");
		RegexUC1 obj = new RegexUC1();
		obj.firstname(array,"[A-Z]{3,}");
	}
}                        

