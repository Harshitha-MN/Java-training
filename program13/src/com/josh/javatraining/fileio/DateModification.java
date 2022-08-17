package com.josh.javatraining.fileio;

import java.io.File;
import java.text.SimpleDateFormat;

public class DateModification {
	public static void main(String[] args) {
		File file = new File("data1.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy  HH:MM:SS");
		System.out.println("last modiified date:" + sdf.format(file.lastModified()));
	}
}
