package com.test.sellcell.dal;

// import java.util.List;
import java.util.UUID;

import com.test.sellcell.models.Cellphone;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("v1CellphoneInterface")
public interface CellphoneDao extends CrudRepository<Cellphone, UUID>{
    // This will be AUTO IMPLEMENTED by Spring into a Bean
    // CRUD refers Create, Read, Update, Delete
    
    // Example implementations or method definitions
    // List<Cellphone> selectAllCellphones();

    // int insertCellphone(UUID id, Cellphone cellphone);

    // default int insertCellphone(Cellphone cellphone) {
    //     UUID id = UUID.randomUUID();
    //     return insertCellphone(id, cellphone);
    // }
}
