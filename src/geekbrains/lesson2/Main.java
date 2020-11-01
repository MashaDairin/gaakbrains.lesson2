package geekbrains.lesson2;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        //task1
        //проходясь дебагом он заменяет 1 на 0, а 0 на 1, всего выходит: 0 1 1 0,
        // однако в консоли выдает дополнительные числа,
        // если вы можете, то объясните пожайлуста почему так происходит
        int[] arr = {1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
        arr[i] = 1;
        System.out.print(arr[i] + " ");
        } else
        arr[i] = 0;
        System.out.print(arr[i] + " ");
        }

        //task 2
        int[] arr5 = new int[8];
        arr5[0] = 0;
        for (int i = 0; i < arr5.length; i++) {
          arr5[1] = arr5[0] + 3;
          arr5[2] = arr5[1] + 3;
          arr5[3] = arr5[2] + 3;
          arr5[4] = arr5[3] + 3;
          arr5[5] = arr5[4] + 3;
          arr5[6] = arr5[5] + 3;
          arr5[7] = arr5[6] + 3;
          System.out.print(arr5[i] + " ");
        }

        //task3
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
                System.out.print(arr2[i] + " ");
            }
        }

        //task4
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[0][0] = 1;
            arr3[1][1] = 1;
            arr3[2][2] = 1;
            System.out.println(Arrays.toString(arr3[i]));
        }
        }
    }






