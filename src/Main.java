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

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен "+age+", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен "+age+", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int tempOutside = 17;
        if (tempOutside < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 17;
        if (speed > 60) {
            System.out.println("Если скорость "+speed+", придется заплатить штраф");
        } else {
            System.out.println("Если скорость "+speed+", можно ездить спокойно");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 17;
        if (age >= 2 && age < 6) {
            System.out.println("Марш в детский сад! Дружный класс. Дважды два. Раз на раз.");
        } else if (age < 18) {
            System.out.println("Мой-то? Да всё в облаках, как в детстве, витает.\n" +
                    "Ты ничем не лучше других, чудес не бывает.");
        }else if (age < 24) {
            System.out.println("На, сделай пару тяг - стены полетят.\n" +
                    "Чё, ништяк, по шестьдесят, -бери сейчас!");
        } else {
            System.out.println("Сожалеем, но у нас всё так же нет вакансий.\n" +
                    "Как ты был неблагодарный, так жизнь сломал мне.\n" +
                    "На могильном камне пусть выбьют как-нибудь пошикарней.");
            }
        }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 17;
        if (age < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        } else if (age < 14) {
            System.out.println("Можно кататься в сопровождении взрослого");
        }else {
            System.out.println("Можно кататься без сопровождения взрослого");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        int passangerCount = 17;
        if (passangerCount < 60) {
            System.out.println("Есть свободные места");
        } else if (passangerCount < 102) {
            System.out.println("Есть только стоячие места");
        }else {
            System.out.println("Мест нет");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 10;
        int two = 12;
        int three = 11;
        if (one > two && one > three) {
            System.out.println("The biggest is one");
        } else if (two > one && two > three) {
            System.out.println("The biggest is two");
        }else if (three > one && three > two) {
            System.out.println("The biggest is three");
        } else {System.out.println("There is no biggest number");}
    }
}