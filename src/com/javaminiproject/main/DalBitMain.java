package com.javaminiproject.main;

import java.util.Scanner;

public class DalBitMain {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        AccountBook accountBook = new AccountBook();
	        ColorGame colorGame = new ColorGame();

	        while (true) {
	            try {
	                System.out.println("\n==== DalBit 통합 프로그램 ====");
	                System.out.println("1. 달빛 가계부");
	                System.out.println("2. 색깔 게임");
	                System.out.println("3. 종료");
	                System.out.print("메뉴 선택: ");
	                int choice = Integer.parseInt(sc.nextLine());

	                switch (choice) {
	                    case 1 -> {
	                        while (true) {
	                            System.out.println("\n--- 달빛 가계부 ---");
	                            System.out.println("1. 거래 추가");
	                            System.out.println("2. 거래 내역 보기");
	                            System.out.println("3. 잔액 보기");
	                            System.out.println("4. 메인 메뉴로 돌아가기");
	                            System.out.print("선택: ");
	                            int menu = Integer.parseInt(sc.nextLine());
	                            if (menu == 1) accountBook.addTransaction();
	                            else if (menu == 2) accountBook.showTransactions();
	                            else if (menu == 3) accountBook.showBalance();
	                            else if (menu == 4) break;
	                            else System.out.println("잘못된 입력입니다.");
	                        }
	                    }
	                    case 2 -> colorGame.play();
	                    case 3 -> {
	                        System.out.println("프로그램을 종료합니다.");
	                        return;
	                    }
	                    default -> System.out.println("올바른 번호를 입력하세요.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("숫자로 입력해주세요.");
	            } catch (Exception e) {
	                System.out.println("오류: " + e.getMessage());
	            }
	        }
	}

}
