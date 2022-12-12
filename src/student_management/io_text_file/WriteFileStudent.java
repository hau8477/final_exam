package student_management.io_text_file;

import student_management.student.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileStudent {
    private static final String PATH_FILE = "src/student_management/data/list_student.csv";
    public static void writeFileStudent(List<Student> students) throws IOException {
        File file = new File(PATH_FILE);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Student student:students) {
            bufferedWriter.write(student.formatStudentForCSV());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
