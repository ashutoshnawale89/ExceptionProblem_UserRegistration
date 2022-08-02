package com.RegexTest.program;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexClass {
	public boolean Firstname(String user,String regx) {
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(user);
		//System.out.println("The First name is :");
		//	System.out.println(user + "->" + m.matches());
		return m.matches();
	}

	public boolean Laststname(String user,String regx) {
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(user);
		//System.out.println("The First name is :");
		//		System.out.println(user + "->" + m.matches());
		return m.matches();
	}
	public boolean Email(String user,String regx) {
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(user);
		//System.out.println("The First name is :");
		//		System.out.println(user + "->" + m.matches());
		return m.matches();
	}
	public boolean Mobile(String user,String regx) {
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(user);
		//System.out.println("The First name is :");
		//		System.out.println(user + "->" + m.matches());
		return m.matches();
	}
	public boolean Passwrd(String user,String regx) {
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(user);
		//System.out.println("The First name is :");
		//		System.out.println(user + "->" + m.matches());
		return m.matches();
	}
}    
