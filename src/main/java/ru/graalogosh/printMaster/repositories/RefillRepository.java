package ru.graalogosh.printMaster.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.graalogosh.printMaster.models.Refill;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
public interface RefillRepository extends MongoRepository<Refill, String> {

}
