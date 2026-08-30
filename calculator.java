import java.util.Scanner;
class Calculator {
 private int a;
 private int b;
 private String op;

 Calculator (int a, int b, String op) {
     this.a=a;
     this.b=b;
     this.op=op;
 } 
public int getA() {
    return a;
}

public void setA(int a) {
    this.a = a;
}

public int getB() {
    return b;
}

public void setB(int b) {
    this.b = b;
}

public String getOp() {
    return op;
}

public void setOp(String op) {
    this.op = op;
}

    void displayInfo() {
        System.out.println("First number : " + a);
        System.out.println("Second number : " + b);
        System.out.println("Operation : " + op);
    }

}
public class Main {
	public static void main(String[] args) {
		System.out.println ("===== Calculator ====") ;
      
     Scanner sc = new Scanner (System.in ) ;
     
     System.out.println("Enter First Number: ");
    int a=sc.nextInt() ;
    System.out.println("Enter Second Number: ");
    int b=sc.nextInt() ;
    System.out.println("Enter (+ , -, * , /): ");
    String op= sc.next() ;
    
     Calculator c = new Calculator (a,b,op) ;
 String  ch=c.getOp();
    	
switch (ch) {
   case "+":
        
        System.out.println("Sum: "+ (c.getA()+c.getB()));
       break ;
   case "-":
       System.out.println("Difference: "+ (c.getA()-c.getB()));
       break ;
    case "*":
       System.out.println("Product: "+ (c.getA()*c.getB()));
       break ;
     case "/":
     if(c.getB() !=0){
       System.out.println("Quotient: "+ ((double)c.getA()/c.getB()));
     }else
        System.out.println("Can not divide by 0");
       break ;
   default :
       System.out.println ("Enter valid number or operation") ;
} 
sc.close();
	}
}