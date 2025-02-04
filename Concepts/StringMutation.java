import java.util.*;
public class StringMutation {

    public static void main(String[] args) {
	    	System.out.println((int)Math.log10(45763267)+1);

	    String a= "String";

	     String b= a.replace('r','s');
	    	System.out.println(a+" "+b);

     StringBuilder  c = new StringBuilder("hello");
	      StringBuffer  b1 = new StringBuffer("hello");

	      System.out.println(c);
	      c.append(" I am IronMan");
	      System.out.println(c);
	      c.delete(0,3);
	      System.out.println(c);
	      c.insert(1,"new");
	      System.out.println(c);





		StringBuilder aMutable = new StringBuilder("Hello");
		System.out.println(aMutable);
		aMutable.append(" World");
		System.out.println(aMutable);
		aMutable.reverse();
		System.out.println(aMutable);
		aMutable.delete(0, 3);
		System.out.println(aMutable);
		aMutable.insert(1, "new");
		System.out.println(aMutable);










//
//	int aint=76542313;
//	StringBuffer astr= new StringBuffer(String.valueOf(aint));
//	System.out.println(astr);
//	astr.reverse();// 31324567
//	System.out.println(astr);
//	int res = Integer.parseInt(String.valueOf(astr));
//	//used to convert String to Integer
//	System.out.println(res);

    }
}








	      /*
                import java.util.*;
public class Main{
 public static void main(String []args){
  Scanner sc= new Scanner(System.in);
   StringBuffer a= new StringBuffer("input");
   System.out.println("original a value     : "+a);

   a.append("user");
   System.out.println("append               : "+a);

   System.out.println("capacity             : "+a.capacity());

   System.out.println("delete method        : "+a.delete(0,3)+ " ,original a  "+a);

   System.out.println("del char At          : "+a.deleteCharAt(1));

   a.	ensureCapacity(22);
   System.out.println("ensureCapacity       : "+a.capacity());

    a.insert(0,"this is user=>");
    System.out.println("inserting            : "+a);

    a.replace(14,19,"input");
    System.out.println("replacing            : "+a);

   String b= "reversing";
   StringBuffer c= new StringBuffer(b);
   c.reverse();
   System.out.println("reversed buffer      : "+c);


   b=c.toString();
   System.out.println("to string            : "+b);
 }
}















    b="sb"  ,  c= "sBuiler"
StringBuffer          StringBuilder
synchronized          non- synchronized
Thread safe           non-thread safe
slower opertation     fast opertation/execution */


