import org.joda.time.DateTime;

public class Charge_Service {

    public final DateTime date;
    public final double charge;

    public Charge_Service(DateTime date, double charge) {
        this.date = date;
        this.charge = charge;
    }
}