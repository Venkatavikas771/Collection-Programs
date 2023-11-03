import java.util.*;
class Hdtv
  {
    String brand;
    int size;
    Hdt(String brand,int size)
    {
      this.brand=brand;
        this.size=size;
    }
    
    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String toString()
    {
      return "["+"brand:"+brand +"size:"+size+"]";
    }
  }
    class Mycomparator implements Comparator<Hdt>
      {
        public int compare(Hdt a,Hdt b)
        {
          if(a.getSize()<b.getSize())
          {
            return 1;
          }
         else if(a.getSize()>b.getSize())
          {
            return -1;
          } 
          else
         {
           return 0;
         }
        }
      }
class HdTvStock
  {
    public static void main(String args[])
    {
      Hdt h1=new Hdt("Samsung",45);
      Hdt h2=new Hdt("mi",22);
       Hdt h3=new Hdt("volga",34);
      TreeSet al=new TreeSet(new Mycomparator());
      al.add(h1);
      al.add(h2);
      al.add(h3);
      System.out.println(al);
    }
  }
  