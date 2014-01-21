package grid.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Contains most of the processing of the Chat Bot. Holds all values for Chat
 * Bot.
 * 
 * @author Sam Robinson
 * @version 1.6 10/30/13
 */
public class Chatbot
{
	/**
	 * Creates an Array List that is a String type named myMemes.
	 */
	private ArrayList<String> myMemes;
	
	public ArrayList<String> getMyMovies()
	{
		return myMovies;
	}

	/**
	 * Creates an Array List that is a String type named myColors.
	 */
	private ArrayList<String> myColors;
	
	public ArrayList<String> getMyColors()
	{
		return myColors;
	}

	/**
	 * Creates an Array List that is a String type named myRandomList.
	 */
	private ArrayList<String> myRandomList;
	
	/**
	 * Creates an Array List that is a String type named myMovies.
	 */
	private ArrayList<String> myMovies;
	
	/**
	 * Creates an Array List that is a String type named conversationList.
	 */
	private ArrayList<String> conversationList;

	public Chatbot()
	{
		myMemes = new ArrayList<String>();
		myColors = new ArrayList<String>();
		myRandomList = new ArrayList<String>();
		myMovies = new ArrayList<String>();
		conversationList = new ArrayList<String>();

		fillTheRandomList();
		fillTheMemeList();
		fillTheColorList();
		fillTheMovieList();
		fillTheConversationList();
	}
	
	/**
	 * Adds Strings to the ArrayList 'conversationList'.
	 */
	private void fillTheConversationList()
	{
		conversationList.add("My name is Chatbot.");
		conversationList.add("My favorite car is the McLaren P1.");
		conversationList.add("I like cookies.");
		conversationList.add("I don't care about you.");
	}

	/**
	 * Helper method to fill the myMovies with Strings.
	 */
	private void fillTheMovieList()
	{
		myMovies.add("Starwars");
		myMovies.add("Men in Black");
		myMovies.add("Lord of the Rings");
		myMovies.add("Cars");

	}

	/**
	 * Helper method to fill the myRandomList with Strings.
	 */
	private void fillTheRandomList()
	{
		myRandomList.add("penguins");
		myRandomList.add("I have to say something random?");
		myRandomList.add("you don't want that?");
		myRandomList.add("cat");
		myRandomList.add("java");
	}

	/**
	 * Method to retrieve a random value from the myRandomList.
	 * 
	 * @return The String value randomly selected from the list.
	 */
	public String getRandomTopic()
	{
		String memeTopic = "";

		double myRandomNumber = Math.random();
		int myMemesPosition = (int) (myRandomNumber * myMemes.size());
		memeTopic = myMemes.get(myMemesPosition);

		return memeTopic;
	}

	/**
	 * Fills the Array List 'myColors' with the colors.
	 */
	private void fillTheColorList()
	{
		myColors.add("blue");
		myColors.add("red");
		myColors.add("green");
		myColors.add("purple");
		myColors.add("pink");
		myColors.add("yellow");
		myColors.add("white");
		myColors.add("black");
		myColors.add("orange");
		myColors.add("brown");
		myColors.add("cyan");
		myColors.add("silver");
		myColors.add("grey");
		myColors.add("gray");
		myColors.add("tan");
		myColors.add("crimson");
		myColors.add("turqoise");
		myColors.add("aquamarine");
		myColors.add("dark blue");
	}

	/**
	 * Fills the Array List 'myMemes' with memes.
	 */
	private void fillTheMemeList()
	{
		myMemes.add("my jimmies are rustled");
		myMemes.add("cats");
		myMemes.add("grumpy cat");
		myMemes.add("What does the fox say");
		myMemes.add("philosoraptor");
		myMemes.add("iamdisappoint");
	}

	/**
	 * Tests if 'currentPhrase' matches any of the Strings in 'myMovies'.
	 * 
	 * @param currentPhrase
	 *            is using the 'userInput' String value.
	 * @return The boolean that shows whether or not 'currentPhrase' matches
	 *         anything in 'myMovies'.
	 */
	public boolean movieChecker(String currentPhrase)
	{
		boolean isMovie = false;

		if (currentPhrase != null)
		{
			for (String currentMovie : myMovies)
			{
				if (currentPhrase.equalsIgnoreCase(currentMovie))
				{
					isMovie = true;
				}
			}
		}

		return isMovie;
	}

	/**
	 * Tests if 'currentPhrase' matches any of the values in the Array List
	 * 'myColors'.
	 * 
	 * @param currentPhrase
	 *            is using the 'userInput' String value.
	 * @return The boolean that shows whether or not 'currentPhrase' matches
	 *         anything in 'myColors'.
	 */
	public boolean colorChecker(String currentPhrase)
	{
		boolean isColor = false;

		if (currentPhrase != null)
		{
			for (String currentColor : myColors)
			{
				if (currentPhrase.equalsIgnoreCase(currentColor))
				{
					isColor = true;
				}
			}
		}

		return isColor;

	}

	/**
	 * Tests if 'currentPhrase' matches any of the values in the Array List
	 * 'myMemes'.
	 * 
	 * @param currentPhrase
	 *            is using the 'userInput' String value.
	 * @return The boolean that shows whether or not 'currentPhrase' matches
	 *         anything in 'myMemes'.
	 */
	public boolean memeChecker(String currentPhrase)
	{
		boolean isMeme = false;

		if (currentPhrase != null)
		{
			for (String currentMeme : myMemes)
			{
				if (currentPhrase.equalsIgnoreCase(currentMeme))
				{
					isMeme = true;
				}
			}
		}

		return isMeme;
	}

	/**
	 * Tests whether or not the String 'current' contains 'boo'.
	 * 
	 * @param The
	 *            current phrase.
	 * @return Returns a String based on whether or not the String 'current'
	 *         contains 'boo'.
	 */
	public String usesContent(String current)
	{
		String processedString = "";

		if (current.contains("boo"))
		{
			processedString = "wooo scary";
		}
		else
		{
			processedString = "boooooooring";
		}

		return processedString;
	}

	/**
	 * Runs a series of tests to sort Strings alphabetically.
	 * 
	 * @param String
	 *            with the name of first.
	 * @param String
	 *            with the name of middle.
	 * @param String
	 *            with the name of last.
	 * @return the String sortedName.
	 */
	public String putNameInAlphabeticOrder(String first, String middle,
			String last)
	{
		String sortedName = "";

		if (first.compareTo(middle) < 0)
		{
			if (first.compareTo(last) < 0)
			{
				if (middle.compareTo(last) < 0)
				{
					sortedName = first + ", " + middle + ", " + last;
				}
				else
				{
					sortedName = first + ", " + last + ", " + middle;
				}
			}
			else
			{
				sortedName = last + ", " + first + ", " + middle;
			}
		}
		else
		{
			if (middle.compareTo(last) < 0)
			{
				if (last.compareTo(first) < 0)
				{
					sortedName = middle + ", " + last + ", " + first;
				}
				else
				{
					sortedName = middle + ", " + first + ", " + last;
				}
			}
			else
			{
				sortedName = last + ", " + middle + ", " + first;
			}
		}

		return sortedName;
	}

	/**
	 * A method that is used to return the ArrayList 'conversationList'.
	 * @return the ArrayList 'conversationList'.
	 */
	public ArrayList<String> conversationPiece()
	{
		
		return conversationList;

	}

}
