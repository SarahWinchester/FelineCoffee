import java.util.ArrayList;
import java.util.List;

public class Order {

    public List<Cafe> coffe = new ArrayList<Cafe>();
    public List<Te> te = new ArrayList<>();
    public  List<Frapuccino> frap = new ArrayList<>();





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
                "        `-.__`.               ,' fєℓιиє ςαfє.\n" +
                "    ,--------`\"`-------------'--------.\n" +
                "     `\"--.__                   __.--\"'\n" +
                "            `\"\"-------------\"\"' \n\n");


        Waitress waitress = new Waitress();
        Order previous = waitress.kindOfBeverage();

        Check check = new Check();
        check.bringObjects(previous);



    }

}
