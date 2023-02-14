public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("task 1");
        int a = 5;
        byte b = 6;
        short c = 7;
        long d = 12L;
        float e = 6.7F;
        double f = 6.7877;

        System.out.println("Значение переменной а с типом int равно " + a);
        System.out.println("Значение переменной а с типом byte равно " + b);
        System.out.println("Значение переменной а с типом short равно " + c);
        System.out.println("Значение переменной а с типом long равно " + d);
        System.out.println("Значение переменной а с типом float равно " + e);
        System.out.println("Значение переменной а с типом double равно " + f);
        System.out.println();

    }
    public static void task2() {
        System.out.println("task 2");

        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        System.out.println();

    }
    public static void task3() {
        System.out.println("task 3");


        byte classRoom1 = 23;
        byte classRoom2 = 27;
        byte classRoom3 = 30;
        short allPaper = 480;
        int classRoomPaper = allPaper /(classRoom1 + classRoom2 + classRoom3);

        System.out.println("На каждого ученика рассчитано " + classRoomPaper +" листов бумаги");


        System.out.println();

    }
    public static void task4() {

        System.out.println("task 4");
        byte efficiencyMachine = 16/2;
        byte efficiencyMachineOneMinute = efficiencyMachine;
        int efficiencyMachineTwentyMinute = 20/efficiencyMachine;
        int efficiencyMachineOneDay = 1440/efficiencyMachine;
        int efficiencyMachineThreeDay = efficiencyMachineOneDay * 3;
        int efficiencyMachineOneMonth = efficiencyMachineOneDay * 31;

        System.out.println("За 20 минут машина произвела " +  efficiencyMachineTwentyMinute + " штук бутылок");
        System.out.println("За 1 день машина произвела " +  efficiencyMachineOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " +  efficiencyMachineThreeDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " +  efficiencyMachineOneMonth + " штук бутылок");


        System.out.println();

    }
    public static void task5() {
        System.out.println("task 5");

        byte allPaint = 120;
        byte whitePaintOneClassRoom = 2;
        byte brownPaintOneClassRoom = 4;
        int allClassRoom = allPaint /(whitePaintOneClassRoom + brownPaintOneClassRoom );
        int allWhitePaint = allClassRoom * whitePaintOneClassRoom;
        int allBrownPaint = allClassRoom * brownPaintOneClassRoom;

        System.out.println("В школе,где " + allClassRoom + " классов,нужно "+ allWhitePaint +" банок белой краски и " + allBrownPaint + " банок коричневой краски");




        System.out.println();

    }
    public static void task6() {
    System.out.println("task 6");

    short bananas = 5*40;
    short milk = 2*105;
    short iceCream = 2*100;
    short eggs = 4*70;
    int resumeGramBreakfast = bananas + milk + iceCream + eggs;
    float resumeKgBreakfast = resumeGramBreakfast / 1000F;

        System.out.println("Завтрак в граммах " + resumeGramBreakfast + " в киллограммах " +resumeKgBreakfast );


        System.out.println();

}

}


