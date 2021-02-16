package org.jetBrains.javacore.w3schools.serializedobject;

import java.io.*;

public class Person {

    public static void main(String[] args) {
        serializingPersonObject();
    }

    public static void serializingPersonObject() {
        SerializedPersonObject spo = new SerializedPersonObject();
        spo.setName("Mike");
        spo.setAge(24);
        spo.setHeight(1.78);

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("src/main/java/org/jetBrains/javacore/w3schools/serializedobject/serializedPerson.txt");

            ObjectOutputStream objectOutputStream = null;
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                try {
                    objectOutputStream.writeObject(spo);
                    try {
                        objectOutputStream.flush();
                        try {
                            objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/main/java/org/jetBrains/javacore/w3schools/serializedobject/serializedPerson.txt");
            ObjectInputStream objectInputStream = null;
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    SerializedPersonObject spobj = (SerializedPersonObject) objectInputStream.readObject();
                    System.out.println(spobj.getName());
                    System.out.println(spobj.getAge());
                    System.out.println(spobj.getHeight());
                    System.out.println(spobj.getCountry());
                    try {
                        objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
             catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        /*

What Are Serialization and Deserialization?
In Java, we create several objects that live and die accordingly, and every object will certainly die when the JVM dies. But sometimes, we might want to reuse an object between several JVMs or we might want to transfer an object to another machine over the network.
Well, serialization allows us to convert the state of an object into a byte stream, which then can be saved into a file on the local disk or sent over the network to any other machine. And deserialization allows us to reverse the process, which means reconverting the serialized byte stream to an object again.
In simple words, object serialization is the process of saving an object's state to a sequence of bytes and deserialization is the process of reconstructing an object from those bytes.

To serialize and deserialize, our object to a file we need to call ObjectOutputStream.writeObject() and ObjectInputStream.readObject() and Only Classes That Implement Serializable Can Be Serialized

Serialization is the conversion of the state of an object into a byte stream; deserialization does the opposite.
Stated differently, serialization is the conversion of a Java object into a static stream (sequence) of bytes which can then be saved to a database or transferred over a network.

The serialization process is instance-independent, i.e. objects can be serialized on one platform and deserialized on another. Classes that are eligible for serialization need to implement a special marker interface Serializable.

Java provides a mechanism, called object serialization where an object can be represented as a sequence of bytes that includes the object's data as well as information about the object's type and the types of data stored in the object.
After a serialized object has been written into a file, it can be read from the file and deserialized that is, the type information and bytes that represent the object and its data can be used to recreate the object in memory.
Most impressive is that the entire process is JVM independent, meaning an object can be serialized on one platform and deserialized on an entirely different platform.
Classes ObjectInputStream and ObjectOutputStream are high-level streams that contain the methods for serializing and deserializing an object.

The ObjectOutputStream class contains many write methods for writing various data types, but one method in particular stands out −
public final void writeObject(Object x) throws IOException
The above method serializes an Object and sends it to the output stream. Similarly, the ObjectInputStream class contains the following method for deserializing an object −
public final Object readObject() throws IOException, ClassNotFoundException
This method retrieves the next Object out of the stream and deserializes it. The return value is Object, so you will need to cast it to its appropriate data type.

Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.
Only the objects of those classes can be serialized which are implementing java.io.Serializable interface.

Advantages of Serialization
1. To save/persist state of an object.
2. To travel an object across a network.

Points to remember
1. If a parent class has implemented Serializable interface then child class doesn’t need to implement it but vice-versa is not true.
2. Only non-static data members are saved via Serialization process.
3. Static data members and transient data members are not saved via Serialization process.So, if you don’t want to save value of a non-static data member then make it transient.
4. Constructor of object is never called when an object is deserialized.
5. Associated objects must be implementing Serializable interface.

SerialVersionUI
The Serialization runtime associates a version number with each Serializable class called a SerialVersionUID, which is used during Deserialization to verify that sender and reciever of a serialized object have loaded classes for that object which are compatible with respect to serialization.
If the reciever has loaded a class for the object that has different UID than that of corresponding sender’s class, the Deserialization will result in an InvalidClassException. A Serializable class can declare its own UID explicitly by declaring a field name.
It must be static, final and of type long.
i.e- ANY-ACCESS-MODIFIER static final long serialVersionUID=42L;
If a serializable class doesn’t explicitly declare a serialVersionUID, then the serialization runtime will calculate a default one for that class based on various aspects of class, as described in Java Object Serialization Specification.
However it is strongly recommended that all serializable classes explicitly declare serialVersionUID value, since its computation is highly sensitive to class details that may vary depending on compiler implementations, any change in class or using different id may affect the serialized data.
It is also recommended to use private modifier for UID since it is not useful as inherited member.

Conclusion
Serialization is the process of saving an object's state to a sequence of bytes, which then can be stored on a file or sent over the network, and deserialization is the process of reconstructing an object from those bytes.
Only subclasses of the Serializable interface can be serialized.
If our class does not implement Serializable interface, or if it is having a reference to a non-Serializable class, then the JVM will throw NotSerializableException.
All transient and static fields do not get serialized.
The serialVersionUID is used to verify that the serialized and deserialized objects have the same attributes and thus are compatible with deserialization.
We should create a serialVersionUID field in our class so if we change our class structure (adding/removing fields), the JVM will not through InvalidClassException. If we do not provide it, the JVM provides one that might change when our class structure changes.
We can override the default serialization behaviour inside our Java class by providing the implementation of writeObject and readObject methods.
And we can call ObjectOutputStream.defaultWriteObject() and ObjectInputStream.defaultReadObject from writeObject and readObject methods to get the default serialization and deserialization logic.
We can throw NotSerializableException exception from writeObject and readObject , if we do not want our class to be serialized or deserialized.

https://dzone.com/articles/what-is-serialization-everything-about-java-serial
https://www.geeksforgeeks.org/serialization-in-java/
https://www.baeldung.com/java-serialization
        */
    }
}
