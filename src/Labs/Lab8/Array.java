package Labs.Lab8;

public class Array {
    public static void main(String[] args) {
        String[] tokens = args[0].split(",");
        String[] customerName = new String [8];
       for(int i=0;i<tokens.length;i++){
           customerName[i]=tokens[i];
       }
       displayNames(customerName);
       customerName[6]=customerName[4];
       customerName[7]=customerName[5];
       customerName[4]="Rick";
       customerName[5]="Jessica";
       displayNames(customerName);

       reverseNames(customerName);
       displayNames(customerName);

       for (int i=0;i<customerName.length;i++){
           if (customerName[i] != null && customerName[i].equals("Rick")){
               customerName[i]=null;

               for (int j=i+1;j<customerName.length;j++){
                   String temp = customerName[j];
                   customerName[j]=customerName[j-1];
                   customerName[j-1]=temp;
               }
               i--;
           }
       }
       displayNames(customerName);
    }
    public static void displayNames(String[] names){
        for(String j : names){
            System.out.println(j);
        }
        System.out.println();
    }

    public static String[] reverseNames(String[]names){
        for(int i=0;i<names.length/2;i++){
            String temp = names[i];
            names[i]=names[names.length-i-1];
            names[names.length-i-1]=temp;
        } return names;
    }

    public static void reverseNames2(String[] names){
        for(int i=0;i<names.length/2;i++) {
            String temp = names[i];
            names[i] = names[names.length - i - 1];
            names[names.length - i - 1] = temp;
        }
    }
}