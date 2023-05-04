package com.mrj33.myportfoliomt.controller;

import com.mrj33.myportfoliomt.model.watchlist.Watchlist;
import com.mrj33.myportfoliomt.model.watchlist.Watchlists;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class WatchlistController {
    @GetMapping("watchlist")
    public ResponseEntity<ArrayList<Watchlist>> getWatchlist() {
        Watchlists watchlists = new Watchlists();
        watchlists.setWatchlists(new Watchlist("India", "India"));
        watchlists.setWatchlists(new Watchlist("US", "us"));
        watchlists.setWatchlists(new Watchlist("ETF", "ETF"));
        return ResponseEntity.ok(watchlists.getWatchlists());
    }
}
