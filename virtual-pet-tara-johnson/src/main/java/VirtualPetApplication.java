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
            System.out.printf("5. Abandon %s \n", petName);

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


                //choice 2 loop, playing with dragon effects boredom level
            } else if (choice == 2) {

                do {
                    //play choices for user
                    System.out.printf("How would you like to play with %s ? \n", petName);
                    System.out.printf("1. Ride %s while they fly around the block \n", petName);
                    System.out.printf("2. Give %s some crayons\n", petName);
                    System.out.printf("3. Stop playing with %s\n", petName);
                    int playChoice = input.nextInt();

                    myVirtualPet.play(playChoice);

                    if (playChoice == 1) {
                        System.out.println("I had so much fun!");

                    } else if (playChoice == 2) {
                        System.out.println("");

                    } else if (playChoice == 3) {
                        break;
                    }
                }
                while (myVirtualPet.getBoredStatus());


                //choice 3 loop, giving dragon drinks effects thirst level
            } else if (choice == 3) {

                do {
                    //drink choices for user
                    System.out.printf("What will you give %s to drink? \n", petName);
                    System.out.println("1. An oat milk latte");
                    System.out.println("2. A glass of water");
                    System.out.println("3. Actually, let's do something else");
                    int drinkChoice = input.nextInt();

                    myVirtualPet.drink(drinkChoice);

                    if (drinkChoice == 1) {
                        System.out.println("");

                    } else if (drinkChoice == 2) {
                        System.out.println();

                    } else if (drinkChoice == 3) {
                        break;
                    }
                }
                while (myVirtualPet.getThirstStatus());

                //choice 4 loop, letting pet rest effects energy level
            } else if (choice == 4) {

                do {
                    System.out.printf("How long will you let %s rest?\n", petName);
                    System.out.printf("Let %s rest 1 hour\n", petName);
                    System.out.printf("Let %s rest 20 minutes\n", petName);
                    System.out.printf("Do something else with %s\n", petName);
                    int restChoice = input.nextInt();

                    myVirtualPet.rest(restChoice);
                    if (restChoice == 1) {
                        System.out.println("");

                    } else if (restChoice == 2) {
                        System.out.println();

                    } else if (restChoice == 3) {
                        break;
                    }
                }

                while (myVirtualPet.getEnergyStatus());

            }
            myVirtualPet.tickCounter();
            System.out.println("Boredom Level: " + myVirtualPet.boredomLevel + " Hunger Level: " + myVirtualPet.hungerLevel +
                    " Thirst Level: " + myVirtualPet.thirstLevel);
        }
    }
}

