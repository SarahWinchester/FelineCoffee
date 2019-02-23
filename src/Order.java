import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Beverage> beverages= new ArrayList<Beverage>();


    public static void main(String[] args) {




        System.out.println("\n    _ ,                                                        \n" +
                "  ,- -       ,,                        ,- _~.         /\\       \n" +
                " _||_        ||  '                    (' /|     _    ||        \n" +
                "' ||    _-_  || \\\\ \\\\/\\\\  _-_        ((  ||    < \\, =||=  _-_  \n" +
                "  ||   || \\\\ || || || || || \\\\       ((  ||    /-||  ||  || \\\\ \n" +
                "  |,   ||/   || || || || ||/          ( / |   (( ||  ||  ||/   \n" +
                "_-/    \\\\,/  \\\\ \\\\ \\\\ \\\\ \\\\,/          -____-  \\/\\\\  \\\\, \\\\,/  \n" +
                "                                                               ");

        System.out.println("\n               `:.\n" +
                "                          `:.\n" +
                "                  .:'     ,::\n" +
                "                 .:'      ;:'\n" +
                "                 ::      ;:'\n" +
                "                  :    .:'\n" +
                "                   `.  :.\n" +
                "          _________________________\n" +
                "         : _ _ _ _ _ _ _ _ _ _ _ _ :\n" +
                "     ,---:\".\".\".\".\".\".\".\".\".\".\".\".\":\n" +
                "    : ,'\"`::.:.:.:.:.:.:.:.:.:.:.::'\n" +
                "    `.`.  `:-===-===-===-===-===-:'\n" +
                "      `.`-._:                   :\n" +
                "        `-.__`.               ,' Feline Cafe.\n" +
                "    ,--------`\"`-------------'--------.\n" +
                "     `\"--.__                   __.--\"'\n" +
                "            `\"\"-------------\"\"'");







        Waitress waitress = new Waitress();
        waitress.kindOfBeverage();
    }

}
