import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
        System.out.println(LocalDate.of(2015, Month.APRIL, 1));
    }
}
