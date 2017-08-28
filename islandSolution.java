import java.io.*;
import java.util.*;

class Solution {

  static int[][] visited;
  static int getNumberOfIslands(int[][] binaryMatrix) {
    
    // your code goes here
    int islandsExplored = 0;
    visited= new int[binaryMatrix.length][binaryMatrix[0].length];
    
    for (int i=0; i< binaryMatrix.length; i++){
      for (int j=0; j < binaryMatrix[0].length; j++){
        if ( binaryMatrix[i][j] == 1 && visited[i][j] != 1){
          exploreIsland( binaryMatrix, i, j );
          islandsExplored += 1;
        }
      }
    }
    
    return islandsExplored;
    
  }
  
  public static void exploreIsland(int[][] binaryMatrix, int row, int column){
    if (row < 0 || column < 0 || row >= binaryMatrix.length || column >= binaryMatrix[0].length || binaryMatrix[row][column] == 0 || visited[row][column] == 1)
      return;
    else{
      // mark the current node as visited
      visited[row][column] = 1;
      exploreIsland(binaryMatrix,row,column+1);
      exploreIsland(binaryMatrix,row,column-1);
      exploreIsland(binaryMatrix,row+1,column);
      exploreIsland(binaryMatrix,row-1,column);
    }
      return;
  }

  public static void main(String[] args) {

  }

}
