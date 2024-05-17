import java.lang.*;
import java.util.*;
public class Main {

  public static void main(String[] args) {

    int num, i = 2;
    boolean flag = false;
    Scanner SC=new Scanner(System.in);
    System.out.print("Enter a number..:");
    num=SC.nextInt();
    while (i <= num / 2) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }

      ++i;
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
