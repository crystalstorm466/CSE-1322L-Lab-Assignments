package lectureCode;

import java.util.ArrayList;

class Stuff {
    private int x;

    public void setx(int y) {
        x=y;
    }

    public int getx() {
        return x;
    }
}
public class scratchWork {

    public static void main(String[] args) {

        ArrayList<Stuff> myNumbers = new ArrayList<Stuff>();
        for(int i=0;i<5;i++) {
            Stuff myStuff = new Stuff();
            myStuff.setx(i*10);
            myNumbers.add(myStuff);
        }
        System.out.println(myNumbers.get(2).getx());
}

}
