package com.mrj33.myportfoliomt.holdings;

import com.mrj33.myportfoliomt.model.holding.Holding;

import java.util.List;

public interface HoldingInterface {
    List<Holding> fetchHoldings();
}
