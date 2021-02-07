package org.jetBrains.javacore.w3schools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LambdaRegex {

    public static void main(String[] args) {
        lambda();
        regex();
        createFiles();
        writeFiles();
        readFiles();
        deleteFiles();
    }

    public static void lambda(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach(n -> System.out.println(n));
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        Consumer<Integer> m = n -> System.out.println(n);
        numbers.forEach( method );
        numbers.forEach(m);
    }

    /*
    Regular expressions can be used to perform all types of text search and text replace operations.
    Pattern Class - Defines a pattern (to be used in a search)
    Matcher Class - Used to search for the pattern
    PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

    |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
    .	Find just one instance of any character
    ^	Finds a match as the beginning of a string as in: ^Hello
    $	Finds a match at the end of the string as in: World$
    \d	Find a digit
    \s	Find a whitespace character
    \b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
    [abc]	Find one character from the options between the brackets
    [^abc]	Find one character NOT between the brackets
    [0-9]	Find one character from the range 0 to 9
    n+	Matches any string that contains at least one n
    n*	Matches any string that contains zero or more occurrences of n
    n?	Matches any string that contains zero or one occurrences of n
    n{x}	Matches any string that contains a sequence of X n's
    n{x,y}	Matches any string that contains a sequence of X to Y n's
    n{x,}	Matches any string that contains a sequence of at least X n's
    */
    public static void regex(){
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matcherFound = matcher.find();

        if(matcherFound){
            System.out.println("Matcher found");
        }else{
            System.out.println("No matching pattern found");
        }
    }

    /*
    Note: There are many available classes in the Java API that can be used to read and write files in Java:
     FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream, etc.
     Which one to use depends on the Java version you're working with and whether you need to read bytes or characters,
     and the size of the file/lines etc.
     */
    public static void createFiles(){
        File file = new File("src/main/java/org/w3schools/myFile.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File is generated");
            }else{
                System.out.println("File exists already");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFiles(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("src/main/java/org/w3schools/myFile2.txt");
            fileWriter.write("Generating a new file");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFiles(){
        File file = new File("src/main/java/org/w3schools/myFile2.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error in file reading!");
        }
        while(scanner.hasNextLine()){
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    }

    public static void deleteFiles(){
        File file = new File("src/main/java/org/w3schools/myFile2.txt");
        if(file.delete()){
            System.out.println("File deleted Good morning," + file.getName());
        }else{
            System.out.println("Failed to delete the file");
        }
    }
}
