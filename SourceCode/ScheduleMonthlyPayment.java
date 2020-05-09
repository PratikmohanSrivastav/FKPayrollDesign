import org.joda.time.DateTime;

public class ScheduleMonthlyPayment implements PaySchedule {
  public boolean isPayDate(DateTime payDate) {
    return isLastDayOfMonth(payDate);
  }

  private boolean isLastDayOfMonth(DateTime date) {
    return date.plusMonths(1).getMonthOfYear() == date.plusDays(1).getMonthOfYear();
  }

  @Override
  public DateTime isPayPeriodStartDate(DateTime payDate) {
    return null;
  }
}