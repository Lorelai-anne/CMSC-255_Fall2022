package Labs.Lab10;

public class FanTest {
    public static void main(String[] args){
        Fan fans[] = new Fan[2];
        fans[0] = new Fan(3,true,10,"yellow");
        fans[1] = new Fan(2,false,20,"blue");

        System.out.println(fans[0].toString());
        System.out.println(fans[1].toString());
    }
}
