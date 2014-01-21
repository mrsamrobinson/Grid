package grid.view;

import grid.model.Chatbot;

public class GridView
{
	
	public void printIntInformation(int [][] currentArray)
	{
		System.out.println("foreach printing");
		for(int [] currentRow : currentArray)
		{
			for(int currentNumber : currentRow)
			{
				System.out.print(currentNumber + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	public void printStringInformation(String [][] currentArray)
	{
		System.out.println("foreach printing");
		for(String [] currentRow : currentArray)
		{
			for(String currentString : currentRow)
			{
				System.out.print(currentString + "\t");
			}
			System.out.println();
		}
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public void printChatbotInformation(Chatbot [][] currentArray)
	{
		int listSlot = 0;
		
		System.out.println("foreach printing");
		for(Chatbot [] currentRow : currentArray)
		{
			for(Chatbot currentBot : currentRow)
			{
				System.out.print(currentBot.getMyColors().get(listSlot) + "\t");
				listSlot++;
			}
			System.out.println();
		}
		
		listSlot = 0;
		
		System.out.println("for printing");
		for(int row = 0; row < currentArray.length; row++)
		{
			for(int col = 0; col < currentArray[0].length; col++)
			{
				System.out.print(row + "," + col + ": " + currentArray[row][col].getMyMovies().get(listSlot) + "\t");
				
				listSlot++;
			}
			System.out.println();
		}
	}

}
