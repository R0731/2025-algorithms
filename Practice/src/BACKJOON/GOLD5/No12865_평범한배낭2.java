package BACKJOON.GOLD5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No12865_평범한배낭2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 물건의 수
        int K = Integer.parseInt(st.nextToken()); // 최대 무게
        int[] weights = new int[N + 1];
        int[] values = new int[N + 1];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            weights[i] = Integer.parseInt(st.nextToken());
            values[i] = Integer.parseInt(st.nextToken());
        }

//        System.out.println(Arrays.toString(weights));
//        System.out.println(Arrays.toString(values));

        int[][] dp = new int[N + 1][K + 1];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= K; j++){
                if(weights[i] <= j){
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i]] + values[i]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[N][K]);
    }
}
