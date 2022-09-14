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

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " + super.toString();
    }
}
