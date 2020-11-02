package com.test.sellcell.services;

import java.util.List;

import com.test.sellcell.dal.ICellphoneDao;
import com.test.sellcell.models.Cellphone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CellphoneService {

    private final ICellphoneDao cellphoneDataAccess;

    @Autowired
    public CellphoneService(@Qualifier("v1CellphoneImpl") ICellphoneDao cellphoneDataAccess) {
        this.cellphoneDataAccess = cellphoneDataAccess;
    }

    public int addCellphone(Cellphone cellphone) {
        return cellphoneDataAccess.insertCellphone(cellphone);
    }

    public List<Cellphone> getAllCellphones() {
        return cellphoneDataAccess.selectAllCellphones();
    }
}
