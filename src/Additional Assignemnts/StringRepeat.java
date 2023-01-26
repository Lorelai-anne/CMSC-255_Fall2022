package MidtermCorrections;

public class StringRepeat {
    public static void main(String[] args){
        String s = "fun";
        System.out.println(repeatFun(s,7));
    }
    public static String repeatFun (String s,int num){
        String repeating = "";
        for (int i=0;i<num;i++){
            repeating += (s+" ");
        }
        return repeating;
    }
}
