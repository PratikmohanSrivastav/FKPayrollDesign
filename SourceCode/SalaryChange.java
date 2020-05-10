public class SalaryChange extends ClassificationOrValueChange{

  private final double salary;

  public SalaryChange(int emp_id, double salary, PayrollDatabase db) {
    super(emp_id, db);
    this.salary = salary;
  }

  

  @Override
  protected PaySchedule scheduler() {
    return new ScheduleMonthlyPayment();
  }

  @Override
  protected PayClassification classifier() {
    return new ClassifyMonthlyBasis(salary);
  }
}