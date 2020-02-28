package tasks.lesson2;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b){
        /*
        метод должен вернуть наибольший общий делитель чисел a и b
        наибольший общий делитель лежит в дапазоне от 2 до наименьшего из чисел поэтому
        1) находим маньшее из этих двух чисел
        2) создаем переменную для ответа инициализируем ее единицей
        3) перебираем в цикле числа от из 1) до двойки включительно (в обратную сторону, используя i-- в for)
        4) для каждого такого числа проверяем евляется ли оно одновременно делителем а и делителем b
        5) если является, то записываем этот делитель в ответ и прерываем цикл (break)
        6) возвращаем ответ

         */

        int minab = Math.min(a, b);
        int maxab = Math.max(a, b);

        int envResult = 1;
        System.out.println("Наименьшее:" + minab);
        System.out.println("Деление большего на меньшее:" + maxab/minab);

        for (int j = minab; j >= 2; j-- ) {

         if ((a%j==0) & (b%j==0)) {
            envResult = j;
             break;
         }
        }

        System.out.print("Наибольший общий делитель:"+ envResult + "\n");

        return envResult;
    }

    public static void main(String[] arg) {
        GreatestCommonDivisor.gcd(8733,8733);
    }
}
