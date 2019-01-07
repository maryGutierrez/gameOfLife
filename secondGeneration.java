//Mary Gutierrez
package theProject;

public class secondGeneration {
	//class takes care of counting the number of neighboors and printing 
	// the next generation
	 void nextGeneration(int my2dArray[][], int R, int C)
		{
			int[][] future = new int[R][C];

				for (int k = 1; k < R - 1; k++) // going trough the array 
				{
					for (int l = 1; l < C - 1; l++)
					{
						int n = 0;// saves the nummber of neighbours for every cells. 
						for (int i = -1; i <= 1; i++)
							for (int j = -1; j <= 1; j++)
									n += my2dArray[k + i][l + j];
									n -= my2dArray[k][l];
									
								if ((my2dArray[k][l] == 1) && (n < 2))
								future[k][l] = 0;
								
									else if ((my2dArray[k][l] == 1) && (n > 3))
									future[k][l] = 0;
												else if ((my2dArray[k][l] == 0) && (n == 3))
						future[k][l] = 1;
						else
						future[k][l] = my2dArray[k][l];
					}
				}
				//prints the next generation
				System.out.println();
				
				System.out.println("Next Generation");
				for (int i = 0; i < R; i++)
				{
				for (int j = 0; j < C; j++)
				{
				if (future[j][i] == 0)
				System.out.print("O");
				else
				System.out.print("X");
				System.out.print(" ");
				
				}
				System.out.println();
				}

			}

}
