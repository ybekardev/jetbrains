package org.jetBrains.oop.concepts.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DeclareStudents {

    public static void main(String[] args) throws ClassNotFoundException {
        Class student = Class.forName("org.jetBrains.oop.concepts.reflect.Student");

        Constructor[] declaredConstructors = student.getDeclaredConstructors();
        for(Constructor dc : declaredConstructors){
            System.out.println(dc.getName());
        }
        Constructor [] constructors = student.getConstructors();
        for(Constructor c : constructors){
            System.out.println(c.getName());
        }
        Field [] declaredField = student.getDeclaredFields();
        for(Field df : declaredField){
            System.out.println(df.getName());
        }
        Field [] fields  = student.getFields();
        for(Field f : fields){
            System.out.println(f.getName());
        }
        Method[] declaredMethods = student.getDeclaredMethods();
        for(Method dm : declaredMethods){
            System.out.println(dm.getName());
        }
        Method[] method = student.getMethods();
        for(Method m : method){
            System.out.println(m.getName());
        }
    }
}
