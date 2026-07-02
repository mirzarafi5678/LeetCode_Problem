import java.util.ArrayList;


class students {
    public String name;
    students(String name ){
        this.name = name;
    }

    @Override
    public String toString() {
        return name +" okay";
    }
}


public class test {

    public static void main(String[] args) {
        ArrayList<ArrayList<students >>   list = new ArrayList<>();

        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        list.get(0).add(new students("Rafi"));
        list.get(2).add(new students("tonmoy"));

        System.out.println(list);


    }
}
