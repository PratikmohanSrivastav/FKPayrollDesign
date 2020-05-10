public class EmpNameChange extends AbstractEmployeeChangeClass {

    private final String new_Name;

    public EmpNameChange(int emp_id, String new_Name, PayrollDatabase db) {
        super(emp_id, db);
        this.new_Name = new_Name;
    }

    @Override
    protected void change(Employee emp) {
        emp.emp_name = new_Name;
    }

}