public class Passenger extends TrainDecorator{


    public Passenger(Wagon newWagon) {
        super(newWagon);
        //System.out.println("create passenger wagon");
    }

    public String print(){
        return wagon.print() + "|OOOO|";
    }

    public String getType(){
        return  wagon.getType() + "p";
    }
}
