package com.mdangelo.mahindra_proj.utils;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	private static final String DELEMITER = "\\s+";
	private Scanner scanner;	
	
	public BigDecimal getFloatFromFile(MultipartFile mFile) {
		String word="";
		float summ=0F;
		try {
			InputStream inputStream = new ByteArrayInputStream(mFile.getBytes());
			Scanner scanner = new Scanner(inputStream);
			scanner.useDelimiter(DELEMITER);		
			while (scanner.hasNextLine()) {
				// System.out.println("--->" + scanner.delimiter()+ "\n");
				//System.out.println("--->" + scanner.next() + "\n");
				float number = 0F;
				word = scanner.next();
				if(wordIsANumber(word)) {
					number = Float.parseFloat(word);
					summ += number;
				}				
			}
			scanner.close();			
			System.out.println("summ :"+summ+"\n");

		} catch (IOException e) {			
			e.printStackTrace();
		}
		return new BigDecimal(summ);
	}
	
	private boolean wordIsANumber(String word) {
		boolean isNumber = false;
		int iAscii = 0;
		System.out.println("-word-->"+word);
		/*byte[] bytes = word.getBytes();
		System.out.println("-->"+ Arrays.toString(bytes));*/
		for (int i = 0; i < word.length(); i++) {			
			iAscii = (int)word.charAt(i);
			isNumber = ( (iAscii>=48 && iAscii<=57) || iAscii==46 );
		}
		System.out.println("-Is a Number ? -->"+isNumber);
		return isNumber;
	}
}
