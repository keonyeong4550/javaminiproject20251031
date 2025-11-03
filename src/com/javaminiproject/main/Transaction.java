package com.javaminiproject.main;

abstract class Transaction {
	protected String date;
    protected String description;
    protected int amount;
    protected String emotion;

    public Transaction(String date, String description, int amount, String emotion) {
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.emotion = emotion;
    }

    public abstract int getSignedAmount();
    public abstract String getType();
    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }
    @Override
    public String toString() {
        return String.format("[%s] (%s) %s: %d원, 감정 : %s", date, getType(), description, amount, emotion);
    }
}
