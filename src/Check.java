import java.util.ArrayList;
import java.util.List;

public class Check {
    List <Double> numToSum = new ArrayList<>();
    double sum = 0;


    //Printing check

    public void bringObjects(Order print) {

        System.out.println("\n=^..^=   =^..^=   =^..^=    =^..^=    =^..^=    =^..^=    =^..^=" );
        System.out.println("|\n|********** YOUR ORDER **********");



        if (print.coffe.size() > 0) {


            for (int i = 0; i < print.coffe.size(); i++) {

                System.out.println("|\n|Name: " + print.coffe.get(i).getName());
                System.out.println("|Milk: " + print.coffe.get(i).getMilk());
                System.out.println("|Size: " + print.coffe.get(i).getSizes());
                System.out.println("|Coffee Type: " + print.coffe.get(i).getCoffeeType());
                System.out.println("|price: " + print.coffe.get(i).getSizes().getPrice());
                numToSum.add(print.coffe.get(i).getSizes().getPrice());


            }
        }
        if (print.te.size() > 0) {
            for (int i = 0; i < print.te.size(); i++) {

                System.out.println("|\n|Name: " + print.te.get(i).getName());
                System.out.println("|Milk: " + print.te.get(i).getMilk());
                System.out.println("|Size: " + print.te.get(i).getSizes());
                System.out.println("|Coffee Type: " + print.te.get(i).getLeafType());
                System.out.println("|price: " + print.te.get(i).getSizes().getPrice());
                numToSum.add(print.te.get(i).getSizes().getPrice());


            }

        }
        if (print.frap.size() > 0) {

            for (int i = 0; i < print.frap.size(); i++) {
                System.out.println("|\n|Name: " + print.frap.get(i).getName());
                System.out.println("|Milk: " + print.frap.get(i).getMilk());
                System.out.println("|Wipped Cream: " + print.frap.get(i).getCreamType());
                System.out.println("|Size: " + print.frap.get(i).getSizes());
                System.out.println("|price: " + print.frap.get(i).getSizes().getPrice());
                numToSum.add(print.frap.get(i).getSizes().getPrice());

                if (print.frap.get(i).getCreamType() == true) {
                    System.out.println("whipped cream extra: " + print.frap.get(i).getPriceWhippedCream());
                    numToSum.add(print.frap.get(i).getPriceWhippedCream());

                }

            }

        }


        //CUENTA

        for (Double d : numToSum) {

            sum += d;

        }
        System.out.println("|\n|Check: " + sum);
        System.out.println("|\n|Thank you for visiting us ");
        System.out.println("|\n|********** YOUR ORDER **********");

        System.out.println("\n=^..^=   =^..^=   =^..^=    =^..^=    =^..^=    =^..^=    =^..^=\n" +
                "\n");

    }
}

