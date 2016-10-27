package javagram;

import javagram.filters.*;


import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Filter filter = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				//String[] relPathParts = relPath.split(File.separator);
				//imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
			
				imagePath = (dir + "\\" + relPath);
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		
		do
		{
			System.out.println("Select a filter!");
			System.out.println("1. Choose BlueFilter");
			System.out.println("2. Choose BrightnessFilter");
			System.out.println("3. Choose GrayscaleFilter");
			System.out.println("Please select an option: ");
			int selection = in.nextInt();
			try 
			{
				filter = getFilter(selection);	
			} catch (IndexOutOfBoundsException i)
			{
				System.out.println(i);
			}
		}while(filter == null);
				

		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		boolean confirm = true;
		do 
		{
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) 
		{
			System.out.println("Image not saved");
		} 
			else 
			{
			String absFileName = dir + File.separator + fileName;
			File throwawayFile = new File(absFileName);
			
				if (!throwawayFile.exists())
				{
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);
				} 
				else 
				{
				System.out.println("Are you certain you want to overwrite the file? Type 'yes', otherwise type 'no'");
				String confirmation = in.next();
					if (confirmation != "yes")
					{
						confirm = false;
					}
				} 
			}
		} while (!confirm);
		// close input scanner
		in.close();
		}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to throw an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int ID) {
		Filter newFilter;
		switch (ID) {
			case 1: newFilter = new BlueFilter();
			break;
			case 2: newFilter = new BrightnessFilter();
			break;
			case 3: newFilter = new GrayscaleFilter();
			break;
			default: throw new IndexOutOfBoundsException("Not a valid selection"); 
			
		}
		// TODO - create some more filters, and add logic to return the appropriate one
		return newFilter;
		
	}

}