public class Main {
    public static void main(String[] args) {
      Programmer programmer=new Programmer("Bektemir","student","Peaksoft-->|");
        System.out.println("|<-----------------|========HOMEWORK 14========---------->|");
        System.out.println("|<------------------------------------------------------->|");
        System.out.println("|<-----------------|==========PROGRAMMER===========------>|");
        System.out.println(programmer);
        programmer.Coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("|<------------------------------------------------------>|");
    Dancer dancer=new Dancer("Bektemir","biichi","kgGroup---------->|");
        System.out.println("|<-----------------|==========DANCER==========---------->|");
        System.out.println(dancer);
        dancer.Dancing();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("|<------------------------------------------------------>|");
        Singer singer=new Singer("Bektemir","gitarist","gitaristy-------->|");
        System.out.println("|<-----------------|==========SINGER===========--------->|");
        System.out.println(singer);
        singer.PlayGitar();
        singer.Singing();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("|<----------------------------------------------------->|");
}
}