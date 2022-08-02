package com.RegexProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class InvalidNameException extends Exception {

	InvalidNameException(String msg)  {
		System.out.println(msg);
	}
}

public class RegexException      {  
	public void user(String user,String regx, String name)  throws InvalidNameException
	{
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(user); 
		if (m.matches()==false) 
		{
			throw new InvalidNameException("Plese Enter Corrected Format");
		}
		else   {
		    
			System.out.print(name+" : "); 
			System.out.println(user + "->" + m.matches());

		}
	}
	public static void main(String args[])  {   
		RegexException obj = new RegexException();
		try  {
		obj.user("ASHUTOSH","[A-Z]{3,}","First Name");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try  {
			obj.user("NAWALE","[A-Z]{3,}","Last Name");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		try  {
			obj.user("abc.xyz@bl.co.in","[abc]{3}[.]{1}[xyz]*[@]{1}[bl]{2}[.]{1}[co]{2}[.]{1}[in]*","Email ID :");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		try  {
			obj.user("7776042852","[0-9]{10}","Moile Number");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		try  {
			obj.user("ShrurTiKa","[A-Za-z]{8,}","Passaword");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
}
}


                        


