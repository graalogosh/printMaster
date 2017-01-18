package ru.graalogosh.printMaster.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.graalogosh.printMaster.models.Company;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
public interface CompanyRepository extends MongoRepository<Company, String> {

}
