package com.josh.javatraining.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("data1.txt");
			fos = new FileOutputStream("data3.txt");
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("file copied");
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}