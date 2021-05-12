import java.util.*;
/**
 * A List of Items
 * @author Coy Burke
 */
public class Listing {
    private String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;
    /**
     * Paramaterized Constructor
     * @param title the desired title for the list.
     */
    public Listing(String title){
        this.title = title;
        this.items = new ArrayList<String>();
        this.sortBehavior = new BubbleSort();
    }
    /**
     * Adds an item to the end of the list.
     * @param item String: item to be added to the list
     */
    public void add(String item){
        items.add(item);
    }
    /**
     * Removes an item from the list.
     * @param item A String representing the item to be removed from the list
     */
    public void remove(String item){
        items.remove(item);
    }
    /**
     * Returns the title of the list.
     * @return A String representing the title of the list.
     */
    public String getTitle(){
        return title;
    }
    /**
     * Sets the sort behavior used to sort items in the list.
     * @param sortBehavior the desired sortBehavior.
     */
    public void setSortBehavior(SortBehavior sortBehavior){
        this.sortBehavior = sortBehavior;
    }
    /**
     * Returns a sorted copy of the list of items.
     * @return A sorted ArrayList of the items in the list.
     */
    public ArrayList<String> getSortedList(){
        /*
        ** Note: ArrayList items is cloned to a new ArrayList to prevent 
        **       the unsorted list from being overwritten.
        */
        ArrayList<String> sortedList = new ArrayList<String>(items);
        return this.sortBehavior.sort(sortedList);
    }
        /**
     * Returns the unsorted version of the list of items.
     * @return An unsorted ArrayList of the items in the list.
     */
    public ArrayList<String> getUnsortedList(){
        return items;
    }
}