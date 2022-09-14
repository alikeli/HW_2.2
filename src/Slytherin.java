public class Slytherin  extends Hogwarts{
    private String trick;
    private String determination;
    private String ambition;
    private String resourcefulness;
    private String thirstForPower;

    public Slytherin(String name,int doMagic, int distanceOfTransgression, String trick, String determination, String ambition, String resourcefulness, String thirstForPower) {
        super(name,doMagic, distanceOfTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public String getDetermination() {
        return determination;
    }

    public void setDetermination(String determination) {
        this.determination = determination;
    }

    public String getAmbition() {
        return ambition;
    }

    public void setAmbition(String ambition) {
        this.ambition = ambition;
    }

    public String getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(String resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public String getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(String thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}
