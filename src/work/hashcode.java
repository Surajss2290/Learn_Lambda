package work;

public class hashcode {
    int id;
    String name;

    public hashcode(String name, int i) {
        this.id=i;
        this.name=name;
    }

    public int hashcode(){
        int value=name.hashCode();
        int id =this.id;
        return value+id;
    }


    public static void main(String[] args) {
    hashcode n1=new hashcode("suraj",120);
    hashcode n2=new hashcode("suraj",120);

        System.out.println(n1.hashcode());
        System.out.println(n2.hashcode());
    }
}
