// В последовательности чисел найти сумму «чётных и положительных» и «нечётных и
// положительных» чисел.

public class Main {
    public static void main(String[] args)
    {
        int sum1 = 0;
        int sum2 = 0;

        for (String x : args)
        {//Вывод всех заданных параметров командной строки
        /* преобразвание строки, хранящейся в переменной "х" в целое число
        и проверка этого числа на чётность*/
            int number = Integer.parseInt(x);
            if (number >= 0)
            {
                if (number % 2 == 1){
                    sum1 += number;
                }
                else {
                    sum2 += number;
                }
            }
        }
        // System.out.println(sum1);//вывод "нечётного" списка
        // System.out.println(sum2);//вывод "чётного" списка
        System.out.println(sum1 + sum2);

    }
}