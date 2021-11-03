package com.pauloricardo;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.json.CDL;
import org.json.Cookie;
import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;
import org.json.JSONWriter;
import org.json.Property;
import org.json.XML;

//Usando import org.json
public class JSONExamples {
	

		public static void main(String[] args) {
			
//			JSONExampleArray1();
//			JSONExampleArray2();
//			JSONExampleStringer();
//			JSONExampleObject1();
//			JSONExampleObject2();
//			JSONExampleObject3();
//			JSONExamplWriter();
//			JSONExampleTokener();
//			JSONObjectToArray();
//			XMLToExampleConversion();
//			XMLFromExampleConversion();
//			CookieToExampleConversion();
//			CookieFromExampleConversion(); 
//			HTTPToExampleConversion();
//			HTTPFromExampleConversion();
//			CDLToExampleConversion();
//			CDLFromExampleConversion();
//			PropertyToExampleConversion();
//			PropertyFromExampleConversion();
		
			
		}

		private static void JSONExampleArray1() {
			//O metodo acima cria uma uma variável String que instancia a classe JSONArray no objeto "array" e o print por meio desse "array" puxa todas as chaves e valores do JSON.
			//O length faz a contagem do número de valores e também mexe com o list, caso mude por exemplo array.length e 
			//coloque um número, como o 4 por exemplo, ele vai puxar apenas 5 valores do arrayStr, pois inicia do 0.
			//O list já puxa tantos os valores em si como os números dos mesmos.

			 String arrayStr = 
			            "["+"true,"+"false,"+ "\"true\","+ "\"false\","+"\"hello\","+"23.45e-4,"+
			                "\"23.45\","+"42,"+"\"43\","+"["+"\"world\""+"],"+
			            		"{"+
			                    "\"key1\":\"value1\","+
			                    "\"key2\":\"value2\","+
			                    "\"key3\":\"value3\","+
			                    "\"key4\":\"value4\""+
			                "},"+
			                "0,"+"\"-1\""+
			            "]";

			 
			  JSONArray array = new JSONArray(arrayStr);
			  System.out.println("Values array: "+ array);

			  JSONArray list = listNumberArray(array.length());
			  System.out.println("Label Array: "+ list.toString());
			  JSONObject object = array.toJSONObject(list);
			  System.out.println("Final JSONOBject: " + object);
		}


		private static JSONArray listNumberArray(int max){
			 JSONArray res = new JSONArray();
			for (int i=0; i<max;i++) {
				res.put(String.valueOf(i));
			}
			return res;
		}
		
		
		
		private static void JSONExampleArray2() {

			//Aqui foi criado um JSON sem o uso de String, e o list mais uma vez inicia a contagem do número de valores do  array por 0 até 3 nesse caso
			//O "put" faz a função de acrescentar os valores no objeto "array"
			//A classe JSONObject já vai ter instanciada o list com o número de valores em seu objeto "object". 

			  JSONArray array = new JSONArray();

			
			array.put("value");
			array.put(5);
			array.put(-23.45e67);
			array.put(true);
			
			 JSONArray list = listNumberArray(array.length());
			 JSONObject object = array.toJSONObject(list);
			 System.out.println("Final JSONOBject: " + object);
		}
		
		private static void JSONExampleStringer() {

			//Aqui é mostrado que é possível adicionar chave e valor de JSON usando de forma direta a ".key" e o ".value".
			//O método object adiciona à classe as chaves e valores e o endObject fecha e devolve para a instância da classe.
			//Utilizando um objeto da classe JSONStringer como no primeiro exemplo é feito um construtor String que é puxado pela instancia jsonObject
			//Um padrão observado que no print não vem na ordem estabelecida, mas é no construtor que se cria a ordem que se dá pela ordem do id dos HashMap de cada chave valor colocada

			JSONStringer jsonStringer = new JSONStringer();

			jsonStringer.object();

	        jsonStringer.key("trueValue").value(true);
	        jsonStringer.key("falseValue").value(false);
	        jsonStringer.key("nullValue").value(null);
	        jsonStringer.key("stringValue").value("hello world!");
	        jsonStringer.key("complexStringValue").value("h\be\tllo w\u1234orld!");
	        jsonStringer.key("intValue").value(42);
	        jsonStringer.key("doubleValue").value(-23.45e67);

	        jsonStringer.endObject();
	        
	        String str = jsonStringer.toString();
	        JSONObject jsonObject = new JSONObject(str);
	        
	       System.out.println("Final JSONOBject: " + jsonObject);
		}
		
		
		private static void JSONExampleObject1() {

			//É colocado os valores na String e dessa forma cria-se um construtor 
			//Que chama String que é instanciado pelo objeto "example" da classe JSONObject

			String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
			JSONObject example = new JSONObject(string);
			System.out.println("Final JSONObject: " + example);
			
		}
		
		
		private static void JSONExampleObject2() {

			//O JSONObject pode ser criado de forma direta adicionando chave e valor de forma similar ao método String
			//Sendo que a primeira entrada é a chave (key) e a segunda o valor(value)
			//Porém nessa forma não é possível colocar valores nulos
			
			JSONObject example = new JSONObject();

			example.put("key", "value");

			example.put("key2", 5);
			example.put("key3", -23.45e67);
			example.put("trueValue", true);

			
			
			 System.out.println("Final JSONOBject: " + example);
		}
		
		
		private static void JSONExampleObject3() {

			//Usando o HashMap é possível criar um JSONObject, contudo as chaves  terão de ser do tipo String,
			//os valores podem ser o tipo que você desejar que no caso desse construtor em questão é do tipo Double
			//O Map é um objeto que já faz a varredura de item por chave e valor
			
			

			Map<String,Double> map = new HashMap<String, Double>();
			
			map.put("key1", 1.0);
			map.put("key2", -23.45e67);
			
			JSONObject example = new JSONObject(map);
			System.out.println("Final JSONOBject: " + example);
		}
		
		private static void JSONExamplWriter() {

			//A forma desse método funcionar é similar ao Objeto e String, mas usamos o objeto da classe StringBuilder que é uma forma mais maleável de usar String 
			//Da mesma forma que com a forma do Objeto JSON para Stringer, usamos um construtor para passar os parâmetros
			//O objeto jsonWriter passa as chaves e valores acrescentando ao novo método objeto criado
			//E que dentro do método do objeto é acrescentado as chaves e valores
			//E logo após o fechamento desse pequeno método que retorna a classe JSONWriter
			//Por meio da instância write que tem todos os parâmetros hora colocados
			//E nessa forma não temos um JSONObject
			

			StringBuilder write = new StringBuilder();
			JSONWriter jsonWriter = new JSONWriter(write);

			jsonWriter.object();
			
			jsonWriter.key("trueValue").value(true);
			jsonWriter.key("falseValue").value(false);
			jsonWriter.key("nullValue").value(null);
			jsonWriter.key("stringValue").value("hello world!");
			jsonWriter.key("complexStringValue").value("h\be\tllo w\u1234orld!");
			jsonWriter.key("intValue").value(42);
			jsonWriter.key("doubleValue").value(-23.45e67);
			
			jsonWriter.endObject();
			
			
			
			System.out.println("JSON: " + write.toString());
				
			
		}
		
		private static void JSONExampleTokener() {

			//Com um String podemos criar JSONTokener
			//Que pode ser mudado tanto como JSONObject, como JSONArray
			//Mas desde que respeitando as estruturas do JSONObject e do JSONArray
			
			
			
			String stringObj = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
			String stringArray = "[{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}]";
			
			JSONTokener token = new JSONTokener(stringObj);
			JSONObject object = new JSONObject(token);
			System.out.println(object);
			
			token = new JSONTokener(stringArray);
			JSONArray array = new JSONArray(token);
			System.out.println(array);
			
			
			//Não compilou por conta de não ter as estruturas corretas no tipo String para se criar um JSON
			//Seja JSONOBject ou JSONArray
/*			String string = "this is not a valid JSON string";
			JSONTokener token = new JSONTokener(string);
			
			//Now you can use the token in JSONObject and Array the same way as a String

			JSONObject object = new JSONObject(token);
			JSONArray array = new JSONArray(token);*/
			
		}
		
		
		private static void JSONObjectToArray() {
		
			//Com o objeto string criado e também o construtor JSONObject tendo o objeto string como parâmetro;
			//É criado uma lista do número de arrays na classe JSONArray e 
			//No objeto array fica datalogado as chaves e os tipos dos valores que no caso são: String, integer, BigDecimal e Boolean

			String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";

			JSONObject example = new JSONObject(string);
			
			//We need a list of key strings like the reverse operation
			
			JSONArray keyStrings = listNumberArray(example.length());
			
			//Then we convert to the Array using both elements
			
			JSONArray array = example.toJSONArray(keyStrings);
			
			System.out.println("Final JSONArray: " + array);
		}
		
		
		private static void XMLToExampleConversion() {

			//O JSONObject criado no objeto string é mudado por meio do método XML.toString, que formula todo string JSON em formato XML
					
			String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
			JSONObject example = new JSONObject(string);

			String output = XML.toString(example);
			System.out.println("Final XML: " + output);
		}
		
		private static void XMLFromExampleConversion() {

			//O XML criado no objeto string é mudado por meio do método XML.toJSONObject, que formula todo string XML em formato JSON

			String string = "<0>value</0><1>5</1><2>-2.345E+68</2><3>true</3>";

			//We obtain a JSONObject with toJSONOBject()

			JSONObject output = XML.toJSONObject(string);
			
			System.out.println("Final JSONObject: " + output);
		}
		
		private static void CookieToExampleConversion() {

			//Com o JSONObject criado no objeto string, muda-se por meio do método Cookie.toString, que formula todo string JSON em Cookie.
			//Contudo esse tipo web browser precisa ter um nome e o campo nome um nome também e não suporta o tipo boolean.
			
			String string = "{\"name\":\"Cookie-Name\",\"value\":\"name\",\"1\":5,\"2\":-2.345E68,\"3\":'true'}";
			JSONObject example = new JSONObject(string);
			
			
			String output = Cookie.toString(example);
			System.out.println("Final Cookie: " + output);
		}
		
		private static void CookieFromExampleConversion() {

			//O Cookie criado no objeto string é mudado por meio do método Cookie.toJSONObject, que formula todo string Cookie em formato JSON.

			String string = "Cookie-Name=name;1=5;2=-2.345E%2b68;3=true";

			JSONObject output = Cookie.toJSONObject(string);
			System.out.println("Final JSONObject: " + output);
		}
		
		
		private static void HTTPToExampleConversion() {

			//O JSON criado no objeto string é mudado por meio do método HTTP.toString, que formula todo string JSON em HTTP
			//Contudo para que isso ocorra é necessário no mínimo o cabeçalho para o HTTP ser convertido
			

			String string = "{\"Method\":\"POST\",\"Request-URI\":'/',\"HTTP-Version\":'HTTP/1.1',\"Value1\":true,\"Value2\":2,\"Value3\":-2.345E68}";

			JSONObject example = new JSONObject(string);

			String output = HTTP.toString(example);
			System.out.println("Final HTTP: " + output);
		}
		
		private static void HTTPFromExampleConversion() {

			//O formato HTTP criado no objeto string é convertido em HTTP.JSONObject através do método toJSONObject

			String string = "Final HTTP: POST '/' HTTP/1.1 Value3: -2.345E+68 Value1: true Value2: 2";

			JSONObject output = HTTP.toJSONObject(string);
			System.out.println("Final JSONObject: " + output);
		}
		
		private static void CDLToExampleConversion() {
			
			//Os JSON's criados em seus respectivos objetos string nesse método possuem valores diferentes
			//Assim os JSONOBject's são instanciados e colocados em um JSONArray 
			//E nesse array o formato JSON é mudado por meio do método CDL.toString, que formula todo string/string2 JSON em CDL.

			String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
			JSONObject example = new JSONObject(string);
			
			String string2 = "{\"0\":\"value2\",\"1\":6,\"2\":-8.345E68,\"3\":false}";
			JSONObject example2 = new JSONObject(string2);
			
			JSONArray array = new JSONArray();
			array.put(example);
			array.put(example2);

			String output = CDL.toString(array);
			System.out.println("Final CDL: \r\n" + output);
			
			}
		
		private static void CDLFromExampleConversion() {

			//O formato CDL é mudado por meio do método CDL.toJSONArray, que formula todo string CDL em JSON.
			//No caso como tem mais de um valor é necessário o método JSONArray e não o JSONObject.

			String string = "0,1,2,3\n"
					+ "value,5,-2.345E+68,true\n"
					+ "value2,6,-8.345E+68,false";

			JSONArray output = CDL.toJSONArray(string);
			System.out.println("Final JSONArray: " + output);
		}
		
		private static Properties PropertyToExampleConversion() {

			//O JSONObject criado no objeto string é mudado por meio do método Property.toProperties, que formula todo string JSON em formato Properties

			String string = "{\"0\":\"value\",\"1\":5,\"2\":-2.345E68,\"3\":true}";
			JSONObject example = new JSONObject(string);

			Properties output = Property.toProperties(example);
			System.out.println("Final Properties: " + output);

			return output;
			
			}
		
		private static void PropertyFromExampleConversion() {

			//Os dados do Properties criado anteriormente foram reutilizados e instanciados no input
			//o objeto da classe JSONObject recebe os dados do input e os dados no formato Properties é mudado
			//Por meio do método Property.toJSONObject, que formula todo input Properties em formato JSON que sai no output pela função print.

			Properties input = PropertyToExampleConversion();

			JSONObject output = Property.toJSONObject(input);
			System.out.println("Final JSONObject: " + output);
		}
		
	}