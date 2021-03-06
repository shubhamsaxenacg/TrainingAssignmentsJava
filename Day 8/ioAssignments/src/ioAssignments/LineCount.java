package ioAssignments;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class LineCount {
	public static void main(String args[]) {
			
			String filePathString;
			Scanner scanner = new Scanner(System.in);
		//Input path of file	
			System.out.println("Enter file path....");
			filePathString = scanner.next();
			
			try {
				File file = new File(filePathString);
				
				if(file.exists() && !file.isDirectory())
				{
					FileReader fileReader = new FileReader(file);
					LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
					
					int lineNumber = 0;
					
					while (lineNumberReader.readLine() != null) {
						lineNumber++;
					}
					System.out.println("Total no. of lines: "+lineNumber);
					lineNumberReader.close();
				}
				else
					System.out.println("File is not there....");
				
			} catch(IOException e) {
				e.printStackTrace();
				
			}
			scanner.close();
	}
}
