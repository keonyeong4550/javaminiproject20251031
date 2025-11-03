package com.javaminiproject.main;

import java.util.ArrayList;
import java.util.Scanner;

import exception.DalBitException;
import exception.InputException;

public class AccountBook implements Manageable {
	private ArrayList<Transaction> transactions = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addTransaction() throws DalBitException{
        try {
            System.out.print("날짜 입력 (예: 2025-10-30): ");
            String date = sc.nextLine().trim();
            System.out.print("내용 입력: ");
            String desc = sc.nextLine().trim();
            int amount; 
            try {
                System.out.print("금액 입력: ");
                amount = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                throw new InputException("금액은 숫자여야 합니다.");
            }
            int type;

            try {
                System.out.print("유형 선택 (1: 수입, 2: 지출): ");
                type = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                throw new InputException("유형 선택은 1 또는 2의 숫자여야 합니다.");
            }
            // 🧠 감정 선택 공통 로직
            System.out.println("감정 선택 (1. 😆 행복  2. 😢 후회  3. 😐 보통)");
            System.out.print("> ");
            int emoType;
            try {
                emoType = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                throw new InputException("감정 선택은 숫자여야 합니다.");
            }

            String emotion = switch (emoType) {
                case 1 -> "😆 행복";
                case 2 -> "😢 후회";
                default -> "😐 보통";
            };
            Transaction t;
            if (type == 1)
                t = new Income(date, desc, amount, emotion);
            else if (type == 2)
            
                t = new Expense(date, desc, amount, emotion);
            else {
                System.out.println("잘못된 입력입니다.");
                return;
            }

            transactions.add(t);
            System.out.println("거래가 추가되었습니다! (" + t.getType() + ", " + t.getEmotion() + ")\n");

        } catch (NumberFormatException e) {
        	throw new InputException("금액은 숫자여야 합니다.");
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void showTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("기록이 없습니다.\n");
            return;
        }
        System.out.println("\n===== 거래 내역 =====");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
        System.out.println("=====================\n");
    }

    @Override
    public void showBalance() {
        int balance = 0;
        String lastEmotion = "";
        for (Transaction t : transactions) {
            balance += t.getSignedAmount();
            lastEmotion = t.getEmotion();
        }
        
        System.out.println("현재 잔액: " + balance + "원 , " + lastEmotion + "\n");
    }

}
