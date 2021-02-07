package org.jetBrains.javacore.practice;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormattingAndMatcher {

    //Java will replace %c - (char), %s - (string), %d - (int, short, byte, long), %f - (double, float)
    //%n newline character breaks the line every time it was used.

    @Test
    public void formatString() {
        char sex = 'M';
        int age = 34;
        float height = 6.00f;
        String name = "Johnathan";

        //String.format()
        String customer = String.format("Customer Information: %nName: %s,  %nAge: %d, %nHeight: %.2f, %nSex: %c", name, age, height, sex);
        System.out.println(customer);

        //string - printf()
        System.out.printf("Customer Information: %nName: %s,  %nAge: %d, %nHeight: %.2f, %nSex: %c", name, age, height, sex);
        System.out.println();

    }

        @Test
        public void testDotQmark() {
        //The dot . matches any single character including letters, digits, spaces, and so on.
        //The only character it is unable to match with is the newline character \n.
        String str = "Hello World!";
        String str2 = "Hello.World!";
        System.out.println("Hello World!".matches(str)); //true
        System.out.println("Hello World!".matches(str2)); //true

        //the question mark ? is a special character that means “the preceding character or nothing".
        String str3 = "behaviou?r";
        System.out.println("behaviour".matches(str3)); //true
        System.out.println("behavior".matches(str3)); //true

        //Combine dot and question mark there can be any single character or no character at all
        String str4 = "..?";
        System.out.println("I".matches(str4)); //true
        System.out.println("am".matches(str4)); //true
        System.out.println("".matches(str4)); //false
        System.out.println(".".matches(str4)); //true
        System.out.println(" ".matches(str4)); //true
    }


        @Test
        public void specificChar() {
        //The dot, though, matches almost every possible character,
        // and sometimes we want to be more specific in our regex use []

        String pattern = "[bcr]at";
        System.out.println("rat".matches(pattern));//true
        System.out.println("fat".matches(pattern)); //false

        String s2 = "[ab]x[12]";
        System.out.println("ax1".matches(s2)); //true
        System.out.println("b4".matches(s2)); //false

            //inside sets, ranges of characters designated by the dash can be used: [1-3]
            String digit = "[0-9]";
            String letter = "[a-zA-Z]";
            String any = "[a-z!?.A-Z]";
            String exor = "[^abc]";

            System.out.println("2".matches(digit)); //true
            System.out.println("e".matches(letter)); //true
            System.out.println("!".matches(any)); //true
            System.out.println("a".matches(exor)); //false
            System.out.println("d".matches(exor)); //true

            //use \\ for [ ] "

            String pat = "yes|no|maybe";
            System.out.println("no".matches(pat));

            //the vertical bar can be used to describe multi-character alternating substring: 1|2|3
            String p = "(b|r|go)at";
            System.out.println("rat".matches(p));
    }

    @Test
    public void test(){
        String hi = "Hello!";
        String any = "[a-z!?.A-Z]";
        //System.out.println(alp);
        for(int i = 0; i < hi.length(); i++) {
            String s = String.valueOf(hi.charAt(i));
            if (s.matches(any)){
                System.out.print(s);
            }
        }
    }

    @Test
    public void shorthands(){
        String s = "\\s";
        System.out.println(" ".matches(s));
        String s2 = "\\s\\w";
        System.out.println(" B".matches(s2));
        String s3 = "\\s\\w\\d";
        System.out.println(" A5".matches(s3));
        String s4 = "alpha\\b";
        System.out.println("alpha".matches(s4));
        String  s5 = "\\bcat";
        System.out.println("cat".matches(s5));
        String s6 = "\\bdog\\b";
        System.out.println("dog".matches(s6));
        String s7 = "\t Hello!";
        System.out.println(s7);
        String s8 = "\n World";
        System.out.println(s8);
        String s9 ="\r Bye";
        System.out.println(s9);
        String s10 = "Hello\fWorld Booo";
        System.out.println(s10);

         // \\D\\S\\W\\ -> does opposite of lower cases
/*
\b  backspace
\t  horizontal tab
\n  linefeed
\f  form feed
\r  carriage return - carries to new line
\"  double quote
\'  single quote
\\  backslash
*/
    }

    @Test
    public void quantifiers(){
        String s = "ca+b";
        System.out.println("cab".matches(s));
        System.out.println("caaaaaaaaab".matches(s));
        System.out.println("cb".matches(s)); //false
        String s2 = "a[0-3]*"; // a and zero to three any permutation
        System.out.println("a0".matches(s2));
        System.out.println("a123321".matches(s2));
        String s3 = ".*json.*";
        System.out.println("The format was in json file".matches(s3));
        String s4 = "[0-9]{3}";
        System.out.println("643".matches(s4));
        System.out.println("23424".matches(s4)); //false
        String s5 = "4{2,3}";
        System.out.println("44".matches(s5));
        System.out.println("444".matches(s5));
        System.out.println("4444".matches(s5)); //false
        String s6 = "ab{3,}";
        System.out.println("aaa".matches(s6));
        System.out.println("abbb".matches(s6));
        System.out.println("abbbbbbb".matches(s6));
        String s7 = " ";
        System.out.println(s7.matches("\\s*"));
        String s8 = "\\s*[a-zA-Z0-9_$]{5,12}\\s*";
        System.out.println("  Hello_User02 ".matches(s8)); //true, any 5-12 long word with characters

/*
+ matches one or more repetitions of the preceding character;
* matches zero or more repetitions of the preceding character;
{n} matches exactly n repetitions of the preceding character;
{n,m} matches at least n but not more than m repetitions of the preceding character;
{n,} matches at least n repetitions of the preceding character;
{0,m} matches no more than m repetitions of the preceding character.
\\s* is used to find  space, instead of using " "
*/

    }

    @Test
    public void testPattern() {
        String s = "The programming language Java";
        Pattern pattern = Pattern.compile(".*[Jj]ava.*");
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher.matches());
        System.out.println(s.matches(String.valueOf(pattern)));

        String s2 = "Java tool is a programming language";
        Pattern.compile("tool");
        matcher = pattern.matcher(s2);
        System.out.println(matcher.find());


        String text = "Java supports JAVA";
        Pattern jp = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher m = jp.matcher(text);
        while (matcher.find()) {
            System.out.println(m.group());
        }
    }

    @Test
    public void t(){
        String text = "Regex is a powerful tool for programmers";

        Pattern pattern = Pattern.compile("tool");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches()); // false, the whole string does not match the pattern
        System.out.println(matcher.find());
    }

    /*
    input stream that reads data from a source;
    output stream that writes data to a specified destination.
    */

    @Test
    public void te(){
        String s = "\\^abc\\g";
        System.out.println(s);
    }
}
