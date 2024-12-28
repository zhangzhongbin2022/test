import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class optionalTest {


    public static void main(String[] args) {
            // testOptional();
       testDate();
    }


    public  static void testDate() {
        //日期
      final LocalDate dd = LocalDate.now();
        LocalDate dd1 = dd.plusYears(2);
        LocalDate dd2 = dd.minusYears(2);
        System.out.println(dd1.isAfter(dd2));
        System.out.println(dd1.isBefore(dd2));
//        System.out.println(Period.between(dd2,dd1).getMonths());
        System.out.println(ChronoUnit.MONTHS.between(dd2,dd1));
        //时间
        final LocalDateTime times = LocalDateTime.now();
        LocalDateTime t1 = times.plusYears(2);
        LocalDateTime t2 = times.minusYears(2);
        final Date de = new Date();
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().withDayOfMonth(10));
      }


    public static void  testOptional() {
     for(int i=0 ; i<10_000 ;i++) {
         System.out.println(i);
     }

    }

}
