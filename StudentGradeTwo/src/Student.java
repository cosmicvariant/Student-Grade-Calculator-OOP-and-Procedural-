

class Student {
    private String name;
    private int id;
    private int[] grades;

    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int[] getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        if (grades.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    @Override
    public String toString() {
        return "Name: " + name + " | ID: " + id + " | Average Grade: " + calculateAverageGrade();
    }



    public static double calculateClassAverage(Student[] students) {
        if (students.length == 0) {
            return 0.0;
        }

        double total = 0.0;
        for (Student student : students) {
            total += student.calculateAverageGrade();
        }

        return total / students.length;
    }
}

