package Exp10;

import java.io.*;

public class Copy_Content_Of_File {
	public static void main(String[] args) {
		String sourceFilePath = "D://myprofile//source.txt";
		String destinationFilePath = "D://myprofile//destination.txt";
		try {
		File sourceFile = new File(sourceFilePath);
		File destinationFile = new File(destinationFilePath);
		FileReader reader = new FileReader(sourceFile);
		FileWriter writer = new FileWriter(destinationFile);
		char[] buffer = new char[1024];
		int bytesRead;
		while ((bytesRead = reader.read(buffer)) != -1) {
		writer.write(buffer, 0, bytesRead);
		}
		reader.close();
		writer.close();
		System.out.println("File copied successfully.");
		} catch (IOException e) {
		System.out.println("An error occurred: " + e.getMessage());
		}}}