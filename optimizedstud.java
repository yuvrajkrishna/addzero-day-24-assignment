public class optimizedstud {
    public static void main(String[] args) {
        Student s1 = new Student(1, "f", 1, 2, 3);
        // s1.printDetails();
        Student st[] = new Student[5];
        st[0] = s1;
        Student s2 = new Student(2, "s", 1, 2, 3);
        Student s3 = new Student(3, "t", 4, 5, 6);
        Student s4 = new Student(4, "fo", 7, 8, 9);
        Student s5 = new Student(5, "fi", 10, 11, 12);
        st[1] = s2;
        st[2] = s3;
        st[3] = s4;
        st[4] = s5;
        Student[]gettop3 = s1.getTop3(st);
        for(int i = 0 ; i < gettop3.length ;i++){
            System.out.println(gettop3[i].name);
        }
    }
}


class Student {

    int rn;
    String name;
    int m1, m2, m3, tm;

    public Student(int rn, String name, int m1, int m2, int m3) {

        this.rn = rn;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

        tm = m1 + m2 + m3;
    }

    public void printDetails() {
        System.out.println("Name : " + name + " " + tm);
    }

    public Student[] getTop3(Student[] st) {

        Student first = null;
        Student second = null;
        Student third = null;

        for (int i = 0; i < st.length; i++) {

            if (first == null || st[i].tm > first.tm) {

                third = second;
                second = first;
                first = st[i];

            }
            else if (second == null || st[i].tm > second.tm) {

                third = second;
                second = st[i];

            }
            else if (third == null || st[i].tm > third.tm) {

                third = st[i];
            }
        }

        Student[] top3 = {first, second, third};

        return top3;
    }
}