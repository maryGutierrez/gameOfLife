package theProject;

import java.io.*;
import java.util.*;

public class ReadFile {
	// class takes care of reading a file and placing the data
	// into a 2 dimensional array
 void reading(int my2dArray[][], int R, int C)
 {
	
	String fileName= "startinggrid.txt";
	String line = null;
	try {
		FileReader fileReader= new FileReader(fileName);
		
		BufferedReader bufferedReader= new BufferedReader(fileReader);
		System.out.println("\n\nOriginal Generation");
		
		while((line= bufferedReader.readLine()) != null)
		{
			R = 0;
			String[] values = line.split(", ");
			for(String str:values)
			{
				int str_double = (int) Double.parseDouble(str);
				my2dArray[R][C]= str_double;	
				if (my2dArray[R][C] == 0)
					System.out.print("O");
					else
					System.out.print("X");
				System.out.print( " ");
				R++;
			}
			System.out.println();
				C++;	
		}	

	}
	
	    catch(IOException ex) { System.out.println("Error reading file '"  + fileName + "'"); }
	
	// calls the second generation, printing.
	secondGeneration secondGen= new secondGeneration();
	secondGen.nextGeneration(my2dArray, R, C);

	}
}
