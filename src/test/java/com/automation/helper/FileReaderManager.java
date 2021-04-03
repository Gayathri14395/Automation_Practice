package com.automation.helper;

public class FileReaderManager {
	
	public static FileReaderManager getInstance() {
		FileReaderManager fr=new FileReaderManager();
		return fr;
	}
	
	public  Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;

	}
	
	
	

}
