package august.aug_0805_class.morningTest;

public class MorningTest_ref {
    public static void main(String[] args) {
        /*
        1번 - 4
        2번 - 3
        3번 - 2
        4번 - 2
        5번 - 3
        6번 - 3 / 5
         */

        //7번
        int[] array = {1, 5, 3, 8, 2};
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min) min = array[i];
        }
        System.out.println(min);

        // 8번
        int[][] array8 = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int sum8 = 0;
        int num = 0;
        for (int i = 0; i < array8.length; i++) {
            for (int j = 0; j < array8[i].length; j++) {
                sum8 += array8[i][j];
                num++;
            }
        }
        System.out.printf("전체합 : %d\n평균 : %.1f", sum8, sum8 / (double) num);
    }
}
