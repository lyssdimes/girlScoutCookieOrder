package girlscoutcookieorder;

import java.util.ArrayList;
// import java.util.List;

public class Orders {
    private ArrayList<Variety> varieties = new ArrayList<>();
    // creating a new list named varieties of the type Variety.
    // inside the carrots is the TYPE of list
    // can have Variety written inside <> also, but Java is inferring the type Variety without it there
    // this list will store objects of the Variety class
    public void addVariety(Variety orderToAdd){
        varieties.add(orderToAdd);
    }
        // varieties is the name of the new arrayList, you're adding an object to the list
        // orderToAdd is a placeholder parameter that represents a Variety object
        // provide a (Variety) object you want to add to the list
        // ie addVariety.newOrder (newOrder is a saved instance of the new Variety object)
        // (referenced line above Variety newOrder = new Variety(userVariety, userNumberOfBoxes);)
        // Variety newOrder = new Variety(userVariety, userNumberOfBoxes); 
        // ^^line right above creates a new Variety object using the constructor and assigns it 
        // to the variable newOrder.

    public int getTotalBoxes(){
        int totalNumberOfBoxes = 0;
        for (Variety refVariety : varieties){
            totalNumberOfBoxes = totalNumberOfBoxes + refVariety.getNumBoxes();
        }
        return totalNumberOfBoxes;
    }

    public boolean removeVariety(String varietyName, int quantityToRemove) {
        for (Variety refVariety : varieties) {
            if (refVariety.getCookieVariety().equalsIgnoreCase(varietyName)) {
                int currentQuantity = refVariety.getNumBoxes();
                if (currentQuantity >= quantityToRemove) {
                    int newQuantity = currentQuantity - quantityToRemove;
                    refVariety.updateNumBoxes(newQuantity); 
                    return true; 
                } else {
                    return false; 
                }
            }
        }
        return false; 
    }

            public void displayTotalOrder() {
                System.out.println("Your current order consists of:");
                for (Variety refVariety : varieties) {
                    System.out.println(refVariety.getNumBoxes() + " box(es) of " + refVariety.getCookieVariety() + " cookies");
                }
            }
            
            // declares a new variable refVariety of type Variety
            // The type declaration specifies the data type of the elements in the list that 
            // will be assigned to the variable refVariety.
            // The variable refVariety will be used to hold each element 
            // of the varieties list as the loop iterates over it.
            // The colon symbol (`:`) is used to separate the variable declaration 
            // from the iterable object (varieties). varieties is the ArrayList we want to iterate over.
    }

    // for all methods and variables, must declare the type expected 

