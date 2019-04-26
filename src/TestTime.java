import java.time.*;


public class TestTime {
    public static void main(String[] args){
        Time czas = new Time(10,45,20);
        System.out.println(czas.toString());
        czas.setHour(5);
        czas.setMinute(15);
        czas.setSecond(45);
        System.out.println("Time: " +czas.getHour() + ":" +czas.getMinute() + ":" + czas.getSecond());
        czas.setTime(6,16,46);
        System.out.println("Time: " +czas.getHour() + ":" +czas.getMinute() + ":" + czas.getSecond());
    }
}
