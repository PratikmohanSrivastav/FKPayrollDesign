public class EmpPayMethodChange extends AbstractEmployeeChangeClass{

  private final String new_pay_method;

  public EmpPayMethodChange(int emp_id, String new_pay_method, PayrollDatabase db) {
    super(emp_id, db);
    this.new_pay_method = new_pay_method;
  }

  @Override
  protected void change(Employee emp) {
    emp.pay_method = new_pay_method;
  }
}