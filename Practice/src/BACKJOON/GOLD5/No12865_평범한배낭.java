package BACKJOON.GOLD5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No12865_평범한배낭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 물품의 수
        int K = Integer.parseInt(st.nextToken()); // 최대 무게

        int[][] product = new int[N + 1][2];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            int W = Integer.parseInt(st.nextToken()); // 무게
            int V = Integer.parseInt(st.nextToken()); // 가치
            product[i][0] = W;
            product[i][1] = V;
        }

        int[][] dp = new int[N + 1][K + 1];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= K; j++){
                if(product[i][0] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - product[i][0]] + product[i][1]);
                }else{
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }

        System.out.println(dp[N][K]);
    }

}
