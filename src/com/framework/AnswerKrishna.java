package com.framework;

public class AnswerKrishna {
	private int id;
	private String answer;
	private String givenBy;

	public AnswerKrishna(int id, String answer, String givenBy) {
		super();
		this.id = id;
		this.answer = answer;
		this.givenBy = givenBy;
	}

	public String toString() {
		return "answer id:" + id + " ,answer :" + answer + ",answer given by :" + givenBy;
	}
}
