package dataTime;
import java.time.*;
import java.io.*;
import java.time.format.*;
public class data {
    public static void main(String[] args) {
        LocalDateTime l1 = LocalDateTime.of(2016, 1, 1, 9, 0);
        LocalDateTime l2 = LocalDateTime.of(2016, 10, 31, 18, 0);
        Period p = Period.of(0, 1, 2);
        Duration d = Duration.ofHours(10);
        dataForTest dataT = new dataForTest();
        dataT.smena(l1, l2, p, d);
    }
}
class dataForTest{
    DateTimeFormatter d1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
    DateTimeFormatter d2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");
    public void smena(LocalDateTime l1, LocalDateTime l2, Period p, Duration d){
        while(l1.isBefore(l2)){
            System.out.println("Працюємо з: " + l1.format(d1));
            l1 = l1.plus(p);
            System.out.println("До: " + l1.format(d1));
            System.out.println();
            System.out.println("Відпочиваємо з: " + l1.format(d2));
            l1 = l1.plus(d);
            System.out.println("До: " + l1.format(d2));
            System.out.println();
        }
    }
}
