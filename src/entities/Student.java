package entities;

public class Student {
    public String studentName;
    public double firstTrimester;
    public double secondTrimester;
    public double thirdTrimester;

    public String finalGrade() {
        double grade = firstTrimester + secondTrimester + thirdTrimester;
        if (grade >= 60) {
            return grade + " PASS";
        } else
            return grade + " FAILED";

    }
}
