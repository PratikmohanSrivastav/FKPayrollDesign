public class HourEmpAdd extends EmpAdd {

    private final double rate;

    public HourEmpAdd(int emp_id, String emp_name, String emp_address, String pay_method,boolean union,double rate, PayrollDatabase db) {
        super(emp_id, emp_name, emp_address,pay_method,union,db);
        this.rate = rate;
    }

     @Override
    protected PaySchedule Schedule() {
        return new ScheduleWeeklyPayment();
    }

        //Bomm Boom Boom 

    @Override
    protected PayClassification Classify() {
        return new ClassifyHourBasis(rate);
    }

   
}
