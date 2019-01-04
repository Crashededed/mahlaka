class Passport {
    private String firstName;
    private String lastName;
    private int passNum;
    private Date expiryDate;

    public Passport(String firstName, String lastName, int passNum, Date expiryDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passNum = passNum;
        this.expiryDate = expiryDate;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getPassNum() {
        return this.passNum;
    }

    public Date getExpiryDate() {
        return this.expiryDate;
    }

    public void setExpiryDate(Date d) {

        this.expiryDate = d;
    }

    public boolean isValid(Date currentDate) {
        if ((this.expiryDate).compareTo(currentDate) == 1)
            return true;
        else
            return false;
    }


    public void checkAndSet(Passport pass, Date d) {

        if (pass.isValid(d) == false) {
            if (d.getYear() % 4 == 0 && d.getMonth() == 2 && d.getDay() == 29) {
                d.setYear(d.getYear() + 10);
                d.setMonth(3);
                d.setDay(1);
            } else
                d.setYear(d.getYear() + 10);

        }
    }

    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + "\n" + "Passport number: " + this.passNum + "\n" + "Exp date: " + this.expiryDate;
    }


}