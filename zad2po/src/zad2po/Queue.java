package zad2po;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Queue {
	static List<Message> list = new LinkedList<>();

	public void sending() {
		int how = 0;
		how = readLineInt();
		for (int i = 0; i < how; i++) {
			list.add(new Message(readLineInt(), readLine(), Priority
					.valueOf(readLine())));
		}
	}

	public String readLine() {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		return text;
	}

	public int readLineInt() {
		Scanner scanner = new Scanner(System.in);
		int myInt = scanner.nextInt();
		return myInt;

	}

}
