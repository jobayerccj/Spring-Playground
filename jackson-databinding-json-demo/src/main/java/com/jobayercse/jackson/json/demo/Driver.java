package com.jobayercse.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println("firstName: " + theStudent.getFirstName());
			System.out.println("lastName: " + theStudent.getLastName());
			
			Address tempAddress = theStudent.getAddress();
			
			System.out.println(tempAddress.getStreet());
			System.out.println(tempAddress.getCity());
			
			for(String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
