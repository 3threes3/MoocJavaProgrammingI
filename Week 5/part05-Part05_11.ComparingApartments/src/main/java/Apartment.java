
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan (Apartment compared){
        if(this.squares > compared.getSquares()){
            return true;
        } else { 
            return false;
        }
    }
    
    public int priceDifference (Apartment compared){
        int difference = (this.princePerSquare * this.squares) - (compared.princePerSquare * compared.getSquares());
        if (difference < 0){
            difference = difference * -1;
        }
        return difference;
    }
    
    public boolean moreExpensiveThan (Apartment compared){ 
        if((this.princePerSquare * this.squares) - (compared.princePerSquare * compared.getSquares()) > 0) { 
            return true;
        } else { 
            return false;
        }
    }
    
    public int getSquares () { 
        return this.squares;
    }

}
