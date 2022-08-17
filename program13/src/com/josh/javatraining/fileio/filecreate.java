package com.josh.javatraining.fileio;

import java.io.File;
import java.io.IOException;

public class filecreate {
	public static void main(String[] args) {
		File myFile = new File("data3.txt");

		try {
			if (myFile.createNewFile()) {
				System.out.println("file created succesfully");
			} else {
				System.out.println("file creation errors");
			}
		} catch (IOException ex) {
			System.out.println("file error");
		}
	}
}
