package com.framework;

import java.util.Iterator;
import java.util.List;

public class QuestionKrishna {
	private int id;
	private String questionName;
	private List<AnswerKrishna> answers;

	public QuestionKrishna(int id, String questionName, List<AnswerKrishna> answers) {
		super();
		this.id = id;
		this.questionName = questionName;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("Q" + id + ": " + questionName);
		System.out.println("Answers are :");
		Iterator<AnswerKrishna> iterating = answers.iterator();
		while (iterating.hasNext()) {
			System.out.println(iterating.next());
		}
	}

}
