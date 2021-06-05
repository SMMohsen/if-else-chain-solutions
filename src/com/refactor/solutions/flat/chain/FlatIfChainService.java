package com.refactor.solutions.flat.chain;

public class FlatIfChainService {

    /*
     * this example uses flat chain technique to avoid if-else chain and prefer readability over efficiency
     * we have a Student and want to know if with it's GPA will pass or fail in his academic year
     * according to some business rules you will notice that we may check condition that may be checked before
     * but this is the trade off
     */
    public static void main(String[] args) {
        Student student = new Student("Ahmed",2.3,3);
        System.out.println("student passed : "+isStudentPassed(student));
    }

    private static Boolean isStudentPassed(Student student) {
        if(student.getName().startsWith("A") && student.getGpa() > 2.3 && student.getYear() < 3)
            return true;
        if(student.getName().startsWith("A") && student.getGpa() > 2.3 && student.getYear() > 3)
            return false;
        if(student.getName().startsWith("S") && student.getGpa() > 2.5 && student.getYear() > 2)
            return true;

        return false;
    }
}
