import org.joda.time.DateTime;

public class AddTimeCard{

    private final DateTime date;
    private final double hours;
    private final int emp_id;
    private PayrollDatabase db;

    public AddTimeCard(DateTime date, double hours, int emp_id, PayrollDatabase db) {
        this.date = date;
        this.hours = hours;
        this.emp_id = emp_id;
        this.db = db;
    }

    public void execute() {
        Employee e = db.getEmployee(emp_id);
        if (e != null) {
            PayClassification pc = e.ctype;
            ClassifyHourBasis hc = (ClassifyHourBasis) pc;
            hc.addTimeCard(date, hours);
        }
    }

}
