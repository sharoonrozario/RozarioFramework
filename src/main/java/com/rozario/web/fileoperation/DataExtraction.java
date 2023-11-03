package com.rozario.web.fileoperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataExtraction {
	private static File propFile;
	private static FileInputStream fis;
	private static Properties prop;
	public synchronized String getDataFromProperties(String input) throws IOException,FileNotFoundException {
		propFile = new File("/Users/sharoonrozario/eclipse-workspace/RozarioFramework/Configurations/Config.properties");
		input = input.toLowerCase();
		fis = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(fis);
		return	prop.get(input).toString();
	}
	

}
