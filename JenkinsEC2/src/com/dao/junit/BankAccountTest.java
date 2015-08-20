package com.dao.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.dao.BankAccount;

public class BankAccountTest {

	BankAccount bankAccount = new BankAccount(1000.0);

	@Test
	public void checkFinalBalanceJunit() {
		
		System.out.println("Inside checkFinalBalanceJunit()");
		assertEquals(600.0, bankAccount.debit(400.0),0.01);
	}

}
