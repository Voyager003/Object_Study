package chapter_2;

public class SequenceCondition implements DiscountCondition{

    private int sequence;

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
