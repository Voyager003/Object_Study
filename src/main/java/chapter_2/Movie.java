package chapter_2;

// '상영'할 영화의 정보
public class Movie {

    private String title;
    private Dutation runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Dutation runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
