public abstract class EmpAdd{

    private int emp_id;
    private String emp_name;
    private String emp_address;
    private String pay_method;
    private boolean union;
    private double commission_rate;
    private PayrollDatabase db;

    public EmpAdd (int emp_id, String emp_name, String emp_address, String pay_method,boolean union,double commission_rate,PayrollDatabase db) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
        this.pay_method = pay_method;
        this.db = db;
        this.union = union;
        this.commission_rate = commission_rate;
    }

    protected abstract PayClassification Classify();
    protected abstract PaySchedule Schedule();

    public void execute() {
        
        PayClassification pc = Classify();
        PaySchedule ps = Schedule();


        Employee e = new Employee(emp_id, emp_name, emp_address,pay_method,union,commission_rate);

        e.ctype = pc;

        e.stype = ps;
            //Boom Boom Boom

        db.addEmployee(emp_id, e);
    }
}
