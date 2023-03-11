package MethodOverloading;

public class Overloadstaticmethod {

   static void Overloadstaticmethod(double b,int a){
        System.out.println("nice");
    }
   static void  Overloadstaticmethod(String name){
       System.out.println("great");
   }
   static void Overloadstaticmethod(int a){
       System.out.println("all right");
   }

    public static void main(String[] args) {
         Overloadstaticmethod(7);// static method do not need to create new object using new keyword.
         Overloadstaticmethod("me");

    }
}
