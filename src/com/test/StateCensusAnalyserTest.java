package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.StateCensusAnalyser;

public class StateCensusAnalyserTest {
	@Test
	public void test_reading_CSVdata() throws Exception {
		StateCensusAnalyser censusAnalyser = new StateCensusAnalyser();
		censusAnalyser.readCSVdata();
		assertEquals(true, censusAnalyser.countEntries());
	}
}
