import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Instrucciones {
	 public void exe(int inicio) {
		 File archivo, nuevo;
		 String filePath, data, fileName;
		 String[] trueData, title = null;
		 int[] array = new int[3000];
		 
		 filePath = "C:\\Users\\silen\\Downloads";
		 fileName = "182238.txt";
		 nuevo = new File(fileName);
		
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
					 }
				 }
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
			PrintWriter escribir = new PrintWriter(nuevo);
			for(int e = 0; e < 3000; e++) {
				escribir.write(title[e] + ": " + array[e] + "\n\r");
			}
			
			escribir.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	 }
}