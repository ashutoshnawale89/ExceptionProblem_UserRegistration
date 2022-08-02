package com.RegexProgram;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUC4 {

	public void MobileNumber(ArrayList<String> user,String regx) {
		Pattern p = Pattern.compile(regx);
		for (int i = 0; i < user.size(); i++) {
			Matcher m = p.matcher(user.get(i));
			System.out.print("The MobileNumber is :");
			System.out.println(user.get(i) + "->" + m.matches());
		}
	}
	public static void main(String args[]) {
		ArrayList<String> array = new ArrayList<String>();
		array.add("7776042880");
		array.add("77776655445");
		RegexUC4 obj = new RegexUC4();
		obj.MobileNumber(array,"[0-9]{10}");
	}
}                        





