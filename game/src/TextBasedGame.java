import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class TextBasedGame {
    private static Scanner userInputOut = new Scanner(System.in);

    public static String scrollHelper (String scrollInterest, String scrollGain) {


        return ("In this scrolling session, the social media carefully utilizes " + scrollInterest + " in order to" +
                " give the viewer" + scrollGain + ".");
    }

    public static String Game(int num1, int num2) {

        return ("Your result is " + (num1 + num2) + "," + (num1 * num2) + " ending in " + ((num1 + num2) % 10 + (num1 * num2 % 10)));
    }

    public static String doHomework() {
        return ("No.");
    }

    public static String checkBus() {
        return ("Jesus must not be smiling upon you today, as the bus app has crashed.");
    }

    public static String checkClass() {
        return ("Your first class is CS, in room 1234567891");
    }

    public static String lifeWisdom(String wisdomAdjective, String wisdomVerb) {

        return ("In life, it's not about the " + wisdomAdjective + " you " + wisdomVerb + ", but rather the " + wisdomVerb + " you " + wisdomAdjective + ".");
    }

    public static String strangerTalk() {
        return ("You find yourself paralysed, unable to defeat social awkwardness.");
    }

    public static String singDance(String sing, String dance) {

        return ("You excitedly and enthusiastically " + sing + " while " + dance + "... in your imagination.");
    }

    public static String clap(int clapAmt) {

        if (clapAmt >= 100) {
            return ("Your hands are too tired to do that.");
        } else if (clapAmt >= 20 && clapAmt < 100) {
            return ("You inspire a rousing round of applause that reverbrates around the train. ");
        } else {
            return ("You clap, and get some weird looks. Huh.");
        }
    }

    public static String dayDream(String dayDreamAdjective, String dayDreamVerb, String dayDreamNoun) {

        return ("You daydream that, one day, a " + dayDreamAdjective + " " + dayDreamNoun + " would " + dayDreamVerb + ".");
    }


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("You wake up. It's 7:05 and you've missed your bus. You have 50 minutes to get to school before you get marked late, and face divine Retribution (AKA detention).");
        System.out.println("You know there are three main stages to getting to school. The House, The Metro and The Bus, all of which you have 50 minutes to complete");
        int energy = 50;
        int time = 5;
        boolean havePowerBank = false;
        boolean haveCoins = false;
        int phoneUseLeft = 1;
        System.out.println("Stage 1: The House.");
        System.out.println("You quickly brush your teeth and pack your bag, are you gonna eat breakfast? " + "\n [1] Yes (-5 mins) " + "\n [2] No ");
        int breakfast = userInput.nextInt();

        if (breakfast == 1) {
            time = time + 5;
            energy = 100;
        } else if (breakfast == 2) {
            time = 5;
            energy = 50;
        } else {
            System.out.println("Getting to school is a grueling task. Every time you fail to make a quick decision, you gotta restart.");
            System.exit(0);
        }

        System.out.println("Just before you rush out the door, you begin to doubt yourself. Did you forget anything?" + "\n [1] Probably, lemme go back to my room and check. (-2 mins) " + "\n [2] Nah ");
        int forget = userInput.nextInt();
        if (forget == 1) {
            time = time + 2;
            System.out.println("You go back into your room and pick up your powerbank.");
            havePowerBank = true;
            System.out.println("Did you forget anything else?" + "\n [1] Yes (-2 mins) " + "\n [2] Nah");
            int forget2 = userInput.nextInt();
            if (forget2 == 1) {
                System.out.println("You look around again, and grab some coins, just in case your octopus runs out.");
                haveCoins = true;
                System.out.println("With both some coins in your pocket and the powerbank in your hand, you finally rush out the door.");
            } else if (forget2 == 2) {
                System.out.println("With your powerbank in hand, you finally rush out the door.");
            } else {
                System.out.println("Getting to school is a grueling task. Every time you fail to make a quick decision, you gotta restart.");
                System.exit(0);

            }


        } else if (forget == 2) {
            System.out.println("Without any doubts, you get out of the house, making sure to close the door behind you.");

        } else {
            System.out.println("Getting to school is a grueling task. Every time you fail to make a quick decision, you gotta restart.");
            System.exit(0);

        }
        System.out.println("As you descend the elevator, you have some idle time to think. Would you like to check your phone, to see when the next train will arrive?");
        System.out.println(" [1] Yes. [2] No ");
        int elevatorPhone = userInput.nextInt();
        if (elevatorPhone == 1) {
            System.out.println("You check the 'train app' on your phone, but realize there's no reception in the elevator.");

            phoneUseLeft = 2;
            if (havePowerBank) {
                System.out.println("You notice your phone is low battery, but luckily, since you have your powerbank, you plug in and begin charging.");
                phoneUseLeft = 100;
            } else {
                System.out.println("You notice your phone is low battery, and you forget your powerbank at home...");
                System.out.println("You estimate that you don't have many more chances to use your phone.");
                phoneUseLeft = 1;
            }

        } else if (elevatorPhone == 2) {
            System.out.println("You take some deep breaths, knowing what comes ahead.");
        } else {
            System.out.println("Getting to school is a grueling task. Every time you fail to make a quick decision, you gotta restart. Even in the elevator.");
            System.exit(0);

        }


        System.out.println("You exit your apartment complex.");
        System.out.println("Time left:" + (50 - time) + " minutes");
        System.out.println("Stage 2: The Metro");
        System.out.println("As you leave the house, you look upon the straight path that leads to the subway station.");
        System.out.println("Will you [1] walk (-7 min) or [2] run");
        int walkRun = userInput.nextInt();
        if (walkRun == 1) {
            System.out.println("You walk calmly, but briskly to the train station.");
            time = time + 11;
        } else if (walkRun == 2) {
            System.out.println("Choosing to run, you get ready to weave through people.");
            System.out.println("Minigame instructions: In order to save time, you will need to weave through other pedestrians. There are three lanes, 'left' , 'right' and 'middle'. " +
                    " You will be given one of them, and must input one of the other two in order to gracefully run through. Do not put spaces in front of your answers.");
            System.out.println("Are you ready? (input 'start' to begin) ");
            String readytoStart = userInput.nextLine();
            while (!readytoStart.equals("start")) {
                System.out.println("By the way, more hesitation, more time lost");
                time = time + 1;
                readytoStart = userInput.nextLine();
            }
            int runCounter = 0;
            int failCounter = 0;
            ArrayList<String> running = new ArrayList<String>();
            running.add("left");
            running.add("middle");
            running.add("right");
            while (runCounter != 10) {
                Random rndm = new Random();
                int rndmIndx = rndm.nextInt(running.size());
                String rndmElem = running.get(rndmIndx);
                String whichOne = (rndmElem + " ");
                System.out.println(whichOne);
                String runAns;

                if (whichOne.equals("left ")) {
                    runAns = userInput.nextLine();

                    if (runAns.equals("middle") || runAns.equals("right")) {
                        runCounter = runCounter + 1;

                    } else {
                        failCounter = failCounter + 1;
                    }
                } else if (whichOne.equals("middle ")) {
                    runAns = userInput.nextLine();
                    if (runAns.equals("left") || runAns.equals("right")) {
                        runCounter = runCounter + 1;
                    } else {
                        failCounter = failCounter + 1;
                    }
                } else if (whichOne.equals("right ")) {
                    runAns = userInput.nextLine();
                    if (runAns.equals("left") || runAns.equals("middle")) {
                        runCounter = runCounter + 1;
                    } else {
                        failCounter = failCounter + 1;
                        System.out.println(failCounter);
                    }
                }
            }
            System.out.println("You reach the metro station, panting, having failed " + failCounter + " times.");
            energy = (energy - 20 * (failCounter * 2));
            time = time + 1 + failCounter % 2;
            if (time >= 50) {
                System.out.println("How did you spend so long getting to the train station? Well anyway, you're out of time.");
                System.exit(0);
            }


        } else {
            System.out.println("Getting to school is a grueling task. Every time you fail to make a quick decision, you gotta restart.");
            System.exit(0);
        }
        System.out.println("Making it inside the station, you pay and enter the train.");
        int trainIdle = 0;
        while (trainIdle < 4) {
            System.out.println("You have some time on the train, what do you decide to do?");
            System.out.println("You could: " +
                    "\n (1) Talk to a stranger " +
                    "\n (2) Sing and Dance " +
                    "\n (3) Clap" +
                    "\n (4) Daydream");
            if (phoneUseLeft >= 4) {
                System.out.println("Since you charged your phone, you can also: " +
                        "\n (5) Scroll social media" +
                        "\n (6) Game (doesn't work) " +
                        "\n (7) Do Homework" +
                        "\n (8) Check when the bus is coming" +
                        "\n (9) Check what classes you have today" +
                        "\n (10) Write some life wisdom");

            }
            int trainActivity = userInput.nextInt();
            if (trainActivity == 5) {


                System.out.println("What do you wish to see within the reel?");
                String a = userInputOut.nextLine();
                while (!userInputOut.hasNextLine()) {
                    System.out.println("Please enter a valid value");
                    userInputOut.nextLine();
                }
                System.out.println("And what do you hope to gain out of this scrolling session?");
                String b = userInputOut.nextLine();
                while (!userInputOut.hasNextLine()) {
                    System.out.println("Please enter a valid value");
                    userInputOut.nextLine();
                }

                String output5 = scrollHelper(a, b);
                System.out.println(output5);
                trainIdle = trainIdle + 1;
            } else if (trainActivity == 6) {
                System.out.println("Welcome to Great Addition, Multiplication and Ending. In this story, there will be an addition, a multiplication, and an ending.");
                System.out.println("Input your first number.");
                int num1 = userInputOut.nextInt();

                System.out.println("Input your second number.");
                int num2 = userInputOut.nextInt();
                while (!userInputOut.hasNextInt()) {
                    System.out.println("Please enter a valid value");
                    userInputOut.nextInt();
                }
                String output6 = Game(num1, num2);
                System.out.println(output6);
                trainIdle = trainIdle + 1;


            } else if (trainActivity == 7) {
                System.out.println(doHomework());
                trainIdle = trainIdle + 1;

            } else if (trainActivity == 8) {
                System.out.println(checkBus());
                trainIdle = trainIdle + 1;

            } else if (trainActivity == 9) {
                System.out.println(checkClass());
                trainIdle = trainIdle + 1;

            } else if (trainActivity == 10) {

                System.out.println("Input a word (adjective)");
                String wise1 = userInputOut.nextLine();

                userInput.nextLine();
                System.out.println("Input another word (verb)");
                String wise2 = userInputOut.nextLine();
                while (!userInputOut.hasNextLine()) {
                    System.out.println("Please enter a valid value");
                    userInputOut.nextLine();
                }

                String output10 = lifeWisdom(wise1, wise2);
                trainIdle = trainIdle + 1;

                System.out.println(output10);
            } else if (trainActivity == 1) {
                System.out.println(strangerTalk());
                trainIdle = trainIdle + 1;
            } else if (trainActivity == 2) {
                System.out.println("How will you sing?");
                String sing1 = userInputOut.nextLine();

                System.out.println("How will you dance?");
                String dance1 = userInputOut.nextLine();
                while (!userInputOut.hasNextLine()) {
                    System.out.println("Please enter a valid value");
                    userInputOut.nextLine();
                }
                String outputSing = singDance(sing1, dance1);
                System.out.println(outputSing);
                trainIdle = trainIdle + 1;

            } else if (trainActivity == 3) {
                System.out.println("How many times do you want to clap?");
                int clap1 = userInputOut.nextInt();
                String outputClap = clap(clap1);
                System.out.println(outputClap);
                trainIdle = trainIdle + 1;
                while (!userInputOut.hasNextInt()) {
                    System.out.println("Enter a number please");
                    userInputOut.nextInt();
                }



            } else if (trainActivity == 4) {
                System.out.println("Input a word (adjective)");
                String dayDreamAdj = userInputOut.nextLine();

                System.out.println("Input another word (noun)");
                String dayDreamVer = userInputOut.nextLine();

                System.out.println("Input another word (verb)");
                String dayDreamNo = userInputOut.nextLine();
                while (!userInputOut.hasNextLine()) {
                    System.out.println("Please enter a valid value");
                    userInputOut.nextLine();
                }
                String outputDream = dayDream(dayDreamAdj,dayDreamVer,dayDreamNo);
                System.out.println(outputDream);
                trainIdle = trainIdle + 1;

            } else {
                while (!userInput.hasNextInt()) {
                    System.out.println("Please enter a valid value");
                    userInput.nextInt();
                }
            }


        }

        System.out.println("As the metro nears your destination, you remember to get off and exit the station.");
        System.out.println("The metro is always an 11 minute ride.");
        time = time + 11;
        System.out.println("Time left: " + (50 - time) + " minutes");
        if (time >= 55) {
            System.out.println("You're late. So close, yet so far");
            System.exit(0);
        }
        System.out.println("Stage 3: The Bus.");
        System.out.println("The station is usually a few hurdles away. Literally. you could choose to walk around all of them, but usually in these situations you jump and duck through fences in order to catch the bus.");
        if (energy < 60) {
            System.out.println("Unfortunately, even if you wanted to run your growling stomach wouldn't let you.");
            System.out.println("You are forced to spend 7 minutes slowly walking to the bus station.");
            time = time + 7;
        } else {
            System.out.println("Since you ate breakfast, you have the energy to take on that challenge once again! Do you wish to (1) run or (2) walk anyway?");
            int busRun = userInput.nextInt();
            if (busRun == 2) {
                System.out.println("You briskly walk towards the bus station, losing only 5 minutes");
                time = time + 5;
            } else if (busRun == 1) {
                System.out.println("Choosing to run, you get ready to duck and leap over fences.");
                System.out.println("Minigame instructions: Similar to the streets minigame, except you will be given two options this time. 'Up' and 'down' " +
                        "input the one that is missing in order gracefully clear a fence. Once again, do not put spaces in front of your answers.");
                System.out.println("Are you ready? (input 'start' to begin) ");
                String readytoBus = userInput.nextLine();
                while (!readytoBus.equals("start")) {
                    System.out.println("More hesitation, more time lost");
                    time = time + 1;
                    readytoBus = userInput.nextLine();
                }
                int fenceCounter = 0;
                int failFenceCounter = 0;
                ArrayList<String> fencing = new ArrayList<String>();
                fencing.add("Up");
                fencing.add("down");
                while (fenceCounter != 10) {
                    Random rndm = new Random();
                    int rndmIndx = rndm.nextInt(fencing.size());
                    String rndmElem = fencing.get(rndmIndx);
                    String whichFence = (rndmElem + " ");
                    System.out.println(whichFence);
                    String inputFence = userInput.nextLine();
                    System.out.println(fenceCounter);

                    if (whichFence.equals("Up ")) {

                        if (inputFence.equals("down")) {
                            fenceCounter = fenceCounter + 1;
                        } else {
                            failFenceCounter = failFenceCounter + 1;
                        }
                    } else if (whichFence.equals("down ")) {

                        if (whichFence.equals("Up")) {
                            fenceCounter = fenceCounter + 1;
                        } else {
                            failFenceCounter = failFenceCounter + 1;
                        }
                    }
                }
                System.out.println("You reach the bus station, panting, having failed " + failFenceCounter + "times.");
                energy = (energy - 20 * (failFenceCounter * 2));
                time = time + 2 + failFenceCounter % 2;
                if (time >= 50) {
                    System.out.println("How many fences did you smash into?");
                    System.exit(0);
                }
            }

        }
            if (time >= 50) {
                System.out.println("As you saw the holy doors of the bus, you sneak a quick glance at your watch. You're out of time!");
                System.exit(0);
            }

            System.out.println("You get on the bus, and have some idle time.");
            int busIdle = 0;
            while (busIdle < 4) {
                System.out.println("What do you decide to do?");
                System.out.println("You could: " +
                        "\n (1) Talk to a stranger " +
                        "\n (2) Sing and Dance " +
                        "\n (3) Clap" +
                        "\n (4) Daydream");
                if (phoneUseLeft >= 4) {
                    System.out.println("Since you charged your phone, you can also: " +
                            "\n (5) Scroll social media" +
                            "\n (6) Game" +
                            "\n (7) Do Homework" +
                            "\n (8) Check what classes you have today" +
                            "\n (9) Write some life wisdom");

                }
                int busActivity = userInput.nextInt();
                if (busActivity == 5) {


                    System.out.println("What do you wish to see within the reel?");
                    String a = userInputOut.nextLine();
                    while (!userInputOut.hasNextLine()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextLine();
                    }
                    System.out.println("And what do you hope to gain out of this scrolling session?");
                    String b = userInputOut.nextLine();
                    while (!userInputOut.hasNextLine()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextLine();
                    }
                    String output5 = scrollHelper(a, b);
                    System.out.println(output5);
                    busIdle = busIdle + 1;
                } else if (busActivity == 6) {
                    System.out.println("Welcome to Great Addition, Multiplication and Ending. In this story, there will be an addition, a multiplication, and an ending.");
                    System.out.println("Input your first number.");
                    int num1 = userInputOut.nextInt();
                    while (!userInputOut.hasNextInt()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextInt();
                    }
                    System.out.println("Input your second number.");
                    int num2 = userInputOut.nextInt();
                    while (!userInputOut.hasNextInt()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextInt();
                    }
                    String output6 = Game(num1, num2);
                    System.out.println(output6);
                    busIdle = busIdle + 1;


                } else if (busActivity == 7) {
                    System.out.println(doHomework());



                } else if (busActivity == 8) {
                    System.out.println(checkClass());
                    busIdle = busIdle + 1;

                } else if (busActivity == 9) {
                    System.out.println();
                    System.out.println("Input a word (adjective)");

                    String wise1 = userInputOut.nextLine();
                    System.out.println("Userinputout: " + userInputOut.toString());
                    while (!userInputOut.hasNextLine()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextLine();
                    }
                    System.out.println("Input another word (verb)");
                    String wise2 = userInputOut.nextLine();
                    while (!userInputOut.hasNextLine()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextLine();
                    }
                    String output10 = lifeWisdom(wise1, wise2);
                    System.out.println(output10);
                    busIdle = busIdle + 1;
                } else if (busActivity == 1) {
                    System.out.println(strangerTalk());
                    busIdle = busIdle + 1;
                } else if (busActivity == 2) {
                    System.out.println("How will you sing?");
                    String sing1 = userInputOut.nextLine();
                    while (!userInputOut.hasNextLine()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextLine();
                    }
                    System.out.println("How will you dance?");
                    String dance1 = userInputOut.nextLine();
                    while (!userInputOut.hasNextLine()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextLine();
                    }
                    String outputSing = singDance(sing1, dance1);
                    System.out.println(outputSing);
                    busIdle = busIdle + 1;
                } else if (busActivity == 3) {
                    System.out.println("How many times do you want to clap?");
                    int clap1 = userInputOut.nextInt();
                    while (!userInputOut.hasNextInt()) {
                        System.out.println("Enter a number please");
                        userInputOut.nextInt();
                    }
                    String outputClap = clap(clap1);
                    busIdle = busIdle + 1;
                } else if (busActivity == 4) {
                    System.out.println("Input a word (adjective)");
                    String dayDreamAdj = userInputOut.nextLine();
                    while (!userInputOut.hasNextLine()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextLine();
                    }
                    System.out.println("Input another word (verb)");
                    String dayDreamVer = userInputOut.nextLine();
                    while (!userInputOut.hasNextLine()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextLine();
                    }
                    System.out.println("Input another word (verb)");
                    String dayDreamNo = userInputOut.nextLine();
                    while (!userInputOut.hasNextLine()) {
                        System.out.println("Please enter a valid value");
                        userInputOut.nextLine();
                    }
                    String outputDream = dayDream(dayDreamAdj,dayDreamVer,dayDreamNo);
                    System.out.println(outputDream);
                    busIdle = busIdle + 1;

                } else {
                    while (!userInput.hasNextInt()) {
                        System.out.println("Please enter a valid value");
                        userInput.nextInt();
                    }
                }


            }

                int attemptsLast;
                if (time >= 20) {
                    attemptsLast = 5;
                } else if (time >= 10 && time <= 20) {
                    attemptsLast = 3;
                } else {
                    attemptsLast = 1;
                }

                if (time >= 50) {
                    System.out.println("You're late. So close, yet so far");
                    System.exit(0);
                }
                System.out.println("After a long and arduous journey, you get to the school, and reach your last hurdle: What room is your first period class in?");
                int classRoom = userInput.nextInt();
                while (attemptsLast > 0) {
                    while (classRoom != 1234567891) {
                        System.out.println("Try again");
                        userInput.nextInt();
                    }
                    if (classRoom == 1234567891) {
                        System.out.println("Carefully climbing the steps up to the room, you make it in time.");
                        System.out.println("Congrats! You win, your reward: https://drive.google.com/drive/folders/1ScUAuUjbUJoLYPGl9UV6qvjCMH3OQsxl?usp=sharing ");
                        System.exit(0);
                    }

                }

                System.out.println("After many more wrong guesses, eventually you find your classroom, but you are LATE.");
                System.exit(0);


            }

        }






