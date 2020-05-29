package streams;

import java.util.List;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;


public class _Stream
{
    public static void main( String[] args )
    {
        List<Person> people = List.of(
                new Person( "Jhon", MALE ),
                new Person( "Maria", FEMALE ),
                new Person( "Aisha", FEMALE ),
                new Person( "Alex", MALE ),
                new Person( "Alice", FEMALE )

        );


        final boolean match = people.stream()
                                .anyMatch( person -> MALE.equals( person.gender ) );

        System.out.println(match);

    }

    static class Person
    {
        private String name;
        private Gender gender;

        public Person( String name, Gender gender )
        {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString()
        {
            return "Person{" +
                           "name='" + name + '\'' +
                           ", gender=" + gender +
                           '}';
        }
    }

    enum Gender
    {
        MALE,FEMALE;
    }
}
