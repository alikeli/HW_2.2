public abstract class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Harry Potter", 100, 8, 5, 6, 7);
        Griffindor germiona = new Griffindor("Germiona Grend", 30, 2, 30, 5, 1);
        Griffindor ron = new Griffindor("Ron izly", 1, 2, 3, 40, 5);
        Slytherin drako = new Slytherin("Drako Malfoy", 2, 5, 6, 7, 80, 7, 88);
        Slytherin grehem = new Slytherin("Grehem Moneteg", 2, 3, 44, 5, 1, 86, 7);
        Slytherin gregory = new Slytherin("Gregory Goil", 70, 61, 8, 30, 7, 7, 8);
        Hufflepuff zaharia = new Hufflepuff("Zaharia Smith", 4, 50, 7, 89, 9);
        Hufflepuff sedrikD = new Hufflepuff("Sedrik Diggori", 4, 50, 7, 2, 2);
        Hufflepuff djastin = new Hufflepuff("Djastin Finch Aletcher", 4, 54, 5, 7, 1);
        Ravenclaw chang = new Ravenclaw("Chang", 2, 40, 5, 6, 7, 8);
        Ravenclaw padma = new Ravenclaw("Padma Patill", 5, 60, 47, 84, 2, 56);
        Ravenclaw markys = new Ravenclaw("Markys Belby", 49, 66, 7, 8, 26, 23);

        harry.printStudent();
        germiona.printStudent();
        ron.printStudent();

        drako.studentsCompareHogwarts(zaharia);
        gregory.studentsCompareSlytherin(grehem);
        germiona.studentsCompareGriffindor(ron);
    }


}