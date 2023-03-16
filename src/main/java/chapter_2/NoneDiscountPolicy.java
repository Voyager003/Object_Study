package chapter_2;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAomunt(Screening screening) {
        return Money.ZERO;
    }
}
