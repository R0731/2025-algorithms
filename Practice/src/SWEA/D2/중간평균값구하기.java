package SWEA.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 중간평균값구하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int t = 1; t <= tc; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int ans = 0;
            int max = 0;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < 10; i++) {
                int n = Integer.parseInt(st.nextToken());
                ans += n;
                max = Math.max(max, n);
                min = Math.min(min, n);
            }

            ans -= max;
            ans -= min;

            double average = ans / 8.0;
            int roundedAvarage = (int)Math.round(average);

            System.out.println("#" + t + " " + roundedAvarage);
        }
    }
}
