import java.util.*;  

public class SortArrayList  {  

 public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      ArrayList<Integer> ar=new ArrayList<Integer>();
      ar.add(a);
      ar.add(b);
      ar.add(c);
      ar.add(d);
      TreeSet t=new  TreeSet(ar);

      
      System.out.println("Array list after sorting :"+t);
    }
  }