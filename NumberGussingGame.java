import java.util.Random;
import java.util.Scanner;

class NumberGussingGame {

    // Generates Random Number
    public static int randomNum() {
        int randNumber;
        Random random = new Random();
        randNumber = random.nextInt(0, 100) + 1;
        return randNumber;
    }

    public static void main(String[] args) {

        // Prerequisites
        int userGuess;
        int attempts;
        int restart;
        int score = 0;
        int randomNumber = randomNum();
        Scanner sc = new Scanner(System.in);

        // Intro Duction to the game.
        System.out.println("\nWELCOME MATE");
        System.out.println("It is a Number Guessing Game");
        System.out.println("You will have 2 rounds to make your scor better.\nSo, carefully.");
        System.out.println("To start the Game Press 1\nTo Check the Menu Press 2\nFor exist Press 0.");
        System.out.print("Enter Your Option: ");// Option Choice
        int startinput = sc.nextInt();

        // Starting Point of Main Game.
        if (startinput == 1) {
            System.out.println("\n\n----------ROUND 1----------");
            // Giving the User to choose number of attempts from 5 or 10.
            System.out.println("\nNumber of attempts do you want from 5 or 10.");
            System.out.println(
                    "If You choose 5 attempts then Your Maximum Score will be 40 and in case of 10 maximum score will be 20.");
            System.out.print("Enter Your Choice: ");
            attempts = sc.nextInt();

            // If user choose 5.
            if (attempts == 5) {// User chooses 5
                score = 40;
                // Game main logic
                System.out.println("\nYou have " + attempts
                        + " attempts. If You Guessed this in first attempt then your score will be the Highest according to your choice.");
                System.out.println("Otherwise it will deducted by 2.");
                int i = 1;// Running game to attempts
                while (i <= attempts) {
                    // User Input
                    System.out.print("\nAttempt Number " + i + ". Enter the Number in range of 1 to 100: ");
                    userGuess = sc.nextInt();
                    // Comparision of UserGuess and number generated.
                    if (userGuess > 0 && userGuess < 100) {
                        if (userGuess == randomNumber) {
                            System.out.println("Yay! You Won");
                            System.out.println("Your score is: " + score);
                            //Start of round 2
                            System.out.print("\nYou want to play round 2.\nif yes enter 1, if no enter 0: ");
                            restart = sc.nextInt();
                            System.out.println("\n\n----------ROUND 2----------");
                            if (restart == 1) {
                                int rNumber = randomNum();
                                System.out.println("\nNumber of attempts do you want from 5 or 10.");
                                System.out.println(
                                        "If You choose 5 attempts then Your Maximum Score will be 40 and in case of 10 maximum score will be 20.");
                                System.out.print("Enter Your Choice: ");
                                attempts = sc.nextInt();

                                // If user choose 5.
                                if (attempts == 5) {// User chooses 5
                                    score = 40;
                                    // Game main logic
                                    System.out.println("\nYou have " + attempts
                                            + " attempts. If You Guessed this in first attempt then your score will be the Highest according to your choice.");
                                    System.out.println("Otherwise it will deducted by 2.");
                                    // Running game to attempts
                                    int j = 1;
                                    while (j <= attempts) {
                                        // User Input
                                        System.out.print(
                                                "\nAttempt Number " + j + ". Enter the Number in range of 1 to 100: ");
                                        userGuess = sc.nextInt();
                                        // Comparision of UserGuess and number generated.
                                        if (userGuess > 0 && userGuess < 100) {
                                            if (userGuess == rNumber) {
                                                System.out.println("Yay! You Won");
                                                System.out.println("Your score is: " + score);
                                                break;
                                            } else if (userGuess < rNumber) {
                                                System.out.println(userGuess + " is Lower Number!");
                                            } else if (userGuess > rNumber) {
                                                System.out.println(userGuess + " is Higher Number!");
                                            }
                                        } else {
                                            System.out.println(
                                                    "\nPlease enter valid Number!, Number should be in range of 1 to 100");
                                        }
                                        if (j == attempts) {
                                            System.out.println("You Lose!\nNo More attempts left. Retry in next game.");
                                        }
                                        j++;
                                        score = score - 5;
                                    }
                                } else if (attempts == 10) {// User choose 10.
                                    score = 20;

                                    // Game main logic
                                    System.out.println("\nYou have " + attempts
                                            + " attempts. If You Guessed this in first attempt then your score will be the Highest according to your choice.");
                                    System.out.println("Otherwise it will deducted by 3.");
                                    // Running game to attempts
                                    int j = 1;
                                    while (j <= attempts) {
                                        // User Input
                                        System.out.print(
                                                "\nAttempt Number " + j + ". Enter the Number in range of 1 to 100: ");
                                        userGuess = sc.nextInt();
                                        // Comparision of UserGuess and number generated.
                                        if (userGuess > 0 && userGuess < 100) {
                                            if (userGuess == rNumber) {
                                                System.out.println("Yay! You Won");
                                                System.out.println("Your score is: " + score);
                                                break;
                                            } else if (userGuess < rNumber) {
                                                System.out.println(userGuess + " is Lower Number!");
                                            } else if (userGuess > rNumber) {
                                                System.out.println(userGuess + " is Higher Number!");
                                            }
                                        } else {
                                            System.out.println(
                                                    "\nPlease enter valid Number!, Number should be in range of 1 to 100");
                                        }
                                        if (j == attempts) {
                                            System.out.println("You Lose!\nNo More attempts left. Retry in next game.");
                                        }
                                        j++;
                                        score = score - 2;
                                    }
                                } else {// If user not chooses from 5 or 10.
                                    System.out.println(
                                            "\nError! You Choosed a wrong choice. enter the choice from 5 or 10. Restart your Game.");
                                }
                            } else if (restart == 0) {
                                System.out.println("Okay! Good Bye, Come Baack Next time.");
                            }
                            break;
                        } else if (userGuess < randomNumber) {
                            System.out.println(userGuess + " is Lower Number!");
                        } else if (userGuess > randomNumber) {
                            System.out.println(userGuess + " is Higher Number!");
                        }
                    } else {
                        System.out.println("\nPlease enter valid Number!, Number should be in range of 1 to 100");
                    }
                    if (i == attempts) {
                        System.out.println("You Lose!\nNo More attempts left. Retry in next game.");
                    }
                    i++;
                    score = score - 5;
                }
            } else if (attempts == 10) {// User choose 10.
                score = 20;

                // Game main logic
                System.out.println("\nYou have " + attempts
                        + " attempts. If You Guessed this in first attempt then your score will be the Highest according to your choice.");
                System.out.println("Otherwise it will deducted by 3.");
                int i = 1;// Running game to attempts
                while (i <= attempts) {
                    // User Input
                    System.out.print("\nAttempt Number " + i + ". Enter the Number in range of 1 to 100: ");
                    userGuess = sc.nextInt();
                    // Comparision of UserGuess and number generated.
                    if (userGuess > 0 && userGuess < 100) {
                        if (userGuess == randomNumber) {
                            System.out.println("Yay! You Won");
                            System.out.println("Your score is: " + score);
                            //Start of round 2
                            System.out.print("\nYou want to play round 2.\nif yes enter 1, if no enter 0: ");
                            restart = sc.nextInt();
                            System.out.println("\n\n----------ROUND 2----------");
                            if (restart == 1) {
                                int rNumber = randomNum();
                                System.out.println("\nNumber of attempts do you want from 5 or 10.");
                                System.out.println(
                                        "If You choose 5 attempts then Your Maximum Score will be 40 and in case of 10 maximum score will be 20.");
                                System.out.print("Enter Your Choice: ");
                                attempts = sc.nextInt();

                                // If user choose 5.
                                if (attempts == 5) {// User chooses 5
                                    score = 40;
                                    // Game main logic
                                    System.out.println("\nYou have " + attempts
                                            + " attempts. If You Guessed this in first attempt then your score will be the Highest according to your choice.");
                                    System.out.println("Otherwise it will deducted by 2.");
                                    // Running game to attempts
                                    int j = 1;
                                    while (j <= attempts) {
                                        // User Input
                                        System.out.print(
                                                "\nAttempt Number " + j + ". Enter the Number in range of 1 to 100: ");
                                        userGuess = sc.nextInt();
                                        // Comparision of UserGuess and number generated.
                                        if (userGuess > 0 && userGuess < 100) {
                                            if (userGuess == rNumber) {
                                                System.out.println("Yay! You Won");
                                                System.out.println("Your score is: " + score);
                                                break;
                                            } else if (userGuess < rNumber) {
                                                System.out.println(userGuess + " is Lower Number!");
                                            } else if (userGuess > rNumber) {
                                                System.out.println(userGuess + " is Higher Number!");
                                            }
                                        } else {
                                            System.out.println(
                                                    "\nPlease enter valid Number!, Number should be in range of 1 to 100");
                                        }
                                        if (j == attempts) {
                                            System.out.println("You Lose!\nNo More attempts left. Retry in next game.");
                                        }
                                        j++;
                                        score = score - 5;
                                    }
                                } else if (attempts == 10) {// User choose 10.
                                    score = 20;

                                    // Game main logic
                                    System.out.println("\nYou have " + attempts
                                            + " attempts. If You Guessed this in first attempt then your score will be the Highest according to your choice.");
                                    System.out.println("Otherwise it will deducted by 3.");
                                    // Running game to attempts
                                    int j = 1;
                                    while (j <= attempts) {
                                        // User Input
                                        System.out.print(
                                                "\nAttempt Number " + j + ". Enter the Number in range of 1 to 100: ");
                                        userGuess = sc.nextInt();
                                        // Comparision of UserGuess and number generated.
                                        if (userGuess > 0 && userGuess < 100) {
                                            if (userGuess == rNumber) {
                                                System.out.println("Yay! You Won");
                                                System.out.println("Your score is: " + score);
                                                break;
                                            } else if (userGuess < rNumber) {
                                                System.out.println(userGuess + " is Lower Number!");
                                            } else if (userGuess > rNumber) {
                                                System.out.println(userGuess + " is Higher Number!");
                                            }
                                        } else {
                                            System.out.println(
                                                    "\nPlease enter valid Number!, Number should be in range of 1 to 100");
                                        }
                                        if (j == attempts) {
                                            System.out.println("You Lose!\nNo More attempts left. Retry in next game.");
                                        }
                                        j++;
                                        score = score - 2;
                                    }
                                } else {// If user not chooses from 5 or 10.
                                    System.out.println(
                                            "\nError! You Choosed a wrong choice. enter the choice from 5 or 10. Restart your Game.");
                                }
                            } else if (restart == 0) {
                                System.out.println("Okay! Good Bye, Come Baack Next time.");
                            }
                            break;
                        } else if (userGuess < randomNumber) {
                            System.out.println(userGuess + " is Lower Number!");
                        } else if (userGuess > randomNumber) {
                            System.out.println(userGuess + " is Higher Number!");
                        }
                    } else {
                        System.out.println("\nPlease enter valid Number!, Number should be in range of 1 to 100");
                    }
                    if (i == attempts) {
                        System.out.println("You Lose!\nNo More attempts left. Retry in next game.");
                    }
                    i++;
                    score = score - 2;
                }
            } else {// If user not chooses from 5 or 10.
                System.out.println(
                        "\nError! You Choosed a wrong choice. enter the choice from 5 or 10. Restart your Game.");
            }
        } else if (startinput == 2) {
            // Menu
            System.out.println(
                    "In this Game you Have to Guess the Number. If Your  Guess is correct then you will win this game");
            System.out.println(
                    "You Have 2 attempt Choices 5 and 10 that means you attempt 5 or 10 time in a single game according to your choice.");
            System.out.println(
                    "Minimum attempts will maximum Points\n for e.g Guessing in first time will be 40 pionts if attempt choice is 5 and otherwise in 20 points.");
        } else if (startinput == 0) {
            System.out.println("Thank You! Comeback Next Time.");
        } else {
            System.out.println("Choose From the Given Options.");
        }

        // Securing Resource Leek
        sc.close();
    }
}