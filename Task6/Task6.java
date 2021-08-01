package Task6;

import java.io.IOException;

public class Task6 {

    public static int[] volume = {4, 1, 3, 2, 5, 2, 3, 1, 6};
    public static int[] value = {4000, 2500, 2000, 1000, 5000, 100, 200, 0, 9000};
    public static int maxVolume = 6;

    public static void main(String[] args) {

        int[][] arr = new int[volume.length + 1][maxVolume + 1];

        for (int i = 0; i <= volume.length; i++) {
            for (int j = 0; j <= maxVolume; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else {
                    if (volume[i - 1] > j) {
                        arr[i][j] = arr[i - 1][j];
                    } else {
                        int prev = arr[i - 1][j];
                        int formula = value[i - 1] + arr[i - 1][j - volume[i - 1]];
                        arr[i][j] = Math.max(prev, formula);
                    }
                }
            }
        }
        System.out.println(arr[volume.length][maxVolume]);
    }
}
