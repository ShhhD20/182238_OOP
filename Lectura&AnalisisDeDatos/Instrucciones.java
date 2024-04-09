import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Instrucciones {
	 public void exe(int inicio) {
		 File archivo, nuevo;
		 String filePath, data, fileName;
		 String[] trueData, title, trueTitle;
		 int[] array = new int[3000];
		 
		 filePath = "D:\\Users\\182238\\Downloads";
		 fileName = "182238.txt";
		 nuevo = new File(fileName);
		 FileOutputStream outFileStream;
		
		 for(int c = 0; c < 3000; c++) {
			 array[c] = 0;
		 }
		 try {
			 archivo = new File(filePath, "ACT_002_emails.csv");
			 Scanner lector = new Scanner(archivo);
			 
			 for(int a = 0; a < 9999; a++) {
				 if(lector.hasNextLine()) {
					 
					 data = lector.nextLine();
					 if(a >= inicio && a < (inicio+50)) {
						 if(a > 999) {
							 data = data.substring(11);
						 }else if(a > 99) {
							 data = data.substring(10);
						 }else if(a > 9) {
							 data = data.substring(9);
						 }else {
							 data = data.substring(8);
						 }
						 data = data.substring(0, data.length()-2);
						 trueData = data.split(",");
						 
						 for(int b = 0; b < 3000; b++) {
							 array[b] += Integer.parseInt(trueData[b]); 
						 }
					 }
					 if(a == 0) {
						 data = data.substring(10);
						 title = data.split(",");
						 System.out.print(title);
					 }
				 }
			 }
			 for(int d = 0; d < 3000; d++) {
				 System.out.print(array[d] + " ");
			 }
			 lector.close();
		 }catch (FileNotFoundException e) {
			 System.out.println("An error occurred.");
			 e.printStackTrace();
		 }
		 
		 if(nuevo.exists()) {
			 
		 }else {
			 try {
				 nuevo.createNewFile();
			 }catch(IOException e){
				 e.printStackTrace();
			 }
		 }
		 try {
			outFileStream = new FileOutputStream(nuevo);
			DataOutputStream outDataStream = new DataOutputStream(outFileStream);
			ObjectOutputStream outObjectStream;
			try {
				outObjectStream = new ObjectOutputStream(outDataStream);
				
				outObjectStream.writeObject(title[0]);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				outDataStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		 
	 }
}
