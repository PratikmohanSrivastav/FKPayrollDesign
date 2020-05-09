public class MonthlyEmpAdd extends EmpAdd {

    private double salary;

    public MonthlyEmpAdd(int emp_id, String emp_name, String emp_address, double salary, PayrollDatabase db) {
        super(emp_id, emp_name, emp_address, db);
        this.salary = salary;
    }


    @Override
    protected PaySchedule Schedule() {
        return new ScheduleMonthlyPayment();
    }


    @Override
    protected PayClassification Classify() {
        return new ClassifyMonthlyBasis(salary);
    }

    
}