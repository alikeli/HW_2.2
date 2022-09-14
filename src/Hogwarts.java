public class Hogwarts {
    String name;
    private int doMagic;
    private int distanceOfTransgression;
    public Hogwarts(String name, int doMagic, int distanceOfTransgression) {
        this.name = name;
        if (doMagic < 0 || doMagic >100) throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        this.doMagic = doMagic;
        if (distanceOfTransgression < 0 || distanceOfTransgression >100) throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoMagic() {
        return doMagic;
    }

    public void setDoMagic(int doMagic) {
        this.doMagic = doMagic;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    }
