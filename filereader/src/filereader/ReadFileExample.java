package filereader;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class ReadFileExample {
	    public static void main(String[] args) { 
	        // Path to the file
	        String filePath = "example.txt";

	        // Try-with-resources statement to ensure the file is closed properly
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            // Read the content of the file
	            String line;
	            while ((line = br.readLine()) != null) {
	                // Print each line to the console
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            // Handle exceptions related to file operations
	            System.err.println("An error occurred while reading the file: " + e.getMessage());
	        }
	    }
	}

