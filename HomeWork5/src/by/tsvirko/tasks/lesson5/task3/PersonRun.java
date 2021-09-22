package by.tsvirko.tasks.lesson5.task3;

public class PersonRun {
    public static void main(String[] args) {

        Person person = new Person();
        Person personSecond = new Person("Дима",33);
        person.move();
        personSecond.talk();

        System.out.println(person.talk() + " говорит");
        System.out.println( personSecond.talk() + " говорит");
        System.out.println(person.move() + " dance");
        System.out.println(personSecond.move() + " jump");


    }
}
