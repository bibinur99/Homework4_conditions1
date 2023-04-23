public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Task One");
        int age = 18;
        if (age < 18) {
            System.out.println("Если ваш возраст равен" + " " + age + " " +
                    "то вы не достигли совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если ваш возраст равен" + " " + age + " " +
                    "то вы достигли совершеннолетия");
        }
        System.out.println();
    }
    public static void task2() {
        System.out.println("Task Two");
        int temp = 3;
        if (temp < 5) {
            System.out.println("На улице" + " " + temp + " " + "градусов," +
                    "нужно надеть шапку");
        } else {
            System.out.println("На улице" + " " + temp + " " + "градусов," +
                    " можно идти без шапки");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task Three");
        int speed = 53;
        if (speed > 60) {
            System.out.println("Если скорость" + " " + speed + " " +
                    "то придется заплатить штраф");
        } else {
            System.out.println("Если скорость" + " " + speed + " " +
                    "можно ездить спокойно");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task Four");
        int age = 65;
        boolean goToSleep = age < 2;
        boolean goToKindergarten = age >= 2 && age <= 6;
        boolean goToSchool = age >= 7 && age < 18;
        boolean goToUniversity = age >= 18 && age <= 24;
        boolean goToWork = age > 24 && age < 60;
        // boolean goToRetired = age >= 60;
        if (goToSleep) {
            System.out.println("Если возраст человека равен" + " " + age + " " + "" +
                    " то ему нужно спать");
        } else if (goToKindergarten) {
            System.out.println("Если возраст человека равен" + " " + age + " " + "" +
                    " то ему нужно ходить в садик");
        } else if (goToSchool) {
            System.out.println("Если возраст человека равен" + " " + age + " " + "" +
                    " то ему нужно ходить в школу");
        } else if (goToUniversity) {
            System.out.println("Если возраст человека равен" + " " + age + " " + "" +
                    " то ему нужно ходить в университет");
        } else if (goToWork) {
            System.out.println("Если возраст человека равен" + " " + age + " " + "" +
                    " то ему нужно работать");
        } else {
            System.out.println("Если возраст человека равен" + " " + age + " " + "" +
                    " то ему можно отдыхать");
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("Task Five");
        int age = 7;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен" + " " + age + " то ему " +
                    "нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен" + " " + age + " то ему " +
                    "можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен" + " " + age + " то ему " +
                    "можно кататься на аттракционе без сопровождения");
        }
        System.out.println();
    }
    public static void task6() {
        System.out.println("Task Six");
        int seats = 102;
        int sitting = 60;
        int standing = seats - sitting;
        int reservSit = 22;
        int reservStand = 15;
        int totalReserv = reservSit + reservStand;
        if (totalReserv < seats && reservSit < sitting) {
            System.out.println("В вагоне есть сободные сидячие места:" + " " + (sitting - reservSit));
        }
        if (totalReserv < seats && reservStand < standing) {
            System.out.println("В вагоне есть сободные стоячие места:" + " " + (standing - reservStand));
        }
        else {
            System.out.println("Мест в вагоне нет");
        }
        System.out.println();
    }
    public static void task7() {
        System.out.println("Task Seven");
        int one = 8;
        int two = 11;
        int three = 45;
        if (one > two && one > three) {
            System.out.println("Maximum is" + " "+ one);
        } else if (two> one && two > three){
            System.out.println("Maximum is" + " "+ two);
        } else if (three > one && three > two) {
            System.out.println("Maximum is" +" "+ three);
        }
         }

    }


























