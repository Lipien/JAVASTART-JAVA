package methodsandconstructors;

public class UnitsRecalculator {
    public static void main(String[] args) {

        TimeUnitsRecalculator timeUnitsRecalculator = new TimeUnitsRecalculator();
        int hours = 14;
        int resultMinutes = timeUnitsRecalculator.hoursToMinutes(hours);
        int resultSeconds = timeUnitsRecalculator.minutesToSeconds(resultMinutes);
        int resultMiliseconds = timeUnitsRecalculator.secondsToMilliseconds(resultSeconds);

        System.out.println(hours + " hours equals " + resultMiliseconds + " milliseconds");
    }
}
