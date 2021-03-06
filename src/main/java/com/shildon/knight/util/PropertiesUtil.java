package com.shildon.knight.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 处理Propertites的工具。
 * @author shildon<shildondu@gmail.com>
 * @date Jan 29, 2016
 */
public class PropertiesUtil {
	
	private Properties properties = new Properties();
	
	public PropertiesUtil(InputStream inputStream) {
		try {
			InputStreamReader isr = new InputStreamReader(inputStream, "UTF-8");
			properties.load(isr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object getValue(Object key) {
		return properties.get(key);
	}

}
