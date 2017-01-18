package ru.graalogosh.printMaster.models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.net.InetAddress;
import java.util.Date;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@Data
@Builder
public class Printer {

    @Id
    private String id;

    private Manufacturer manufacturer;
    private String model;
    private PrinterType type;
    private Date purchaseDate;
    private String room;
    private InetAddress IPAddress;
    private Cartridge currentCartridge;

    private String comment;
}

//TODO create types
enum PrinterType {
    Laser,
    Matrix,
    Ink_jet
}
