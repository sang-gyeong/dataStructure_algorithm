package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



class Graph_UndirectedAdList {
    /*
     * 비방향 그래프를 인접리스트를 통해 구현
     * 비항향 그래프를 구현하기 위해 방향성 그래프로 변환하여 구현
     * 그렇기에 edge정보를 담기위한 공간이 방향성 그래프에비해 많이듬(2배)
     * 정점과 간선의 개수가 증가하면 증가할수록 공간이 많이 필요하다.
     * 이를 해결하기 위해 인접행렬이 나옴
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
            
            adList.get(vertex1).add(vertex2);//비방향 그래프이기 때문에 번갈아서 구현
            adList.get(vertex2).add(vertex1);//비방향 그래프를 방향성그래프로 변환하여 구현하기에
                                             //번갈아서 edge를 구현해야한다.
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