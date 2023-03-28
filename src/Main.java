import enums.MonthsOfYear;
import enums.WeekDay;

public class Main {

    static int i;
    public static void main(String[] args) {

        System.out.print("Months of Year is:");
        System.out.println();
        for (MonthsOfYear months: MonthsOfYear.values()) {
            i++;
            System.out.println(i + ". " + months.name());

        }

        System.out.println(WeekDay.Monday.isWeekDay());
    }
}