package com.tisem.dao;

import com.tisem.entity.Counter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface CounterDao extends CrudRepository<Counter, Integer> {

    Counter findById(int id);

}
