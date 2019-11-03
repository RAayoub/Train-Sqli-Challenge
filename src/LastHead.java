public class LastHead extends TrainDecorator {

    public LastHead(Wagon newWagon) {
        super(newWagon);
      //  System.out.println("create last head wagon");
    }

    public String print(){
        return wagon.print() + "HHHH>";
    }

    public String getType(){
        return  wagon.getType() + "lh";
    }
}

