package ru.graalogosh.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@Data
public class Printer {

    @Id
    private String id;

    private Manufacturer manufacturer;
    private String model;
}
