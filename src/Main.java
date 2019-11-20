import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,5,55,87,115,254,387,44};
        String[] names = {"Almaz","Marat", "Aziz","Kairat"};
        int max = 0;
        int min = 0;
        float avarage = 0;

      Users users = new Users("Aziz",30);
      Users users1 = new Users("Marat", 24);
      Users users2 = new Users("Almaz", 27);
      Users users3 = new Users("Kairat",40);


        ArrayList<Users> userList =  new ArrayList<>();
        userList.add(users);
        userList.add(users1);
        userList.add(users2);
        userList.add(users3);


        /*   for (int item:nums) {
            if (item > max){
                max = item;
            }

        }
        System.out.println("max = "+ max);

       Date[] dates = {new Date(), new Date(1265317326), new Date(Long.MAX_VALUE)};

        max = Arrays.stream(nums).max().getAsInt();
        System.out.println("max = "+ max);

        Date dateMax = Arrays.stream(dates).max((x,y) -> x.compareTo(y)).get();
        System.out.println(dateMax);

        min = Arrays.stream(nums).min().getAsInt();
        System.out.println("min = "+min);

        Date dateMin = Arrays.stream(dates).min((x,y) -> x.compareTo(y)).get();
        System.out.println(dateMin);

        avarage = (float) Arrays.stream(nums).average().getAsDouble();
        System.out.println("avarage = " + avarage);

        IntStream a = Arrays.stream(nums).filter(x ->x%2 == 0);
        max = a.max().getAsInt();
        System.out.println(max);

        // IntStream a = Arrays.stream(nums).filter(x ->x%2 == 0).max().getAsInt();  или можно продолжить

        Arrays.stream(nums).forEach(x-> System.out.println(x));  //foreach

        Arrays.stream(nums).filter(x->x%2!=0).forEach(x-> System.out.println(x));*/


       // userList.stream().filter(x->x.getAge()<30).forEach(x-> System.out.println(x.getName()));

        //Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).forEach(x-> System.out.println(x));

      //  Arrays.stream(names).sorted().forEach(x-> System.out.println(x));

        userList.stream()
                .sorted(Comparator.comparing(x->x.getAge()))
                .forEach(x-> System.out.println(x.getName() + " - " + x.getAge()));

        min = Arrays.stream(nums).min().getAsInt();
        System.out.println("min = "+min);

        max = Arrays.stream(nums).max().getAsInt();
        System.out.println("max = "+ max);

        avarage = (float) Arrays.stream(nums).average().getAsDouble();
        System.out.println("avarage = " + avarage);



    }
}
