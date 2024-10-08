package task2;

/**
 * Написать функцию, возвращающую разницу между самым большим и
 * самым маленьким элементами переданного не пустого массива.
 */
public class Task2 {

    public static int maxMinDiff (int[] numbers){
        if (numbers.length != 0) {
            int min = numbers[0];
            int max = numbers[0];
            int diff;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            diff = max - min;
            return diff;
        }
        else{
            System.out.println("Массив пустой");
            throw new IllegalArgumentException();

        }
    }
}
