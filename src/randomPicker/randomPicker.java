package randomPicker;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class randomPicker {
	int randNumber;
	ArrayList<film> list; //Create an ArrayList that stores "film" called list
	public randomPicker() {//constructor
		
//declare the array
		
		list = new ArrayList<>();
		wipe();
		inputFilm();
		generateNumbers();
		pickFilm();
		sizeOf();
	}// end of constructor

//method to clear the screen
	public void wipe()
{
	System.out.println("\f");
}
	//displays size of ArrayList
	public void sizeOf()
	{
		wipe();
		
		if(list.size() == 0)
		{
			System.out.println("You have not input anything yet!");
		}
		else
		System.out.println("the size of the list is " + list.size());
	}
	
	//ask the user to input 5 films
	public void inputFilm()
	{
		int count = 0;
		String name;
		film f;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0;count  < 5;count++)
		{
	System.out.println("Input a film name");
	name = scan.nextLine();
	f = new film(name);
	list.add(f);
	
		}
	}
	
	public void generateNumbers()
	{
		
		Random r = new Random();
		randNumber = r.nextInt(5) + 1;
		//System.out.println(randNumber);testing to ensure it works
		
	}
	public void pickFilm()
	{
		int index = randNumber;
		   film selectedFilm = list.get(index);
		   System.out.println("The random number generated was " + randNumber);
		   System.out.println("The random film picked was " + selectedFilm.getFilmName());
	}
	// main method
	public static void main(String[] args) {
new randomPicker();
	} // end of main method
}// end of class
