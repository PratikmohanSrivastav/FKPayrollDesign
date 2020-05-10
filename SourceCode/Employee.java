// This is the main class////

/// Employee object Class//

/// Each employee has address,name,id ///

/// I have also Included a library which will be used for the date requirements that I will have in my code///

/// Initially I had handled this with the help of java.time.LocalDate ///

/// But its functionality was a little difficult to handle /////

/// Hence this library has been included  , I found this through an online source ///

/// Please unzip the file that I have included in my Library Folder ///

// *********************************////


//*******************************/////



import org.joda.time.DateTime;


public class Employee {
    public String emp_address;
    public String emp_name;
    public int emp_id;
    public String pay_method;
    public boolean union; 
    public PayClassification ctype;
    public PaySchedule stype;
    


    public Employee(int emp_id, String emp_name, String emp_address,String pay_method,boolean union) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.pay_method = pay_method;
        this.union = union;
    }

    public DateTime isPayPeriodStartDate(DateTime payDate) {
      return stype.isPayPeriodStartDate(payDate);
    }

    public boolean isPayDate(DateTime payDate) {
      return stype.isPayDate(payDate);
    }
    public void payDay(Paycheck paycheck) {
      double grossPay = ctype.calculatePay(paycheck);


      double deductions = 0;
      double netPay = grossPay - deductions;

      paycheck.grossPay = grossPay;
      paycheck.deductions = deductions;
      paycheck.netPay = netPay;
    }
    
}
