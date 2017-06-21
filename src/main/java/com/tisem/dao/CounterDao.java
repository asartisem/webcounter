package com.tisem.dao;

import com.tisem.entity.Counter;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CounterDao extends CrudRepository<Counter, Integer> {

    Counter findById(int id);

    @Modifying
    @Query(incrementValueQuery)
    void incrementValue();

    @Modifying
    @Query(decrementValueQuery)
    void decrementValue();

    String incrementValueQuery= "UPDATE Counter c set c.value = c.value + 1 WHERE c.id = 1";
    String decrementValueQuery= "UPDATE Counter c set c.value = c.value - 1 WHERE c.id = 1";

}
