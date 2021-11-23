package date;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DateBucket {

//  final Instant from;
//  final Instant to;

  private Instant minDate;
  private Instant maxDate;

  public DateBucket(Instant minDate, Instant maxDate) {
    this.minDate = minDate;
    this.maxDate = maxDate;
  }


  public static List<DateBucket> bucketize(ZonedDateTime fromDate, ZonedDateTime toDate,
      int bucketSize, ChronoUnit bucketSizeUnit) {

    List<DateBucket> buckets = new ArrayList<>();

    Integer fromDateI = fromDate.toInstant().getNano();
    Integer toDateI = toDate.toInstant().getNano();
    Long bucketSizeI = bucketSizeUnit.getDuration().getSeconds() * 1000000000 ;

    Long algo = fromDateI - toDateI / bucketSizeI;
    System.out.println(algo);


    boolean reachedDate = false;
    for(int i=0; !reachedDate; i++) {
      ZonedDateTime minDate = fromDate.plus(i * bucketSize, bucketSizeUnit);
      ZonedDateTime maxDate = fromDate.plus((i + 1) * bucketSize, bucketSizeUnit);
      reachedDate = toDate.isBefore(maxDate);
      buckets.add(new DateBucket(minDate.toInstant(), maxDate.toInstant()));
    }
    return buckets;







  }


}
