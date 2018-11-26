import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        System.out.println("Welcome to Hangman!");
        System.out.println("Rules of the game: Guess a letter for the amount of spaces given. ");
        System.out.println("For every letter you get wrong, a part of the hangman will appear.");
        System.out.println("Once the whole hangman appears you lose the game.");
        System.out.println("Good luck!");

        int numberOfMisses = 0;
        for (int i = 0; i < 15; i++) {
            hangManImage(i);
            {

                int tries = 0;
                boolean iterated = false;
                String temp = "";
                String holder = "";
                int length;
                String SecretWord;
                String hiddenword;
                char[] charstring;
                char[] censor;
                int attempts = 0;
                StringBuilder pastguesses = new StringBuilder();

                Scanner typedword = new Scanner(System.in);
                System.out.println("What is the word");
                hiddenword = typedword.nextLine();
                hiddenword = hiddenword.toLowerCase();
                length = hiddenword.length();

                charstring = hiddenword.toCharArray();


                censor = hiddenword.toCharArray();
                System.out.println("Your hidden word is: ");

                for (int index = 0; index < length; index++) {
                    censor[index] = '*';



                    while (String.valueOf(censor).equals(hiddenword) == false) {


                        char charguess;
                        String tempword;
                        String tempstring;
                        boolean correct = false;
                        int times = 0;
                        boolean repeated = false;


                        for (int a = 0; a < length; a++) {
                            System.out.print(censor[a]);
                        }
                        System.out.println();


                        Scanner guess = new Scanner(System.in);
                        System.out.println("Type your guess: ");
                        tempword = guess.next();
                        charguess = tempword.charAt(0);

                        pastguesses.append(charguess);
                        tempstring = pastguesses.toString();


                        if (tempstring.lastIndexOf(charguess, tempstring.length() - 2) != -1) {
                            System.out.println("You already guessed this letter! Guess again. Your previous guesses were: ");
                            pastguesses.deleteCharAt(tempstring.length() - 1);
                            System.out.println(tempstring.substring(0, tempstring.length() - 1));
                            repeated = true;
                        }


                        if (repeated == false) {
                            for (int indes = 0; index < length; index++) {

                                if (charstring[index] == Character.toLowerCase(charguess)) {

                                    censor[index] = Character.toLowerCase(charguess);
                                    correct = true;
                                    times++;
                                }
                            }
                            if (correct == true) {
                                System.out.println("The letter " + charguess + " is in the secret word! There are " + times + " " + charguess + " 's in the word. Revealing the letter(s): ");
                            } else if (correct == false) {
                                System.out.println("Sorry, the letter is not in the word. Your secret word:  ");
                            }
                            System.out.println();
                        }
                        attempts++;
                    }
                    System.out.println("You guessed the entire word " + hiddenword.toUpperCase() + " correctly! It took you " + attempts + " attempts!");


                }

            }
        }
    }

public static void hangManImage(int tries){
        String display="";
        switch(tries){

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
                System.out.println("    |                              |---|");
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
                System.out.println("    |                              |---|");
                System.out.println("    |                              |   | ");
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
