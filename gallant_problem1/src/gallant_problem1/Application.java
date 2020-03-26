package gallant_problem1;

public class Application {

	public static void main(String[] args) {
		
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
		String file1 = "problem1.txt";
		String file2 = "unique_words.txt";
		
		duplicateRemover.remove(file1);
		duplicateRemover.write(file2);

	}
}
