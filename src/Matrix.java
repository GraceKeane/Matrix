import java.util.Scanner;

public class Matrix {

	int[][] matrix = new int[4][4];
	
	public Matrix()
	{
		int i,j;
		Scanner input;
		
		input = new Scanner(System.in);
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.println("Please enter row "+i +" col "+j);
				matrix[i][j] = input.nextInt();
				
			}
				
			
		}
	}
	
	public Matrix(int init)
	{
		int i,j;
		Scanner input;
		
		input = new Scanner(System.in);
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				matrix[i][j] = init;
				
			}
				
			
		}
	}
	
	public Matrix Add(Matrix b)
	{
		Matrix C = new Matrix(1);
		int i,j;
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.println("Please enter row "+i +" col "+j);
				C.matrix[i][j] = matrix[i][j] + b.matrix[i][j];
				
			}
				
			
		}
		
		return C;
	}
	
	public Matrix Subtract(Matrix b)
	{
		Matrix C = new Matrix(1);
		int i,j;
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.println("Please enter row "+i +" col "+j);
				C.matrix[i][j] = matrix[i][j] - b.matrix[i][j];
				
			}
				
			
		}
		
		return C;
	}
	
	@Override
    public boolean equals(Object obj) {
		boolean found = true;
		int i,j;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(((Matrix)obj).matrix[i][j] != matrix[i][j])
					{
					   found = false;
					   System.out.println(matrix[i][j]);
					   System.out.println(((Matrix)obj).matrix[i][j]);
					   
					   System.out.println("Not same");
					}
				
			}
				
			
		}
		
		return found;
    }
}
