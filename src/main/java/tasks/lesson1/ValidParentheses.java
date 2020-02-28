package tasks.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;



public class ValidParentheses {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите последовательность: ");
        String envIn = in.nextLine();
        System.out.println(envIn);

        checkValidness (envIn);
    }




    public static boolean checkValidness(String envInput) {
        //TODO написать функцию, проверяющую правильность комбинации скобок
        // на вход подается комбинация из обычных, квадратных или фигурных скобок например "[()[{}]]"
        // нужно проверить - является ли такая комбинация верной
        // 1) каждой открывающей скобке должна соответсвовать закрывающая скобка
        // 2) каждая пара скобок должна начинаться с отрывающей
        // 3) если пара скобок открывается внутри другой пары, то и закрываться она должна внутри нее
        // валидные пары ([{}]), (()[{()}([])])
        // не валидные {], ({[}])
        // нужно попытаться написать код так, чтобы можно было легко добавить новые типы скобок, например <>
        // возможно стоит создать и применить какие-то дополнительные классы
        // чтобы понять какие - нужно ответить на вопрос, какую функцию они выполняют? в чем их смысл

        System.out.println("тест");




        return false;
    }
}

// public class AddBrackets {
/*    String envBr1open = "(";
    String envBr1close = ")";
    String envBr2open = "[";
    String envBr2close = "]";
    String envBr3open = "{";
    String envBr3close = "}";
    String envBr4open = "<";
    String envBr4close = ">";
   // String envBr5open = "(";
   //  String envBr5close = ")";
   // String envBr6open = "(";
   // String envBr6close = ")";



}*/
