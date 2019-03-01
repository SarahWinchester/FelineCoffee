import javax.swing.*;
public class Waitress {

    public Order kindOfBeverage(){

        Icon icon2 = new ImageIcon(Order.class.getResource("img/felineCafe.png"));

        Boolean milkAux;
        Boolean creamType;
        String nameAux;
        Sizes sizeAux;
        int orderFinish = 0;


        Sizes [] sizeOptions =Sizes.values();
        String [] coffeOptions ={"Veracruz", "Oaxaca" ,"Colombia"};
        String [] teOptions ={"Green Te", "Black Te" ,"Tisane"};
        String [] frapOptions ={"Regular", "Moka" ,"White"};

        Order orderCoffee = new Order();



        JOptionPane.showMessageDialog(null, "Welcoмe тo [ fєℓιиє ςαfє ]\n","fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2 );


        do {

            nameAux = (String) JOptionPane.showInputDialog(null, "What do you want to drink?", "fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2, null, null);

            //System.out.println(nameAux);
            switch (nameAux.toLowerCase()) {

                case "coffee":

                    String coffeeQuestion = (String) JOptionPane.showInputDialog(null, "What kind of coffee do you want?", "fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2, coffeOptions, null);

                    sizeAux = (Sizes) JOptionPane.showInputDialog(null, "What size?", "fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2, sizeOptions, null);

                    int milk = JOptionPane.showConfirmDialog(null, "Do you want milk?", "fєℓιиє ςαfє", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);

                    if (milk == 0) {
                        milkAux = true;
                    } else if (milk == 1) {
                        milkAux = false;
                    } else {
                        break;
                    }

                   /* System.out.println(coffeeQuestion);
                    System.out.println(sizeAux);
                    System.out.println(milkAux);
                    System.out.println(sizeAux.getPrice());
                    System.out.println("********");*/

                    Cafe coff = new Cafe("coffee", milkAux,sizeAux, sizeAux.getPrice() ,coffeeQuestion);
                    orderCoffee.coffe.add(coff);



                    orderFinish = JOptionPane.showConfirmDialog(null, "Do you want something else?", "fєℓιиє ςαfє", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);

                    break;

                case "te":


                    String teQuestion = (String) JOptionPane.showInputDialog(null, "What kind of te do you want? ", "fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2, teOptions, null);

                    sizeAux = (Sizes) JOptionPane.showInputDialog(null, "What Size?", "fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2, sizeOptions, null);

                    int teMilk = JOptionPane.showConfirmDialog(null, "So you want milk?", "fєℓιиє ςαfє", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);

                    if (teMilk == 0) {
                        milkAux = true;
                    } else if (teMilk == 1) {
                        milkAux = false;
                    } else {
                        break;
                    }
                    /*System.out.println(teQuestion);
                    System.out.println(sizeAux);
                    System.out.println(milkAux);
                    System.out.println("******");*/

                    Te teSave = new Te("te", milkAux , sizeAux , sizeAux.getPrice(),teQuestion);
                    orderCoffee.te.add(teSave);

                    orderFinish = JOptionPane.showConfirmDialog(null, "Do you want something else?", "fєℓιиє ςαfє", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);

                    break;

                case "frappuccino":

                    String frapQuestion = (String) JOptionPane.showInputDialog(null, "What kind of Frappuccino do you want?", "fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2, frapOptions, null);

                    sizeAux = (Sizes) JOptionPane.showInputDialog(null, "What Size?", "fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2, sizeOptions, null);

                    int frapMilk = JOptionPane.showConfirmDialog(null, "Do you want extra Milk?", "fєℓιиє ςαfє", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);

                    if (frapMilk == 0) {
                        milkAux = true;
                    } else if (frapMilk == 1) {
                        milkAux = false;
                    } else {
                        break;
                    }

                    int whipped = JOptionPane.showConfirmDialog(null, "Do you want Wipped cream?", "fєℓιиє ςαfє", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);

                    if (whipped == 0) {
                        creamType = true;
                    } else if (whipped == 1) {
                        creamType = false;
                    } else {
                        break;
                    }

                    /*System.out.println(frapQuestion);
                    System.out.println(sizeAux);
                    System.out.println("*******");*/

                    Frapuccino frapOrder = new Frapuccino("Frappuccino", milkAux, sizeAux, sizeAux.getPrice(),creamType, 10);
                    orderCoffee.frap.add(frapOrder);

                    orderFinish = JOptionPane.showConfirmDialog(null, "Do you want something else?", "fєℓιиє ςαfє", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.YES_NO_OPTION, icon2);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "We sorry, we don't have what you are looking for, can i offer you something else?\n We have Coffee, Te and Frappuccinos", "fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2);
            }
            }
            while (orderFinish == 0) ;



        return orderCoffee;

        }


}
