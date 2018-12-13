import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
    String name;
        System.out.println("Welcome to Hangman!");
        System.out.println("Rules of the game: Guess a letter for the amount of spaces given. ");
        System.out.println("For every letter you get wrong, a part of the hangman will appear.");
        System.out.println("Once the whole hangman appears you lose the game.");
        System.out.println("Good luck!");
        }

        private static String[] words = {"ohio", "basketball", "football"};
        private static String word = words[(int) (Math.random() * words.length)];
        private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
        private static int count = 0;

         {
            Scanner sc = new Scanner(System.in);

            while (count < 7 && asterisk.contains("*")) {
                System.out.println("Guess any letter in the word");
                System.out.println(asterisk);
                String guess = sc.next();
                hang(guess);
            }
            sc.close();
        }

        public static void hang(String guess) {
            String newasterisk = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    newasterisk += guess.charAt(0);
                } else if (asterisk.charAt(i) != '*') {
                    newasterisk += word.charAt(i);
                } else {
                    newasterisk += "*";
                }
            }

            if (asterisk.equals(newasterisk)) {
                count++;
                hangManImage(15);
            } else {
                asterisk = newasterisk;
            }
            if (asterisk.equals(word)) {
                System.out.println("Correct! You win! The word was " + word);
            }
        }



public static void hangManImage(int tries){
        String display="";
        switch(tries) {

            case 0:
            default:
                System.out.println("    |---------------------------------|");
                System.out.println("    |        ;");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 1:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 2:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               $ $");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 3:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                   ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 4:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 5:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                                  |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 6:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                              |---|");
                System.out.println("    |                                 ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 7:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                              |---|");
                System.out.println("    |                              |    ");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 8:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                              |---|");
                System.out.println("    |                              |    ");
                System.out.println("    |                              |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 9:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                              |---|");
                System.out.println("    |                              |   | ");
                System.out.println("    |                              |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 10:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                              |---|---|");
                System.out.println("    |                              |   | ");
                System.out.println("    |                              |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 11:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                              |---|---|");
                System.out.println("    |                              |   |   | ");
                System.out.println("    |                              |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 12:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                              |---|---|");
                System.out.println("    |                              |   |   |");
                System.out.println("    |                              |   |   |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("    |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 13:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                              |---|---|");
                System.out.println("    |                              |   |   |");
                System.out.println("    |                              |   |   |");
                System.out.println("    |                                 /");
                System.out.println("    |                                /");
                System.out.println("    |                               /");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;

            case 14:
                System.out.println("    |---------------------------------|");
                System.out.println("    |                                 |");
                System.out.println("    |                               ( $ $ )");
                System.out.println("    |                                  |");
                System.out.println("    |                              |---|---|");
                System.out.println("    |                              |   |   |");
                System.out.println("    |                              |   |   |");
                System.out.println("    |                                 / |");
                System.out.println("    |                                /  |");
                System.out.println("    |                               /   |");
                System.out.println("----|-------------------------------------------");
                System.out.println("");
                break;


        }


























    }











}
