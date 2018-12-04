import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
    String name;
        System.out.println("Welcome to Hangman!");
        System.out.println("Rules of the game: Guess a letter for the amount of spaces given. ");
        System.out.println("For every letter you get wrong, a part of the hangman will appear.");
        System.out.println("Once the whole hangman appears you lose the game.");
        System.out.println("Good luck!");


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter Secret Word!!!");
        name = keyboard. nextLine();
        int numberOfMisses = 0;
        for (int i = 0; i < 15; i++) {
            hangManImage(i);
            {


                int tries = 0;
                boolean iterated = false;
                String temp = "";
            }
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
