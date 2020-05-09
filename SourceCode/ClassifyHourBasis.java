import java.util.*;

import org.joda.time.DateTime;




public class ClassifyHourBasis implements PayClassification{

    public double rate;
    public HashMap<DateTime,TimeCard> timecards = new HashMap<DateTime,TimeCard>();



    // The important Class Constructor , Please keep care//
    //
    //...///

    public ClassifyHourBasis(double rate) {
        this.rate = rate;
    }

    //// Important Function to add 
    public void addTimeCard(DateTime date, double hoursWorked) {
        timecards.put(date, new TimeCard(date, hoursWorked));
    }
    public TimeCard getTimeCard(DateTime date) {
        return timecards.get(date);
    }

    @Override
    public double calculatePay(Paycheck paycheck) {
    	//Store in salary variable


      double salary = 0;

      for(DateTime date = paycheck.startDate; date.isBefore(paycheck.payDate.plusDays(1));date = date.plusDays(1)) {
        if (timecards.get(date) != null) {
          double hours = timecards.get(date).hours;

          salary =salary +  rate * hours;
          if (hours > 8.0)
            salary = salary + rate * (hours - 8) / 2.0;
        }
      }

      /// The required answer is stored here   /////   
      return salary;
    }
}