public class EmployeeDelete{

    private int emp_id;
    private PayrollDatabase db;

    public EmployeeDelete(int emp_id, PayrollDatabase db) {
        this.emp_id = emp_id;
        this.db = db;
    }

    public void execute() {
        db.deleteEmployee(emp_id);
    }

}
