import java.util.Calendar;

import static java.lang.Math.abs;

public class MyDate { //declaring member variables
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;  //constructor class with day, month, year parameters
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {

        int years = abs(comparedDate.year - this.year);

        int months;
        int days = abs(comparedDate.day - this.day);
       // int MAX_MONTHS = 12;
       // int MAX_DAYS_IN_YEAR = 365;
        int MAX_DAY_IN_MONTH = 30;

        if (!earlier(comparedDate)) {

            if (comparedDate.month > this.month || comparedDate.day > this.day) {
                months = 0;
                years--;

            } else {
                months = abs(comparedDate.month - this.month);

            }

            if (comparedDate.day > this.day) {
                days = (MAX_DAY_IN_MONTH - comparedDate.day) + this.day;
            }

        }

        if (earlier(comparedDate)) {
            if (comparedDate.month < this.month || comparedDate.day < this.day) {
                months = 0;
                years--;

            } else {
                months = abs(comparedDate.month - this.month);
            }

           // System.out.println("years: " + years);

            //System.out.println("months: " + months);

           // System.out.println("days: " + days);
        }
            return years;
        }

}

