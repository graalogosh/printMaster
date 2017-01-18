package ru.graalogosh.printMaster.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 19.01.2017.
 */
@Data
@Builder
public class Refill {
    @Id
    private String id;

    private Date date;
    private Company company;
    private String master;

}
