public class Assignment12{
    public static void main(String[] args) {
        Holiday h1 = new Holiday("Iday",15,"August");
        Holiday h2 = new Holiday("RakshaBdhan", 28, "August");
        Holiday h3 = new Holiday("Rday",26,"January");
        System.out.println(h1.issameMonth(h3));
    }
}

class Holiday{
    String name;
    int day;
    String month;
    Holiday(String name,int day,String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public boolean issameMonth(Holiday h2){
        if(this.month == h2.month){
            return true;
        }
        return false;
    }
}