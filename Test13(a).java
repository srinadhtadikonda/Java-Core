package myjavacodes;

import java.util.*;

public class Test27 {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        
        String ecode;
        int eno;
        String ename;
        double esal;
        float epf;
        char egrade;
        boolean ews;

        System.out.print("Enter Ecode..:");
        ecode = SC.nextLine();

        System.out.print("Enter Eno..:");
        eno = SC.nextInt();
        SC.nextLine(); // consume leftover newline

        System.out.print("Enter Ename..:");
        ename = SC.nextLine();

        System.out.print("Enter Esal..:");
        esal = SC.nextDouble();

        System.out.print("Enter Epf..:");
        epf = SC.nextFloat();

        System.out.print("Enter Egrade..:");
        egrade = SC.next().charAt(0);

        System.out.print("Enter Ews..:");
        ews = SC.nextBoolean();

        System.out.println("----------------------");
        System.out.println("\tEmployee Data");
        System.out.println("----------------------");
        System.out.println("Code=" + ecode);
        System.out.println("Number=" + eno);
        System.out.println("Name=" + ename);
        System.out.println("Salary=" + esal);
        System.out.println("Provident Fund=" + epf);
        System.out.println("Grade=" + egrade);
        System.out.println("Work Status=" + ews);
        System.out.println("----------------------");
    }
}


