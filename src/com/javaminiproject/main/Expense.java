package com.javaminiproject.main;

class Expense extends Transaction {
    public Expense(String date, String description, int amount, String emotion) {
        super(date, description, amount, emotion);
    }

    @Override
    public int getSignedAmount() {
        return -amount;
    }

    @Override
    public String getType() {
        return "지출";
    }
    public String getEmotion() {
        return emotion;
    }
}
