import task1.Task1;
import task2.Task2;
import task3.Task3;

public class Main {
    public static void main(String[] args) {

        /**
         * Task1
         */
        System.out.println("Количество четных элементов массива {2, 1, 2, 3, 4} → " + Task1.countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println("Количество четных элементов массива {2, 2, 0} → " + Task1.countEvens(new int[] {2, 2, 0}));
        System.out.println("Количество четных элементов массива {1, 3, 5} → " + Task1.countEvens(new int[] {1, 3, 5}));

        /**
         * Task2
         */
        try {
            System.out.println("Разница между самым большим и самым маленьким элементами массива → "
                    + Task2.maxMinDiff(new int[]{1, 5, 0, 7, -3, 6, 15, -2, 0, -2, 1, 9}));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
//////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            System.out.println("Разница между самым большим и самым маленьким элементами массива → "
                    + Task2.maxMinDiff(new int[] {}));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
//////////////////////////////////////////////////////////////////////////////////////////////////
        try {
            System.out.println("Разница между самым большим и самым маленьким элементами массива → "
                    + Task2.maxMinDiff(new int[] {3, 6 ,2, 9, 15, 10, 23, 5, 4, 3, 2, 9}));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
//////////////////////////////////////////////////////////////////////////////////////////////////

        /**
         * Task3
         */
        System.out.println(Task3.zeroNeighbour(new int[] {0, 4, 1, 5, 0})); //false
        System.out.println(Task3.zeroNeighbour(new int[] {0, 0, 3, 3, 3})); //true
        System.out.println(Task3.zeroNeighbour(new int[] {0, 3, 3, 0, 0})); //true
        System.out.println(Task3.zeroNeighbour(new int[] {0, 5, 0, 5, 3})); //false
        System.out.println(Task3.zeroNeighbour(new int[] {-1, 0, 1, 1, 4})); //false
        System.out.println(Task3.zeroNeighbour(new int[] {-1, 0, 0, 3, 0})); //true
    }
}
