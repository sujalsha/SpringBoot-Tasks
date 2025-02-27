package com.financemanagement.PFMS.Controllers;

import com.financemanagement.PFMS.Models.Transactions;
import com.financemanagement.PFMS.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping("/add-transaction")
    public ResponseEntity<Map<String, String>> postBlog(@RequestBody Transactions transactions){
        Transactions postObj = transactionRepository.save(transactions);
        Map<String, String> response = new HashMap<>();
        if (postObj.getTransactionId() != 0){
            response.put("Status", "Transaction Successful");
        }
        else {
            response.put("Status", "Transaction Failed");
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping("/view-all-transactions")
    public ResponseEntity<List<Map<String, String>>> viewAllTransactions(){
        List<Map<String, String>> transactionsObj = transactionRepository.viewAllTransactions();
        return ResponseEntity.ok(transactionsObj);
    }

    @PostMapping("/view-my-transactions")
    public ResponseEntity<Map<String, Object>> viewMyTransactions(@RequestBody Transactions transactions){
        List<Map<String, String>> transactionsObj = transactionRepository.viewMyTransactions(transactions.getUserId());
        List<Object[]> result = transactionRepository.viewExpensesByCategory(transactions.getUserId());

        Map<String, Double> categorySums = new HashMap<>();
        double totalExpense = 0.0;

        for (Object[] row : result) {
            String category = (String) row[0];
            Double sum = (Double) row[1];
            categorySums.put(category, sum);
            totalExpense += sum;
        }

        Map<String, Object> response = new HashMap<>();
        response.put("Transactions", transactionsObj);
        response.put("Category Expenses", categorySums);
        response.put("Total Expense", totalExpense);

        return ResponseEntity.ok(response);
    }
}
