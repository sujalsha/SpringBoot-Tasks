package com.financemanagement.PFMS.Repositories;

import com.financemanagement.PFMS.Models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {
    @Query(value = "SELECT transaction_id, user_id, transaction_type, amount, category, transaction_date_time, notes FROM pfms_db.transactions t JOIN pfms_db.users u ON t.user_id = u.id", nativeQuery = true)
    public List<Map<String, String>> viewAllTransactions();

    @Query(value = "SELECT transaction_id, user_id, transaction_type, amount, category, transaction_date_time, notes FROM pfms_db.transactions t JOIN pfms_db.users u ON t.user_id = u.id WHERE u.id = ?1", nativeQuery = true)
    public List<Map<String, String>> viewMyTransactions(Long userId);

    @Query(value = "SELECT category, SUM(amount) FROM pfms_db.transactions WHERE user_id = ?1 AND transaction_type = 'Expense' GROUP BY category", nativeQuery = true)
    List<Object[]> viewExpensesByCategory(Long userId);
}
