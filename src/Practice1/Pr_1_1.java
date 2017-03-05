package Practice1;

import java.util.Scanner;


public class Pr_1_1 {
    public byte b;
    public short sh;
    public int i;
    public long l=2;
    public char ch;

    public  float f;
    public  double d;

    public boolean bool;


    public static void main(String[] args) {

        Pr_1_1 pr11 = new Pr_1_1();
        char c = 'ж';

        System.out.println("Привет");
        System.out.println(c);


        System.out.println("----------------------------");

        System.out.println("byte - " + pr11.b);
        System.out.println("short - " + pr11.sh);
        System.out.println("int - " + pr11.i);
        System.out.println("long - " + pr11.l);
        System.out.println("char - " + pr11.ch);
        System.out.println("float - " + pr11.f);
        System.out.println("double - " + pr11.d);
        System.out.println("boolean - " + pr11.bool + "" + "\n\t---------");

        showLocalVar();

        System.out.println("\n\t---------");

        showFloat();

        System.out.println("\n\t---------");

        showShort();

        System.out.println("\n\t---------");

        triange(3, 4, 5);

        System.out.println("\n\t---------");
        sumOfInt();

        System.out.println("\n\t---------");
        sumOfEvenInt();

        System.out.println("\n\t---------");
        primeNumber();

        System.out.println("\n\t---------");
        threeVariable();

        System.out.println("\n\t---------");
        showAverageOfNumber();

        System.out.println("\n\t---------");
        showPayOfCredit();

    }

    public static int enterOnlyInt (){
        int number=0;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Введите целое число: ");

            if (sc.hasNextInt()) {
                number = sc.nextInt();

                break;
            }
            System.out.println("Это не целое число");
            String line = sc.nextLine();
        }
        return number;
    }

    public static double enterOnlyDouble (){
        double number=0;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Введите дробное число: ");

            if (sc.hasNextDouble()) {
                number = sc.nextDouble();

                break;
            }
            System.out.println("Это не  число");
            String line = sc.nextLine();
        }
        return number;
    }

    public static   void showLocalVar(){
        byte b = 0b0111_1111;
        short sh = 0b1000_0000;
        int i = 256;
        long l = 512;
        char ch = '\102';
        float f = 10.0f;
        double d = 20.0;
        boolean bool = true;

        System.out.println("byte - " + b);
        System.out.println("short - " + sh);
        System.out.println("int - " + i);
        System.out.println("long - " + l);
        System.out.println("char - " + ch);
        System.out.println("float - " + f);
        System.out.println("double - " + d);
        System.out.println("boolean - " + bool);
    }

    public static void showFloat(){
        float f1 = 1.f;
        float f2 = 1000;
        float f3 = 0x1;
        float f4 = 0b1;
        float f5 =1.0e1f;
        float f6 = 01;

        System.out.println("f1 - " + f1);
        System.out.println("f2 - " + f2);
        System.out.println("f3 - " + f3);
        System.out.println("f4 - " + f4);
        System.out.println("f5 - " + f5);
        System.out.println("f6 - " + f6);

    }
    public static void showShort(){
        byte b = 85;
        int i = 5;
        double d = 5.0;
        float f = 10.0f;
        short sh1 = 127+1;
        //short sh2 = 15 + 1.0;
        //short sh3 = i+d;
       // short sh4 = b + sh1;
       // short sh5 = f + d;

        System.out.println("b1 - " + sh1);
        System.out.println("sh1 - " + sh1);
        //System.out.println("f2 - " + sh2);
        //System.out.println("f3 - " + sh3);
        //System.out.println("f4 - " + sh4);
        //System.out.println("f5 - " + sh5);
    }

    public static void triange(int cat1, int cat2, int gip){
        System.out.println((gip*gip == cat1*cat1 + cat2*cat2)?"This triangle is rectangular":"Not rectangular");

    }

    public static void sumOfInt(){
        System.out.println("task 5: sum of integer");
        int count = enterOnlyInt();
        int summ = 0;
        for(int i=0; i<=count; i++){
            summ += i;
        }
        System.out.println("sum of int = " + summ);
    }

    public static void sumOfEvenInt(){
        System.out.println("task 6: sum of even integer");
        int number;
        int summ = 0;

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Введите целое число: ");

            if (sc.hasNextInt()) {
                number = sc.nextInt();
                break;
            }

            String line = sc.nextLine();
        }

        for(int i=0; i<=number; i++){
            if( (i%2) == 0) summ += i;
        }

        System.out.println("sum of even integer = " + summ);
    }

    public static void primeNumber(){
        System.out.println("task 7:summ of prime integer");
        int number =0;
        int summ = 0;

        number = enterOnlyInt();

        for(int i=1; i<=number; i++){
            int count=0;
            for(int j=1; j<=i; j++) {
                if (i % j == 0) count++;
            }
            if (count == 2 || count == 1) summ +=i;
        }

        System.out.println("sum of prime integer = " + summ);
    }

    public static void threeVariable(){
        System.out.println("task 8: sum of two number = third");
        int a;
        int b;
        int c;

        a = enterOnlyInt();

        b = enterOnlyInt();

        c = enterOnlyInt();

        System.out.println("a = " + a + "\tb = " + b + "\tc = " + c);

        if ( a+b == c ) System.out.println("a+b=c is " + true);
        if ( a+c == b ) System.out.println("a+c=b is " +true);
        if ( b+c == a ) System.out.println("b+c=a is " +true);
    }

    public  static void showAverageOfNumber(){
        System.out.println("task 9: average value of the numbers");
        int a,b,summ=0,count=0;
        double average=0;
        a = enterOnlyInt();
        while (a < (b = enterOnlyInt())){
            System.out.println("Второе введенное число должно быть меньше " + a);
        }

        System.out.println(a+ "  "+b);


        for (int i=a; i>=b; i--){
            summ +=i;
            count++;
        }
        average =( (double)(summ) / count);
        System.out.println("average number = " + average);
    }

    public static void showPayOfCredit(){
        System.out.println("task 10: Credit");
        double credit, stavka, monthPay, montPayTelo, monthPayProc, dolg, summProc=0;
        int srok;
        System.out.println("Введите срок кредитование в месяцах");
        srok = enterOnlyInt();
        System.out.println("Введите сумму кредита");
        credit = enterOnlyDouble();
        System.out.println("Введите процентную ставку");
        stavka = enterOnlyDouble();
        dolg=credit;
        monthPay = (  credit * (stavka/100/12)  ) / (   1 - (  1 / Math.pow((1 + ( stavka/100/12 )),srok  ))   );
        System.out.println(monthPay);

        System.out.println("| Month | Ostatok dolga | MonthPay | MonthPayTelo | MonthPayProc |");
        System.out.println("-----------------------------------------------------------------");

        for(int i=1; i<=srok; i++){
            monthPayProc = dolg * (stavka/100/12);
            montPayTelo = monthPay - monthPayProc;
            dolg -=montPayTelo;
            summProc +=monthPayProc;

            /*System.out.println("month "+i+" | dolg%8.2f "+dolg+" | monthPay "+monthPay+" | monthPayTelo "+montPayTelo
                                + " | monthPayProc "+monthPayProc);*/

            System.out.printf("|\t%d\t|" + "\t%.2f\t|" + "\t%.2f\t|" + "\t%.2f\t|" + "\t%.2f\t|" + "\n",
                    i, dolg, monthPay, montPayTelo, monthPayProc);

            System.out.println("-----------------------------------------------------------------");


        }

        System.out.printf("Sum of Procent %.2f", summProc);

    }
}


