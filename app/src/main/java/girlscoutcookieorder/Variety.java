package girlscoutcookieorder;

public class Variety {
    private String cookieVariety;
    private int numBoxes;

    public String getCookieVariety(){
        return cookieVariety;
    }

    public int getNumBoxes(){
        return numBoxes;
    }

    public Variety(String cookieVariety, int numBoxes){
        // constructor must have the same name as the class it belongs to
        // = lets Java identify and associate a constructor with a particular class.
        this.cookieVariety = cookieVariety;
        this.numBoxes = numBoxes;
    }

    public void updateNumBoxes(int newQuantity) {
        numBoxes = newQuantity;
    }

}

