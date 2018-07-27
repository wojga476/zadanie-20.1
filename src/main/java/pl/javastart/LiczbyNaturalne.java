package pl.javastart;

import java.util.ArrayList;
import java.util.List;

public class LiczbyNaturalne {

    public static void main(String[] args) {
        LiczbyNaturalne liczbyNaturalne = new LiczbyNaturalne();
        List<Integer> lista = liczbyNaturalne.wielokrotnosci3i5(1000);
        System.out.println(lista);
    }

    public List<Integer> wielokrotnosci3i5(int liczba) {
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i =1 ; i<liczba; i++){
            if (i%5==0 && i%3==0){
                liczby.add(i);
            }
        }

        return liczby;
    }
}
