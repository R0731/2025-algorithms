package SWEA.D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class View {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc = 1; tc <= 10; tc++){
            int n = Integer.parseInt(br.readLine());
            int[] building = new int[n];

            // 빌딩 높이 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < n; i++){
                building[i] = Integer.parseInt(st.nextToken());
            }

            int ans = 0;

            for(int i = 2; i < n - 2; i++){
                int left = Math.max(building[i - 2], building[i - 1]);
                int right = Math.max(building[i + 2], building[i + 1]);
                int max = Math.max(left, right);
                if(building[i] - max > 0){
                    ans += building[i] - max;
                }
            }
            System.out.println("#" + tc + " " + ans);
        }//tc
    }
}
