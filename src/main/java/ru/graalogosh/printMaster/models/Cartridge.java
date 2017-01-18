package ru.graalogosh.printMaster.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.awt.*;
import java.util.Date;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@Data
@Builder
public class Cartridge {
    @Id
    private String id;

    private String inventoryNumber;
    private String serialNumber;
    private Manufacturer manufacturer;
    private Printer printer;
    private Date purchaseDate;
    private Refill lastRefill;
    private Integer avgLifeDays;
    private Color color;

    private String comment;


    public Boolean isOriginal() {
        return manufacturer.equals(printer.getManufacturer());
    }
}

