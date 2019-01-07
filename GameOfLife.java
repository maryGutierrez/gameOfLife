// Mary Gutierrez 
// Game of life game 
package theProject;


import java.util.Scanner;
import java.util.*;
import java.util.Arrays.*;

public class GameOfLife {
	static Scanner in= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int R =0;// Rows
		int C =0;//Columns
		
		int[][] my2dArray= new int[20][20];// initializing array
		System.out.println("Welcome to the game of Life");
		
		
		ReadFile theFile = new ReadFile();// calling the file reader
		theFile.reading(my2dArray, R, C);//printing the file 

	}

}
	