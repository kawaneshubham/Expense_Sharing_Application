package com.splitwise.info6250.dao;

import java.util.List;

import com.splitwise.info6250.model.Expense;
import com.splitwise.info6250.model.ExpenseDB;
import com.splitwise.info6250.model.Friends;
import com.splitwise.info6250.model.Tally;
import com.splitwise.info6250.model.TransactionHistory;
import com.splitwise.info6250.model.User;


public interface TransactionDao {

	void addTransaction(TransactionHistory th);
	List<TransactionHistory> getAllTransactions(String sourceUser);
	List<TransactionHistory> getIndividualTransactions(String sourceUser, String targetUser);
	List<TransactionHistory> getTransactionByexpenseId(int expenseId);
	void deleteTransactions(int expenseId);
	void settleAmountTransaction(String sourceUser, String targetUser);
}
