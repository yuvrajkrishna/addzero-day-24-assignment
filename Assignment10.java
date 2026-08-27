class Student{
    int rNo;
    String name;
    int marks1, marks2, marks3, totalMarks;

   Student(){} // default constructor

    public Student[] getTop3(Student[] students){
        Student[] top3 = new Student[3];
        for (int i=0; i<students.length-1; i++){
            for (int j=0; j<students.length-i-1; j++){
                if (students[j].totalMarks < students[j+1].totalMarks){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        top3[0] = students[0];
        top3[1] = students[1];
        top3[2] = students[2];
        return top3;
    }

    Student(int rNo, String name, int marks1, int marks2, int marks3){
        this.rNo = rNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.totalMarks = marks1+marks2+marks3;
    }
    public void printDetails(){
        System.out.println(name + " " + totalMarks);
    }
}

public class Assignment10 {
    public static void main(String[] args) {
        // Object Oriented Programming

        Student s1 = new Student(1, "a", 0,60,70);
        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = new Student(2, "b", 90,80,10);
        students[2] = new Student(3, "c", 200,50,10);
        students[3] = new Student(4, "d", 100,40,10);
        students[4] = new Student(5, "e", 90,0,40);
        Student[] top3 = s1.getTop3(students);
        for (Student s : top3){
            s.printDetails();
        }
    }
}
