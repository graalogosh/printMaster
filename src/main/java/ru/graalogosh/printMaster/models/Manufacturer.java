package ru.graalogosh.printMaster.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@Data
@Builder
public class Manufacturer {

    @Id
    private String id;

    private String shortName;
    private String fullName;

    private String comment;
}
