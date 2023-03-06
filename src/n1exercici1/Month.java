/*** S1.3 Nivell 1 exercici 1 ***/
package n1exercici1;

public class Month {
    private String name;

    /* Getters and setters */
    public Month(String month) {
        this.name=month;
    }

    public String getName() {
        return name;
    }    //Setters and getters

    public void setName(String month) {
        this.name = month;
    }

    @Override                       //Overriding hashCode
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override                //Overriding equals
    public boolean equals(Object obj) {
        if(this==obj) {
            return true;
        }
        if(!(obj instanceof Month)) {
            return false;
        }
        Month month=(Month) obj;
        return month.getName()==this.getName();
    }
}
