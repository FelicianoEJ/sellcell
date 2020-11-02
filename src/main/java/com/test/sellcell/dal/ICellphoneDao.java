package com.test.sellcell.dal;

import java.util.List;
import java.util.UUID;

import com.test.sellcell.models.Cellphone;

public interface ICellphoneDao {

    List<Cellphone> selectAllCellphones();

    int insertCellphone(UUID id, Cellphone cellphone);

    default int insertCellphone(Cellphone cellphone) {
        UUID id = UUID.randomUUID();
        return insertCellphone(id, cellphone);
    }
}
