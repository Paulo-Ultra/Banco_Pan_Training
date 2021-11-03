package com.pauloricardo.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ExercicioWhileJSON {

			public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {

		
				JSONObject jsonzinhoCriador = new JSONObject();
				
				jsonzinhoCriador.put("Nome", "Julio");
				jsonzinhoCriador.put("Sobrenome", "Smith");
				jsonzinhoCriador.put("idade", 25);
				jsonzinhoCriador.put("Nome", "Jorge");
				jsonzinhoCriador.put("Sobrenome", "Victor");
				jsonzinhoCriador.put("idade", 30);
				
				PrintWriter salvar =  new PrintWriter("./src/main/java/teste5.json");
				salvar.write(jsonzinhoCriador.toJSONString());
				
				salvar.flush();
				salvar.close();
				
		
				Object obj = new JSONParser().parse(new FileReader("./src/main/java/teste5.json"));
				
				JSONObject jsonzinhoMostrador = (JSONObject) obj;	
				
				// get nome
				String nominho = (String) jsonzinhoMostrador.get("Nome");
				String sobrenominho = (String) jsonzinhoMostrador.get("Sobrenome");
				long idade = (long) jsonzinhoMostrador.get("idade");
				
				Iterator<Map.Entry> itr = jsonzinhoMostrador.entrySet().iterator();
		        while (itr.hasNext()) {
		            Map.Entry pair = itr.next();
		            System.out.println(pair.getKey() + " : " + pair.getValue());
		        }
		        
		       		       		        
			}
	}