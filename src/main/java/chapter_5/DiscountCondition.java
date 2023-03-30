package chapter_5;

import java.time.DayOfWeek;
import java.time.LocalTime;

public interface DiscountCondition {
    private DiscountConditionType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public boolean isSatisfiedBy(Screnning screening) {
        if (type == DiscountConditionType.PERIOD) {
            return isSatisfiedByPeriod(screening);
        }
        return isSatisfiedByPeriod(screening);
    }

    private boolean isSatisfiedByPeriod(Screnning screening) {
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek())
                && startTime.isBefore(screening.getWhenScreened().toLocalTime())
                && endTime.isAfter(screening.getWhenScreened().toLocalTime());
    }

    private boolean isSatisfiedBySequence(Screening screening) {
        return sequence == screening.getSequence();
    }
}