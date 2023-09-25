

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;


public class Main {
    public static class Country {
        int order;
        int gold;
        int silver;
        int bronze;

        int rank;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int T = Integer.parseInt(st.nextToken());

        List<Country> countryList = new ArrayList<>();

        Country targetCountry = null;


        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            Country c = new Country();
            c.order = Integer.parseInt(st.nextToken());
            c.gold = Integer.parseInt(st.nextToken());
            c.silver = Integer.parseInt(st.nextToken());
            c.bronze = Integer.parseInt(st.nextToken());

            if(c.order == T) {
                targetCountry = c;
            }


            countryList.add(c);

        }

        Collections.sort(countryList, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                if (o1.gold == o2.gold) {
                    if (o1.silver == o2.silver) {
                        return Integer.compare(o2.bronze, o1.bronze);
                    }
                    return Integer.compare(o2.silver, o1.silver);
                }
                return Integer.compare(o2.gold, o1.gold);
            }
        });


        int rank = 1;
        int count = 1;

        if(countryList.get(0).order == T) {
            System.out.println(1);
            return;
        }

        for(int i = 1; i < N; i++) {
            Country prev = countryList.get(i-1);
            Country current = countryList.get(i);

            if((prev.gold != current.gold) || (prev.silver != current.silver) || (prev.bronze != current.bronze)) {
                rank += count;
                count = 1;
            } else {
                count++;
            }

            if(current.order == T) {
                System.out.println(rank);
                break;
            }
        }





    }
}
