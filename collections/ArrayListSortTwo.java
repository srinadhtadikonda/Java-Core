//sorting in Descending Order

import java.util.*;
class ArrayListSortTwo
{
public static void main(String args[])
{
ArrayList<Integer> AT=new ArrayList<Integer>();
AT.add(34);
AT.add(75);
AT.add(64);
AT.add(88);
AT.add(15);
AT.add(99);
System.out.println(AT);
Collections.sort(AT, Collections.reverseOrder());   
System.out.println(AT);
}
}
