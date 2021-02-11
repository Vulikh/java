package Lesson03;

import java.util.Random;
import java.util.Scanner;

//        При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
//        сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
//        Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//        apple – загаданное
//        apricot - ответ игрока
//        ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//        Для сравнения двух слов посимвольно можно пользоваться:
//        String str = "apple";
//        char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//        Играем до тех пор, пока игрок не отгадает слово.
//        Используем только маленькие букв


public class Lesson03 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String word = getRandWord();
        final String question = "Угадайте загаданное слово";
        final String answer = "Ваш ответ: ";
        final int wordLength = 15;

        System.out.println(question);

        while(true) {

            System.out.println(answer);
            String guess = sc.nextLine();
            String output = "";

            if(word.equals(guess))
                    break;

            for (int i=0; i < guess.length(); i++){
                char a = guess.charAt(i);
                char b = 'x';
                if(i < word.length())
                    b = word.charAt(i);
                if(a == b)
                    output += a;
                else
                    output += "#";
            }

            int diff = wordLength - output.length();

            if(diff != 0)

                for(int i = 0; i < diff ; i++ ){
                    output += "#";
                }
            System.out.println(output);

        }

        System.out.println("Верно! Загаданное слово: " + word);

    }

    public static String getRandWord(){

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();
        int w = rand.nextInt(words.length - 1);

        return words[w];

    }

}
