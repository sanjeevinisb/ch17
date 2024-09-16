package com.xworkz.rule.runner;
import com.xworkz.rule.internal.BankRule;
import com.xworkz.rule.implement.HDFCBankRule;

public class BankRuleRunner {

	public static void main(String[] args) {
		BankRule bank= new HDFCBankRule();
		System.out.println(bank.security());
		System.out.println(bank.silence());
		System.out.println(bank.amount());
		System.out.println(bank.deposit());
		System.out.println(bank.onlineBanking());
		System.out.println(bank.account());
		System.out.println(bank.locker());
		System.out.println(bank.minBalance());
		System.out.println(bank.manager());
		System.out.println(bank.transactionFee());
		System.out.println(bank.withdrawl());
		System.out.println(bank.cleanliness());
		System.out.println(bank.longTermLoan());
		System.out.println(bank.debitCard());
		System.out.println(bank.creditCard());
		

	}

}
