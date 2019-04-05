//Autor: Aleksander Mojzych
//Stworzone 05.04.2019

package RectanglePackage;

public class Triangle {

    public double lenghta;
    public double lengthb;
    public double lengthc;
    public double height;

    Triangle(double lenghta, double lengthb, double lengthc, double height){

        this.lenghta = lenghta;
        this.lengthb = lengthb;
        this.lengthc = lengthc;
        this.height = height;

    }
  /*  enum TriangleType {
        EQUILATERAL, ISOSCELES, SCALENE
    }
    static TriangleType classify(double lenghta, double lengthb, double lengthc) {
        if (lenghta == lengthb && lengthb == lengthc) return TriangleType.EQUILATERAL;
        if (lenghta == lengthb || lengthb == lengthc || lenghta == lengthc) return TriangleType.ISOSCELES;
        return TriangleType.SCALENE;
    }
*/
    double getAreaT() {
        return (height * lenghta)/2;
    }

    double getCircT() {
        return lenghta + lengthb + lengthc;
    }


    void printTriangle(){
        System.out.println("Bok a" + lenghta);
        System.out.println("Bok b" + lengthb);
        System.out.println("Bok c" + lengthc);
        System.out.println("Pole" + getAreaT());
        System.out.println("Obwod" + getCircT());
        if(lenghta == lengthb && lengthb == lengthc) System.out.println("isEquilateral");
        else if(lenghta == lengthb || lengthb == lengthc || lenghta == lengthc) System.out.println("isIsosceles");
        else System.out.println("isScelen");
    }


}
