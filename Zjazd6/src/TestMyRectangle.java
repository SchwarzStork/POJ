/*
Autorzy: Aleksander Mojzych, Adrian Matyszczak 25.05.2019
 */


public class TestMyRectangle {

    public static void main(String[] args){

        MyRectangle rect = new MyRectangle(3,3,4,5);
        System.out.println(rect);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Circumference: " + rect.getCircumference());
    }
}
