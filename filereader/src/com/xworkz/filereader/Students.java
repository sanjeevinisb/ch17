package com.xworkz.filereader;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class Students {
		
		public static void main(String[] args) {
		        String fileName ="C:\\vcs\\ch17\\filereader\\src\\com\\xworkz\\filereader\\sanjeevini.txt";

		        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
		            String line;
		            while ((line = br.readLine()) != null) {
		                System.out.println(line); // Print each line of the file to the console
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		

}
