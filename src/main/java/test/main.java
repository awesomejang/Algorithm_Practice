package test;

import java.util.LinkedList;
import java.util.Queue;


class Point {
	public int z,x,y;
	
	Point(int z, int x, int y) {
		this.z = z;
		this.x = x;
		this.y = y;
	}
}
public class main {
	  
	static int[] dz = {1,-1,0,0,0,0};
	static int[] dx = {0,0,-1,0,1,0};
	static int[] dy = {0,0,0,1,0,-1};
	static int startPointZ, startPointX, startPointY;
	static int endPointZ, endPointX, endPointY;
	static int sizeZ, sizeX, sizeY;
	
	static Character[][][] map;
	static int[][][] dis;
	
	
	public void BFS(int z, int x, int y) { 
		  Queue<Point> Q = new LinkedList<Point>();
		  Q.offer(new Point(z, x, y));
		  map[z][x][y] = 'X';
		  while(!Q.isEmpty()) {
			  Point tmp = Q.poll();
			  for (int i = 0; i < dz.length; i++) {
				int nz = tmp.z + dz[i];
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nz >= 0 && nz < sizeZ && nx >= 0 && nx < sizeX && ny >= 0 && ny < sizeY && map[nz][nx][ny] == 'O') {
					map[nz][nx][ny] = 'X';
					Q.offer(new Point(nz, nx, ny));
					dis[nz][nx][ny] = dis[tmp.z][tmp.x][tmp.y] + 1; 
				}
			}
		  }
	  }
	
	public int solution(String[][] map3d) {
		int answer = 0;
		sizeZ = map3d.length;
		sizeX = map3d[0].length;
		sizeY = map3d[0][1].length();
		map = new Character[sizeZ][sizeX][sizeY];
		dis = new int[sizeZ][sizeX][sizeY];
		int Z = 0;
		
		for (int z = map3d.length-1; z >= 0; z--) {
			for (int x = 0; x < map3d[z].length; x++) {
				for (int y = 0; y < map3d[z][x].length(); y++) {
					Character target = map3d[z][x].charAt(y);
					if(target.equals('S')) {
						startPointZ = Z;
						startPointX = x;
						startPointY = y;
					}
					if(target.equals('E')) {
						endPointZ = Z;
						endPointX = x;
						endPointY = y;
					}
					map[Z][x][y] = map3d[z][x].charAt(y);
				}
			}
			Z++;
		}
		
		this.BFS(startPointZ, startPointX, startPointY);
		if(dis[endPointZ][endPointX][endPointY] == 0) answer = -1;
		else answer = dis[endPointZ][endPointX][endPointY];
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		main m = new main();
		String[][] t = {{"SOXX", "OOXX"}, {"XXOO", "XXOE"}};
		System.out.println(m.solution(t));
	}
}
