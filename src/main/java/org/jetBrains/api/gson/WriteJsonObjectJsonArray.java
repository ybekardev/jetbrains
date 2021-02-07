package org.jetBrains.api.gson;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJsonObjectJsonArray {

    /*
    Write JSON to file in Java with json-simple
    To write JSON to file, we will be working to mainly two objects:
    JSONArray : To write data in json arrays. Use its add() method to add objects of type JSONObject.
    JSONObject : To write json objects. Use it’s put() method to populate fields.
    After populating above objects, use FileWriter instance to write JSON file.
     */

    public static void main( String[] args )
    {
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firstName", "Yasin");
        employeeDetails.put("lastName", "Bekar");
        employeeDetails.put("website", "mycompany.com");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firstName", "William");
        employeeDetails2.put("lastName", "Catcher");
        employeeDetails2.put("website", "example.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        System.out.println(employeeList);
        //Write JSON file
        try (FileWriter file = new FileWriter("src/main/java/org/api/gson/employees.json")) {
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
