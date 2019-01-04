class TestTime {


    public static void main(String[] args) {

        Time2 a = new Time2(16, 12);
        System.out.println(a);
        System.out.println(a.minFromMidnight());
        Time2 b = new Time2(6, 12);
        System.out.println(b);
        System.out.println(b.minFromMidnight());
        boolean e = a.equals(b);
        if (e)
            System.out.println("they are equal");
        else
            System.out.println("they are unequal");
        System.out.println("a<b:" + a.before(b));
        System.out.println("a>b:" + a.after(b));
        System.out.println("a-b=" + a.difference(b));


    }
}