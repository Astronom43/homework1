package dao;

import domain.Person;

public class PersonDao implements IPersonDao {
    private int age;
    public Person findByName(String name) {
        return new Person(35, name);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
