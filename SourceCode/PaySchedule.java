import java.time.LocalDate;

public interface PaySchedule {

  boolean isPayDate(LocalDate payDate);

  java.time.LocalDate isPayPeriodStartDate(LocalDate payDate);

}

