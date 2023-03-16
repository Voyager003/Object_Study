package chapter_2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class PeriodCondition implements DiscountCondition {

    private DayOfWeek dayOfweek;
    private LocalDateTime starttime;
    private LocalDateTime endtime;

    public PeriodCondition(DayOfWeek dayOfweek, LocalDateTime starttime, LocalDateTime endtime) {
        this.dayOfweek = dayOfweek;
        this.starttime = starttime;
        this.endtime = endtime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.getStartTime().getDayOfWeek().equals(dayOfweek) &&
                starttime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
                endtime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
    }
}
