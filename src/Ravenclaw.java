public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wise;
    private int creativity;
    private int wit;

    public Ravenclaw(String name, int doMagic, int distanceOfTransgression, int intellect, int wise, int wit, int creativity) {
        super(name, doMagic, distanceOfTransgression);
        if (intellect < 0 || intellect > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.intellect = intellect;
        if (wise < 0 || wise > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.wise = wise;
        if (wit < 0 || wit > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.wit = wit;
        if (creativity < 0 || creativity > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.creativity = creativity;
    }


    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int abilities() {
        return creativity + wit + wise + intellect;
    }
    public void studentsCompareRavenclaw(Ravenclaw ravenclaw) {
        int abilityFirst = this.abilities();
        int abilitySecond = ravenclaw.abilities();
        if (abilityFirst == abilitySecond) {
            System.out.printf("%s равен %s.%d равно %d \n", getName(), ravenclaw.getName());
        } else if ((abilityFirst > abilitySecond)) {
            System.out.printf("%s лучше %s.%d лучше %d \n", ravenclaw.getName(), getName());
        } else {
            System.out.printf("%s хуже %s.%d хуже %d \n", getName(), ravenclaw.getName());
        }

    }

    @Override
    public String toString() {
        return super.toString() + "интелект = " + intellect + ", мудрость = " + wise + ", творчество = " + creativity + ", остроумие =" + wit  ;
    }
}
