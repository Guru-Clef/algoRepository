package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;


public class Fecha {

  public static void main(String args[]) {

    ZonedDateTime fromDate = ZonedDateTime.now();
    ZonedDateTime toDate = ZonedDateTime.now().plusDays(1);

    List<DateBucket> arr = DateBucket.bucketize(fromDate, toDate, 2, ChronoUnit.HOURS);
    System.out.println(arr.size());


  }

}
