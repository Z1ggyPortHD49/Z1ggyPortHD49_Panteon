import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class RRGtest {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int plChooseGameDiff;
        System.out.println("\n" + "Choose simple or hard work version, if simple ver. enter 0 or if hard ver. enter 1" + "\n" + "PS: More precisely, the light version is more optimal and easier for the PC, and the second one specifically with the rendering of each cell in the revolver drum and naturally Boolean and less optimal. In general, Light (Int) is better suited for text games, like right now, and complex (Boolean)" + "\n" + "for games with graphics rendering and interaction with the environment. (Yes i mean shit in Unity, Unreal and other junk), second this is trash any way.");
        int plChooseDiffOfProgram = scanner.nextInt();
        System.out.println("Classic mode, or modernisation? Classic this is there 1 bullet and size of drum = 6?" + "\n" + "Enter 0 if classic mode or enter 1 if modernisation mode.");
        int plChooseGameMode = scanner.nextInt();
        if (plChooseDiffOfProgram <= 0) {
            if (plChooseGameMode >= 0) {
                System.out.println("Choose the difficult. Arcade mode - 0 (on score), HardCore mode - 1 (on life & redemption)");
                plChooseGameDiff = scanner.nextInt();
                System.out.println(SimpleIntVersion(6, 1, plChooseDiffOfProgram, 2));
            } else {
                System.out.println("Enter how many players will be in the game");
                int plChooseHowManyPlayersInTheGame = scanner.nextInt();
                System.out.println("Enter the size of the drum that the revolver will have.");
                int plChooseSizeOfTheDrum = scanner.nextInt();
                System.out.println("Enter how many bullets will be in the revolver.");
                int plChooseHowManyBullets = scanner.nextInt();
                if (plChooseHowManyBullets > plChooseSizeOfTheDrum) {
                    System.out.println("John inserted all the misplaced cartridges into his throat, thereby losing the duel with a machine gun");
                    System.exit(0);
                }
                if (plChooseHowManyBullets == plChooseSizeOfTheDrum) {
                    System.out.println("John and Micah took bottles of the most beautiful ale, drank and shot themselves together, forgetting about the insults of the past, that's it <Red Dead Redemption>");
                }
                System.out.println("Choose the difficult. Arcade mode - 0 (on score), HardCore mode - 1 (on life & redemption)");
                plChooseGameDiff = scanner.nextInt();
                System.out.println(SimpleIntVersion(plChooseSizeOfTheDrum, plChooseHowManyBullets, plChooseGameDiff, plChooseHowManyPlayersInTheGame));
            }
        } else if (plChooseDiffOfProgram == 1) {
            if (plChooseGameMode == 0) {
                System.out.println("Choose the difficult. Arcade mode - 0 (on score), HardCore mode - 1 (on life & redemption)");
                plChooseGameDiff = scanner.nextInt();
                System.out.println(HardBooleanVersion(6, 1, plChooseDiffOfProgram, 2));
            } else {
                System.out.println("Enter how many players will be in the game");
                int plChooseHowManyPlayersInTheGame = scanner.nextInt();
                System.out.println("Enter the size of the drum that the revolver will have.");
                int plChooseSizeOfTheDrum = scanner.nextInt();
                System.out.println("Enter how many bullets will be in the revolver.");
                int plChooseHowManyBullets = scanner.nextInt();
                if (plChooseHowManyBullets > plChooseSizeOfTheDrum) {
                    System.out.println("John inserted all the misplaced cartridges into his throat, thereby losing the duel with a machine gun");
                    System.exit(0);
                }
                if (plChooseHowManyBullets == plChooseSizeOfTheDrum) {
                    System.out.println("John and Micah took bottles of the most beautiful ale, drank and shot themselves together, forgetting about the insults of the past, that's it <Red Dead Redemption>");
                }
                System.out.println("Choose the difficult. Arcade mode - 0 (on score), HardCore mode - 1 (on life & redemption)");
                plChooseGameDiff = scanner.nextInt();
                System.out.println(HardBooleanVersion(plChooseSizeOfTheDrum, plChooseHowManyBullets, plChooseGameDiff, plChooseHowManyPlayersInTheGame));
            }
        }
    }

    static int SimpleIntVersion(int sizeDrum, int howManyBullets, int gameDiff, int howManyPlayersInTheGame) throws InterruptedException { //Complete but not Full (, int howManyPlayersInTheGame)
        Random random = new Random();
        int randomNumberToStart = random.nextInt();
        Scanner scanner = new Scanner(System.in);
        int[] boxWithPeople = new int[howManyPlayersInTheGame];
        HashSet<Integer> boxWithDeath = new HashSet<>();
        int advantage = 0;
        int hitCounter = 0;

        while (boxWithDeath.size() < howManyBullets) {
            int randomNumber = random.nextInt(sizeDrum) + 1;
            boxWithDeath.add(randomNumber);
        }
        boolean youTakeGun = random.nextBoolean();
        System.out.println("John and Micah gathered to deal with the grievances of the past. One for Arthur, the other just fucked him up");
        Thread.sleep(2000);
        System.out.println("Game Started");
        Thread.sleep(300);
        if (gameDiff <= 0) { //Симпл Мод
            for (int i = 1; i <= sizeDrum; i++) {
                if (hitCounter >= boxWithDeath.size())
                    break;
                System.out.println("New Round");
                if (youTakeGun == true) {
                    System.out.println("You token the gun");
                    Thread.sleep(750);

                    System.out.println("SHOOOT!");

                    Thread.sleep(1350);
                    if (boxWithDeath.contains(i)) {
                        System.out.println("You're damaged");
                        advantage -= 1;
                        ++hitCounter;
                    } else {
                        System.out.println("You're saving");
                        advantage += 0;
                    }
                    youTakeGun = false;
                } else {
                    System.out.println("Enemy token the gun");
                    Thread.sleep(750);
                    System.out.println("He's shooting!");
                    Thread.sleep(1350);
                    if (boxWithDeath.contains(i)) {
                        System.out.println("Enemy was damaged");
                        advantage += 1;
                        ++hitCounter;
                    } else {

                        System.out.println("Enemy saving");
                        advantage += 0;
                    }
                    youTakeGun = true;
                }
            }
            if (advantage > 0)
                System.out.println("You win, score");
            else if (advantage < 0) {
                System.out.println("You loose, score");
            } else if (advantage == 0 && hitCounter == boxWithDeath.size()) {
                System.out.println("John and Micah took bottles of the most beautiful ale, drank and shot themselves together, forgetting about the insults of the past, that's it <Red Dead Redemption>");
            }
        } else //HardMode One bullet - one death
        {
            System.out.println("Include Easter eggs (only hard mode)? Enter 0 if no, enter 1 if yes");
            int plChooseEaster = scanner.nextInt();
            boolean easterEggs;
            int easterEggsRule;
            boolean easterEggsActivation = false;
            if (plChooseEaster <= 1)
                easterEggs = true;
            else easterEggs = false;
            if (easterEggs = false) {
                System.out.println("Armadillo, a sunny day. Two old enemies and oldest friends gathered to achieve redemption with each other's blood");
                Thread.sleep(2000);
                System.out.println("Game Started");
            } else {
                System.out.println("Two worlds were created, John Marston, who was going to avenge Arthur Morgan and Micah Bell, who was going to avenge everything that John destroyed in an attempt to avenge Arthur, sat down in a bar, " + "\n" + "Undead Nightmare, death is all around, there are no people, they are like walking corpses");
                Thread.sleep(5000);
                System.out.println("The <Black Undead Revenge> was Started");
            }
            Thread.sleep(300);
            for (int i = 1; i <= sizeDrum; i++) {
                if (hitCounter > 0) //if (hitCounter >= boxWithDeath.size()) - For full tests
                    break;
                System.out.println("A new chance for redemption");
                if (easterEggs == true) {
                    easterEggsRule = random.nextInt(0, sizeDrum - 1);
                    if (advantage != 0) {
                        break;
                    }
                    if (boxWithDeath.contains(easterEggsRule)) {
                        System.out.println("YOU'RE TAKEN THE SUPER BULLET");
                        Thread.sleep(750);
                        easterEggsRule = random.nextInt(0, 10);
                        Thread.sleep(750);
                        if (youTakeGun == true) {
                            if (easterEggsRule > 5) {
                                System.out.println("John say - This is all for Arthur, Micah" + "\n" + "Micah say - Not waiting" + "\n" + "John answered - You will dead in the this new world, where everyone is on the verge of life and death, but at the same time everyone is the living dead. Well, live in this world of Undead Nightmare." + "\n" + "Micah answered - Ahaha John, do you understand the meaning of my life is to rob. AND FINALLY I CAN GET THE WEALTH OF ALL NATIONS AND PEOPLES AND LIVE FOREVER AHAHA STUPID COWPOKE" + "John shoots himself, thereby condemning Mika to eternal wandering. This is Red Dead Redemption");
                                --advantage;
                                ++hitCounter;
                                break;
                            } else {
                                System.out.println("John say - This is all for Arthur, Micah" + "\n");
                                Thread.sleep(1500);
                                System.out.println("And then the door breaks down, a walking corpse, which was the revived Arthur Morgan" + "\n");
                                Thread.sleep(750);
                                System.out.println("And he say - You forgot what I said." + "\n" + "What brother? John answered.");
                                Thread.sleep(750);
                                System.out.println("I said revenge is for fools without the right to life, and I've been saying it all my life. And what are you doing for me now, did I spend my whole life on this, so that some kid would run after his uncle because of stupid revenge?");
                                Thread.sleep(500);
                                System.out.println("You killed more than you avenged for me. Arthur pulled out a revolver and shot Mika.\" + \"In the end, Arthur said, I did it myself. And you suffer in this world, 'damnfull avenger'.");
                                Thread.sleep(300);
                                System.out.println("John's only response is - Sorry brother");
                                ++advantage;
                                ++hitCounter;
                                break;
                            }
                        } else {
                            if (easterEggsRule > 5) {
                                System.out.println("Mika - Yes John, you will not avenge your cowpoke 'Arfur Morhan' and I will kill you, just as I killed him. You've always been like two fucking dumbfools and Dutch understood that. spit in*" + "\n" + "John responds by saying - YOU'RE FUCKING GAY" + "\n" + "Mika is confused, I'm ain gay, I'm not like I was, what are you talking about, shepherd? Your wife is a total slut, be quiet cowpoke, you're living in the clouds" + "\n" + "John - YOU'RE FUCKING GAY, FUCKING GAY FOR DUTCH" + "\n" + "Mika screams in tears, I'M NOT GAY, IT WAS EASY TO WASH DANCING and Mika shoots himself." + "Fuck damnfool - John replied");
                                --advantage;
                                ++hitCounter;
                                break;
                            } else {
                                System.out.println("Mika holds a revolver in his hands, already aiming at himself, and then you hear. An argument between two friends, fairly close friends." + "\n" + "They were two drunks who were considered strange, but in their own way, intelligent. They were Stas Strizhnev and Vladislav Panteos, both migrants, one a Russo-Irishman, the other a Russo-Greek.");
                                Thread.sleep(1500);
                                System.out.println("And they argued quite quietly, but the tension hit Miki in the head. He put down the revolver and began to listen to them.");
                                Thread.sleep(2500);
                                System.out.println("Vlad - I tried to do everything only for the best, and you were the first to get offended, then I said don't yell, don't insult, don't make things worse, my psyche is already in a state of furstration," + "\n" + "NO YOU MADE IT WORSE FOR ME AND YOURSELF, and now you say I don't want to solve problems, fuck, I really trusted you," + "\n" + "the whore then remembered her lesbian past and went to her ex CONSIDERING THE FACT THAT I RECONCILIATED YOU." + "\n" + "You don't even know how to love as a friend, you just get attached and use people, it's your fault that you're such a person," + "I'm an idiot and I'm ashamed that I ever talked to you, the fact that you're such a shitty person could have been understood a long time ago. Disappear from my life. - He got up from the table and ordered another glass and whispered," + "\n" + "but I really loved this creature as a best friend and he (she), even twisted the rights and trust, like Vladya, you are valuable to me, I want to be closer, and then because of her own created problems, she sluts. A fucking traitor like Mika Bell" + "\n" + "In response, Stas only said, Fuck, you... yourself, and starts talking about something that has nothing to do with their argument.");
                                Thread.sleep(75000);
                                System.out.println("And John says, yeah, idiots. At least we have reasons, the first one is just an idiot, the second one is just a weakling idiot who will later whine about how he used to abandon people, and now he's just improving and appreciates everything." + "\n" + "Idiots... It's not the first time for them, but it's the most painful. Fuck, one has schizophrenia, the other has furstration and something hinting at PTSD. Phew. John took a gun and shot himself.");
                                Thread.sleep(1500);
                                System.out.println("Mika said... Women... Well, yes, John's wife was a real slut. And this is a mixture... Us and his wife..." + "\n" + "After a second, Mika's zombies fly apart, even though they suffer for eternity, but at least they don't hear them.");
                                ++hitCounter;
                                break;
                            }
                        }
                    }
                }
                if (youTakeGun == true) {
                    System.out.println("You token the death machine");
                    Thread.sleep(750);

                    System.out.println("YOUR CHANCE!");

                    Thread.sleep(1350);
                    if (boxWithDeath.contains(i)) {
                        System.out.println("John died with honor and dignity, and the great shooter, Micah Bell, who never gave Texas a break for a minute, " + "\n" + "died drunk on the side of the road in Armadillo from cholera. This is his redemption");
                        advantage -= 1;
                        ++hitCounter;
                    } else {
                        System.out.println("NOTHING IS FINISHED, YOU SURVIVED, the disease is progressing");
                    }
                    youTakeGun = false;
                } else {
                    System.out.println("The enemy decides your fate");
                    Thread.sleep(750);
                    System.out.println("and the sand of all Texas howled...");
                    Thread.sleep(1350);
                    if (boxWithDeath.contains(i)) {
                        System.out.println("And the legendary Mika died with honor, and simpleton John died of intoxication");
                        advantage += 1;
                        ++hitCounter;
                    } else {

                        System.out.println("The great shooter proved again that Texas will never stop shuddering from him");
                    }
                    youTakeGun = true;
                }
            }
            if (easterEggs == true) {
                if (advantage > 0)
                    System.out.println("Red Dead Redemption, John die, John Wins");
                else if (advantage < 0) {
                    System.out.println("Red Undead Redemption, Micah die, Micah Wins");
                }
            } else {
                if (advantage > 0)
                    System.out.println("You win, score");
                else if (advantage < 0) {
                    System.out.println("You loose, score");
                }
            }
        }
        return advantage;
    }

    static int HardBooleanVersion(int sizeDrum, int howManyBullets, int gameDiff, int howManyPlayersInTheGame) throws InterruptedException { //Work In Progress (WIP)
        Random random = new Random();

        HashSet<Integer> boxWithDeath = new HashSet<>();
        int advantage = 0;
        int hitCounter = 0;

        while (boxWithDeath.size() < howManyBullets) {
            int randomNumber = random.nextInt(sizeDrum) + 1;
            boxWithDeath.add(randomNumber);
        }
        boolean youTakeGun = random.nextBoolean();
        System.out.println("Game Started");
        Thread.sleep(750);
        return advantage;
    }
}

//Ура фурстрация, потеря близких и дорогих тебе людей = графодр*черство УРА!!! ОТ ЭТОГО НАДО КАЙФОВАТЬ КАК ОТ ПТСР? Сквад, Тарков, Раст? НЕ ТРОГАЙТЕ МНЕ И ИРЛ ХВАТАЕТ
