//Autor: Aleksander Mojzych s15595
//Data powstania: 23.03.2019

package RectanglePackage;

public class Human{
	Human(){
	System.out.println("This is a human");
}

	public int age;
	public String weight;
	public String height;
	public String name;
	public String sex;
	public String index;
	public String footsize;

	Human(int age, String weight, String height, String name, String sex, String index, String footsize){
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.sex = sex;
		this.index = index;
		this.footsize = footsize;
	}

	void printHuman(){
		System.out.println("Wiek " + age);
		System.out.println("Waga " + weight);
		System.out.println("Wzrost " + height);
		System.out.println("Imie " + name);
		System.out.println("Plec " + sex);
		System.out.println("Indeks " + index);
		System.out.println("Rozmiar buta " + footsize);
	}


	public int getAge() {
		return age;
	}

	public int setAge(int age){
		return this.age = age;
	}

	public String getWeight() {
		return weight;
	}

	public String setWeight(String weight){
		return this.weight = weight;
	}

	public String getHeight() {
		return height;
	}

	public String setHeight(String height){
		return this.height = height;
	}

	public String getName() {
		return name;
	}

	public String setName(String name){
		return this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public String setSex(String sex){
		return this.sex = sex;
	}

	public String getIndex() {
		return index;
	}

	public String setIndex(String index){
		return this.index = index;
	}

	public String getFootsize() {
		return footsize;
	}

	public String setFootsize(String footsize){
		return this.footsize = footsize;
	}

}

