package chapter_5;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class PeriodCondition {

    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean isSatisfiedBy(Screnning screening) {
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek())
                && startTime.isBefore(screening.getWhenScreened().toLocalTime())
                && endTime.isAfter(screening.getWhenScreened().toLocalTime());
    }
}

