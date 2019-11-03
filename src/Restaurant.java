public class Restaurant extends TrainDecorator {

    public Restaurant(Wagon newWagon) {
        super(newWagon);
     //   System.out.println("create restaurant wagon");
    }

    public String print(){
        return wagon.print() + "|hThT|";
    }

    public String getType(){
        return  wagon.getType() + "r";
    }
}
