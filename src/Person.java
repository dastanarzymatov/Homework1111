public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    void learn(){
        System.out.println("|<-"+name+" uironup atat---------->|");
    }void walk(){
        System.out.println("|<-"+name+" okuuga baratat-------->|");
    }void eat(){
        System.out.println("|<-"+name+" kofe ichip jatat------>|");

    }

    @Override
    public String toString() {
        return "|<-Person: " +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' ;
    }
}
