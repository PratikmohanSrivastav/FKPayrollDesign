public abstract class EmpAdd{

    private int emp_id;
    private String emp_name;
    private String emp_address;
    private PayrollDatabase db;

    public EmpAdd (int emp_id, String emp_name, String emp_address, PayrollDatabase db) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.db = db;
    }

    protected abstract PayClassification Classify();
    protected abstract PaySchedule Schedule();

    public void execute() {
        
        PayMethod pm = new Method();
        PayClassification pc = Classify();
        PaySchedule ps = Schedule();


        Employee e = new Employee(emp_id, emp_name, emp_address);

        e.ctype = pc;

        e.stype = ps;
            //Boom Boom Boom

        e.mtype = pm;

        db.addEmployee(emp_id, e);
    }
}