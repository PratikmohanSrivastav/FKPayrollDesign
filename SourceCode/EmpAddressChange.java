public class EmpAddressChange extends AbstractEmployeeChangeClass{

  private final String new_Address;

  public EmpAddressChange(int emp_id, String new_Address, PayrollDatabase db) {
    super(emp_id, db);
    this.new_Address = new_Address;
  }

  @Override
  protected void change(Employee emp) {
    emp.emp_address = new_Address;
  }
}