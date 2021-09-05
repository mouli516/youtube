package com.youtube.genericlib;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	
	public String readpropdata(String key,String proppath) throws Throwable
	{
		FileInputStream file = new FileInputStream(proppath);
		Properties prop = new Properties();
		prop.load(file);
		String p = prop.getProperty(key,"incorrect vlue");
		return p;
	}

}
