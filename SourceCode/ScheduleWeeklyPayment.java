import org.joda.time.DateTime;


public class ScheduleWeeklyPayment implements PaySchedule {

  @Override
  public boolean isPayDate(DateTime payDate) {
    return payDate.getDayOfWeek() == 5;
  }

  @Override
  public DateTime isPayPeriodStartDate(DateTime payDate) {
    return payDate.minusDays(payDate.getDayOfWeek() - 1);
  }

 }
