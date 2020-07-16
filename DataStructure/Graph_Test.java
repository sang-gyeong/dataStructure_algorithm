package DataStructure;

class Graph{
	final int MAX_VERTEX = 30;
	
	int n;
	int [][] adjMatrix;
	
	public Graph() {
		n = 0;
		adjMatrix = new int [MAX_VERTEX][MAX_VERTEX];
		
		for (int i=0; i<MAX_VERTEX; i++) {
			for (int j=0; j<MAX_VERTEX; j++) {
				adjMatrix[i][j] = 0;
			}
		}
	}
	/*
     * 그래프에 정점을 삽입하는 연산
     */

	void insertVertex(int v) {
		if ((n+1) >MAX_VERTEX) {
			System.out.println("정점의 갯수 초과!");
			return;
		}
		n++;
	}
	void insertEdge(int u, int v) {
		if (u >=n || v>=n) {
			System.out.println("그래프에 없는 정점!");
			return;
		}
		adjMatrix[u][v] = 1;
	}
	void printMatrix() {
		for (int i=0; i<n; i++) {
			System.out.println("\n\t");
			for (int j=0; j<n; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
		}
	}
	
}


public class Graph_Test {

	public static void main(String[] args) {
		 Graph g1, g2;
	        
	        g1 = new Graph();
	        g2 = new Graph();
	        
	        for (int i = 0; i < 4; i++) {
	            g1.insertVertex(i);
	        }
	        
	        g1.insertEdge(0, 1);
	        g1.insertEdge(0, 3);
	        g1.insertEdge(1, 0);
	        g1.insertEdge(1, 2);
	        g1.insertEdge(1, 3);
	        g1.insertEdge(2, 1);
	        g1.insertEdge(2, 3);
	        g1.insertEdge(3, 0);
	        g1.insertEdge(3, 1);
	        g1.insertEdge(3, 2);
	        
	        System.out.println("G1의 인접 행렬");
	        g1.printMatrix();
	        
	        System.out.println("\n");
	        for (int i = 0; i < 3; i++) {
	            g2.insertVertex(i);
	        }
	        
	        g2.insertEdge(0, 1);
	        g2.insertEdge(0, 2);
	        g2.insertEdge(1, 0);
	        g2.insertEdge(1, 2);
	        g2.insertEdge(2, 0);
	        g2.insertEdge(2, 1);
	 
	        System.out.println("G2의 인접 행렬");
	        g2.printMatrix();

	}

}
