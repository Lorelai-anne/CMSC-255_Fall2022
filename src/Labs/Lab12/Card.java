package Labs.Lab12;

public class Card {
    private String name;

    public Card(String name){
        this.name = name;
    }
    public Card(){
        name = "";
    }

    public String toString(){
        String description = ("Card Holder: "+name);
        return description;
    }
}
