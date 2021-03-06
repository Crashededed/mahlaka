class Time1 {
    private int hour;
    private int minute;

    public Time1(int h, int m) {
        this.hour = h;
        this.minute = m;
        if (this.hour < 0 || this.hour > 23)
            this.hour = 0;
        if (this.minute < 0 || this.minute > 59)
            this.minute = 0;
    }

    public Time1(Time1 t) {
        this.hour = t.hour;
        this.minute = t.minute;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int num) {
        if (this.hour > 0 && this.hour < 23)
            this.hour = num;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int num) {
        if (this.minute > 0 && this.minute < 59)
            this.minute = num;
    }

    public int minFromMidnight() {
        return (this.hour * 60) + this.minute;
    }

    public boolean before(Time1 other) {
        return minFromMidnight() < other.minFromMidnight();
    }

    public boolean after(Time1 other) {
        return other.before(this);
    }

    public int difference(Time1 other) {
        return minFromMidnight() - other.minFromMidnight();
    }

    public String toString() {
        if ((this.hour >= 0 && this.hour <= 9) && (this.minute >= 0 && this.minute <= 9)) {
            return "0" + this.hour + ":0" + this.minute;
        } else if (this.hour >= 0 && this.hour <= 9) {
            return "0" + this.hour + ":" + this.minute;
        } else if (this.minute >= 0 && this.minute <= 9) {
            return this.hour + ":0" + this.minute;
        } else {
            return this.hour + ":" + this.minute;
        }
    }

    public boolean equals(Time1 other) {
        return this.hour == other.hour && this.minute == other.minute;
    }

}
