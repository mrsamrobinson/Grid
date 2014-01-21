package grid.controller;

import grid.model.Chatbot;
import grid.view.GridView;

public class GridController
{
	private int[][] intArray;
	private String[][] stringArray;
	private Chatbot[][] chatbotArray;
	private GridView myView;
	
	
	public GridController()
	{
		myView = new GridView();
		intArray = new int[3][3];
		stringArray = new String[4][4];
		chatbotArray = new Chatbot[2][2];
		
		fillTheIntArray();
		fillTheStringArray();
		fillTheChatbotArray();
	}
	
	private void fillTheIntArray()
	{
		intArray[0][0] = 7;
		intArray[0][1] = 9;
		intArray[0][2] = 21;
		
		intArray[1][0] = 10;
		intArray[1][1] = 69;
		intArray[1][2] = 77;
		
		intArray[2][0] = 84;
		intArray[2][1] = 50;
		intArray[2][2] = 44;
	}
	
	private void fillTheStringArray()
	{
		stringArray[0][0] = "Sam";
		stringArray[0][1] = "Berry";
		stringArray[0][2] = "Jarin";
		stringArray[0][3] = "Jake";
		
		stringArray[1][0] = "Nate";
		stringArray[1][1] = "Devvin";
		stringArray[1][2] = "Zach";
		stringArray[1][3] = "Cody";
		
		stringArray[2][0] = "Janice";
		stringArray[2][1] = "Karl";
		stringArray[2][2] = "Charlotte";
		stringArray[2][3] = "Jessica";
		
		stringArray[3][0] = "Heather";
		stringArray[3][1] = "Brittany";
		stringArray[3][2] = "Carter";
		stringArray[3][3] = "Justin";
	}
	
	private void fillTheChatbotArray()
	{
		chatbotArray[0][0] = new Chatbot();
		chatbotArray[0][1] = new Chatbot();
		
		chatbotArray[1][0] = new Chatbot();
		chatbotArray[1][1] = new Chatbot();
	}
	
	public void start()
	{
		myView.printIntInformation(intArray);
		myView.printStringInformation(stringArray);
		myView.printChatbotInformation(chatbotArray);
		
	}
	
	
	
}
