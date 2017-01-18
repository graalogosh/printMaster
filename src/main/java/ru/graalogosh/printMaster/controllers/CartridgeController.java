package ru.graalogosh.printMaster.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.graalogosh.printMaster.models.Cartridge;
import ru.graalogosh.printMaster.repositories.CartridgeRepository;

import java.util.List;

/**
 * Created by Anton Mukovozov (graalogosh@gmail.com) on 18.01.2017.
 */
@RestController
@RequestMapping("/api/cartridge")
public class CartridgeController {
    @Autowired
    private CartridgeRepository cartridgeRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Cartridge> getCartriges() {
        return cartridgeRepository.findAll();
    }
}
