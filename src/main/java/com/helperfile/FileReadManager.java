package com.helperfile;

import java.io.IOException;

public class FileReadManager {

	// priavte method
	private FileReadManager() {
		
	}
	
	// static method
	public static FileReadManager getInstance_FRM() {
		FileReadManager help = new FileReadManager();
		return help;
		
	}
	
	// non static method
	
	public Configuration_Reader getInstance_co() throws IOException {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}
	
	
}
