package chapter_5;

import java.time.LocalDate;

public class Screnning {
    private Movie movie;
    private int sequence;
    private LocalDate whenScreened;

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
