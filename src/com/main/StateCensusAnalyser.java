package com.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.entity.StateCensusCSV;
import com.exception.InvalidFileName;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class StateCensusAnalyser {
	List<StateCensusCSV> censusCSVs = new ArrayList<>();

	public void readCSVdata(String path) throws Exception {
		try {
			CSVReader csvReader = new CSVReader(new FileReader(path));
			String[] data;
			data = csvReader.readNext();
			while ((data = csvReader.readNext()) != null) {
				censusCSVs.add(new StateCensusCSV(data[0], Long.parseLong(data[1]), Integer.parseInt(data[2]),
						Double.parseDouble(data[3])));
			}
			
			 for (StateCensusCSV info : censusCSVs) { System.out.println(info); }
			 

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new InvalidFileName("Invalid File Name");
		}

	}

	public Object countEntries() {
		if (censusCSVs.size() == 29)
			return true;
			return false;
	}

}
