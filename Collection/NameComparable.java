import java.util.*;
class Mock1 implements Comparable <Mock1>
  {
        int id;
        String name;
      Mock1(int id,String name)
        {
        this.id=id;
        this.name=name;
        }
    public String  toString()
    {
      return "id"+id+" "+"name"+name;
    }
    public int compareTo(Mock1 o)
    {
            return this.name.compareTo(o.name);
    }

        class Vikas
          {
            public static void main(String args[])
            {
           Queue<Mock1> pr=new PriorityQueue<Mock1>();
              Mock1 p=new Mock1(1,"vikas");
               Mock1 p1=new Mock1(2,"sakiv");
               Mock1 p2=new Mock1(3,"anjali");
        
              pr.add(p);
                 pr.add(p1);
                  pr.add(p2);
              for(Mock1 q:pr)
                {
                  System.out.println(q);
                }
            
            }
          }

      
    
  }