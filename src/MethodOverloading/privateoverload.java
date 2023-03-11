package MethodOverloading;

public class privateoverload {

    private void privateoverload(double b, int a) {
        System.out.println("nice");
    }

    private void privateoverload(String name) {
        System.out.println("great");
    }

    private void privateoverload(int a) {
        System.out.println("all right");
    }

    public static void main(String[] args) {
        privateoverload POL=new privateoverload();
        POL.privateoverload(47.3,2);

    }
}