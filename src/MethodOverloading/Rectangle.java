package MethodOverloading;

public class Rectangle {

    public static void main(String[] args) {
        double width=5;
        int height=10;
        int length=12;
        String Rectangle;
        String Square;

    }
    void calculateArea(double width,int height){
        double area= width*height;
        System.out.println(area);

    }
    void calculateArea(int height, int length){
        int area=height*length;
        System.out.println(area);
    }
}
