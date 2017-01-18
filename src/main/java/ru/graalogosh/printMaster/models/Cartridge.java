package ru.graalogosh.printMaster.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@Data
public class Cartridge {
    @Id
    private String id;

    private Manufacturer manufacturer;
    private Printer printer;
    private Date purchaseDate;
    private Date lastRefresh;
    private Integer avgLifeDays;

    private String comment;


    public Boolean isOriginal() {
        return manufacturer.equals(printer.getManufacturer());
    }
}
