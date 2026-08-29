public class Assignment12{
    public static void main(String[] args) {
        Holiday h1 = new Holiday("Iday",6,"August");
        Holiday h2 = new Holiday("RakshaBdhan", 5, "August");
        Holiday h3 = new Holiday("Rday",4,"January");
        System.out.println(h1.issameMonth(h3));
        Holiday [] hd = new Holiday[5];
        hd[0] = h1;
        hd[1] = h2;
        hd[2] = h3;
        hd[3] = new Holiday("js",4,"sept");
        hd[4] = new Holiday("js",4,"sept");
        double avg = h1.avg(hd);
        System.out.println(avg);
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
    public double avg(Holiday [] hd){
        int sum = 0 ;
        for(int i = 0 ; i < hd.length ; i++){
            sum += hd[i].day;
        }
        return (double)sum/hd.length;
    }
}