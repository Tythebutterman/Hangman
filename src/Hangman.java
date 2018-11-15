public class Hangman {

    public static void main(String[] args){

    System.out.println("Welcome to Hangman!");
    System.out.println("Rules of the game: Guess a letter for the amount of spaces given. ");
    System.out.println("For every letter you get wrong, a part of the hangman will appear.");
    System.out.println("Once the whole hangman appears you lose the game.");
    System.out.println("Good luck!");

    int numberOfMisses=0;
    for( int i=0; i<15; i++){
        hangManImage(i);}
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
                System.out.println("    |                               -- --");
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

        }


























    }











}
