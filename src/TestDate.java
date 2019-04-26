import java.util.*;
import java.util.Date;


public class TestDate {
    public static void main(String[] args){
        Date data = new Date(1,2,1995);
        System.out.println(data.toString());
        data.setDay(2);
        data.setMonth(3);
        data.setYear(1996);
        System.out.println("Date: " + data.getDay() + "/" + data.getMonth() + "/" + data.getYear());
        data.setDate(3,4,1997);
        System.out.println("Date: " + data.getDay()+ "/" + data.getMonth()+ "/" + data.getYear());
    }
}
