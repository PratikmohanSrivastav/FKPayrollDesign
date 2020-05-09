import org.joda.time.DateTime;

public interface PaySchedule {

  boolean isPayDate(DateTime payDate);

  DateTime isPayPeriodStartDate(DateTime payDate);

}

