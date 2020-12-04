public class VirtualPet {

    int hungerLevel;
    int boredomLevel;
    int thirstLevel;
    int energyLevel;
    boolean hungry;
    boolean bored;
    boolean thirsty;
    boolean energy;
    int maxCount = 22;

    public VirtualPet() {
        hungerLevel = maxCount - 5;
        boredomLevel = maxCount - 5;
        thirstLevel = maxCount - 5;
        energyLevel = maxCount - 5;
    }

    //hunger & eat methods
    public void setHungerLevel(int newValue) {
        hungerLevel = newValue;
        if (hungerLevel > maxCount) {
            hungerLevel = maxCount;
        }
    }

    public boolean getHungerStatus() {
        if (hungerLevel < 20)
            return !hungry;
        else
            return hungry;
    }

    public void eat(int foodChoice) {
        if (foodChoice == 1) {
            hungerLevel += 3;
            thirstLevel -= 1;
        } else if (foodChoice == 2) {
            hungerLevel += 2;
            thirstLevel -= 1;
        } else if (foodChoice == 3) {
            hungerLevel += 1;
        }
    }


    //thirst & drink methods
    public void setThirstLevel(int newValue) {
        thirstLevel = newValue;
        if (thirstLevel > maxCount) {
            thirstLevel = maxCount;
        }
    }

    public boolean getThirstStatus() {
        if (thirstLevel < 20)
            return !thirsty;
        else
            return thirsty;
    }

    public void drink(int drinkChoice) {
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
        if (boredomLevel > maxCount) {
            boredomLevel = maxCount;
        }
    }

    public boolean getBoredStatus() {
        if (boredomLevel < 20)
            return !bored;
        else
            return bored;
    }

    public void play(int playChoice) {
        if (playChoice == 1) {
            boredomLevel += 3;
            hungerLevel -= 1;
        } else if (playChoice == 2) {
            boredomLevel += 2;
            hungerLevel -= 1;
        }
    }

    //energy & rest methods
    public void setEnergyLevel(int newValue) {
        energyLevel = newValue;
        if (energyLevel > maxCount) {
            energyLevel = maxCount;
        }

    }

    public boolean getEnergyStatus() {
        if (energyLevel < 20)
            return !energy;
        else
            return energy;
    }

    public void rest(int restChoice) {
        if (restChoice == 1) {
            energyLevel += 3;
            hungerLevel -= 1;
            thirstLevel -= 1;
            boredomLevel -= 1;
        } else if (restChoice == 2) {
            energyLevel += 2;
        }
    }

    //establishing tick method
    public void tickCounter() {
        setHungerLevel(hungerLevel - 2);
        //This set method if found on line 36 on virtualPet class.
        setThirstLevel(thirstLevel - 2);
        //This set method if found on line 67 on virtualPet class.
        setBoredomLevel(boredomLevel - 2);
        //uses a "set method" where the value can not exceed **maxCount**but will go down below the **maxCount**
        //This set method if found on line 81 on virtualPet class.
        setEnergyLevel(energyLevel - 2);
    }

}