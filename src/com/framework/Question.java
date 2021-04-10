package com.framework;

import java.util.Iterator;
import java.util.List;

public class Question {
	private String questionNumber;
	private String questionName;
	private List<String> answers;

	public Question(String questionNumber, String questionName, List<String> answers) {
		super();
		this.questionNumber = questionNumber;
		this.questionName = questionName;
		this.answers = answers;
	}

	void displayInfo() {
		System.out.println("Q" + questionNumber + ":" + questionName);
		Iterator<String> iterating = answers.iterator();
		while (iterating.hasNext()) {
			System.out.println(iterating.next());
		}
	}

}
