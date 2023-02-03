//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class Bank{  
int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class CBE extends Bank{  
int getRateOfInterest(){return 8;}  
}  
  
class UR extends Bank{  
int getRateOfInterest(){return 7;}  
}  
class ABBA extends Bank{  
int getRateOfInterest(){return 9;}  
}  
//Test class to create objects and call the methods  
class overriding{  
public static void main(String args[]){  
CBE s=new CBE();  
UR i=new UR();  
ABBA a=new ABBA();  
System.out.println("CBE Rate of Interest: "+s.getRateOfInterest());  
System.out.println("UR Rate of Interest: "+i.getRateOfInterest());  
System.out.println("ABBA Rate of Interest: "+a.getRateOfInterest());  
}  
}  