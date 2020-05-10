public class HourlyChange extends ClassificationOrValueChange {

  private final double rate;

  public HourlyChange(int emp_id, double rate, PayrollDatabase db) {
    super(emp_id, db);
    this.rate = rate;
  }

  @Override
  protected PaySchedule scheduler() {
    return new ScheduleWeeklyPayment();
  }


  @Override
  protected PayClassification classifier() {
    return new ClassifyHourBasis(rate);
  }

}