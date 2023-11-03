import java.util.*; 
import java.util.ArrayList; 

class CopyArrayList  { 

public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the values ");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      ArrayList<Integer> ar=new ArrayList<Integer>();
      ar.add(a);
      ar.add(b);
      ar.add(c);
      ar.add(d);
      
       ArrayList<Integer> arr=new ArrayList<Integer>(ar);
       System.out.println(" -----Iterating over the second ArrayList from the above list----");
      ListIterator l=arr.listIterator();
      while(l.hasNext())
        {
          System.out.println(l.next());
        }
    }
  }
      