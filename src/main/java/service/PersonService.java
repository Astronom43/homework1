package service;

import dao.IPersonDao;
import domain.Person;

public class PersonService implements IPersonService {
    private IPersonDao personDao;

    public PersonService(IPersonDao dao) {
        personDao = dao;
    }

    public void setPersonDao(IPersonDao personDao) {
        this.personDao = personDao;
    }

    public Person getPerson(String name) {
        return personDao.findByName(name);
    }
}
