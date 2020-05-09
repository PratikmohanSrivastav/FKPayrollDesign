import java.util.*;


public class PayrollDatabase {

    /// Starting with hash - maps to store the empoyess , not clear about JSON or MYSQL///


    ///// Key will br employees ID /////


    /////  Values Will be Employees Themselves /////



    private static HashMap<Integer,Employee> employees = new HashMap<Integer,Employee>();


    ////  Separate map for the memners  /// // /////

    private static HashMap<Integer,Employee> members = new HashMap<Integer, Employee>();


    //// For addition of employees//////



    public void addEmployee(int id, Employee employee) {
        employees.put(id, employee);
    }

    ////  For retrieving employees  /////
    public Employee getEmployee(int empId) {
        return employees.get(empId);
    }

    //// For removal of employees  ////
    public void deleteEmployee(int id) {
        employees.remove(id);
    }

    /*public void addUnionMember(int memberId, Employee e) {
        members.put(memberId, e);
    }

    public Employee getMember(int memberId) {
        return members.get(memberId);
    }

    public void removeUnionMember(int memberId) {
      members.remove(memberId);
    }

    public Collection<Employee> getAllEmployees() {
      return employees.values();
    }*/
}