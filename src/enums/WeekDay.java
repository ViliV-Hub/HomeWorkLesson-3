package enums;

public enum WeekDay {
    Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;

    WeekDay day;

    public boolean isWeekDay() {

        switch (day) {
            case Monday:
                return true;
                break;

            case Tuesday:
                return true;
                break;

            case Wednesday:
                return true;
                break;

            case Thursday:
                return true;
                break;

            case Friday:
                return true;
                break;

            default:
                return false;
        }
    }
}
