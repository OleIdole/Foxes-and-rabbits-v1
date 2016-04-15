
package defaultpackage;


/**
 *
 * @author OleMartin
 */
public abstract class Animal {
    // Whether the animal is alive or not.
    private boolean alive;
        // The animal's position.
    private Location location;
        // The field occupied.
    private Field field;
    
    

    public Animal(Field field, Location location) {
        alive = true;
                this.field = field;
    }
    
    /**
     * Return the field currently occupied.
     * @return The field currently occupied.
     */
    public Field getField()
    {
        return field;
    }
    
        /**
     * Return the animal's location.
     * @return The animal's location.
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Place the animal at the new location in the given field.
     * @param newLocation The animal's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }    
    
        /**
     * Check whether the animal is alive or not.
     * @return True if the animal is still alive.
     */
    public boolean isAlive()
    {
        return alive;
    }
    
        /**
     * Indicate that the animal is no longer alive.
     * It is removed from the field.
     */
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    
    //public abstract void act(List<Animal> newAnimals);
    
}
