package com.Account2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1{

	ApplicationContext appCtx = new ClassPathXmlApplicationContext("accctx.xml");
	Acc tc = (Acc) appCtx.getBean("acc");
@Test
void testMethods() {
	tc.balance();
	System.out.println("-----------------------------------------------------");
	testInvalidDeposit() ;
	System.out.println("-----------------------------------------------------");
	testValidWithdraw();
	System.out.println("-----------------------------------------------------");
	testValidDeposit();
	System.out.println("-----------------------------------------------------");
	testInvalidWithdraw();
	System.out.println("-----------------------------------------------------");
	testInsufficientWithdraw();
	System.out.println("-----------------------------------------------------");
}


void testInvalidDeposit()  {
	try {
		//Acc tc5 = (Acc) appCtx.getBean("acc");

		tc.deposit(-100000);
	} catch (AmountException e) {
		// TODO Auto-generated catch block
	
		}		
	}

	void testValidWithdraw() {
	try {
		//Acc tc4 = (Acc) appCtx.getBean("acc");

		tc.withdraw(100);
	} catch (BalanceException | AmountException e) {
	// TODO Auto-generated catch block
	
}}

	void testValidDeposit()  {
		try {
			//Acc tc3 = (Acc) appCtx.getBean("acc");

			tc.deposit(100);
		} catch (AmountException e) {
			// TODO Auto-generated catch block
			
		}
	}
	

	void testInvalidWithdraw()  {
	try {
		//Acc tc2 = (Acc) appCtx.getBean("acc");

			tc.withdraw(-200);
	}
		 catch (AmountException e) {
		// TODO Auto-generated catch block
		}
	
}

void testInsufficientWithdraw()  {
	try {
		//Acc tc1 = (Acc) appCtx.getBean("acc");

		tc.withdraw(200000);
	} catch (BalanceException | AmountException e) {
		// TODO Auto-generated catch block
			
	}}
}
