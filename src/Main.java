import enums.MonthsOfYear;
import enums.WeekDay;

public class Main {

    static int i;

    public static void main(String[] args) {

        System.out.print("Months of Year is:");
        System.out.println();
        for (MonthsOfYear months : MonthsOfYear.values()) {
            i++;
            System.out.println(i + ". " + months.name());

        }

        System.out.println("=================================");
        System.out.println();

        WeekDay day = WeekDay.Sunday;

        switch (day) {
            case Monday:
                //day.isWeekDay();
                System.out.print(WeekDay.Monday.isWeekDay());
                System.out.print(" - " + day + " is Weekday!");
                break;

            case Tuesday:
                //day.isWeekDay();
                System.out.print(WeekDay.Tuesday.isWeekDay());
                System.out.print(" - " + day + " is Weekday!");
                break;

            case Wednesday:
                //day.isWeekDay();
                System.out.print(WeekDay.Wednesday.isWeekDay());
                System.out.print(" - " + day + " is Weekday!");
                break;

            case Thursday:
                //day.isWeekDay();
                System.out.print(WeekDay.Thursday.isWeekDay());
                System.out.print(" - " + day + " is Weekday!");
                break;

            case Friday:
                //day.isWeekDay();
                System.out.print(WeekDay.Friday.isWeekDay());
                System.out.print(" - " + day + " is Weekday!");
                break;

            case Saturday:
                //day.isHoliDay();
                System.out.print(WeekDay.Saturday.isHoliDay());
                System.out.print(" - " + day + " is Holiday!");
                break;

            case Sunday:
                //day.isHoliDay();
                System.out.print(WeekDay.Sunday.isHoliDay());
                System.out.print(" - " + day + " is Holiday!");
                break;

            default:
                System.out.println("This Day Not Exist!");
                break;
        }

        System.out.println();
        System.out.println("=================================");
        System.out.println();

        boolean stBoolean = Boolean.parseBoolean("true");
        byte stByte = Byte.parseByte("120");
        short stShort = Short.parseShort("32000");
        int stInt = Integer.parseInt("147895632");
        long stLong = Long.parseLong("987654321987654321");
        double stDouble = Double.parseDouble("4444.5d");
        float stFloat = Float.parseFloat("2354.56f");

        System.out.println("1. String to Boolean - " + stBoolean);
        System.out.println("2. String to Byte - " + stByte);
        System.out.println("3. String to Short - " + stShort);
        System.out.println("4. String to Integer - " + stInt);
        System.out.println("5. String to Long - " + stLong);
        System.out.println("6. String to Double - " + stDouble);
        System.out.println("7. String to Float - " + stFloat);

    }
}