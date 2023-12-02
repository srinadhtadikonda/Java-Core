class MyException extends Exception
{
 int ex;
 
 MyException(int a)
 {
  ex=a;
 }
 
 public String toString()
 {
  return "MyException[" + ex +"] is less than zero";
 }
}

class Test82
{
 static void sum(int a,int b) throws MyException
 {
  if(a<0)
  {
   throw new MyException(a);
  }
  else 
  { 
   System.out.println(a+b); 
  }
 }

 public static void main(String[] args)
 {
  try
  {
   sum(11, 10);
  }
  catch(MyException me)
  {
   System.out.println(me);
  }
 }
}
