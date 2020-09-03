package com.testo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testo.model.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
