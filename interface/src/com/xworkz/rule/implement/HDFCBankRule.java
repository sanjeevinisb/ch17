package com.xworkz.rule.implement;
import com.xworkz.rule.internal.BankRule;

	public class HDFCBankRule implements BankRule{


		@Override
		public boolean security() {
			System.out.println("running security in HDFCBankRule");
			return true;
		}

		@Override
		public boolean deposit() {
			System.out.println("running deposit in HDFCBankRule");
			return true;
		}

		@Override
		public boolean cleanliness() {
			System.out.println("Execute cleanliness in SBI bank");
			return true;
		}

		@Override
		public boolean silence() {
			System.out.println("running silence in HDFCBankRule");
			return true;
		}

		@Override
		public boolean locker() {
			System.out.println("running locker in HDFCBankRule");
			return true;
		}

		@Override
		public boolean manager() {
			System.out.println("running manager in HDFCBankRule");
			return true;
		}

		@Override
		public int minBalance() {
			System.out.println("running minBalance in HDFCBankRule");
			return 1000;
		}

		@Override
		public double transactionFee() {
			System.out.println("running transactionFee in HDFCBankRule");
			return 10;
		}

		@Override
		public boolean withdrawl() {
			System.out.println("running withdrawl in HDFCBankRule");
			return true;
		}

		@Override
		public boolean amount() {
			System.out.println("running amount in HDFCBankRule");
			return true;
		}

		@Override
		public boolean account() {
			System.out.println("running account in HDFCBankRule");
			return true;
		}

		@Override
		public boolean longTermLoan() {
			System.out.println("running longTermLoan in HDFCBankRule");
			return true;
		}

		@Override
		public boolean debitCard() {
			System.out.println("running debitCard in HDFCBankRule");
			return true;
		}

		@Override
		public boolean creditCard() {
			System.out.println("running creditCard in HDFCBankRule");
			return true;
		}

		@Override
		public boolean onlineBanking() {
			System.out.println("running onlineBanking in HDFCBankRule");
			return true;
		}
	}

