import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateTimeFormatter.format(dateTime));

        Calendar calendar = new GregorianCalendar();
        Date dateNow = new Date();
        System.out.println(dateNow);
    }
}
