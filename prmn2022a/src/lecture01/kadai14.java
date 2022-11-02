package lecture01;

import java.util.Scanner;

public class kadai14 {
    public static void main(String[] args) {

        int[] array = new int[100];
        int sum=0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("配列番号が偶数の値の総和は"+sum);
    }
}
