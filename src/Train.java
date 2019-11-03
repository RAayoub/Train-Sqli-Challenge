

import java.util.ArrayList;
import java.util.List;

public class Train {

    List<Wagon> wagons = new ArrayList<>();

    public Train(String train) {
        //
        for (int i = 0; i < train.toCharArray().length; i++) {
            char test = train.toCharArray()[i];
            if (Character.toString(test).equalsIgnoreCase("h") && (i ==0))
            { wagons.add(new FirstHead(new BasicWagon())); }
            if (Character.toString(test).equalsIgnoreCase("h") && (i !=0))
            {wagons.add(new LastHead(new BasicWagon()));}
            if (Character.toString(test).equalsIgnoreCase("p")) {
                wagons.add(new Passenger(new BasicWagon()));
            }

            if (Character.toString(test).equalsIgnoreCase("r")) {
                wagons.add(new Restaurant(new BasicWagon()));
            }

            if (Character.toString(test).equalsIgnoreCase("c")) {
                wagons.add(new EmptyCargo(new BasicWagon()));
            }

        }

    }

    public String print() {
        String printTrain = "";
        for (Wagon wg : wagons) {
            if (wg.equals(wagons.get(wagons.size() - 1))) {
                printTrain += wg.print();
            } else
                printTrain += wg.print() + "::";
        }
        return printTrain;
    }

    public void detachHead() {
        wagons.remove(0);
    }

    public void detachEnd() {
        wagons.remove(wagons.size() - 1);
    }
    public boolean fill(){
        int i=0;
        boolean isfilled=false;
        for (Wagon wg : wagons) {
            //wg instanceOf EmptyCargo
            if (wg.getType().equals("ec")) {
                wagons.set(i,new FilledCargo(new BasicWagon()));
                isfilled=true;
                break;
            }
            i++;

        }
        return isfilled;
    }

    public static void main(String[] args) {
        Train train = new Train("hprrpcch");
        System.out.println(train.print());
        train.fill();
        System.out.println(train.print());
        train.fill();
        System.out.println(train.print());

    }
}
