package com.company;

public class Color {
                  //CONST\\
    int Colornumber;
    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int PURPLE = 7;

                 //CONSTRUCTOR\\

    public Color(int Colornumber) {
        this.Colornumber = Colornumber;
    }
                 //METHOD.№1\\

    public int getColornumber() {
        return Colornumber;
    }
                 //METHOD.№2\\

    public String getColorname() {
           String Colorname=null;

                //SWITCH BLOCK\\

        switch (Colornumber) {
            case RED:
                Colorname = "КРАСНЫЙ";
                break;
            case ORANGE:
                Colorname = "ОРАНЖЕВЫЙ";
                break;
            case YELLOW:
                Colorname = "ЖЕЛТЫЙ";
                break;
            case GREEN:
                Colorname = "ЗЕЛЕНЫЙ";
                break;
            case BLUE:
                Colorname = "ГОЛУБОЙ";
                break;
            case INDIGO:
                Colorname = "СИНИЙ";
                break;
            case PURPLE:
                Colorname = "ФИОЛЕТОВЫЙ";
                break;
            default:
                System.out.println("неизвестный цвет");
        }
        return Colorname;
    }
}





