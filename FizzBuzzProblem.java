import java.util.*;

public class FizzBuzzProblem {

    /*
    Scrivi un ciclo for che preso un intero in ingresso :
    stampi Fizz al posto di ogni numero multiplo di 3
    stampi Buzz al posto di ogni numero multiplo di 5
    stampi FizzBuzz al posto di ogni numero multiplo di 5 e di 3
    */

    ///blablabla

    public static <k, v> void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int n=15;
        for (int j = 1; j <=n; j++) {
            list.add(j);
        }
        Collections.sort(list);

        for(int i=0; i<n; i++){
            if((list.get(i))%3!=0 && (list.get(i))%5!=0){
                System.out.println(list.get(i));
            }else if ((list.get(i))%3!=0 && (list.get(i))%5==0){
                System.out.println("Buzz");
            }else if ((list.get(i))%3==0 && (list.get(i))%5!=0){
                System.out.println("Fizz");
            }else if ((list.get(i))%3==0 && (list.get(i))%5==0){
                System.out.println("FizzBuzz");
            }
        }



    }
}
