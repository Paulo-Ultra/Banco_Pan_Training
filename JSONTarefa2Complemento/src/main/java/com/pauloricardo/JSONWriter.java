package com.pauloricardo;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriter {

	
	    @SuppressWarnings("unchecked")
	    public static void main( String[] args )   {
	        //Na primeira classe JSONObject o objeto employeeDetails recebe as chaves e valores	    	
	        JSONObject employeeDetails = new JSONObject();
	        employeeDetails.put("firstName", "Lokesh");
	        employeeDetails.put("lastName", "Gupta");
	        employeeDetails.put("website", "howtodoinjava.com");
	        
	        //O objeto employeeObject recebe esses parâmetros como valores da chave "employee"
	        JSONObject employeeObject = new JSONObject(); 
	        employeeObject.put("employee", employeeDetails);
	         
	        //O objeto employeeDetails2 recebe as chaves e valores
	        JSONObject employeeDetails2 = new JSONObject();
	        employeeDetails2.put("firstName", "Brian");
	        employeeDetails2.put("lastName", "Schultz");
	        employeeDetails2.put("website", "example.com");
	        
	        //O objeto employeeObject2 recebe esses parâmetros como valores da chave "employee"
	        JSONObject employeeObject2 = new JSONObject(); 
	        employeeObject2.put("employee", employeeDetails2);
	         
	        //A classe implementa o objeto employeeList que vai armazenar os dados de employeeObject e employeeObject2 em forma de lista
	        JSONArray employeeList = new JSONArray();
	        employeeList.add(employeeObject);
	        employeeList.add(employeeObject2);
	         
	        //A classe FileWriter cria o arquivo "employees.json"
	        try (FileWriter file = new FileWriter("employees.json")) {
	            //Podemos instanciar o arquivo em JSONArray ou JSONObject
	        	file.write(employeeList.toJSONString()); 
	            file.flush();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
	