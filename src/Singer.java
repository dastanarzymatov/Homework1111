public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }void Singing(){
        System.out.println("|<-"+getName()+" jakshy yrdait--------->|");

    }void PlayGitar(){
        System.out.println("|<-"+getName()+" gitarany cherte alat-->|");
    }

    @Override
    public String toString() {
        return super.toString()+" Singer " +
                "bandName='" + bandName + '\'' ;
    }
}
