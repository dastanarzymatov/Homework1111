public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;

    }public void Dancing() {
        System.out.println("|<-"+getName()+" soonun biyley alat---->|");
    }

    @Override
    public String toString() {
        return  super.toString()+" Dancer" +
                " groupName='" + groupName + '\'';
    }
}
