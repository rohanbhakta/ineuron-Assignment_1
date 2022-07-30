// Assignment Q1 - Print INEURON

class Demo1
{
	public static void main(String[] args)
	{
		int height = 6;
		int width = height;
		for(int i = 1; i <= height; i++)
		{	
			// Alphabet - I
			for(int j = 1; j <= width; j++)
			{
				if(i == 1 || i == height || j == width/2)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");	
				}
			}

			System.out.print(" ");

			// Alphabet - N
			for(int j = 1; j <= width; j++)
			{
				if(j == 1 || j == width || i == j)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.print(" ");

			// Alphabet - E

			for(int j = 1; j <= width; j++)
			{
				if(i == 1 || i == height || j == 1 || i == height/2)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.print(" ");

			// Alphabet - U

			for(int j = 1; j <= width; j++)
			{
				if((j == 1 || j == width) && i != height || (i == height && j != 1) && j != width)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.print(" ");

			// Alphabet - R

			for(int j = 1; j <= width; j++)
			{
				if(j == 1 || (i == 1 || i == height/2) && j != width || (i != 1 && i != height/2) && j == width)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.print(" ");

			// Alphabet O

			for(int j = 1; j <= width; j++)
			{
				if((i == 1 || i == height) && j != 1 && j != width || (j == 1 || j == width) && i != 1 && i != height)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.print(" ");

			// Alphabet N

			for(int j = 1; j <= width; j++)
			{
				if(j == 1 || j == width || i == j)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}


			System.out.println();

		}

	}
	
}

// Assignment Q2 - Number Pattern

class Demo2
{
	public static void main(String[] args)
	{
		int n = 4;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(i);
				System.out.print(" ");
			}

			System.out.println();
		}	
	}
}


// Assignment Q3 

class Demo3
{
	public static void main(String[] args)
	{
		int n = 14;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1  || j == 1  || i == n || j == n || i + j <= (n - (n-1)/2) || j - i >= (n - 1)/2)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.println();
		}	
	}
}



// Assignment Q4

class Demo4
{
	public static void main(String[] args)
	{
		int n = 14;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == n || (j == 1 || j == n) && i >= n/2 || i - j >= (n - 1)/2 && i != (n/2) || i + j >= (n + n/2))
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.println();
		}	
	}
}

// Assignment Q5


class Demo5
{
	public static void main(String[] args)
	{
		int n = 14;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 1 || i == n || j == 1 || i + j <= (n - (n - 1)/2) || i - j >= (n - 1)/2)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.println();
		}	
	}
}