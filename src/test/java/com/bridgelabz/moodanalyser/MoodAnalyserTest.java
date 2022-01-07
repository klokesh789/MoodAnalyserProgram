package com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	@Test
	public void givenMood_IsHappy_ShouldReturnSad() {
		MoodAnalyser analyser = new MoodAnalyser("I am in Sad mood");
		Assert.assertEquals("SAD",analyser.analyseMood());
	}
	@Test
	public void givenMood_IsAny_ShouldReturnHappy() {
		MoodAnalyser analyser = new MoodAnalyser("I am in Happy mood");
		Assert.assertEquals("HAPPY",analyser.analyseMood());
	}
	@Test
	public void givenMood_IsHappy_ShouldReturnException() {
		MoodAnalyser analyser = new MoodAnalyser();
		Assert.assertEquals("HAPPY",analyser.analyseMood());
	}
	@Test
	public void givenMood_IsNull_ShouldReturnException() {
		MoodAnalyser analyser = new MoodAnalyser(null);
		Assert.assertEquals("HAPPY",analyser.analyseMood());
	}
}
