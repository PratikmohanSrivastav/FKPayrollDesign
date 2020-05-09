import java.time.LocalDate;

public class Paycheck {

  public final LocalDate payDate;
  public LocalDate startDate;
  public double grossPay;
  public double deductions;
  public double netPay;

  public Paycheck(LocalDate startDate, LocalDate payDate) {
    this.startDate = startDate;
    this.payDate = payDate;
  }
}
