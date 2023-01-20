package lectureCode;

public class scratchWork {
    public static void main(String[] args) {
        int x=7;
        int y=10;
        long b = -2;
        float d = 17.2f;
        double e = 9;
        System.out.println(b + " " + d + " " + e);

        String s="Hi";
        for(int i=0;i<3;i++) {
            System.out.print("S"+s);
        }


        if((x>5) && (y>12)) {
            System.out.println("A");
        }
        else if((x<7) || (y>10)) {
            System.out.println("B");
        }
        else if((x<=14) && (y>2)) {
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }
       //Double avg = v1 + v2 + v3 / (double) 3;
    }
}
