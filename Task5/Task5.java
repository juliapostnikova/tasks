package Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String num[] = input.split("");
        int n[][] = {
                {
                        9,
                        8,
                        3,
                        3,
                        3,
                        8,
                        9
                },
                {
                        12,
                        10,
                        7,
                        12,
                        12,
                        12,
                        6
                },
                {
                        6,
                        3,
                        15,
                        6,
                        4,
                        4,
                        0
                },
                {
                        6,
                        3,
                        15,
                        6,
                        15,
                        3,
                        6
                },
                {
                        4,
                        2,
                        2,
                        2,
                        0,
                        14,
                        14
                },
                {
                        0,
                        4,
                        4,
                        1,
                        15,
                        3,
                        6
                },
                {
                        6,
                        3,
                        4,
                        1,
                        3,
                        3,
                        6
                },
                {
                        0,
                        2,
                        13,
                        12,
                        11,
                        11,
                        11
                },
                {
                        6,
                        3,
                        3,
                        6,
                        3,
                        3,
                        6
                },
                {
                        6,
                        3,
                        3,
                        5,
                        15,
                        3,
                        6
                }
        };
        String[] b = {
                "*******",
                "****** ",
                "*    * ",
                "*     *",
                "*      ",
                " ******",
                " ***** ",
                " * *   ",
                " *   * ",
                "  ***  ",
                "  **   ",
                "  *    ",
                "   *   ",
                "    *  ",
                "     * ",
                "      *"
        };
        for (int m = 0; m < 7; m++) {
            for (int k = 0; k < num.length; k++) {
                System.out.print(b[n[Integer.parseInt(num[k])][m]] + " ");
            }
            System.out.print("\n");
        }
    }
}
