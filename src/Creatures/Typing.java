package Creatures;

public class Typing {
    String type;

    public Typing(String type)
    {
        this.type = type;
    }
    @Override
    public String toString()
    {
        String type = "";
        type = "" + this.type + "";
        return type;
    }
}
