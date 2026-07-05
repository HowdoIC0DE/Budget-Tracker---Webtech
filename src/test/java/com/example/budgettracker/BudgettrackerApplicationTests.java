package com.example.budgettracker;

import com.example.budgettracker.controller.RootController;
import com.example.budgettracker.model.Account;
import com.example.budgettracker.model.Budget;
import com.example.budgettracker.model.Category;
import com.example.budgettracker.model.GoalContribution;
import com.example.budgettracker.model.Merchant;
import com.example.budgettracker.model.PaymentMethod;
import com.example.budgettracker.model.RecurringTransaction;
import com.example.budgettracker.model.SavingsGoal;
import com.example.budgettracker.model.Tag;
import com.example.budgettracker.model.Transaction;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

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

	@Test
	void transactionCanStoreOptionalFinanceDetails() {
		Transaction transaction = new Transaction(
				null,
				"Groceries",
				42.5,
				"EXPENSE",
				"2026-07-05"
		);

		transaction.setCategoryId(1L);
		transaction.setAccountId(2L);
		transaction.setPaymentMethodId(3L);
		transaction.setMerchantId(4L);
		transaction.setNote("Weekly groceries");

		assertEquals(1L, transaction.getCategoryId());
		assertEquals(2L, transaction.getAccountId());
		assertEquals(3L, transaction.getPaymentMethodId());
		assertEquals(4L, transaction.getMerchantId());
		assertEquals("Weekly groceries", transaction.getNote());
	}

	@Test
	void categoryCanBeCreated() {
		Category category = new Category(null, "Lebensmittel", "EXPENSE");

		assertEquals("Lebensmittel", category.getName());
		assertEquals("EXPENSE", category.getType());
	}

	@Test
	void accountCanBeCreated() {
		Account account = new Account(null, "Main Bank Account", "BANK", 1200.0);

		assertEquals("Main Bank Account", account.getName());
		assertEquals("BANK", account.getType());
		assertEquals(1200.0, account.getBalance());
	}

	@Test
	void budgetCanBeCreated() {
		Budget budget = new Budget(null, "Monthly Groceries", "Lebensmittel", 350.0, "2026-07-01", "2026-07-31");

		assertEquals("Monthly Groceries", budget.getName());
		assertEquals("Lebensmittel", budget.getCategoryName());
		assertEquals(350.0, budget.getAmount());
		assertEquals("2026-07-01", budget.getStartDate());
		assertEquals("2026-07-31", budget.getEndDate());
	}

	@Test
	void recurringTransactionCanBeCreated() {
		RecurringTransaction recurringTransaction = new RecurringTransaction(
				null,
				"Salary",
				2500.0,
				"INCOME",
				"MONTHLY",
				"2026-08-01"
		);

		assertEquals("Salary", recurringTransaction.getTitle());
		assertEquals(2500.0, recurringTransaction.getAmount());
		assertEquals("INCOME", recurringTransaction.getType());
		assertEquals("MONTHLY", recurringTransaction.getFrequency());
		assertEquals("2026-08-01", recurringTransaction.getNextDate());
	}

	@Test
	void savingsGoalCanBeCreated() {
		SavingsGoal savingsGoal = new SavingsGoal(null, "Vacation", 1000.0, 250.0, "2026-12-31");

		assertEquals("Vacation", savingsGoal.getName());
		assertEquals(1000.0, savingsGoal.getTargetAmount());
		assertEquals(250.0, savingsGoal.getCurrentAmount());
		assertEquals("2026-12-31", savingsGoal.getTargetDate());
	}

	@Test
	void goalContributionCanBeCreated() {
		GoalContribution goalContribution = new GoalContribution(null, 1L, 100.0, "2026-07-05", "Monthly saving");

		assertEquals(1L, goalContribution.getSavingsGoalId());
		assertEquals(100.0, goalContribution.getAmount());
		assertEquals("2026-07-05", goalContribution.getDate());
		assertEquals("Monthly saving", goalContribution.getNote());
	}

	@Test
	void paymentMethodCanBeCreated() {
		PaymentMethod paymentMethod = new PaymentMethod(null, "Debit Card", "CARD");

		assertEquals("Debit Card", paymentMethod.getName());
		assertEquals("CARD", paymentMethod.getType());
	}

	@Test
	void merchantCanBeCreated() {
		Merchant merchant = new Merchant(null, "REWE", "Grocery store");

		assertEquals("REWE", merchant.getName());
		assertEquals("Grocery store", merchant.getDescription());
	}

	@Test
	void tagCanBeCreated() {
		Tag tag = new Tag(null, "Important", "#ffcc00");

		assertEquals("Important", tag.getName());
		assertEquals("#ffcc00", tag.getColor());
	}

	@Test
	void rootEndpointInfoCanBeCreated() {
		RootController rootController = new RootController();

		Map<String, Object> apiInfo = rootController.getApiInfo();

		assertEquals("Budget Tracker Backend API is running", apiInfo.get("message"));
		assertEquals(List.of(
				"/transactions",
				"/categories",
				"/accounts",
				"/budgets",
				"/saving-goals",
				"/goal-contributions",
				"/recurring-transactions",
				"/payment-methods",
				"/merchants",
				"/tags"
		), apiInfo.get("endpoints"));
	}
}
