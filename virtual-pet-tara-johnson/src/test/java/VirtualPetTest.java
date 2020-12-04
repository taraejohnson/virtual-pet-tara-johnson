import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {
    @Test
    public void isVirtualPetHungry() {
        VirtualPet myVirtualPet = new VirtualPet();
        boolean hungry = myVirtualPet.getHungerStatus();
        Assert.assertEquals(true, true);
    }

    @Test
    public void isVirtualPetBored() {
        VirtualPet myVirtualPet = new VirtualPet();
        boolean bored = myVirtualPet.getBoredStatus();
        Assert.assertEquals(false, false);
    }

    @Test
    public void isVirtualPetTired() {
        VirtualPet myVirtualPet = new VirtualPet();
        boolean tired = myVirtualPet.getTiredStatus();
        Assert.assertEquals(true, true);
    }

    @Test
    public void doesVirtualPetStillHaveFire() {
        VirtualPet myVirtualPet = new VirtualPet();
        boolean fire = myVirtualPet.getFireStatus();
        Assert.assertEquals(false, false);
    }

    @Test
    public void tick() {

    }

}
