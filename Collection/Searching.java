import java.util.Scanner;
import java.util.ArrayList; 

class SearchingElement
  {
public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the  elements");
      String a=sc.next();
      String b=sc.next();
      String c=sc.next();
      String d=sc.next();
      ArrayList<String> ar=new ArrayList<String>();
      ar.add(a);
      ar.add(b);
      ar.add(c);
      ar.add(d);
      System.out.println("Enter the search element");
      String x=sc.next();
      if(true==ar.contains(x))
      {
        System.out.println(x+" "+"search element is present"); 
      }
      else{
         System.out.println("search element not found in the above array list");
      }
      
    }
  }