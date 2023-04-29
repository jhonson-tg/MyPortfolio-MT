package com.mrj33.myportfoliomt.model.watchlist;

import java.util.ArrayList;
public class Watchlists {
    private final ArrayList<Watchlist> watchlists;

    public Watchlists() {
        super();
        watchlists = new ArrayList<>();
    }

    public void setWatchlists(Watchlist watchlist) {
        watchlists.add(watchlist);
    }

    public ArrayList<Watchlist> getWatchlists() {
        return watchlists;
    }
}
