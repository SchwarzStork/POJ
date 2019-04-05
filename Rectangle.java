//Autor: Aleksander Mojzych
//Data stworzenia: 23-03-2019

package RectanglePackage;

public class Rectangle {
	
	public double length;
	public double width;
	
	
	Rectangle(double length, double width){
		
		this.length = length;
		this.width = width;
	}
	
	double getArea(){
		return length * width;
	}
	
	double getCirc(){
		return 2 * length + 2 * width;
	}
	double getDiagonal(){
		return Math.sqrt(Math.pow(2, length)+ Math.pow(2, width));
	}
	
	void printRectangle(){
		System.out.println("Dlugosc" + length);
		System.out.println("Szerokosc" + width);
		System.out.println("Pole" + getArea());
		System.out.println("Obwod" + getCirc());
		System.out.println("Przekatna" + getDiagonal());
		
	}
}