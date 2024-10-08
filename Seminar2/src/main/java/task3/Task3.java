package task3;

/**
 * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */
public class Task3 {

    public static boolean zeroNeighbour(int[] numbers){
        boolean flag = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if ((numbers[i] == 0) && (numbers[i+1] == 0)){
                flag = true;
            }
        }
        return flag;
    }

}
