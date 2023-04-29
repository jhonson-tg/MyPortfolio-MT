package com.mrj33.myportfoliomt.holdings;

import com.mrj33.myportfoliomt.model.holding.Holding;
import com.mrj33.myportfoliomt.service.HoldingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoldingImpl implements HoldingInterface{
    @Autowired
    private HoldingService holdingService;
    @Override
    public List<Holding> fetchHoldings() {
        return holdingService.fetchAllHoldings();
    }
}
