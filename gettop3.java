public class gettop3 {
    public static void main(String[] args) {
        Stud S1 = new Stud(1,"a",10,20,30);
        Stud S2 = new Stud(2,"b",40,50,60);
        Stud [] Students = new Stud[5];
        Students[0] = S1;
        Students[1] = S2;
        Students[2] = new Stud(3, "c", 200,50,10);
        Students[3] = new Stud(4, "d", 100,40,10);
        Students[4] = new Stud(5, "e", 90,0,40);
        Stud[]top3 = S1.getTop3(Students);
        for(int i = 0 ; i < top3.length ; i++){
            System.out.println(top3[i].Name +top3[i].TotalMarks);
        }
    }
}

class Stud{
    int RollNo;
    String Name;
    int Marks1,Marks2,Marks3,TotalMarks;
    public  Stud(int RollNo,
    String Name,
    int Marks1,int Marks2,int Marks3){
        this.RollNo = RollNo;
        this.Name = Name;
        this.Marks1 = Marks1;
        this.Marks2 = Marks2;
        this.Marks3 = Marks3;
        TotalMarks = Marks1 + Marks2 + Marks3;
    }
    public void printDetails(){
        System.out.println("Roll Number : "+RollNo);
        System.out.println("Name : "+Name);
        System.out.println("Marks 1 :"+Marks1);
        System.out.println("Marks 2 :"+Marks2);
        System.out.println("Marks 3 :"+Marks3);
        System.out.println("TotalMarks : "+TotalMarks);
        
    }
    public Stud[] getTop3(Stud[]stud){
        Stud[] top3 = new Stud[3];
        for (int i=0; i<stud.length-1; i++){
            for (int j=0; j<stud.length-i-1; j++){
                if (stud[j].TotalMarks < stud[j+1].TotalMarks){
                    Stud temp = stud[j];
                    stud[j] = stud[j+1];
                    stud[j+1] = temp;
                }
            }
        }
        top3[0] = stud[0];
        top3[1] = stud[1];
        top3[2] = stud[2];
        return top3;
    }
    
}