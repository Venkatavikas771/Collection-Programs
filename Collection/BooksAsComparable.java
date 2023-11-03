import java.util.*;
class Books implements Comparable
  {
    String name;
    String author;
    double price;
  Books(String name,String author,double price)
    {
    this.name=name;
    this.author=author;
      this.price=price;
    }
public int compareTo(Object obj)
    {
      Books bo=(Books)obj;        
     if(obj.getPrice()>bo.price)
      return 1;
    else if(this.price<bo.price)
      return -1; 
    else
      return 0;
    }
    public String toString()
    {
      return "["+"name:"+name +"author:"+author+"price:"+price+"]";
    }
    
  }
class Book
  {
    public static void main(String[] args)
    {
      Books b1=new Books("social","muttai",678);
      Books b2=new Books("Hindi","nannai",34);
      Books b3=new Books("TELUGU","HANNAI",12);

       TreeSet obj=new TreeSet();
      obj.add(b1);
       obj.add(b2); 
       obj.add(b3);

      for(Object o:obj)
        {
          System.out.println(o);
        }
    }
  }