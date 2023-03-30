package chapter_5;
public class Reservation {

    private Customer customer;
    private Screnning screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screnning screnning, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
