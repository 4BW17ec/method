
public class Demo 
{
	 
	public static void main(String[] args)   
	{  
	// using the max() method of Math class  
	System.out.print("The maximum number is: " + Math.max(9,7));  
	}  
	}

//call by value
class Operation{  
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }  
	     
	 public static void main(String args[]){  
	   Operation op=new Operation();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);  
	  
	 }  
	}
//method overloading
 class Overload {
	
public void area(int b,int h)
  {
       System.out.println("Area of Triangle : "+(0.5*b*h));
  }
  public void area(int r) 
  {
       System.out.println("Area of Circle : "+(3.14*r*r));
  }
  public static void main(String args[])
 {

Overload ob=new Overload();
     ob.area(10,12);
     ob.area(5);  
 }
}

