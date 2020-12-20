public class market {
}


class Tomat {
    private String color;
    private String figure;
    private double price;

    /**
     * @param color "Цвет"
     * @param figure "Фигура"
     * @param price "Цена"
     **/


    public Tomat(String color, String figure, double price){

        this.color=color;
        this.figure=figure;
        this.price=price;
    }

    public Tomat(){
        this("Красный","Сердце", 100);
    }
}