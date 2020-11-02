package com.test.sellcell.controllers;

import java.util.List;

import com.test.sellcell.models.Cellphone;
import com.test.sellcell.services.CellphoneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/cellphone")
@RestController
public class CellphoneController {

    private final CellphoneService cellphoneService;

    @Autowired
    public CellphoneController(CellphoneService cellphoneService) {
        this.cellphoneService = cellphoneService;
    }

    @PostMapping
    public void addCellphone(@RequestBody Cellphone cellphone) {
        cellphoneService.addCellphone(cellphone);
    }

    @GetMapping
    public List<Cellphone> getAllCellphones() {
        return cellphoneService.getAllCellphones();
    }

}
