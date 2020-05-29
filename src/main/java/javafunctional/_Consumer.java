package javafunctional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer
{
    public static void main( String[] args )
    {
        Customer asen_sanjula = new Customer( "Asen Sanjula", "9999" );
        greetingCustomer.accept( asen_sanjula );
        greetingCustomerV2.accept( asen_sanjula , false);
    }

    static class Customer
    {
        private String name;
        private String phoneNumber;

        public Customer( String name, String phoneNumber )
        {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName()
        {
            return name;
        }

        public String getPhoneNumber()
        {
            return phoneNumber;
        }
    }

    static Consumer<Customer> greetingCustomer = customer ->
                                                         System.out.println( "Hi " + customer.getName() );
    static BiConsumer<Customer,Boolean> greetingCustomerV2 = ( customer, showNumber ) ->
                                                                     System.out.println( "Hi " + customer.getName() + "Phone number "
                                                                                                 + (showNumber ? customer.phoneNumber : "*****") );
}
