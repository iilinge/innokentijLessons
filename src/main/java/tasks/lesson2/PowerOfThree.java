package tasks.lesson2;

public class PowerOfThree {

    public static void main(String[] arg) {

        System.out.println(powerOfThree(0));
    }


    public static boolean powerOfThree(int a) {
        /*
        метод должен вернуть ответ - является -ли заданое число степенью тройки

        1) пишем бесконечный цикл
        2) проверяем - является ли а единицей
        3) если да то возвращяем true
        4) если нет, то проверяем делится ли оно на 3
        5) если да, то записываем в а результат деления а на 3 и уходим на следующую итерацию цикла
        6) если нет то возвращяем false

        обрати внимание:
        - в методе может быть несколько return ов
            как только любой из них выполняется - метод закончен (прерываются все условия циклы итд)
        - переменную которая обявлена параметром метода (в нашем случае а) мы можем изменять внутри метода

         */

        while (true) {
            if (a == 1) {
                return true;
            } else if ( a==0 ) {
                System.out.println("замкнутый цикл с нулем");
                return false;
            }

            else {
                if (a % 3 == 0) {
                    a = a / 3;
                } else {
                    System.out.print(a);
                    return false;
                }
            }
        }
    }
}

