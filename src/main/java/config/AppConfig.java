package config;

import dao.IPersonDao;
import dao.PersonDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.IPersonService;
import service.PersonService;

@Configuration
public class AppConfig {

    @Bean
    IPersonDao personDao (){
        return new PersonDao();
    }

    @Bean
    IPersonService personService(IPersonDao dao){
        return new PersonService(dao);
    }

}
