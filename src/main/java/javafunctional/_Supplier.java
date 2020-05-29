package javafunctional;

import java.util.function.Supplier;

public class _Supplier
{
    public static void main( String[] args )
    {
        System.out.println(getConnectionSupplier.get());
    }


    static Supplier<String> getConnectionSupplier = () -> "test Supplir";
    static String getConnection()
    {
        return "test Supplier";
    }
}
