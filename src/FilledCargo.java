public class FilledCargo extends TrainDecorator {

    public FilledCargo(Wagon newWagon) {
        super(newWagon);
      //  System.out.println("create filled cargo wagon");
    }

    public String print(){
        return wagon.print() + "|^^^^|";
    }

    public String getType(){
        return  wagon.getType() + "fc";
    }
}
