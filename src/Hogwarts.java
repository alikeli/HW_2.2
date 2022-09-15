public abstract class Hogwarts {
    private String name;
    private int doMagic;
    private int distanceOfTransgression;

    public Hogwarts(String name, int doMagic, int distanceOfTransgression) {
        this.name = name;
        if (doMagic < 0 || doMagic > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
        this.doMagic = doMagic;
        if (distanceOfTransgression < 0 || distanceOfTransgression > 100) {
            throw new IllegalArgumentException("Значение выходит за границы диапозона.");
        }
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

    private int abilities() {
        return doMagic + distanceOfTransgression;
    }

    public void printStudent() {
        System.out.println(this);
    }

    public void studentsCompareHogwarts(Hogwarts hogwarts) {
        int abilityFirst = this.abilities();
        int abilitySecond = hogwarts.abilities();
        if (abilityFirst == abilitySecond) {
            System.out.printf("%s равен %s. %d равно %d \n", getName(), hogwarts.getName(),abilityFirst, abilitySecond );
        } else if ((abilityFirst > abilitySecond)) {
            System.out.printf("%s лучше %s . %d больше %d\n", hogwarts.getName(), getName(), abilityFirst, abilitySecond );
        } else {
            System.out.printf("%s хуже  %s. %d меньше %d \n", getName(), hogwarts.getName(), abilityFirst, abilitySecond);
        }
    }

    @Override
    public String toString() {
        return  "Имя='" + name + '\'' + ", сила магии =" + doMagic + ", трансгрессия=" + distanceOfTransgression + ",";
    }
}
