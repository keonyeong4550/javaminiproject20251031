package com.javaminiproject.main;

abstract class Transaction {
	protected String date;
    protected String description;
    protected int amount;

    public Transaction(String date, String description, int amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    public abstract int getSignedAmount();
    public abstract String getType();

    @Override
    public String toString() {
        return String.format("[%s] (%s) %s: %d원", date, getType(), description, amount);
    }
}
