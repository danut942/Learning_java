public class StudentProfile {
    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;

    public StudentProfile(String firstName, String lastName, int expectedYearToGraduate, double GPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public void incrementGraduationYear(){
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}
