public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        if (validDate()) {
            this.day = 1;
            this.month = 1;
            this.year = 1;
        }
    }

    int daysInMonth(int m) {
        if (m == 2)
            return 28;
        else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            return 31;
        else if (m == 4 || m == 6 || m == 9 || m == 11)
            return 30;
        else
            return 0;
    }

    boolean validDate() {

        if (this.day > 0 && this.day <= (daysInMonth(this.month)) && this.month > 0 && this.month <= 12) {
            return false;
        } else {
            return true;
        }

    }

    int compareTo(Date other) {
        if (this.year > other.year)
            return -1;
        else if (this.year == other.year && this.month > other.month)
            return -1;
        else if (this.year == other.year && this.month == other.month && this.day > other.day)
            return -1;
        else if (this.year == other.year && this.month == other.month && this.day == other.day)
            return 0;
        else
            return 1;
    }

    Date tomorrow() {
        int d = this.day;
        int m = this.month;
        int y = this.year;
        if (d == 31 && m == 12) {
            d = 1;
            m = 1;
            y++;
        } else if (d == daysInMonth(m)) {
            d = 1;
        } else {
            d++;
        }
        return new Date(d, m, y);
    }

    Date yesterday() {
        int d = this.day;
        int m = this.month;
        int y = this.year;

        if (d == 1 && m == 1) {
            d = 31;
            m = 12;
            if (y > 1)
                y--;
        } else if (d == 1) {
            d = daysInMonth(m - 1);
        } else {
            d--;
        }
        return new Date(d, m, y);
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int num) {

        this.day = num;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int num) {

        this.month = num;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int num) {

        this.year = num;
    }


    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }


}