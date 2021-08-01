package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Task2 {
    public static void main(String[] args) throws IOException {

        double[] num = new double[8];
        double[] firstVector = new double[4];
        double[] secondVector = new double[4];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < num.length; i++){
            num[i] = Double.parseDouble(reader.readLine());
        }

        System.arraycopy(num, 0, firstVector, 0, 4);
        System.arraycopy(num, 4, secondVector, 0, 4);


        double vector1 = getLength(firstVector[0], firstVector[1], firstVector[2], firstVector[3]);
        double vector2 = getLength(secondVector[0], secondVector[1], secondVector[2], secondVector[3]);

        System.out.println(firstVector[0]);
        System.out.println(secondVector[0]);



        }
    public static double getLength( double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    }

    }
