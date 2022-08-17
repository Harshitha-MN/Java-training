package com.josh.javatraining.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		try {
			File file = new File("data1.txt");
		      FileReader read = new FileReader(file);
		      int i;
		      while((i=read.read())!=-1)
		      {
		    	  System.out.print((char)i);
		      }
		} catch (IOException ex) {
			System.out.println("file rwad error");
		}
	}
}
