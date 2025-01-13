package SWEA.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = -999;
            for(int i = 0; i < 10; i++){
                int n = Integer.parseInt(st.nextToken());
                max = Math.max(max, n);
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}
