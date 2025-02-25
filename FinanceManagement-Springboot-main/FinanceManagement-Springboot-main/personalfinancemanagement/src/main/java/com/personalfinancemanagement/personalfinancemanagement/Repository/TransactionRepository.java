package com.personalfinancemanagement.personalfinancemanagement.Repository;

import com.personalfinancemanagement.personalfinancemanagement.Models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {
}
