package gallant_problem1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

	Set<String> uniqueWords = new HashSet<String>();
	public void remove(String dataFile) {

		String newWord;
		try(Scanner input = new Scanner(Paths.get(dataFile))) {
			while (input.hasNext()) {
				
				newWord = input.next();
				newWord = newWord.toLowerCase();
				if (newWord.contains("1") | newWord.contains("2") | newWord.contains("3") | newWord.contains("4") 
				| newWord.contains("5") | newWord.contains("6") | newWord.contains("7") | newWord.contains("8")
				| newWord.contains("9") | newWord.contains("0")) {
					continue;
				}
				System.out.println(newWord);
				uniqueWords.add(newWord);
				}
			}
		
		catch (IOException | NoSuchElementException | IllegalStateException e) {
			System.out.println("An exceptional IO event has occured, sorry!");
			e.printStackTrace();
		}
	}
	
	public void write(String outputFile) {
		
		try(Formatter output = new Formatter(outputFile)) {
				output.format("%s", uniqueWords);
		}
		
		catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
			e.printStackTrace();
		}
	}

}
