package archivo_basicos_Out_Put_Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class clase_file_data_parcial {

	public static void main(String[] args) throws Exception {
		/* Creacion del archivo */
		File file = new File("src/files/DiscoDuro.txt");
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
		
		dataOutputStream.writeInt(400);
		dataOutputStream.close();
		
		/* Lectura del archivo */
		FileInputStream fileInputStream = new FileInputStream(file);
		DataInputStream dataInputStream = new DataInputStream(fileInputStream);
		
		double gigabytes = dataInputStream.readInt();
		dataInputStream.close();
		
		double discMB = 700;
		double discOnGb = discMB / 1024;
		double discNumber = gigabytes / discOnGb;
		System.out.println("**** para un disco duro lleno de " + (int) Math.ceil(gigabytes) +  " GB de capacidad de almacenamiento **** ");
		System.out.println("********************************    *************************************** ");
		System.out.println("****Se necesita un total de " + (int) Math.ceil(discNumber) + " cds para hacer una copia de seguridad  ****");
		
    }

}
