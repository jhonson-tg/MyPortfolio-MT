package com.mrj33.myportfoliomt.holdings;

import com.mrj33.myportfoliomt.model.HoldingParams;
import com.mrj33.myportfoliomt.model.holding.Holding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HoldingController {
    @Autowired
    private HoldingInterface holdingInterface;

    @PostMapping("/holdings")
    public ResponseEntity<List<Holding>> getHoldings(@RequestBody HoldingParams params) {
        return ResponseEntity.ok(holdingInterface.fetchHoldings());
    }
}
