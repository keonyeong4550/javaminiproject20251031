package com.javaminiproject.main;

class Expense extends Transaction {
    public Expense(String date, String description, int amount) {
        super(date, description, amount);
    }

    @Override
    public int getSignedAmount() {
        return -amount;
    }

    @Override
    public String getType() {
        return "지출";
    }
}
