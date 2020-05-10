import java.util.*;

import org.joda.time.DateTime;

public class Payday {

  private final DateTime payDate;
  private HashMap<Integer, Paycheck> paychecks = new HashMap<Integer, Paycheck>();
  private PayrollDatabase db;

  public Payday(DateTime payDate, PayrollDatabase db) {
    this.payDate = payDate;
    this.db = db;
  }

  public void execute() {
    Collection<Employee> employees = db.getAllEmployees();
    for (Employee e : employees) {
      if (e.isPayDate(payDate)) {
        DateTime startDate = e.isPayPeriodStartDate(payDate); 
        Paycheck pc = new Paycheck(startDate, payDate);
        paychecks.put(e.emp_id, pc);
        e.payDay(pc);
      }
    }
  }

  public Paycheck getPaycheck(int empId) {
    return paychecks.get(empId);
  }
}
