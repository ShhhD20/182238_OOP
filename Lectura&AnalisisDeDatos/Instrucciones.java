import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Instrucciones {

	 public void exe(int inicio) {
		 String filePath, data;
		 String[] trueData;
		 int[] array = new int[3000];
		 
		 
		 filePath = "D:\\Users\\182238\\Downloads";
		 for(int c = 0; c < 3000; c++) {
			 array[c] = 0;
		 }
		 try {
			 File archivo = new File(filePath, "ACT_002_emails.csv");
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
		 
	 }
}
