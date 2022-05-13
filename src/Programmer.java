public class Programmer extends Person{
    private String CompanyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        CompanyName = companyName;
    }void Coding(){
        System.out.println("|<-"+getName()+" kod jaza alat--------->|");
    }

    @Override
    public String toString() {
        return super.toString()+"Programmer " +
                "CompanyName='" + CompanyName + '\'' ;
    }
}
