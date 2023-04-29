package com.mrj33.myportfoliomt.service;

import com.mrj33.myportfoliomt.model.holding.Holding;
import com.mrj33.myportfoliomt.repository.HoldingRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class HoldingService {
    @Autowired
    private HoldingRepository holdingRepository;

    public List<Holding> fetchAllHoldings() {
        return StreamSupport.stream(holdingRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
