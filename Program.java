package RectanglePackage;

public class Program {
	
	public static void main(String args[]){
		
	Human human = new Human (23, "60kg", "170cm", "Aleksander", "Male", "15595", "42");
	human.printHuman();
	
	Human human2 = new Human (15, "70kg", "180cm", "Wymyslony", "Male", "66777", "45");
	human2.printHuman();
	
	Rectangle rectangle = new Rectangle(10, 5);
	rectangle.printRectangle();
	
	Triangle triangle = new Triangle(3, 3, 3, 4);
	triangle.printTriangle();
	Triangle triangle2 = new Triangle(3,1,3,4);
	triangle2.printTriangle();
	Triangle triangle3 = new Triangle(3,2,1,4);
	triangle3.printTriangle();

	CaesarCipher caesarCipher = new CaesarCipher("ALEKSANDERMOJZYCH", 4);
	caesarCipher.printcaesarCipher();

	}

}
