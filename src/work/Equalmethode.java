package work;

public class Equalmethode {

   String name;
   int id;

    public Equalmethode(String name, int i) {
        this.id=i;
        this.name=name;
    }


    public  boolean equals(Object o){
        Equalmethode e=(Equalmethode) o;
            return this.id==e.id;
    }

    public  boolean equals2(Object o){
        Equalmethode e2=(Equalmethode) o;
        return name.equals(e2.name);
    }

    public static void main(String[] args) {
        Equalmethode e=new Equalmethode("Suraj",15);
        Equalmethode e2=new Equalmethode("Suraj",17);

        System.out.println(e.equals(e2));
        System.out.println(e.equals2(e2));
    }
}