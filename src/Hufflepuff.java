public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name,int doMagic,
                      int distanceOfTransgression,
                      int hardWork,
                      int loyalty,
                      int honesty) {
        super(name, doMagic, distanceOfTransgression);
        if (hardWork < 0 || hardWork > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.hardWork = hardWork;
        if (loyalty < 0 || loyalty > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.loyalty = loyalty;
        if (honesty < 0 || honesty > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "} " + super.toString();
    }
}
