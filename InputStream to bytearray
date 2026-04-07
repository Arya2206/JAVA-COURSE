import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamToByteArray {
 
 // write the code..
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String fileName = scanner.nextLine();
		try (FileInputStream fis = new FileInputStream(fileName)) {
			byte[] buffer = new byte[1024];
			int bytesRead;
			java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer,0, bytesRead);
				
			}
			byte[] fileBytes = baos.toByteArray();

			System.out.println("Byte array length: " + fileBytes.length);
		}catch (IOException e){
			System.out.println("Error reading file: " + e.getMessage());
		}
		
	}
}
