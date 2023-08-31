package LearnString;

import java.util.Scanner;

public class LearnString {

    public static void main(String[] args) {



//        String name = "   aNuJ23       ";
//        System.out.println(name.toLowerCase());
//
//        System.out.println(name.trim());

//        System.out.println("Carpet".startsWith("Carp1"));
//        System.out.println("Carpet".endsWith("pet"));
//        System.out.println("Carpet".equals("Carpet"));
//        char temp = "Carpet".charAt(3);
//        System.out.println(temp);

//        int age = 123;
//        String stringAge = String.valueOf(age);
//        System.out.println(age+2); //125
//        System.out.println(stringAge+2); //1232

//            String sentence = "I love Java, Java is, a good ,language";


//            String substring = sentence.substring(2);
//        System.out.println(substring);
//
//            String words[] = sentence.split("a");
//            for(String word: words) {
//                System.out.println(word);
//            }


//            String newSentence = sentence.replace("Java", "Cpp");

//        System.out.println(sentence);
//        System.out.println(newSentence);
//
//        System.out.println(sentence.contains("Good"));

        String color = "Brown is my fav color!";
        char letters[] = color.toCharArray();

        for(char letter: letters) {
            System.out.println(letter);
        }

        String animal = "    ";
        if(animal.isEmpty()) {
            System.out.println("empty");
        } else if(animal.isBlank()) {
            System.out.println("Blank");
        }









//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your First Name:");
//        String firstName = sc.nextLine();
//
//        System.out.println("Enter your Last Name");
//        String lastName = sc.next();
//
//        System.out.println("Your full Name is "+firstName+" "+lastName);
//        System.out.println(lastName);
    }
}
