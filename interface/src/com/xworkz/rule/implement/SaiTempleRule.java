package com.xworkz.rule.implement;

import com.xworkz.rule.internal.TempleRule;

	public class SaiTempleRule implements TempleRule {
			
		

		@Override
		public boolean offertory() {
			System.out.println("running offertory");
			return true;
		}

		@Override
		public String ruleDescription() {
			System.out.println("running ruleDescription");
			return null;
		}

		@Override
		public boolean active() {
			System.out.println("running active");
			return true;
		}

		@Override
		public double donationAmount() {
			System.out.println("running donationAmount");			
			return 2000;
		}

		@Override
		public char importanceLevel() {
			System.out.println("running importanceLevel");
			return 8;
		}

		@Override
		public long ruleCreationDate() {
			System.out.println("running ruleCreationDate");
			return 5;
		}

		@Override
		public float serviceFee() {
			System.out.println("running serviceFee");
			return 5000000;
		}

		@Override
		public short restriction() {
			System.out.println("running restriction");
			return 5;
		}

		@Override
		public byte priorityLevel() {
			System.out.println("running priorityLevel");
			return 2;
		}

		@Override
		public double maxDonation() {
			System.out.println("running maxDonation");
			return 120000000;
		}
}
