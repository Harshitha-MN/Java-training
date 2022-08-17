package com.josh.javatraining.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) {
		String data = "644,Harshitha,tumkur,karnataka,india";

		try {
			FileWriter output = new FileWriter("data1.txt");
			output.write(data);
			System.out.println("data is written succesfully");
			output.close();
		} catch (IOException ex) {
			System.out.println("file write error");
		}
	}
}
