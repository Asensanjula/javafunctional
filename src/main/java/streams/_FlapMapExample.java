package streams;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _FlapMapExample
{
    public static void main( String[] args )
    {
        List<Person> personList = List.of(
                new Person( "Asen", Gender.MALE, List.of( "1", "2" ) ),
                new Person( "Sanjula", Gender.MALE, List.of( "3", "4" ) ),
                new Person( "Saduni", Gender.FEMALE, List.of( "5", "6" ) )
        );


        Optional<String> any = personList.stream()
                                               .map( person -> person.getPhoneNumbers().stream() )
                                               .flatMap( stringStream -> stringStream.filter( s -> s.equalsIgnoreCase( "5" ) ) )
                                               .findAny();
    }


    static class Person
    {
        private String name;
        private Gender gender;
        private List<String> phoneNumbers;

        public Person( String name, Gender gender, List<String> phoneNumbers )
        {
            this.name = name;
            this.gender = gender;
            this.phoneNumbers = phoneNumbers;
        }

        public String getName()
        {
            return name;
        }

        public void setName( String name )
        {
            this.name = name;
        }

        public Gender getGender()
        {
            return gender;
        }

        public void setGender( Gender gender )
        {
            this.gender = gender;
        }

        public List<String> getPhoneNumbers()
        {
            return phoneNumbers;
        }

        public void setPhoneNumbers( List<String> phoneNumbers )
        {
            this.phoneNumbers = phoneNumbers;
        }

        @Override
        public String toString()
        {
            return "Person{" +
                           "name='" + name + '\'' +
                           ", gender=" + gender +
                           ", phoneNumbers=" + phoneNumbers +
                           '}';
        }
    }

    enum Gender
    {
        MALE, FEMALE;
    }
}
