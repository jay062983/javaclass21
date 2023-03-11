package MethodOverloading;

public class Programming {
    String name;
     Programming(){
        System.out.println("I love programming languages");
    }
     Programming(String name){
        System.out.println("programming languages");
    }

    public static void main(String[] args) {
        new Programming("java");
    }
}

