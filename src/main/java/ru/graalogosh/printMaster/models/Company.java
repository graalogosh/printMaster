package ru.graalogosh.printMaster.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 19.01.2017.
 */
@Data
@Builder
public class Company {
    @Id
    private String id;

    private String name;
    private String phone;
}
