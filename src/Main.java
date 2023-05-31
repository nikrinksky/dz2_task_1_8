public class Main {
    public static void main(String[] args) {

        // Задача 1:
        task1();
        System.out.println("------------------");
        // Задача 2:
        task2();
        System.out.println("------------------");
        // Задача 3:
        task3();
        System.out.println("------------------");
        // Задача 4:
        task4();
        System.out.println("------------------");
        //Задача 5:
        task5();
        System.out.println("------------------");
        //Задача 6:
        task6();
        System.out.println("------------------");
        //Задача 7:
        task7();
        System.out.println("------------------");
        //Задача 8:
        task8();
        System.out.println("------------------");
    }
    public static void task1() {
        System.out.println("Задача 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task2() {
        System.out.println("Задача 2:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task3() {
        System.out.println("Задача 3:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task4() {
        System.out.println("Задача 4:");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);
    }

    public static void task5() {
        System.out.println("Задача 5:");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);
    }

    public static void task6() {
        System.out.println("Задача 6:");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес бойцов = " + totalWeight + " кг.");
        var differenceWeight = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе бойцов = " + differenceWeight + " кг.");
    }

    public static void task7() {
        System.out.println("Задача 7:");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var differenceWeight_1 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе спортсменов первый вариант = " + differenceWeight_1 + " кг.");
        var differenceWeight_2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница в весе спортсменов второй вариант = " + differenceWeight_2 + " кг.");
    }

    public static void task8() {
        System.out.println("Задача 8:");
        var totalHours = 640;
        var oneEmployeeHours = 8;
        var totalEmployees = totalHours / oneEmployeeHours;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        var totalEmployees2 = 94 + totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees2 + " человек, то всего " +
                totalEmployees2 * oneEmployeeHours + " часов работы может быть поделено между сотрудниками");

    }
}

