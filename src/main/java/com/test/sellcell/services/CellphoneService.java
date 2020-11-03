package com.test.sellcell.services;

import java.util.Optional;

import com.test.sellcell.dal.CellphoneDao;
import com.test.sellcell.models.Cellphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service // ("cellphoneService")
public class CellphoneService {

    private final CellphoneDao cellphoneDataAccess;

    @Autowired
    public CellphoneService(@Qualifier("v1CellphoneInterface") CellphoneDao cellphoneDataAccess) {
        this.cellphoneDataAccess = cellphoneDataAccess;
    }

    public boolean cellphoneIdExist(String id) {
        // UUID uuid = UUID.fromString(id);
        return cellphoneDataAccess.existsById(id);
    }

    public Cellphone addCellphone(Cellphone cellphone) {
        return cellphoneDataAccess.save(cellphone);
        // return cellphoneDataAccess.insertCellphone(cellphone);
    }

    public Iterable<Cellphone> addMultipleCellphones(Iterable<Cellphone> cellphoneList) {
        return cellphoneDataAccess.saveAll(cellphoneList);
    }

    public boolean deleteById(String id) {
        if (cellphoneIdExist(id)) {
            // UUID uuid = UUID.fromString(id);
            cellphoneDataAccess.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public void deleteMultipleCellphones(Iterable<Cellphone> cellphoneList) {
        cellphoneDataAccess.deleteAll(cellphoneList);
    }

    public long cellphoneCount() {
        return cellphoneDataAccess.count();
    }

    public Optional<Cellphone> getCellphoneById(String id) {
        return cellphoneDataAccess.findById(id);
    }

    public Iterable<Cellphone> getAllCellphones() {
        return cellphoneDataAccess.findAll();
        // return cellphoneDataAccess.selectAllCellphones();
    }
}
