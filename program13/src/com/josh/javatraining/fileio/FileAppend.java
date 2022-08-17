package com.josh.javatraining.fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {
		String data = "this data is appended...";

		try {
			FileWriter output = new FileWriter("data1.txt", true);
			output.write(data);
			System.out.println("data appended succesfully");
			output.close();
		} catch (IOException ex) {
			System.out.println("file append succesfully");
		}
	}
}
