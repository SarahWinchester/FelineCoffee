import javax.swing.*;

public class Waitress {

    public void kindOfBeverage(){

        Icon icon2 = new ImageIcon(Order.class.getResource("img/felineCafe.png"));

        String milkAux;
        String nameAux;
        String sizeAux;
        int orderFinish = 0;
        String [] sizeOptions ={"chico", "mediano", "grande"};
        String [] coffeOptions ={"Veracruz", "Oaxaca" ,"Colombia"};
        String [] teOptions ={"Green Te", "Black Te" ,"Tisane"};
        String [] frapOptions ={"Regular", "Moka" ,"White"};



        JOptionPane.showMessageDialog(null, "Welcoмe тo [ fєℓιиє ςαfє ]\n","fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2 );

        while(orderFinish == 0) {

            nameAux = (String)JOptionPane.showInputDialog(null, "Que deseas Tomar?","fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2,null,null);

            System.out.println(nameAux);

            switch (nameAux.toLowerCase()){

                case "coffee":

                    String option = (String)JOptionPane.showInputDialog(null, "Que Clase de cafe deseas","fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2,coffeOptions,null);
                    sizeAux = (String) JOptionPane.showInputDialog(null, "Que tamaño de bebida deseas?","fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2 , sizeOptions,null);
                    int milk = JOptionPane.showConfirmDialog(null,"Quieres Leche?","fєℓιиє ςαfє",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.YES_NO_OPTION,icon2);
                    if (milk == 0){
                        milkAux = "Con Leche";
                    }else if(milk == 1){
                        milkAux ="Sin leche";
                    }else{
                        break;
                    }
                    orderFinish = JOptionPane.showConfirmDialog(null,"Deseas algo mas?","fєℓιиє ςαfє",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.YES_NO_OPTION,icon2);

                    System.out.println(option);
                    System.out.println(milk);
                    System.out.println(sizeAux);
                    System.out.println(milkAux);

                case "te":


                    String teQuestion = (String)JOptionPane.showInputDialog(null, "Que Clase de te deseas","fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2,teOptions,null);

                    sizeAux = (String) JOptionPane.showInputDialog(null, "Que tamaño de bebida deseas?","fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2 , sizeOptions,null);
                    int teMilk = JOptionPane.showConfirmDialog(null,"Quieres Leche?","fєℓιиє ςαfє",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.YES_NO_OPTION,icon2);
                    if (teMilk == 0){
                        milkAux = "Con Leche";
                    }else if(teMilk == 1){
                        milkAux ="Sin leche";
                    }else{
                        break;
                    }
                    orderFinish = JOptionPane.showConfirmDialog(null,"Deseas algo mas?","fєℓιиє ςαfє",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.YES_NO_OPTION,icon2);

                    System.out.println(teQuestion);
                    System.out.println(teMilk);
                    System.out.println(sizeAux);
                    System.out.println(milkAux);

                case "frappucino":
                    String frapQuestion = (String)JOptionPane.showInputDialog(null, "Que Clase de te deseas","fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2,frapOptions,null);

                    sizeAux = (String) JOptionPane.showInputDialog(null, "Que tamaño de bebida deseas?","fєℓιиє ςαfє", JOptionPane.PLAIN_MESSAGE, icon2 , sizeOptions,null);
                    int whipped = JOptionPane.showConfirmDialog(null,"Quieres Crema Batida?","fєℓιиє ςαfє",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.YES_NO_OPTION,icon2);
                    if (whipped == 0){
                        milkAux = "Con Leche";
                    }else if(whipped == 1){
                        milkAux ="Sin leche";
                    }else{
                        break;
                    }
                    orderFinish = JOptionPane.showConfirmDialog(null,"Deseas algo mas?","fєℓιиє ςαfє",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.YES_NO_OPTION,icon2);

                    System.out.println(frapQuestion);
                    System.out.println(whipped);
                    System.out.println(sizeAux);
                    System.out.println(milkAux);



            }
        }


    }

}
