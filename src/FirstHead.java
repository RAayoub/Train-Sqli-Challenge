public class FirstHead extends TrainDecorator {

    public FirstHead(Wagon newWagon) {
        super(newWagon);
      //  System.out.println("create first head wagon");
    }

    public String print(){
        return wagon.print() + "<HHHH";
    }

    public String getType(){
        return  wagon.getType() + "fh";
    }
}
