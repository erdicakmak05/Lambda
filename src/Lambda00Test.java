import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda00Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 15, 22, 2, 3, 4, 5, 6, 7, 8, 9, 74, 25, 65));
        ciftleriYazdir(list);
        System.out.println();
        System.out.println("****************");
        tekleriYazdir(list);
        System.out.println();
        System.out.println("****************");
        elemanlariBirArttir(list);
        System.out.println();
        System.out.println("****************");
        elemanlariSirala(list);
        System.out.println();
        System.out.println("****************");
        elemanlariBuyuktenKucugeSirala(list);
        System.out.println();
        System.out.println("****************");

        List<User> users = new ArrayList<>();
        users.add(new User(1,"Aleyna"));
        users.add(new User(2,"Ahmet"));
        users.add(new User(3,"Zehra"));
        users.add(new User(4,"Murat"));
        users.add(new User(5,"Yıldız"));
        users.add(new User(6,"Elvan"));
        users.add(new User(7,"Erdi"));
        users.add(new User(8,"Meryem"));
        System.out.println("*/*/*/**/*//*/*/*/*/*/*/*/*/*/*/*/*/*/**/*/*/*/");
        System.out.println(users.stream().count());
        System.out.println(users.stream().map(t->t.id));
        System.out.println(users.stream().findFirst());

        System.out.println("*/*/*/**/*//*/*/*/*/*/*/*/*/*/*/*/*/*/**/*/*/*/");


        users.stream()
                .forEach(user -> {
                    System.out.println("Java 8");
                    System.out.println(user.toString());
                });

        System.out.println("********************************\n");

        users.stream().forEach(User::talk); // method reference
        System.out.println("********************************\n");

        long count = users.stream().filter(user -> user.id>5).count();
        System.out.println("Count : " + count);
        System.out.println("************Filtreli List********************");

        List<User> filteredList = users.stream()
                .filter(user -> user.id>5)
                .collect(Collectors.toList());  // Listi yeni bir liste atamamızı sağladı.
        filteredList.stream().forEach(User::talk);

        System.out.println("********************************\n");

       List<User> mappedList = users.stream().map(user -> new User(user.id +100,user.name)).collect(Collectors.toList());

      Map<Integer,String> userMap = users.stream().collect(Collectors.toMap(user -> user.id,user -> user.name));

      userMap.forEach((key,value) -> System.out.println(key + " : " + value));

        IntStream.range(1,50).filter(t-> t%2==0).forEach(System.out::print);
    }

    public static void ciftleriYazdir(List<Integer> list){
        list.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));
    }

    public static void tekleriYazdir(List<Integer> list){
        list.stream().filter(t->t%2==1).forEach(t-> System.out.print(t+" "));
    }

    public static void elemanlariBirArttir(List<Integer> list){
        list.stream().forEach(element-> System.out.print((element+1) + " "));
    }

    public static void elemanlariSirala(List<Integer> list){
        list.stream().sorted().forEach(element-> System.out.print(element+" "));
    }

    public static void elemanlariBuyuktenKucugeSirala(List<Integer> list){
        list.stream().sorted(Comparator.reverseOrder()).forEach(element-> System.out.print(element+ " " ));
    }


}

class User{
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void talk(){
        System.out.println("Merhaba ben " + name);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
}
