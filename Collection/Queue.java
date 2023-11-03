import java.util.*;
class Queue
  {
    public static void main(String args[])
    {
      Deque p=new ArrayDeque ();              
      p.addFirst("x");
       p.addLast("1");
      p.offerFirst("y");
      p.offerLast("2");
      p.addFirst("Z");
       p.addLast("3");
      p.offerFirst("A");
      p.offerLast("4");
        p.addFirst("Z");
       p.addLast("3");
      p.offerFirst("B");
      p.offerLast("4");
       System.out.println(p);  
      System.out.println(p.removeFirst());
        System.out.println(p.removeLast());
       System.out.println(p);
       System.out.println(p.pollFirst());
       System.out.println(p.pollLast());
      System.out.println(p);
       System.out.println(p.peekFirst());  
      System.out.println(p.peekLast());
       System.out.println(p);
       System.out.println(p.getFirst());
      System.out.println(p.getLast());
       System.out.println(p);
    }
    
  }