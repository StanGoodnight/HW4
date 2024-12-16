public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        int age = 18;
        if (age >= 18) System.out.println("Возраст человека равен 18, он соверщеннолетний.");
        else {System.out.println("Он не достиг совершеннолетия, нужно немного подождать");}

        System.out.println("Задание 2.");
            byte theTemperatureIsHigher = 10;
            if (theTemperatureIsHigher > 5) System.out.println("Сегодня тепло, можно идти без шапки");
            if (theTemperatureIsHigher < 5) System.out.println("На улице холодно, нужно надеть шапку");

            byte temperatureBelow = 2;
            if (temperatureBelow > 5) System.out.println("Сегодня тепло, можно идти без шапки");
            if (temperatureBelow < 5) System.out.println("На улице холодно, нужно надеть шапку");

            System.out.println("Задание 3.");
            byte carSpeedOne = 70;
            if (carSpeedOne > 60) System.out.println(" Если скорость больше 60, придется заплатить штраф");
            if (carSpeedOne < 60) System.out.println(" Если скорость меньше 60, можно ездить спокойно");

            byte carSpeedTwo = 50;
            if (carSpeedTwo > 60) System.out.println(" Если скорость больше 60, придётся заплатить штраф");
            if (carSpeedTwo < 60) System.out.println(" Если скорость меньше 60, можно ездить спокойно");

        System.out.println("Задание 4.");
            byte ageOfTheFirstHuman = 3;
            if (ageOfTheFirstHuman >= 2 || ageOfTheFirstHuman <= 6) System.out.println("Если Возраст человека равен " + ageOfTheFirstHuman + ", то ему нужно ходить в детский сад.");
            if (ageOfTheFirstHuman >= 7 || ageOfTheFirstHuman <= 17) System.out.println("Если Возраст человека равен " + ageOfTheFirstHuman + ", то ему нужно ходить в школу.");
            if (ageOfTheFirstHuman >= 18 || ageOfTheFirstHuman <= 24) System.out.println("Если Возраст человека равен " + ageOfTheFirstHuman + ", то ему нужно ходить в университет.");
            if (ageOfTheFirstHuman > 24) System.out.println("Если Возраст человека равен " + ageOfTheFirstHuman + ", то ему нужно ходить на работу.");

            byte ageOfTheSecondHuman = 14;
        if (ageOfTheSecondHuman >= 2 || ageOfTheSecondHuman <= 6) System.out.println("Если Возраст человека равен " + ageOfTheSecondHuman + ", то ему нужно ходить в детский сад.");
        if (ageOfTheSecondHuman >= 7 || ageOfTheSecondHuman <= 17) System.out.println("Если Возраст человека равен " + ageOfTheSecondHuman + ", то ему нужно ходить в школу.");
        if (ageOfTheSecondHuman >= 18 || ageOfTheSecondHuman <= 24) System.out.println("Если Возраст человека равен " + ageOfTheSecondHuman + ", то ему нужно ходить в университет.");
        if (ageOfTheSecondHuman > 24) System.out.println("Если Возраст человека равен " + ageOfTheSecondHuman + ", то ему нужно ходить на работу.");

        byte ageOfTheThirdHuman = 21;
        if (ageOfTheThirdHuman >= 2 || ageOfTheThirdHuman <= 6) System.out.println("Если Возраст человека равен " + ageOfTheThirdHuman + ", то ему нужно ходить в детский сад.");
        if (ageOfTheThirdHuman >= 7 || ageOfTheThirdHuman <= 17) System.out.println("Если Возраст человека равен " + ageOfTheThirdHuman + ", то ему нужно ходить в школу.");
        if (ageOfTheThirdHuman >= 18 || ageOfTheThirdHuman <= 24) System.out.println("Если Возраст человека равен " + ageOfTheThirdHuman + ", то ему нужно ходить в университет.");
        if (ageOfTheThirdHuman > 24) System.out.println("Если Возраст человека равен " + ageOfTheThirdHuman + ", то ему нужно ходить на работу.");

        byte ageOfTheFourthHuman = 30;
        if (ageOfTheFourthHuman >= 2 || ageOfTheFourthHuman <= 6) System.out.println("Если Возраст человека равен " + ageOfTheFourthHuman + ", то ему нужно ходить в детский сад.");
        if (ageOfTheFourthHuman >= 7 || ageOfTheFourthHuman <= 17) System.out.println("Если Возраст человека равен " + ageOfTheFourthHuman + ", то ему нужно ходить в школу.");
        if (ageOfTheFourthHuman >= 18 || ageOfTheFourthHuman <= 24) System.out.println("Если Возраст человека равен " + ageOfTheFourthHuman + ", то ему нужно ходить в университет.");
        if (ageOfTheFourthHuman > 24) System.out.println("Если Возраст человека равен " + ageOfTheFourthHuman + ", то ему нужно ходить на работу.");

        System.out.println("Задание 5.");
        byte ageOfFirstChild = 4;
        if (ageOfFirstChild <=5 ) System.out.println("Если возраст ребенка равен " + ageOfFirstChild + ", то ему нельзя кататься на аттракционе.");
        if (ageOfFirstChild >=5 || ageOfFirstChild <= 14) System.out.println("Если возраст ребенка равен " + ageOfFirstChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        if (ageOfFirstChild > 14) System.out.println("Если возраст ребенка равен " + ageOfFirstChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        byte ageOfTheSecondChild = 10;
        if (ageOfTheSecondChild <=5 ) System.out.println("Если возраст ребенка равен " + ageOfTheSecondChild + ", то ему нельзя кататься на аттракционе.");
        if (ageOfTheSecondChild >=5 || ageOfFirstChild <= 14) System.out.println("Если возраст ребенка равен " + ageOfTheSecondChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        if (ageOfTheSecondChild > 14) System.out.println("Если возраст ребенка равен " + ageOfTheSecondChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        byte ageOfThirdChild = 16;
        if (ageOfThirdChild <=5 ) System.out.println("Если возраст ребенка равен " + ageOfThirdChild + ", то ему нельзя кататься на аттракционе.");
        if (ageOfThirdChild >=5 || ageOfFirstChild <= 14) System.out.println("Если возраст ребенка равен " + ageOfThirdChild + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        if (ageOfThirdChild > 14) System.out.println("Если возраст ребенка равен " + ageOfThirdChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        System.out.println("Задание 6.");
        int passengers = 94;
        int totalNumberOfSeatsInTheCarriage = 102;
        int seatsInTheCarriage = 60;
        int standingPlacesInTheCarriage = totalNumberOfSeatsInTheCarriage - seatsInTheCarriage;
        if (passengers <= seatsInTheCarriage || passengers <= totalNumberOfSeatsInTheCarriage)
        {System.out.println("Есть сидячие места.");}
        if (passengers > seatsInTheCarriage || passengers <= totalNumberOfSeatsInTheCarriage) {System.out.println("Есть стоячие места.");}
        else {System.out.println("Вагон полностью забит.");}

        System.out.println("Задание 7.");

        int one = 97;
        System.out.println("Первое число = " + one + ".");
        int two = 198;
        System.out.println("Второе число = " + two + ".");
        int three = 18;
        System.out.println("Третье число = " + three + ".");
        if (two > one && two > three) System.out.println(two + " больше чем " + one + " и больше чем " + three + ".");
        if (one < two && one > three) System.out.println(one + " меньше чем " + two + ", но больше чем " + three + ".");
        if (three < two && three < one) System.out.println(three + " меньше чем " + two + " и меньше чем " + three + ".");
        else System.out.println("Все числа равны.");




        }

    }
