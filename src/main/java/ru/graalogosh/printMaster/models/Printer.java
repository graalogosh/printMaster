package ru.graalogosh.printMaster.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@Data
public class Printer {

    @Id
    private String id;

    private Manufacturer manufacturer;
    private String model;
    private PrinterType type;
    private Date purchaseDate;
    private String room;
    private String IPAddress;
    private Cartridge currentCartridge;

    private String comment;
}

enum PrinterType {
    Laser,
    Matrix,
    Ink_jet
}
