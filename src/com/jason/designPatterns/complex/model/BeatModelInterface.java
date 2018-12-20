package com.jason.designPatterns.complex.model;

public interface BeatModelInterface {
	public void initialize();

	public void on();

	public void off();

	public void setBPM(int bpm);

	public int getBPM();
	
	
	public void registerObserver();
	
	public void removeObserver();
}
