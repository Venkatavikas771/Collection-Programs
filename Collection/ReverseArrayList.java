import java.util.*; 
import java.util.ArrayList; 

class ReverseArrayList  {  

 public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the values ");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      ArrayList<Integer> ar=new <Integer>ArrayList();
      ar.add(a);
      ar.add(b);
      ar.add(c);
      ar.add(d);
 System.out.println("Elements after reversing");
for(int i=ar.size()-1;i>=0;i--)
  {
     System.out.println(ar.get(i));
  }


      
    
      
      
    }
  }