package javafunctional;

import java.util.function.Function;

public class _Function
{
    public static void main( String[] args )
    {
        int apply = incrementByOneFunction.apply( 1 );

        Function<Integer,Integer> incrementAntMultiplyBy10 = incrementByOneFunction.andThen( multiplyBy10Function );

        System.out.println(incrementAntMultiplyBy10.apply( 4 ));

        System.out.println( apply );
    }


    static Function<Integer,Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;


}
