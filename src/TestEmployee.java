//Autor: Aleksander Mojzych
//Data powstania: 06.04.2019

public class TestEmployee {
    public static void main(String[] args){
        Employee e1 = new Employee(15595 , "Aleksander" , "Mojzych", 5000);
        System.out.println(e1);
        e1.setSalary(6000);
        System.out.println("New salary: " + e1.getSalary());
        System.out.println("Annual Salary: " + e1.getAnnualSalary());
        System.out.println("Raise: " + e1.raiseSalary(5));


    }
}
