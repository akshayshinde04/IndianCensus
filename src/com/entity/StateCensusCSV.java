package com.entity;

public class StateCensusCSV {
	String state;
	long population;
	int areainSqKm;
	double densityperSqKm;

	public StateCensusCSV(String state, long population, int areainSqKm, double densityperSqKm) {
		super();
		this.state = state;
		this.population = population;
		this.areainSqKm = areainSqKm;
		this.densityperSqKm = densityperSqKm;
	}

	@Override
	public String toString() {
		return "StateCensusCSV [state=" + state + ", population=" + population + ", areainSqKm=" + areainSqKm
				+ ", densityperSqKm=" + densityperSqKm + "]";
	}

}
