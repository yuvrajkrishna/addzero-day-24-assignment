public class StudentDemo {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setStudDetails(1, "Yuvraj", 50, 60, 70);

        s1.calculateTotal();

        s1.displayStudDetails();
    }
}


class Student {

    int rollNum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;


    public void setStudDetails(
            int rollNum,
            String studName,
            int mark1,
            int mark2,
            int mark3) {

        this.rollNum = rollNum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }


    public void calculateTotal() {

        totalMarks = mark1 + mark2 + mark3;
    }


    public void displayStudDetails() {

        System.out.println("Roll No: " + rollNum);
        System.out.println("Name: " + studName);
        System.out.println("Total Marks: " + totalMarks);
    }
}