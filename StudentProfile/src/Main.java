public class Main {
    public static void main(String[] args) {

        StudentProfile firstStudent = new StudentProfile("Will","Smith",2025,3.5,"Computer Science");
        StudentProfile secondStudent = new StudentProfile("Michael","Pearson",3000,1.5,"Aliens");

        secondStudent.incrementGraduationYear();
        System.out.println(secondStudent.expectedYearToGraduate);

    }
}
