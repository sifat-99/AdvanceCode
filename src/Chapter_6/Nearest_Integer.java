package Chapter_6;

import java.util.Scanner;

public class Nearest_Integer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=0;
        b= (float) Math.floor(a+0.5);
        System.out.printf("The original number is %f\nThe Nearest integer number is %f\n",a,b);

    }
}
