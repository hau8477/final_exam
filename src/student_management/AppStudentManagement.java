package student_management;

import student_management.io_text_file.ReadFileStudent;
import student_management.io_text_file.WriteFileStudent;
import student_management.student.Student;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AppStudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("===========Student Management===========\n" +
                    "1.Add student.\n" +
                    "2.Display list student.\n" +
                    "3.Find student.\n" +
                    "3.Exit.\n" +
                    "Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    List<Student> students = null;
                    try {
                        students = ReadFileStudent.readFileStudent();
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }

                    System.out.print("Enter id student: ");
                    String studentID = scanner.nextLine();

                    System.out.print("Enter name student: ");
                    String studentName = scanner.nextLine();

                    System.out.print("Enter phone number student: ");
                    int phoneNumber = Integer.parseInt(scanner.nextLine());

                    assert students != null;
                    boolean checkPhoneNumber = false;
                    for (Student student1: students) {
                        if (student1.getStudentPhoneNumber() == phoneNumber){
                            checkPhoneNumber = true;
                            try {
                                throw new ExceptionPhoneNumber("Phone number valid!");
                            } catch (ExceptionPhoneNumber e) {
                                System.err.println(e.getMessage());
                            }
                        }
                    }

                    if (checkPhoneNumber){
                        break;
                    }

                    System.out.print("Enter date of birth student: ");
                    String dayOfBirth = scanner.nextLine();

                    System.out.print("Enter class name student: ");
                    String className = scanner.nextLine();

                    Student student = new Student(studentID,studentName,phoneNumber,dayOfBirth,className);

                    students.add(student);
                    try {
                        WriteFileStudent.writeFileStudent(students);
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "2":
                    displayListStudent();
                    break;
                case "3":
                    System.out.print("Enter name student you want find: ");
                    String nameStudentFind = scanner.nextLine();

                    List<Student> studentList = findStudent(nameStudentFind);

                    for (Student student1: studentList) {
                        System.out.println(student1);
                    }
                    break;
                case "4":
                    System.exit(1);
                default:
                    System.out.println("Your choice not valid!");
            }
        } while (true);
    }

    private static void displayListStudent(){
        List<Student> students1 = null;
        try {
            students1 = ReadFileStudent.readFileStudent();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        assert students1 != null;
        for (Student student1: students1) {
            System.out.println(student1);
        }
    }

    private static List<Student> findStudent(String name){
        List<Student> students1 = null;
        List<Student> studentsFind = new LinkedList<>();

        try {
            students1 = ReadFileStudent.readFileStudent();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        assert students1 != null;
        for (Student student1: students1) {
                if (student1.getStudentName().contains(name)) {
                    studentsFind.add(student1);
                }
            }
        return studentsFind;
    }
}
