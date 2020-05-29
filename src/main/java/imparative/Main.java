package imparative;

import java.util.List;

import static imparative.Main.Gender.*;

public class Main
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

        people.stream()
              .filter( person -> FEMALE.equals( person.gender ) )
              .forEach( System.out::println );

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
