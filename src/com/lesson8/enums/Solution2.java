package com.lesson8.enums;

public class Solution2 {
    /*
    Implement enum Week, that each element has the name of the week (String) and the number of weekday (int)
    Print these values to the console in the formant - Monday - day of the week: 1
     */
    public static void main(String[] args) {
        Week TUESDAY = Week.TUESDAY;
        System.out.print(TUESDAY + " - day of the week: ");
        TUESDAY.getDayOfWeek();

    }

    public enum Week {
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7);

        private int dayOfWeek;

        Week(int dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
        }

        public void getDayOfWeek() {
            System.out.println(dayOfWeek);
        }

    }
}
