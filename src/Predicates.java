import java.util.ArrayList;
import java.util.List;

public class Predicates {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Сергей", 38));
        persons.add(new Person("Даша", 7));
        persons.add(new Person("Глаша", 3));
        persons.add(new Person("Саша", 6));
        persons.add(new Person("Анна", 18));
//        for (Person p : persons ) {
//            System.out.println(p);
//        }
        persons.stream().forEach(p -> System.out.println(p));
        persons.stream().forEach(System.out::println);
        System.out.println("Выведем коллекция \"взрослых\" т.е. отфильтруем значения");
        persons.stream().
                filter(p -> p.getAge() >=18).
                sorted((p1,p2) -> p1.getName().compareTo(p2.getName())).
                forEach(System.out::println);
    }
}
