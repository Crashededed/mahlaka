class Shever {
    private int mo;
    private int me;

    public Shever(int x, int y) {
        this.mo = x;
        this.me = y;
    }

    public Shever(int x) {
        this.mo = x;
        this.me = 1;

    }

    public String toString() {
        return this.mo + "/" + this.me;
    }

    public Shever sum(Shever other) {
        int resMo = this.mo * other.me + this.me * other.mo;
        int resMe = this.me * other.me;
        Shever res = new Shever(resMo, resMe);
        return res;
    }

    public Shever diff(Shever other) {
        int resMo = this.mo * other.me - this.me * other.mo;
        int resMe = this.me * other.me;
        Shever res = new Shever(resMo, resMe);
        return res;
    }

    public Shever mult(Shever other) {
        int resMo = this.mo * other.mo;
        int resMe = this.me * other.me;
        Shever res = new Shever(resMo, resMe);
        return res;
    }

    public Shever div(Shever other) {
        int resMo = this.mo * other.me;
        int resMe = this.me * other.mo;
        Shever res = new Shever(resMo, resMe);
        return res;
    }

    public boolean equal(Shever other) {
        return this.mo * other.me == this.me * other.mo;
    }

    public boolean greater(Shever other) {
        return this.mo * other.me > this.me * other.mo;
    }

    public boolean smaller(Shever other) {
        return this.mo * other.me < this.me * other.mo;
    }
}