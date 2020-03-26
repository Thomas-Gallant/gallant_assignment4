package gallant_problem2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DuplicateCounter {

	HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
	public void count(String dataFile) {
		
		int currentCount;
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
				if (wordCounter.containsKey(newWord)) {
					currentCount = wordCounter.get(newWord) + 1;
					wordCounter.put(newWord, currentCount);
					continue;
				}
				
				wordCounter.put(newWord, 1);
			}
		}
		
		catch (IOException | NoSuchElementException | IllegalStateException e) {
			System.out.println("An exceptional IO event has occured, sorry!");
			e.printStackTrace();
		}
	}
	
	public void write(String outputFile) {
		
		try(Formatter output = new Formatter(outputFile)) {
			wordCounter.entrySet().forEach(entry->{
				output.format("%s %d \n", entry.getKey(), entry.getValue());
				
			});
		}
	
		catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
			e.printStackTrace();
		}
	}
}
