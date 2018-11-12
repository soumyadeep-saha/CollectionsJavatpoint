package com.soumyadeep.collections.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CreatePropertiesFile {

	public static void main(String[] args) throws IOException {

		Properties p = new Properties();
		p.setProperty("id", "systemStore");
		p.setProperty("password", "oracleStore");
		p.store(new FileWriter("newDb.properties"), "saved");
	}
}
