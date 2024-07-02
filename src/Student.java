//11 - Escreva uma classe cujos objetos representam alunos matriculados em uma
//disciplina. Cada objeto dessa classe deve guardar os seguintes dados do aluno:
//matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos
//para esta classe:
//calcularMédia: calcula a média final do aluno (cada prova tem peso 2,5 e o
//trabalho tem peso 2)
//verificarSituação:verificar o valor da nota, e informe se ele está aprovado ou
//reprovado
public class Student {
    private int registrationNumber;
    private String name;
    private double test1Grade;
    private double test2Grade;
    private double assignmentGrade;

    public Student(int registrationNumber, String name, double test1Grade, double test2Grade, double assignmentGrade) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.test1Grade = test1Grade;
        this.test2Grade = test2Grade;
        this.assignmentGrade = assignmentGrade;
    }

    public double calculateAverage() {
        double average = ((test1Grade * 2.5) + (test2Grade * 2.5) + (assignmentGrade * 2)) / 7.0;
        return average;
    }
    public String checkApproval() {
        double average = calculateAverage();
        if (average >= 7.0) {
            return "Approved";
        } else {
            return "Not Approved";
        }
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTest1Grade() {
        return test1Grade;
    }

    public void setTest1Grade(double test1Grade) {
        this.test1Grade = test1Grade;
    }

    public double getTest2Grade() {
        return test2Grade;
    }

    public void setTest2Grade(double test2Grade) {
        this.test2Grade = test2Grade;
    }

    public double getAssignmentGrade() {
        return assignmentGrade;
    }

    public void setAssignmentGrade(double assignmentGrade) {
        this.assignmentGrade = assignmentGrade;
    }

    public static void showStudentInfo(Student student) {
        System.out.println("Student 1:");
        displayStudentDetails(student);
    }
    public static void displayStudentDetails(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Registration Number: " + student.getRegistrationNumber());
        System.out.println("Test 1 Grade: " + student.getTest1Grade());
        System.out.println("Test 2 Grade: " + student.getTest2Grade());
        System.out.println("Assignment Grade: " + student.getAssignmentGrade());

        double average = student.calculateAverage();
        System.out.printf("Average Grade: %.2f\n", average);

        String approvalStatus = student.checkApproval();
        System.out.println("Approval Status: " + approvalStatus);
    }
}

