package DataStructure;

import java.util.Scanner;

public class Graph_DirectedAdMatrix {
    
    /*
     * 인접행렬을 이용해 구현한 방향성 그래프
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
            adMatrix[vertex2][vertex1] = 1;
        }
        
    
        for(int i=0;i<nV;i++) {
            System.out.print(i + "-" );
            for(int j=0;j<nV;j++) {
                System.out.print(adMatrix[j][i]+ " ");
            }
            System.out.println();
        }
    }    
}