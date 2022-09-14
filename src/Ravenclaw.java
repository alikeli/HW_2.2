public class Ravenclaw  extends Hogwarts {
    private String intellect;
    private String wise;
    private String wit;
    private String creativity;
    public Ravenclaw(String name, int doMagic, int distanceOfTransgression, String intellect, String wise, String wit, String creativity) {
        super(name, doMagic, distanceOfTransgression);
        this.intellect = intellect;
        this.wise = wise;
        this.wit = wit;
        this.creativity = creativity;
    }

    public String getIntellect() {
        return intellect;
    }

    public void setIntellect(String intellect) {
        this.intellect = intellect;
    }

    public String getWise() {
        return wise;
    }

    public void setWise(String wise) {
        this.wise = wise;
    }

    public String getWit() {
        return wit;
    }

    public void setWit(String wit) {
        this.wit = wit;
    }

    public String getCreativity() {
        return creativity;
    }

    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }
}
