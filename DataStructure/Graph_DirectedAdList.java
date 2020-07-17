package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 
class DirectedAdList_Graph {
    /*
     * 방향성이 있는 그래프를 인접 리스트로 구현
     */
    static int nV; //총 vertex 개수
    static int nE; //총 edge 개수
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        nV = scan.nextInt();
        nE = scan.nextInt();
        ArrayList<ArrayList<Integer>> adList = new <ArrayList<Integer>> ArrayList();
        
        for(int i=0;i<nV;i++) adList.add(new<Integer> ArrayList());
        //adList에 담을 리스트(각 vertex마다 인접한 vertext를 표현한 리스트)
        
        for(int i=0;i<nE;i++) {
            int vertex1, vertex2;
            vertex1 = scan.nextInt();
            vertex2 = scan.nextInt();
            
            adList.get(vertex1).add(vertex2);
        }
        //인접리스트 출력
        for(int i=0;i<nV;i++) {
            Iterator<Integer> iter = adList.get(i).iterator();
            System.out.print(i);
            if(iter.hasNext()) System.out.print("-");
            while(iter.hasNext()) System.out.print(iter.next() + " ");
            System.out.println("");
        }
    }
}