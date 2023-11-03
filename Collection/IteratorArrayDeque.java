import java.util.*;
 class IteratorArrayDeque {

  public static void main(String args[])
   {
     Deque d=new ArrayDeque();
     d.add(12);
       d.add(34);
       d.add(18);
       d.add(13);
     Iterator i=d.iterator();
       while(i.hasNext())
         {
           System.out.println("After ieration :"+i.next());
         }
 



}
 }