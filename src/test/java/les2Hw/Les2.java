package les2Hw;

import java.util.Scanner;

public class Les2 {
    public static void main(String[] args) {
        //float temp = ReturnFloat();
        //System.out.println(temp);

        int[] nums = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 10};
        //Task2(nums);
        Task4();
    }

    public static float ReturnFloat() {
        Scanner iSc = new Scanner(System.in);
        float tempFloat = 0.0f;
        System.out.println("Введите число типа Float");
        try {
            tempFloat = iSc.nextFloat();
            return tempFloat;
        } catch (Exception e) {
            System.out.println("Попробуйте еще");
            tempFloat = ReturnFloat();
        }
        return tempFloat;
    }


    public static void Task2(int intArray[]) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) { //нет 8го
            System.out.println("Catching exception: " + e);
        }

    }


    public static void Task4() {
        Scanner iSc = new Scanner(System.in);
        try {
            System.out.print("Введите не пустую строку: ");
            String input = iSc.nextLine();

            if (input.isEmpty()) {
                throw new Exception("Ошибка: введена пустая строка!");
            }

            System.out.println("Вы ввели: " + input);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
