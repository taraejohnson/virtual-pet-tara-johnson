public class VirtualPet {

    int hungerLevel = 0;
    int boredomLevel = 0;
    int thirstLevel = 0;
    int energyLevel = 0;
    boolean bored;
    boolean thirsty;
    boolean energy;
    int maxCount = 20;

    public VirtualPet() {
        hungerLevel = maxCount;
        boredomLevel = maxCount;
        thirstLevel = maxCount;
        energyLevel = maxCount;
    }

    //hunger & eat methods
    public void setHungerLevel(int newValue){
        hungerLevel = newValue;
        if (hungerLevel > maxCount) {
            hungerLevel = maxCount;
        }
    }

    public boolean getHungerStatus() {
        return hungerLevel < 20;
    }

    public void eat(int foodChoice) {
        if (foodChoice == 1) {
            hungerLevel += 3;
        } else if (foodChoice == 2) {
            hungerLevel += 2;
        } else if (foodChoice == 3) {
            hungerLevel += 1;
        }
    }


    //thirst & drink methods
    public void setThirstLevel(int newValue){
        thirstLevel = newValue;
        if (thirstLevel > maxCount) {
            thirstLevel = maxCount;
        }
    }

    public boolean getThirstStatus() {
        if (thirstLevel > 20)
            return !thirsty;
           else
               return thirsty;
    }

    public void drink(int drinkChoice){
        if (drinkChoice == 1) {
            thirstLevel += 2;
            energyLevel += 2;
        } else if (drinkChoice == 2) {
            thirstLevel += 2;
        }
    }


    //boredom & play methods
    public void setBoredomLevel(int newValue) {
        boredomLevel = newValue;
        if (boredomLevel > maxCount){
            boredomLevel = maxCount;
        }
    }

    public boolean getBoredStatus() {
        if (boredomLevel > 20)
            return bored;
        else
            return !bored;
    }

    public void play(int choice) {
        if (choice == 1) {
            boredomLevel += 3;
        } else if (choice == 2) {
            boredomLevel += 2;
        }
    }

    //tired & rest methods
    public void setEnergyLevel(int newValue) {
        energyLevel = newValue;
        if (energyLevel > maxCount){
            energyLevel = maxCount;
        }

    }
    public boolean getEnergyStatus () {
        return energy;
    }

    public void rest(int restChoice){
        if (restChoice == 1) {
            boredomLevel += 3;
        } else if (restChoice == 2) {
            boredomLevel += 2;
        }
    }

    //establishing tick method
    public void tickCounter() {
        setHungerLevel(hungerLevel - 1);
        //This set method if found on line 36 on virtualPet class.
        setThirstLevel(thirstLevel - 1);
        //This set method if found on line 67 on virtualPet class.
        setBoredomLevel(boredomLevel - 1);
        //uses a "set method" where the value can not exceed **maxCount**but will go down below the **maxCount**
        //This set method if found on line 81 on virtualPet class.
    }

}