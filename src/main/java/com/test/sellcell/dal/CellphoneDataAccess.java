package com.test.sellcell.dal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.test.sellcell.models.Cellphone;

import org.springframework.stereotype.Repository;

@Repository("v1CellphoneImpl")
public class CellphoneDataAccess implements ICellphoneDao {

    private static List<Cellphone> db = new ArrayList<>();

    @Override
    public int insertCellphone(UUID id, Cellphone cellphone) {
        try {
            db.add(
                new Cellphone(
                    id,
                    cellphone.getManufacturer(),
                    cellphone.getSeries(),
                    cellphone.getModel(),
                    cellphone.getUnixTimestamp(),
                    cellphone.getDescription(),
                    cellphone.getPrice()
                )
            );
            return 1;
        } catch (Exception e) {
            // Log database process error
            System.out.println(e.getMessage());
            return 0;
        }
    }

    @Override
    public List<Cellphone> selectAllCellphones() {
        return db;
    }
}
