package by.it.kharevich.codewars;


import java.util.Arrays;


public class Task50StatisticsForAnAthleticAssociation {
    public static String stat(String strg) {
        String[] timesString = strg.replace(" ", "").split(",");
        int[] times = new int[timesString.length];
        for(int i = 0; i < timesString.length; i++) {
            String[] timeString = timesString[i].replace("|", " ").split(" ");
            times[i] = Integer.parseInt(timeString[0]) * 3600 + Integer.parseInt(timeString[1]) * 60 + Integer.parseInt(timeString[2]);
        }
        Arrays.sort(times);
        int range = times[times.length - 1] - times[0];
        int average = Arrays.stream(times).sum() / times.length;
        int median;
        if(times.length %2 == 0) {
            median = (times[(times.length/2 - 1)] + times[(times.length/2)]) / 2;
        } else {
            median = times[times.length/2];
        }

        return "Range: " + String.format("%02d|%02d|%02d", range / 3600, (range / 60) % 60, range % 60) +
                " Average: " + String.format("%02d|%02d|%02d", average / 3600, (average / 60) % 60, average % 60) +
                " Median: " + String.format("%02d|%02d|%02d", median / 3600, (median / 60) % 60, median % 60);
    }

    public static void main(String[] args) {
        System.out.println(stat("01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17"));
    }
}
