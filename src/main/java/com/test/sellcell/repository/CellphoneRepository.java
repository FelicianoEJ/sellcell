package com.test.sellcell.repository;

import com.test.sellcell.models.Cellphone;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("v1CellphoneInterface")
public interface CellphoneRepository extends CrudRepository<Cellphone, String> {
    // This will be AUTO IMPLEMENTED by Spring into a Bean
    // CRUD refers Create, Read, Update, Delete
}