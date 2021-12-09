public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int returnLastElement() {
        return this.grades[this.size - 1];
    }

    public double gradesAverage (int[] grades) {
        int sum = 0;
        double average;

        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
        }
        average = sum / grades.length;
        return average;
    }
    }