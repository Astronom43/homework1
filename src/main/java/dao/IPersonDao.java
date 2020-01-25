package dao;


import domain.Person;

public interface IPersonDao {
    Person findByName(String name);
}
