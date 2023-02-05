// В последовательности чисел найти сумму «чётных и положительных» и «нечётных и
// положительных» чисел.

public class Main {
    public static void main(String[] args)
    {
        int positive_sum = 0;
        int negative_sum = 0;

        for (String x : args) {//Вывод всех заданных параметров командной строки

        /* преобразвание строки, хранящейся в переменной "х" в целое число
        и проверка этого числа на чётность*/
            int number = Integer.parseInt(x);
            if ((number % 2 == 0) && (number >= 0)) {
                positive_sum += number;
            }
            if (((number * -1) % 2 == 1) && (number < 0)) {
                negative_sum += number;
            }
        }

        System.out.println(positive_sum);//вывод "нечётного" списка
        System.out.println(negative_sum);//вывод "чётного" списка

    }
}