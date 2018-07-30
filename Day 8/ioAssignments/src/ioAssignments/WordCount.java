package ioAssignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class WordCount {
	public static void main(String args[]) throws Exception {
			
			String filePathString;
			Scanner scanner = new Scanner(System.in);
		//Input path of file	
			System.out.println("Enter file path....");
			filePathString = scanner.next();
			
		
			File file = new File(filePathString);
			if(file.exists() && !file.isDirectory())
			{
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String line = bufferedReader.readLine();
				
				int count = 0;
				while(line != null)
				{
					String parts[] = line.split(" ");
					for(String w : parts)
					{
						count++;
					}
					line = bufferedReader.readLine();
				}
				System.out.println("words are:   "+count);
			}
			else
				System.out.println("File is not there....");
			
			scanner.close();
	}
}
