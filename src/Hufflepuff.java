public class Hufflepuff extends Hogwarts {
    private String hardWork;
    private String loyalty;
    private String honesty;
    public Hufflepuff(String name,int doMagic,
                      int distanceOfTransgression,
                      String hardWork,
                      String loyalty,
                      String honesty) {
        super(name, doMagic, distanceOfTransgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String getHardWork() {
        return hardWork;
    }

    public void setHardWork(String hardWork) {
        this.hardWork = hardWork;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getHonesty() {
        return honesty;
    }

    public void setHonesty(String honesty) {
        this.honesty = honesty;
    }
}
