package com.tdd.codeBreaker;

import java.util.Scanner;

public class ConsoleIOService implements IOService {

	public String prompt(String promptText) {
		Scanner scanner = new Scanner(System.in);
		if(promptText != null && !promptText.isEmpty())
		System.out.print(promptText);
		return scanner.nextLine();
	}

	@Override
	public void display(String text) {
		System.out.println(text);
	}

}
