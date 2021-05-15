import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class PrimsAlgorithm{

	private final int WIDTH;
    private final int LENGTH;
    public static char charPassage = ' ';
    public static char charWall = 'X';
    public static boolean wall = false;
    public static boolean passage = true;
    private boolean map[][];

    public PrimsAlgorithm(int width,  int length ){
        this.WIDTH = width;
        this.LENGTH = length;
        this.map = new boolean[WIDTH][LENGTH];

        LinkedList<int[]> maze = new LinkedList<>();
        Random random = new Random();
        int x = random.nextInt(WIDTH);
    	int y = random.nextInt(LENGTH);
    	maze.add(new int[]{x,y,x,y});

    	while (!maze.isEmpty()){

            int[] p = maze.remove(random.nextInt(maze.size()));
            x = p[2];
            y = p[3];
            //boolean temp = new boolean[]{x, y};
            //map[x][y] = temp;

            if (map[x][y] == wall)
            {
                
            	map[p[0]][p[1]] = map[x][y] = passage;

            }

            if (y >= 2) {
				int[] p1 = new int[]{x, y - 1, x, y - 2};

				if (map[x][y - 2] == wall) {

				  if (!maze.contains(p1)) {

				    maze.add(p1);

				  }
				} 
			}

			if (x >= 2) {
				int[] p1 = new int[]{x - 1, y, x - 2, y};

				if (map[x - 2][y] == wall) {

				  if (!maze.contains(p1)) {

				    maze.add(p1);

				  }
				} 
			}

			if (y < LENGTH - 2) {
				int[] p1 = new int[]{x, y + 1, x, y + 2};

				if (map[x][y + 2] == wall) {

				 if (!maze.contains(p1)) {

				    maze.add(p1);

				  }
				} 
			}

			if (x < WIDTH - 2) {
				int[] p1 = new int[]{x + 1, y, x + 2, y};

				if (map[x + 2][y] == wall) {

				  if (!maze.contains(p1)) {

				    maze.add(p1);

				  }
				} 
			}
            
        }
    }

    public String toString(){

        StringBuffer s1 = new StringBuffer();

        for ( int x = 0; x < WIDTH + 2; x++ ){

        	s1.append(charWall);

        }

        s1.append( '\n' );

        for ( int y = 0; y < LENGTH; y++ ){

            s1.append( charWall );
            for ( int x = 0; x < WIDTH; x++ ){

                s1.append( map[x][y] == wall ? charWall : charPassage );

            }

            s1.append( charWall );
            s1.append( '\n' );

        }

        for ( int x = 0; x < WIDTH + 2; x++ ){

            s1.append( charWall );

        }

        s1.append( '\n' );
        return s1.toString();
    }



    public static void main(String[] args){

        PrimsAlgorithm m1 = new PrimsAlgorithm(50,50);


        System.out.println(m1.toString());

    }




}