package Labs.Lab9;

public class Lab9 {
  public static void addTo10(int [][] array) {
      for (int i=0;i<array.length;i++){
          int sum = 0;
          int zeroIndex = 0;
          int currentNum;
          for(int j=0;j<array[i].length;j++){
              sum += array[i][j];
              currentNum = array[i][j];
              if (currentNum == 0){
                  zeroIndex = j;
              }
          }
          int leftOver = 10 - sum;
          array[i][zeroIndex] = leftOver;
      }
  }

  public static void setHints(int [][] array){
      for(int i=0;i<array.length;i++){
          for(int j=0;j<array[i].length;j++){
              if (isBomb(array[i][j])){
                  for (int k=-1;k<2;k++){
                      for(int l=-1;l<2;l++){
                          if (isInBounds((i+k),(j+l),array)){
                              int space = array[i+k][j+l];
                              if (!isBomb(space)) {
                                  array[i + k][j + l] += 1;
                              }
                          }
                      }
                  }
              }
          }
      }
  }
   
  public static boolean isInBounds(int i, int j, int[][] board){
         return (i >= 0 && i < board.length) && (j >= 0 && j < board[i].length);
  }

  public static boolean isBomb(int value){
         return value == -1;
  }

   
   public static void main(String[] args) { 
     int [][] matrix = {{6, 3, 2, 0, 4}, {34, 53, 0, 23, 1}, {0, 23, 54, 11, 7}};
     
     int [][] matrix2 = {{-1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, -1, 0, -1},
       {0, 0, 0, -1, 0, 0}, {0, 0, 0, 0, 0, 0}};
     int [][] matrix3 = { { 0, -1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 }, { -1, 0, 0, 0, 0, 0 },
       { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
    
     addTo10(matrix);
     setHints(matrix2);
     setHints(matrix3);
   
  } 
   
 }




