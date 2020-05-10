
/// This will help us in not only changing the value of salary and hourly wage , it will also help us to chnage if employee goes form salaries to 
/// hourly wages and also from hourly wages to salaried wages ////


///*****************/////








public abstract class ClassificationOrValueChange extends AbstractEmployeeChangeClass {

  protected abstract PayClassification classifier();
  protected abstract PaySchedule scheduler();
  public ClassificationOrValueChange(int emp_id, PayrollDatabase db) {
    super(emp_id, db);
  }

  @Override
  protected void change(Employee emp) {
    emp.ctype = classifier();
    emp.stype = scheduler();
  }
}