class TestShever {


    public static void main(String[] args) {

        Shever a = new Shever(-1);
        System.out.println(a);
        Shever b = new Shever(6, 8);
        System.out.println(b);
        Shever c = a.sum(b);
        System.out.println(a + "+" + b + "=" + c);
        Shever d = a.diff(b);
        System.out.println(a + "-" + b + "=" + d);
        Shever e = a.mult(b);
        System.out.println(a + "*" + b + "=" + e);
        Shever f = a.div(b);
        System.out.println(a + "/" + b + "=" + f);
        boolean g = a.equal(b);
        boolean h = a.greater(b);
        boolean i = a.smaller(b);

        if (g)
            System.out.println("they are equal");
        else if (g == false) {
            System.out.println("they are unequal");
            if (h)
                System.out.println("a>b");
            else if (i)
                System.out.println("a<b");


        }
    }
}