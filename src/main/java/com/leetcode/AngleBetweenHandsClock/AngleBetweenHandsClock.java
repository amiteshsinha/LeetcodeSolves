package com.leetcode.AngleBetweenHandsClock;

public class AngleBetweenHandsClock extends AbstractParent {

    /**
     * Runtime
     * 0
     * ms
     * Beats
     * 100.00%
     *
     * Memory
     * 40.46
     * MB
     * Beats
     * 65.50%
     * @param hour
     * @param minutes
     * @return
     */
    @Override
    public double angleClock(int hour, int minutes) {
        // in 1 hour/60 mins the minute clock moves 360 degrees
        // in 1 min the hour clock moves 6 degrees
        // in 1 hour/60 mins the hour clock moves 30 degrees
        // in 1 min the hour clock moves 0.5 degrees
        // at 12:00 the angle is 0 degrees
        // calculate the angle with 12 for hour hand and the angle with 12 for minute hand and subtract for result
        // at 3:15 hour hand has moved 30*3 (30 degree per hour) + 15*0.5 (0.5 per min)
        // at 3:15 minute hand has moved - 6*15 (6 degree per min)
        // so at 3:15 difference in angle is 7.5
        // we need to return the smaller angle so we subtract from 180
        if (hour == 12) {
            hour = 0;
        }
//        double hourAngle = hour*30 + minutes*0.5;
//        double minAngle = (double) minutes*6;
//        double angle = Math.abs(hourAngle - minAngle);
      // the above 3 lines can also be written as -
        double angle = Math.abs(hour*30 - minutes*5.5);
        return (angle > 180) ? 360.00 - angle : angle;
    }
}
