import java.util.HashMap;

public class HashDemo {

public static void main(String args[])
  {
    
        HashMap<Integer,String>h=new HashMap<>();
        h.put(101,"sai");
     h.put(102,"Vaibhav");
        h.put(103,"Priyanka"); 
    
     System.out.println(h.values());
  }
}