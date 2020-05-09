public class ClassifyMonthlyBasis implements PayClassification {

    public double salary;

    public ClassifyMonthlyBasis(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay(Paycheck paycheck) {
      return salary;
    }
}