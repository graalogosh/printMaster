package ru.graalogosh.printMaster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.graalogosh.printMaster.models.Printer;
import ru.graalogosh.printMaster.repositories.PrinterRepository;

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
}
