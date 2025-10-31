package com.javaminiproject.main;

import java.util.Random;
import java.util.Scanner;

public class ColorGame {
	private Scanner sc = new Scanner(System.in);
    private Random random = new Random();
    private String[] colors = {"파랑", "빨강", "녹색"};
    private final int MAX_TRIES = 3;

    public void play() {
        System.out.println("자~ 빨강, 파랑, 녹색의 볼이 있습니다.");
        System.out.println("각자 자유롭게 '파파파' 또는 '빨빨녹' 처럼 입력해주세요.");
        System.out.println("랜덤 결과와 일치하면 선물을 드리겠습니다!");
        System.out.println("--------------------------------------------");
        System.out.println("총 3번의 기회를 드립니다.");
        System.out.println("3번의 기회에도 맞추지 못하면 저에게 선물을 주셔야합니다.");
        System.out.println("--------------------------------------------");
        System.out.println("엔터를 눌러 게임을 시작하세요!");
        sc.nextLine();

        boolean isWin = false;

        for (int round = 1; round <= MAX_TRIES; round++) {
            System.out.println("\n[시도 " + round + "번째]");
            System.out.print("예상 색 조합을 입력하세요 (예: 파파파, 파빨녹): ");
            String userInput = sc.nextLine().trim();

            StringBuilder result = new StringBuilder();
            StringBuilder shortCode = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                int idx = random.nextInt(colors.length);
                result.append(colors[idx]);
                if (i < 2) result.append(" ");
                shortCode.append(colors[idx].charAt(0));
            }

            System.out.println("--------------------------------------------");
            System.out.println("랜덤 결과: " + result);
            System.out.println("결과 코드: " + shortCode);

            if (userInput.equals(shortCode.toString())) {
                System.out.println("축하합니다! 당첨입니다!");
                System.out.println("아래 번호로 당첨 메시지를 남겨주세요: 010-0000-0000");
                isWin = true;
                break;
            } else {
                System.out.println("아쉽게도 탈락입니다...");
            }
        }

        if (!isWin) {
            System.out.println("--------------------------------------------");
            System.out.println("3회 모두 탈락했습니다.");
            System.out.println("번호 010-0000-0000 으로 카톡선물을 보내주세요!");
        }
    }
}
