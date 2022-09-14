public class Griffindor extends Hogwarts {
    private String nobility;
    private String honor;
    private String bravery;

    public Griffindor(String name,
                      int doMagic,
                      int distanceOfTransgression,
                      String nobility,
                      String honor,
                      String bravery) {
        super(name,doMagic, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public String getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public String getHonor() {
        return honor;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public String getBravery() {
        return bravery;
    }

    public void setBravery(String bravery) {
        this.bravery = bravery;
    }
}
