package com.RegexTest.program;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClassUC11 {
	public boolean Email(String user,String regx) {
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(user);
		System.out.println("The Email ID is :");
		System.out.println(user + "->" + m.matches());
		return m.matches();
	}
}
