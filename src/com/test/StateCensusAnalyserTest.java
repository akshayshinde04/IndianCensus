package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.StateCensusAnalyser;

public class StateCensusAnalyserTest {
	StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
	@Test
	public void test_reading_CSVdata() throws Exception {
		censusAnalyser.readCSVdata("C:\\Users\\Akshay Shinde\\eclipse-workspace\\IndianCensusAnalyser\\src\\com\\resources\\IndiaStateCensusData.csv");
		assertEquals(true, censusAnalyser.countEntries());
	}
	@Test
	public void testInvalidFilename() throws Exception {
		try {
			censusAnalyser.readCSVdata("C:\\Users\\Akshay Shinde\\eclipse-workspace\\IndianCensusAnalyser\\src\\com\\resources\\abcIndiaStateCensus.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
} 
