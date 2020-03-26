package gallant_problem2;

import gallant_problem2.DuplicateCounter;

public class Application {

	public static void main(String[] args) {
		
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		
		String file1 = "problem2.txt";
		String file2 = "unique_word_counts.txt";
				
		duplicateCounter.count(file1);
		duplicateCounter.write(file2);
	}
}
