package Chapter_6;

import java.util.Scanner;

public class Sphere_Volume {
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        double radius = input.nextDouble();

        System.out.printf( "Volume is %f\n", sphereVolume( radius ) );
    }

    public static double sphereVolume( double radius )
    {
        double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
        return volume;
    }
}
