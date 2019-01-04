class Time2 {

    private int minFromMid;

    public Time2(int h, int m) {
        if (h < 0 || h > 23)
            h = 0;
        if (m < 0 || m > 59)
            m = 0;
        this.minFromMid = h * 60 + m;
    }

    public Time2(Time2 other) {
        this.minFromMid = other.minFromMid;
    }

    public int getHour() {
        return this.minFromMid / 60;
    }

    public void setHour(int num) {
        if (getHour() >= 0 && getHour() <= 23)
            this.minFromMid = num * 60 + getMinute();
    }

    public int getMinute() {
        return this.minFromMid % 60;
    }

    public void setMinute(int num) {
        if (getMinute() >= 0 && getMinute() <= 59)
            this.minFromMid = getHour() + num;
    }

    public int minFromMidnight() {
        return (getHour() * 60) + getMinute();
    }


    public String toString() {
        if ((getHour() >= 0 && getHour() <= 9) && (getMinute() >= 0 && getMinute() <= 9)) {
            return "0" + getHour() + ":0" + getMinute();
        } else if (getHour() >= 0 && getHour() <= 9) {
            return "0" + getHour() + ":" + getMinute();
        } else if (getMinute() >= 0 && getMinute() <= 9) {
            return getHour() + ":0" + getMinute();
        } else {
            return getHour() + ":" + getMinute();
        }
    }

    public boolean equals(Time2 other) {
        return this.minFromMid == other.minFromMid;
    }

    public boolean before(Time2 other) {
        return this.minFromMid < other.minFromMid;
    }

    public boolean after(Time2 other) {
        return other.before(this);
    }

    public int difference(Time2 other) {
        return this.minFromMid - other.minFromMid;
    }
}
