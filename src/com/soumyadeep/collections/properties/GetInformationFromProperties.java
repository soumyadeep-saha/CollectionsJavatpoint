package com.soumyadeep.collections.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetInformationFromProperties {

	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("D:\\workspace-self\\microservices\\db.properties");
		Properties p=new Properties();
		p.load(reader);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}
}
