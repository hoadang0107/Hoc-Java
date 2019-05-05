package taptanh.com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TestFileFactory {
	
	public static boolean luuFile(ArrayList<String>dsData, String path) {
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			for(String s: dsData) {
				bw.write(s);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static ArrayList<String>docFile(String path){
		ArrayList<String>dsData = new ArrayList<String>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while(line!= null) {
				dsData.add(line);
				line = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();
		return dsData;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
