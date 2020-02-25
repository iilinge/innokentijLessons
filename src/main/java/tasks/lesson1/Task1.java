package tasks.lesson1;

public class Task1 {
    public static String primeNumbers(int maximum) {
        //TODO: вернуть строку простых чисел которые <= maximum начиная с двойки, разделитель-запятая "2,3,5..."
        // начало кода Иннокентий

        String envResult = "";
        String envDetermine = ",";


        for (int envNumber = 2; envNumber <= maximum; envNumber++) {
            boolean envType = true;
            for (int j = 2; j<envNumber; j++) {
                if  (envNumber % j == 0) {
                    envType = false;
                }
            }
            if  (envType == true) {
                envResult = envResult + envDetermine + envNumber;
            }
                envType = true;
        }

        if (envResult.length() != 0 ) {
            envResult = envResult.substring(1, envResult.length());
        }

        System.out.println(envResult);

        return envResult;
    }

    public static void main(String[] args) {
        System.out.println(primeNumbers(10));
    }

}

