package com.javaminiproject.main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteManager {
	  private List<String> quotes = new ArrayList<>();

	    public QuoteManager() {
	        try {
	            Path path = Path.of(System.getProperty("user.dir"), "quotes.txt");
	            quotes = Files.readAllLines(path, StandardCharsets.UTF_8);
//	            System.out.println("✅ 명언 파일 로드 완료 (" + quotes.size() + "줄)");
	        } catch (IOException e) {
	            System.out.println("⚠ 명언 파일을 불러오지 못했습니다: " + e.getMessage());
	        }
	    }

	    public void printRandomQuote() {
	        if (quotes.isEmpty()) return;

	        // 번호가 있는 줄만 추출
	        List<Integer> indexes = new ArrayList<>();
	        for (int i = 0; i < quotes.size(); i++) {
	            if (quotes.get(i).matches("^\\d+\\.\\s.*")) { // 예: "1. " 형태
	                indexes.add(i);
	            }
	        }

	        if (indexes.isEmpty()) return;

	        // 랜덤으로 하나 선택
	        Random r = new Random();
	        int idx = indexes.get(r.nextInt(indexes.size()));

	        // 번호 제거한 문장 + 아래 한글 줄 출력
	        System.out.println("\n💡 오늘의 소비 명언 💡");

	        String english = quotes.get(idx).replaceFirst("^\\d+\\.\\s*", "").trim();
	        System.out.println(english);

	        if (idx + 1 < quotes.size()) {
	            System.out.println(quotes.get(idx + 1).trim());
	        }

	        System.out.println("------------------------------------------");
	    }
}
