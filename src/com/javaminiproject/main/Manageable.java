package com.javaminiproject.main;

import exception.DalBitException;

public interface Manageable {
	 void addTransaction() throws DalBitException;
	  void showTransactions() throws DalBitException;
	  void showBalance() throws DalBitException;
}
