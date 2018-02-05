package application;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	//System.out.println("Hello world! Text:\n");
	
	BufferedReader in = new BufferedReader(new FileReader("song_data.txt"));
	String line;
	while((line = in.readLine()) != null)
	{
	    System.out.println(line);
	}
	in.close();
	
	}
	

}
