package com.javaminiproject.main;

class Income extends Transaction{
	   public Income(String date, String description, int amount) {
	        super(date, description, amount);
	    }

	    @Override
	    public int getSignedAmount() {
	        return amount;
	    }

	    @Override
	    public String getType() {
	        return "수입";
	    }
}
