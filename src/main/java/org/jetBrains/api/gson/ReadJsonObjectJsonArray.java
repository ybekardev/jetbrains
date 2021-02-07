package org.jetBrains.api.gson;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJsonObjectJsonArray {

    /*
    To read JSON from file, we will be using the JSON file we created in the previous example.
    First of all, we will create JSONParser instance to parse JSON file.
    Use FileReader to read JSON file and pass it to parser.
    Start reading the JSON objects one by one, based on their type i.e. JSONArray and JSONObject.
     */

    public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("src/main/java/org/api/gson/employees.json")) {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseEmployeeObject(JSONObject employee) {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");
        //Get employee first name
        String firstName = (String) employeeObject.get("firstName");
        System.out.println(firstName);
        //Get employee last name
        String lastName = (String) employeeObject.get("lastName");
        System.out.println(lastName);
        //Get employee website name
        String website = (String) employeeObject.get("website");
        System.out.println(website);
    }
}
