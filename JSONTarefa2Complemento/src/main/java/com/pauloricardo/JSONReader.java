package com.pauloricardo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader {

	    @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
	        
	    	//Cria o objeto de JSONParser para fazer a leitura do arquivo
	        JSONParser jsonParser = new JSONParser();
	        
	        //A função cria um objeto que irá fazer a leitura do arquivo JSON
	        //O try é a invocação do comando onde pode ocorrer a exceção
	        try (FileReader reader = new FileReader("employees.json"))
	        {
	            //Dentro desse novo objeto "obj" ficará os dados do arquivo
	            Object obj = jsonParser.parse(reader);
	 
	            //A classe JSONArray instancia esse objeto e printa em forma de array json
	            JSONArray employeeList = (JSONArray) obj;
	            System.out.println(employeeList);
	             
	            //Faz a iteração sobre o array
	            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
	 
	        //Aqui são testadas as exceções
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	    }
	 
	    private static void parseEmployeeObject(JSONObject employee) 
	    {
	        //Criamos o objeto employeeObject dentro da lista.
	    	JSONObject employeeObject = (JSONObject) employee.get("employee");
	         
	        //Puxamos pela instancia os primeiros nomes que são a primeira chave e mostra seus valores.
	        String firstName = (String) employeeObject.get("firstName");    
	        System.out.println(firstName);
	         
	        //Puxamos pela instancia os últimos nomes que são a segunda chave e mostra seus valores.
	        String lastName = (String) employeeObject.get("lastName");  
	        System.out.println(lastName);
	         
	        //Puxamos os websites que nesse arquivo é a última chave e mostra seus valores.
	        String website = (String) employeeObject.get("website");    
	        System.out.println(website);
	    }
	}
