package DataStructure;

import java.util.*;

public class Graph_UndirectedADMatrix {
    
    /*
     * 인접행렬을 이용해 구현한 비방향성 그래프
     */
    
    static int nV; //총 vertex 수
    static int nE; //총 edge 수
    static int[][] adMatrix;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nV = scan.nextInt();
        nE = scan.nextInt();
        
        adMatrix = new int[nV][nV];
        
        for(int i=0;i<nE;i++) {
            int vertex1, vertex2;
            vertex1 = scan.nextInt();
            vertex2 = scan.nextInt();
            adMatrix[vertex2][vertex1] = 1; //비방향성이기에 같이 표현
            adMatrix[vertex1][vertex2] = 1;
        }
        
    
        for(int i=0;i<nV;i++) {
            System.out.print(i + "-" );
            for(int j=0;j<nV;j++) {
                System.out.print(adMatrix[j][i]+ " ");
            }
            System.out.println();
        }
    }
    
    /*
     * 공간 복잡도가 vertex의 수 * vertex의 수
     * 공간이 항상 미리 정해지기에 edge가 vertex에 비해 적을 경우
     * 공간 낭비가 일어난다.
     * 
     * 그래프가 드문드문이면 인접리스트 E<V*V
     * 촘촘하면 인접행렬 (행렬은 1비트만 사용)
     * 
     * 간선을 찾는데 걸리는 시간
     * 인접행렬 : 1
     * 인접리스트 : V
     * 
     * 모든 간선을 찾거나 방문하는데 걸리는 시간
     * 인접행렬 : V*V
     * 인접리스트 : V+E
     */
}