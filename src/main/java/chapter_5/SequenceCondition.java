package chapter_5;

public class SequenceCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    public boolean isSatisfiedBy(Screnning screening) {
        return sequence == screening.getSequence();
    }
}

