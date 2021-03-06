import java.util.*;
class TestPass {



    public static void expiryDateList(Passport[] p, Date d) {
        System.out.println("");
        for (int i = 0; i < p.length; i++) {
            if (p[i].isValid(d) == false)
                System.out.print(p[i].getPassNum() + " ");
        }
    }

    public static boolean isFakePassport(Passport[] passArr, Passport pass) {
        boolean x = false;
        for (int i = 0; i < passArr.length; i++) {
            if (passArr[i].getPassNum() == pass.getPassNum())
                x = true;
        }
        return x;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        Date date1 = new Date(day, month, year);
        Date date2 = date1.tomorrow().tomorrow();
        Date date3 = date1.yesterday();

        int num1 = 100 + (int) ((999 - 100 + 1) * Math.random());
        int num2 = 100 + (int) ((999 - 100 + 1) * Math.random());
        int num3 = 100 + (int) ((999 - 100 + 1) * Math.random());

        Passport passport1 = new Passport("john", "smith", num1, date1);
        Passport passport2 = new Passport("peter", "gold", num2, date2);
        Passport passport3 = new Passport("will", "feldman", num3, date3);
        System.out.println(passport1 + "\n\n" + passport2 + "\n\n" + passport3);

        Passport[] passArr = new Passport[2];
        passArr[0] = passport1;
        passArr[1] = passport2;


        if (isFakePassport(passArr, passport3))
            System.out.println("\nThe passport is fake");
        else
            System.out.println("\nThe passport is real");
        System.out.println("\nThe passport is real");


    }
}
