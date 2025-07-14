package corejavaprograms;

class InvalidAgeException extends Exception
{
	public String toString()
	{
		return "You Are Not Eligible To Vote";
		
	}
}
class Test 
{
void ageCheck(int age) throws InvalidAgeException
{
	if(age<18)
{
		throw new InvalidAgeException();
}
else
{
	System.out.println("You Are  Eligible To Vote");
}
}
}
class CheckAge
{
public static void main(String args[])
{
Test T=new Test();
	try
	{
		T.ageCheck(5);
	}catch(InvalidAgeException ie)
	{
		System.out.println(ie);
	}
	}
}
---------------------------------------------------------------------------------------

InvalidAgeException.java

package corejavaprograms;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception
{
	public String toString()
	{
		return "You Are Not Eligible To Vote";
		
	}
}


Test.java

package corejavaprograms;

public class Test 
{
void ageCheck(int age) throws InvalidAgeException
{
	if(age<18)
{
		throw new InvalidAgeException();
}
else
{
	System.out.println("You Are  Eligible To Vote");
}
}
}

CheckAge.java

package corejavaprograms;

class CheckAge
{
public static void main(String args[])
{
Test T=new Test();
	try
	{
		T.ageCheck(5);
	}catch(InvalidAgeException ie)
	{
		System.out.println(ie);
	}
	}
}

