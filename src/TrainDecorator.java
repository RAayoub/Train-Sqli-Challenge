public class TrainDecorator  implements Wagon{

    protected Wagon wagon;

    public TrainDecorator(Wagon newWagon){
        wagon= newWagon;
    }

    @Override
    public String print() {
        return wagon.print();
    }

    @Override
    public String getType() {
        return wagon.getType();
    }
}
