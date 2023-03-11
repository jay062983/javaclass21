package superclass;

public class Animal {

    String name;
    String color = "Black";
}
    class Cat extends Animal{
    String color="white";
    int age=10;
    double weight;
void  printColor(){
    String color="gray";
    System.out.println(super.color);
    System.out.println(color);
    System.out.println(this.color);//without using super keyword,
    // default will be printed out which is local color value gray
}// if you use super keyword prints out Black
    }

   class AnimalTester{

       public static void main(String[] args) {
           Cat cat=new Cat();
           cat.printColor();

       }
   }

