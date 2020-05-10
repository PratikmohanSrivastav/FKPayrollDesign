public class EmpCommissionRateChange extends AbstractEmployeeChangeClass{

  private final double new_commission_rate;

  public EmpCommissionRateChange(int emp_id, double new_commission_rate, PayrollDatabase db) {
    super(emp_id, db);
    this.new_commission_rate = new_commission_rate;
  }

  @Override
  protected void change(Employee emp) {
    emp.commission_rate = new_commission_rate;
  }
}