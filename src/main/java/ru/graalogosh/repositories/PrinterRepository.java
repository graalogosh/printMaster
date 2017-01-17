package ru.graalogosh.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.graalogosh.models.Printer;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
public interface PrinterRepository extends MongoRepository<Printer, String> {
    public Printer findByModel(String model);
}
