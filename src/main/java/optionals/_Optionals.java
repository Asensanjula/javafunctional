package optionals;

import java.util.Optional;

public class _Optionals
{
    public static void main( String[] args )
    {

        String  value = "Jhog@gmail.com";
        Optional.ofNullable( value )
                .ifPresentOrElse( email -> System.out.println("This is the email" + email) ,
                        () -> {
                            System.out.println("Cannot send Email");
                        });
    }
}
