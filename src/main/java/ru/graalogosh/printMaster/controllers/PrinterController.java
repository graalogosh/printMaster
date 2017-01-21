package ru.graalogosh.printMaster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.graalogosh.printMaster.models.Printer;
import ru.graalogosh.printMaster.repositories.PrinterRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@RestController
@RequestMapping("/api/printer")
public class PrinterController {
    @Autowired
    private PrinterRepository printerRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Printer> getPrinters() {
        return printerRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Printer createPrinter(
            @RequestBody Printer printer
    ) {
        if (printer.getPurchaseDate() == null) {
            printer.setPurchaseDate(new Date());
        }
        printerRepository.save(printer);
        return printer;
    }
}
