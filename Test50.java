package corejavaprograms;
import java.lang.*;
import java.util.*;
import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		String str1="state bank of india";
		String str2="SHAR";
		String str3="Liril";
		String str4="   Nepal   ";
		System.out.println("string1="+str1);
		System.out.println("String2="+str2);
		System.out.println("String3="+str3);
		System.out.println("Length of S1="+str1.length());
		System.out.println("Length of S1="+str1.toUpperCase());
		System.out.println("Length of S2="+str2.toLowerCase());
		System.out.println("Length of S1="+str1.charAt(2));
		System.out.println("Replace="+str3.replace('l','x'));
		System.out.println("index="+str1.indexOf('c'));
		System.out.println("substring="+str1.substring(0,3));
		System.out.println("contains="+str1.contains("state"));
		System.out.println("Concatiation="+str1.concat(str2));
		System.out.println("EndsWidth="+str1.endsWith("ia"));
		System.out.println("Trim="+str4.trim());
		System.out.println("Starts With="+str1.startsWith("state"));
		
		}
}

