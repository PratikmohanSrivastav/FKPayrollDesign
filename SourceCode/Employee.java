import java.time.LocalDate;


public class Employee {
    public String emp_address;
    public String emp_name;
    public int emp_id;
    public Union union; 
    public PayClassification ctype;
    public PaySchedule stype;
    public PayMethod mtype;


    public Employee(int emp_id, String emp_name, String emp_address) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
    }

    public LocalDate isPayPeriodStartDate(LocalDate payDate) {
      return stype.isPayPeriodStartDate(payDate);
    }

    public boolean isPayDate(LocalDate payDate) {
      return stype.isPayDate(payDate);
    }
    public void payDay(Paycheck paycheck) {
      double grossPay = ctype.calculatePay(paycheck);
      double deductions = union.calculateDeductions(paycheck);
      double netPay = grossPay - deductions;
      paycheck.grossPay = grossPay;
      paycheck.deductions = deductions;
      paycheck.netPay = netPay;
      mtype.pay(paycheck);
    }
    
}
