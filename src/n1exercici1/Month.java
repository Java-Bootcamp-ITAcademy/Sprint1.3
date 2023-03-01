/*** S1.3 Nivell 1 exercici 1 ***/
package n1exercici1;

public class Month {
    private Mes name;

    /* Getters and setters */
    public Month(Mes month) {
        this.setName(month);
    }

    public Mes getName() {
        return name;
    }    //Setters and getters

    public void setName(Mes month) {
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
