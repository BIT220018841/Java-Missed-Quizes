class People{  
void service(){System.out.println("eating...");}  
}  
class Church extends Animal{  
void pray(){System.out.println("barking...");}  
}  
class Christian extends Animal{  
void consecration(){System.out.println("meowing...");}  
}  
class Gathering{  
public static void main(String args[]){  
Christian c=new Christian();  
c.pray();  
}}  