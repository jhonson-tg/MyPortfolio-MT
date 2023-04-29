package com.mrj33.myportfoliomt.repository;

import com.mrj33.myportfoliomt.model.holding.Holding;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoldingRepository extends CrudRepository<Holding, Integer> {
}
