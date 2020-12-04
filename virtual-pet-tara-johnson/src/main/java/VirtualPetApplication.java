import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {

        VirtualPet myVirtualPet = new VirtualPet();
        Scanner input = new Scanner(System.in);

        System.out.println("What will you name your new dragon?");
        String petName = input.nextLine(); //getting user input for dragon name
        System.out.println("Congratulations! You have adopted a dragon named " + petName + "!");
        System.out.print("\n"); //prints blank line to console for readability

        System.out.println("                      / \\\\  / \\                \n" +
                "                     /.  \\\\/   \\      |\\___/|  \n" +
                "  *----*           / / |  \\\\    \\  __/  O  O\\  \n" +
                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                "|  |       /     /     |      \\\\\\/        |\n" +
                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                "~    ~.           .-~-.|.-*      _        {-,\n" +
                " \\      ~-. _ .-~                 \\      /\\'\n" +
                "  \\                   }            {   .*\n" +
                "   ~.                 '-/        /.-~----.\n" +
                "     ~- _             /        >..----.\\\\\\\n" +
                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");

        int choice = 0;

        //beginning of main game loop
        while (choice != 5) {
            //main choices for user's interaction with dragon
            System.out.printf("What would you like to do with %s? \n", petName);
            System.out.printf("1. Feed %s \n", petName);
            System.out.printf("2. Play with %s \n", petName);
            System.out.printf("3. Give %s something to drink \n", petName);
            System.out.printf("4. Send %s back to their treasure hoard to rest \n", petName);
            System.out.printf("5. Abandon %s (Quit game)\n", petName);

            choice = input.nextInt(); //user input with interaction choice
            System.out.print("\n");

            //choice 1 loop, feeding dragon effects hunger level
            if (choice == 1) {

                while (myVirtualPet.getHungerStatus()){
                    //food choices for user
                    System.out.printf("What will you feed %s ? \n", petName);
                    System.out.println("1. A pesky goblin");
                    System.out.println("2. A cream cheese danish");
                    System.out.println("3. A sprig of parsley");
                    System.out.println("4. Nothing");
                    int foodChoice = input.nextInt(); //user input for food choice

                    System.out.print("\n");
                    myVirtualPet.eat(foodChoice);

                    if (foodChoice == 1) {
                        System.out.println(petName + " says, My favorite!\n");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  ♡  ♡\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");
                    } else if (foodChoice == 2) {
                        System.out.println(petName + " says, Mmmmmmmm\n");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  O  O\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");
                    } else if (foodChoice == 3) {
                        System.out.println(petName + " says, \"Thanks, I guess\" \n");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  -  -\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");
                    } else if (foodChoice == 4) {
                        break;
                    }
                }
                if (!myVirtualPet.getHungerStatus()) {
                    System.out.println("I'm full! Let's do something else now.");
                }

                //choice 2 loop, playing with dragon effects boredom level
            } else if (choice == 2) {

                while (myVirtualPet.getBoredStatus()) {
                    //play choices for user
                    System.out.printf("How would you like to play with %s ? \n", petName);
                    System.out.printf("1. Ride %s while they fly around the block \n", petName);
                    System.out.printf("2. Go burn cattle with %s\n", petName);
                    System.out.printf("3. Play fetch with %s\n", petName);
                    System.out.println("4. Let's actually do something else");
                    int playChoice = input.nextInt();

                    System.out.print("\n");
                    myVirtualPet.play(playChoice);

                    if (playChoice == 1) {
                        System.out.println("I had so much fun!");
                        System.out.println("       \\`----.__                 ____               \n" +
                                "       |       `--._          <=#  , *--,\n" +
                                "       /_             `-.    ,/  / `````  \n" +
                                "         \\__             (_.'  ,'       \n" +
                                "            \\__ ......'       \\___----^__      \n" +
                                "  \t   _./               ,'           `.     \n" +
                                "|\\     _.'   ___/ )\\...._\"   ___           \\     \n" +
                                "| \\__.'  __.'            `\"\"'   `\"\"`.'\"\"\"`--\\     \n" +
                                " \\____.-'    \n");

                    } else if (playChoice == 2) {
                        System.out.println("Do we get to eat them now?");
                        System.out.println("                     /(  /(\n" +
                                "                        /   \\/   \\ \n" +
                                "          |\\___/|      //||\\//|| \\\\\n" +
                                "         (,\\  /,)\\__  // ||// || \\\\ \\        \n" +
                                "         /     /   /_//  |//  ||  \\\\ \\\\ \n" +
                                "        (@_^_@)/    /_   //   ||   \\\\  \\\\\n" +
                                "         W//W_/      /_ //    ||    \\\\   \\\\\n" +
                                "       (//) |         ///     ||     \\\\    \\\\\n" +
                                "     (/ /) _|_ /   )  //      ||      \\\\   __\\\n" +
                                "   (// /) '/,_ _ _/  ( ; -.   ||    _ _\\\\.-~        .-~~~^-.\n" +
                                " (( // )) ,-{        _      `-||.-~-.           .~         `.\n" +
                                "(( /// ))  '/\\      /                 ~-. _ .-~      .-~^-.  \\\n" +
                                "(( ///))      `.   {            }                   /      \\  \\\n" +
                                " ((/ ))     .----~-.\\        \\-'                 .~         \\  `. \\^-.\n" +
                                "           ///.----..>    (   \\             _ -~             `.  ^-`   ^-_\n" +
                                "             ///-._ _ _ _ _ _ _}^ - - - - ~                    ~--_.   .-~ \n" +
                                "                                                                   /.-~");

                    } else if (playChoice == 3) {
                        System.out.println("That was fun! Let's invite more friends next time!");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  ♡  ♡\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");
                    } else if (playChoice == 4) {
                        break;
                    }
                }
                if (!myVirtualPet.getBoredStatus()) {
                    System.out.println("I couldn't be more excited! Let's do something else now.");
                }


                //choice 3 loop, giving dragon drinks effects thirst level
            } else if (choice == 3) {

                while (myVirtualPet.getThirstStatus()) {
                    //drink choices for user
                    System.out.printf("What will you give %s to drink? \n", petName);
                    System.out.println("1. An oat milk latte");
                    System.out.println("2. A glass of water");
                    System.out.println("3. Actually, let's do something else");
                    int drinkChoice = input.nextInt();

                    System.out.print("\n");
                    myVirtualPet.drink(drinkChoice);

                    if (drinkChoice == 1) {
                        System.out.println("Yum! I'm a little less thirsty and a little less tired.");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  ♡  ♡\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");

                    } else if (drinkChoice == 2) {
                        System.out.println("Thanks! I feel less thirsty.");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  O  O\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");

                    } else if (drinkChoice == 3) {
                        break;
                    }
                }
                if (!myVirtualPet.getThirstStatus()) {
                    System.out.println("I'm not thirsty anymore! Let's do something else now.");
                }

                //choice 4 loop, letting pet rest effects energy level
            } else if (choice == 4) {

                while (myVirtualPet.getEnergyStatus()) {
                    System.out.printf("How long will you let %s rest?\n", petName);
                    System.out.printf("1. Let %s rest 1 hour\n", petName);
                    System.out.printf("2. Let %s rest 20 minutes\n", petName);
                    System.out.printf("3. Do something else with %s\n", petName);
                    int restChoice = input.nextInt();

                    System.out.print("\n");
                    myVirtualPet.rest(restChoice);

                    if (restChoice == 1) {
                        System.out.println("I feel much more rested!");
                        System.out.println("                      / \\\\  / \\                \n" +
                                "                     /.  \\\\/   \\      |\\___/|  \n" +
                                "  *----*           / / |  \\\\    \\  __/  ♡  ♡\\  \n" +
                                "  |   /          /  /  |   \\\\    \\_\\/  \\     \\    \n" +
                                " / /\\/         /   /   |    \\\\   _\\/    '@___@     \n" +
                                "/  /         /    /    |     \\\\ _\\/       |U\n" +
                                "|  |       /     /     |      \\\\\\/        |\n" +
                                "\\  |     /_     /      |       \\\\  )   \\ _|_\n" +
                                "\\   \\       ~-./_ _    |    .- ; (  \\_ _ _,\\'\n" +
                                "~    ~.           .-~-.|.-*      _        {-,\n" +
                                " \\      ~-. _ .-~                 \\      /\\'\n" +
                                "  \\                   }            {   .*\n" +
                                "   ~.                 '-/        /.-~----.\n" +
                                "     ~- _             /        >..----.\\\\\\\n" +
                                "         ~ - - - - ^}_ _ _ _ _ _ _.-\\\\\\");

                    } else if (restChoice == 2) {
                        System.out.println("I feel a little more rested. *Yawn*");
                        System.out.println("                      ,-,-      \n" +
                                "                     / / |      \n" +
                                "   ,-'             _/ / /       \n" +
                                "  (-_          _,-' `Z_/        \n" +
                                "   \"#:      ,-'_,-.    \\  _     \n" +
                                "    #'    _(_-'_()\\     \\\" |    \n" +
                                "  ,--_,--'                 |    \n" +
                                " / \"\"                      L-'\\ \n" +
                                " \\,--^---v--v-._        /   \\ | \n" +
                                "   \\_________________,-'      | \n" +
                                "                    \\           \n" +
                                "                     \\          \n" +
                                "                      \\       \n");

                    } else if (restChoice == 3) {
                        break;
                    }
                }

                if (!myVirtualPet.getEnergyStatus()) {
                    System.out.println("I've had plenty of rest. Let's do something else now.");
                }

            }
            myVirtualPet.tickCounter();
            System.out.println("Boredom Level: " + myVirtualPet.boredomLevel + " Hunger Level: " + myVirtualPet.hungerLevel +
                    " Thirst Level: " + myVirtualPet.thirstLevel + " Energy Level: " + myVirtualPet.energyLevel);
            System.out.println("\n");

            if (myVirtualPet.hungerLevel <= 0) {
                System.out.println("I'm feeling hungry! Will you feed me?\n");
            } else if (myVirtualPet.energyLevel <= 0) {
                System.out.println("I'm out of energy... it would be nice to have a nap.\n");
            } else if (myVirtualPet.boredomLevel <= 0) {
                System.out.println("I'm bored! Can't we play for a while?\n");
            } else if (myVirtualPet.thirstLevel <= 0) {
                System.out.println("I'm parched! Can I have a drink?\n");
            }
        }
    }
}

