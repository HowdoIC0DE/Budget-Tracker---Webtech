package com.example.budgettracker;

import com.example.budgettracker.model.Transaction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BudgettrackerApplicationTests {

	@Test
	void transactionCanBeCreated() {
		Transaction transaction = new Transaction(
				null,
				"Miete",
				650.0,
				"EXPENSE",
				"2026-06-17"
		);

		assertEquals("Miete", transaction.getTitle());
		assertEquals(650.0, transaction.getAmount());
		assertEquals("EXPENSE", transaction.getType());
		assertEquals("2026-06-17", transaction.getDate());
	}
}