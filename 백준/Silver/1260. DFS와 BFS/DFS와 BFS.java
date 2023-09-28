
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Scanner;




public class Main {
    public static int N;
    public static int M;
    public static int V;

    public static boolean[] visited;

    public static ArrayList<Integer>[] graph;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        //정점의 개수
        N = Integer.parseInt(st.nextToken());

        //간선의 갯수
        M = Integer.parseInt(st.nextToken());

        //탐색을 시작할 정점의 번호
        V = Integer.parseInt(st.nextToken());


        graph = new ArrayList[N+1];

        for(int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            graph[node1].add(node2);
            graph[node2].add(node1);
        }

        for(int i = 0; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[N+1];

        DFS(V);

        System.out.println();

        visited = new boolean[N+1];
        BFS(V);

    }

    public static void DFS(int v) {
        visited[v] = true;

        System.out.print(v+" ");

        for(int node : graph[v]) {
            if(!visited[node]) {
                DFS(node);
            }
        }
    }

    public static void BFS(int v) {


        Queue<Integer> q = new LinkedList<>();

        q.offer(v);

        visited[v] = true;

        while(!q.isEmpty()) {
            int num = q.poll();

            System.out.print(num+" ");

            for(int node : graph[num]) {
                if(!visited[node]) {
                    visited[node] = true;
                    q.offer(node);
                }
            }
        }


    }
}
