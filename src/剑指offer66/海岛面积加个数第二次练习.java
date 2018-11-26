package 剑指offer66;

import java.util.HashMap;
import java.util.Map;

public class 海岛面积加个数第二次练习 {
	public static Map<Integer,Integer> numIslands(int[][] grid) {
		int res=0;
		int count= 0;
		HashMap<Integer,Integer> s= new HashMap<Integer,Integer>();
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[i].length;j++){
				if(grid[i][j]==1) {
					count++;
					res=Math.max(findmax(grid,i,j),res);
				}
			}
		}
		s.put(count, res);
		return s;
		
	}
	public static int findmax(int[][] x , int i ,int j) {
		if(i<0||j<0||i>=x.length||j>=x[0].length||x[i][j]!=1) return 0;
		
		x[i][j]=0;
		return 1+findmax(x,i-1,j)+findmax(x,i+1,j)+findmax(x,i,j-1)+findmax(x,i,j+1);
		
	}
	public static void main(String args[]) {
		int[][] a = {	{1,1,1,0,0},
						{0,1,0,0,0},
						{1,0,1,1,0},
						{0,0,1,0,0}, 
						{1,0,0,1,1}
			};
		Map<Integer,Integer> res = numIslands(a);
		System.out.println( res.isEmpty());
		for(int num : res.keySet()) {
			int area = res.get(num);
			System.out.println("岛屿个数"+ num+ " 最大面积 "+area);
		}
	}
}
