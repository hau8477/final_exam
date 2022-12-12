package student_management.student;

public class Student {
    private String studentID;
    private String studentName;
    private int studentPhoneNumber;
    private String dateOfBirth;
    private String className;

    public Student() {
    }

    public Student(String studentID, String studentName, int studentPhoneNumber, String dateOfBirth, String className) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentPhoneNumber = studentPhoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public Student(String[] strings){
        this.studentID = strings[0];
        this.studentName = strings[1];
        this.studentPhoneNumber = Integer.parseInt(strings[2]);
        this.dateOfBirth = strings[3];
        this.className = strings[4];
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(int studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String formatStudentForCSV(){
        return studentID + "," + studentName + "," + studentPhoneNumber + "," + dateOfBirth + "," + className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentPhoneNumber=" + studentPhoneNumber +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
