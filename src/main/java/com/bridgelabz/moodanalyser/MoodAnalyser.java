package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	String message;
	public MoodAnalyser(){
		
	}
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}
	public String analyseMood() {
		try {
			if (message.contains("Sad")) {
				return "SAD";
			}else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}
