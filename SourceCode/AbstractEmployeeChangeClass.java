public abstract class AbstractEmployeeChangeClass{
    private final int emp_id;
    private PayrollDatabase db;

    public AbstractEmployeeChangeClass(int emp_id, PayrollDatabase db) {
        this.emp_id = emp_id;
        this.db = db;
    }


    protected abstract void change(Employee emp);

    public void execute() {
        Employee emp = db.getEmployee(emp_id);

        if (emp == null) 
            throw new RuntimeException("There is no employee of this type: " + emp_id);
        else
            change(emp);
    }

    
}