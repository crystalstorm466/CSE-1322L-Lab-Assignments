package Lab09;

import java.util.Scanner;

public class Lab9 {
    public static void isHourValid(String hour) throws InvalidTimeException {
        if (Integer.parseInt(hour) > 24) {
            throw new InvalidTimeException("Hour not valid");
        } else { return; }
    }

    public static void isMinuteValid(String minute) throws InvalidTimeException {
        if (Integer.parseInt(minute) > 60) {
            throw new InvalidTimeException("Minute not valid");
        } else { return; }
    }

    public static void iSSecondValue(String second) throws InvalidTimeException {
        if (Integer.parseInt(second) > 60) {
            throw new InvalidTimeException("Second not valid");
        } else { return; }
    }

    public static void isTimeValid(String[] time) throws InvalidTimeException {
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);
        int second = Integer.parseInt(time[2]);

        if (time.length != 3) {
            throw new InvalidTimeException("Time format not valid");
        }
        if ( hour < 0 ||hour > 23) {
            throw new InvalidTimeException("Hour not valid");
        }
        if ( minute < 0 || minute > 59) {
            throw new InvalidTimeException("Minute not valid");
        }
        if ( second < 0 ||second > 59) {
            throw new InvalidTimeException("Second not valid");
        }



    }


    public static boolean timeValidator(String time) throws InvalidTimeException {
        String[] clock = time.split(":");
        try {
            isTimeValid(clock);
        } catch (InvalidTimeException e) {
            System.out.println(e.toString());
        }
        return true;
    }

    public static int getSeconds(String time1, String time2) {
        String[] ClockOne = time1.split(":");
        String[] ClockTwo = time2.split(":");

        int firstHours = Integer.parseInt(ClockOne[0]);
        int firstMinute = Integer.parseInt(ClockOne[1]);
        int firstSecond = Integer.parseInt(ClockOne[2]);
        int secondHours = Integer.parseInt(ClockTwo[0]);
        int secondMinute = Integer.parseInt(ClockTwo[1]);
        int secondSeconds = Integer.parseInt(ClockTwo[2]);
        int secondsOne = firstHours * 3600 + firstMinute * 60 + firstSecond;
        int secondsTwo = secondHours * 3600 + secondMinute * 60 + secondSeconds;
        return Math.abs(secondsTwo - secondsOne);
    }
    public static void main(String[] args) throws InvalidTimeException {
        Scanner scan = new Scanner(System.in);
        String time1;
        String time2;
        do {
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS");
            time1 = scan.next();
            if (!(timeValidator(time1))) { System.out.println("Please enter a valid time!"); }
        } while(!(timeValidator(time1)));
        do {
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS");
             time2 = scan.next();
             if (!(timeValidator(time2))) { System.out.println("Please enter a valid time!"); }
        } while(!(timeValidator(time2)));
        System.out.println("Difference in seconds: " + (getSeconds(time1, time2)));
    }


}
