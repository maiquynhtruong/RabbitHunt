public class Rabbit extends Animal {

    public Rabbit(Model model, int row, int column) {
        super(model, row, column);
    }
    
    
    /**
     *  This is what you'll need to change
     *  make the rabbit smarter!
     */
    int decideMove() {
        return random(Model.MIN_DIRECTION, Model.MAX_DIRECTION);
    }
}
