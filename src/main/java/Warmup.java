import java.util.ArrayList;
import java.util.Random;

public class Warmup {


    public class WarmupArraylist {
        public static  void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();
            Random random = new Random();
            numbers.add(random.nextInt(100));
            for (int i = 0; i <100 ; i++) {
                if (i%2==0)
                {
                    even.add(i);
                }

                else  {
                    odd.add(i);

                }


            }
            System.out.println(numbers);
            System.out.println(odd);
            System.out.println(even);
        }

    }

    }
