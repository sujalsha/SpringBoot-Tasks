package com.personalfinancemanagement.personalfinancemanagement.Controller;

import com.personalfinancemanagement.personalfinancemanagement.Models.Transactions;
import com.personalfinancemanagement.personalfinancemanagement.Repository.TransactionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TransactionAppController {
    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    @PostMapping("/newtransaction")
    public ResponseEntity<Map<String, String>> transactionEntry(@RequestBody Transactions transaction){
        Transactions transactionObj = transactionRepository.save(transaction);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "Transaction Added");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/retrieveexpenses")
    public ResponseEntity<List<Transactions>> transactionList(){
        List<Transactions> transactions = transactionRepository.findAll();
        return ResponseEntity.ok(transactions);
    }
}
