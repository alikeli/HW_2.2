public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name,
                      int doMagic,
                      int distanceOfTransgression,
                      int nobility,
                      int honor,
                      int bravery) {
        super(name, doMagic, distanceOfTransgression);
        if (nobility < 0 || nobility > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.nobility = nobility;
        if (honor < 0 || honor > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.honor = honor;
        if (bravery < 0 || bravery > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    private int abilities() {
        return nobility + honor + bravery;
    }
    public void studentsCompareGriffindor(Griffindor griffindor) {
        int abilityFirst = this.abilities();
        int abilitySecond = griffindor.abilities();
        if (abilityFirst == abilitySecond) {
            System.out.printf("%s равен %s.%d равно %d \n", getName(), griffindor.getName());
        } else if ((abilityFirst > abilitySecond)) {
            System.out.printf("%s лучше %s.%d больше %d \n", griffindor.getName(), getName(), abilityFirst, abilitySecond);
        } else {
            System.out.printf("%s хуже  %s.%d меньше %d \n", getName(), griffindor.getName(), abilityFirst, abilitySecond);
        }


    }

    @Override
    public String toString() {
        return super.toString() +"благородство =" + nobility +", честь =" + honor +", храбрость =" + bravery  ;
    }
}
