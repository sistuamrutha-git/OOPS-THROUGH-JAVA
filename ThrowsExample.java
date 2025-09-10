package oops;
import java.io.*;
import java.io.BufferedReader;

public class ThrowsExample {
static void readFile() throws IOException{
	FileReader fr = new FileReader ("test.txt");
	BufferedReader br = new BufferedReader(fr);
	String line = br.readLine();
	System.out.println("First Line:"+line);
	br.close();
}
public static void main(String[] args) {
	try {
		readFile();
	}
	catch(IOException e) {
		System.out.println("Error:"+e.getMessage());
	}
}
}
