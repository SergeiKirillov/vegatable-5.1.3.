import java.util.Random;

public class market {
    public static void main(String[] args) {
        var polka1 = new Sklad[3];
        polka1[0] = new Sklad("розовый","сердце",5);
        polka1[1] = new Sklad();
        polka1[2] = new Sklad("Овал",300);

        for (Sklad sk: polka1) {
            System.out.println( sk.GetIDSklad() + " - " + sk.GetColor()+ " - " + sk.GetFigure() + " - " + sk.GetPrice());
        }

    }
}


class Sklad extends Tomat{
    //@Override

    /**
     * @param color "Цвет"
     * @param figure "Фигура"
     * @param price "Цена"
     **/
    public Sklad(String color, String figure, double price){
        super(color,figure,price);

    }

    public Sklad(){
        super();

    }

    public Sklad(String figure, double price){
        super(figure,price);
    }

    public String GetIDSklad(){
        int idSlad = GetID();
        return ("Томат №"+idSlad);
    }



}

class Tomat {
    private String color;
    private String figure;
    private double price;
    private static int ID;
    private int codeTomat;

    /**
     * @param color "Цвет"
     * @param figure "Фигура"
     * @param price "Цена"
     **/

    static{
        Random id = new Random();
        ID = id.nextInt(1000);
    }

    {
        codeTomat = ID;
        ID++;
    }

    public Tomat(String color, String figure, double price){


        this.color=color;
        this.figure=figure;
        this.price=price;
    }

    public Tomat(){
        this("красный","круг", 100);
    }

    public Tomat(String figure, double price){
        this("красный", figure, price);
    }

    public String GetColor(){
        return color;
    }

    public String GetFigure(){
        return figure;
    }

    public double GetPrice(){
        return price;
    }

    public int GetID(){
        return codeTomat;
    }
}