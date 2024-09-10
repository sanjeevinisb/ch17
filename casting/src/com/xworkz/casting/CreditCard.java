package com.xworkz.casting;

	public class CreditCard {
	    private String cardNumber;
	    private String cardHolderName;
	    private String expiryDate;
	    private String cvv;
	    private String issuingBank;
	    private String cardType;

	    public CreditCard(String cardNumber, String cardHolderName, String expiryDate, String cvv, String issuingBank, String cardType) {
	        this.cardNumber = cardNumber;
	        this.cardHolderName = cardHolderName;
	        this.expiryDate = expiryDate;
	        this.cvv = cvv;
	        this.issuingBank = issuingBank;
	        this.cardType = cardType;
	    }

	    @Override
	    public String toString() {
	        return "CreditCard{cardNumber='" + cardNumber + "', cardHolderName='" + cardHolderName + "',cvv='" +cvv+"', expiryDate='" + expiryDate + "', issuingBank='" + issuingBank + "', cardType='" + cardType + "'}";
	    }

	    @Override
	    public boolean equals(Object obj) {
	    	System.out.println("running equals in CreditCard");
	        if (obj != null )
	        	{
	        	if(obj instanceof CreditCard)
	        	{ 
	        		CreditCard casted = (CreditCard) obj;
	        if(this.cardNumber.equals(casted.cardNumber) && this.cardHolderName.equals(casted.cardHolderName) && this.issuingBank.equals(casted.issuingBank)) 
	        	System.out.println("this & obj content is matching");
	        return true;
	        	}
	        	else {
	        	System.out.println("obj is not Country");
	        	}
	        	}
	        else {
	        	System.out.println("obj is null");
	        }
	        	return super.equals(obj);
	        }



	}

