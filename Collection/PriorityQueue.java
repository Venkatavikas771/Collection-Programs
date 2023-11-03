mport java.util.*;

public class Priority {

public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string values");
      String a=sc.nextLine();
     String b=sc.nextLine();
       String c=sc.nextLine();
       String d=sc.nextLine();
      PriorityQueue ar=new PriorityQueue();
      ar.add(a);
      ar.add(b);
      ar.add(c);
      ar.add(d);
    System.out.println(ar);

  }

}