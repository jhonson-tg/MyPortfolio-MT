package com.mrj33.myportfoliomt.model.holding;

import java.util.ArrayList;

public class Holdings {
    private ArrayList<Holding> holdings;

    public Holdings() {
        super();
        holdings = new ArrayList<>();
    }

    public void setHoldings(Holding holding) {
        holdings.add(holding);
    }

    public ArrayList<Holding> getHoldings() {
        return holdings;
    }
}
