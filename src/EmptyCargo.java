public class EmptyCargo extends TrainDecorator {

    public EmptyCargo(Wagon newWagon) {
        super(newWagon);
      //  System.out.println("create empty cargo wagon");
    }

    public String print(){
        return wagon.print() + "|____|";
    }

    public String getType(){
        return  wagon.getType() + "ec";
    }
}
