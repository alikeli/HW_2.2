public class Slytherin  extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name,
                     int doMagic,
                     int distanceOfTransgression,
                     int trick,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int thirstForPower) {
        super(name,doMagic, distanceOfTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    private int abilities() {
        return trick + determination + ambition + resourcefulness + thirstForPower;
    }
    public void studentsCompareSlytherin(Slytherin slytherin) {
        int abilityFirst = this.abilities();
        int abilitySecond = slytherin.abilities();
        if (abilityFirst == abilitySecond) {
            System.out.printf("%s равен %s.%d равно %d \n", getName(), slytherin.getName(), abilityFirst,abilitySecond);
        } else if ((abilityFirst > abilitySecond)) {
            System.out.printf("%s лучше %s.%d лучше %d \n", slytherin.getName(), getName(), abilityFirst,abilitySecond);
        } else {
            System.out.printf("%s хуже %s.%d хуже %d \n", getName(), slytherin.getName(),abilityFirst, abilitySecond);
        }


    }

    @Override
    public String toString() {
        return super.toString() +"хитрость =" + trick +", решительность =" + determination +", амбициозность =" + ambition +", находчивость =" + resourcefulness +", жажда власти =" + thirstForPower + "} " + super.toString();
    }
}
