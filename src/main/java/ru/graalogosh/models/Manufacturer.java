package ru.graalogosh.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@Data
public class Manufacturer {

    @Id
    private String id;

    private String name;
}
