import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/12/18.
 */
public class GraphValidPathTest {

    @Test
    public void testSolve_1() throws Exception {
        GraphValidPath path = new GraphValidPath();
        ArrayList<Integer> xCord = new ArrayList<Integer>();
        ArrayList<Integer> yCord = new ArrayList<Integer>();
        xCord.add(2);
        yCord.add(3);
        String actual = path.solve(2, 3, 1, 1, xCord, yCord);
        assertEquals("NO",actual);

    }
    @Test
    public void testSolve_2() throws Exception {
        GraphValidPath path = new GraphValidPath();
        ArrayList<Integer> xCord = new ArrayList<Integer>();
        ArrayList<Integer> yCord = new ArrayList<Integer>();
        xCord.addAll(Arrays.asList(10,7,7,6,13,13,0,6,7,8,4));
        yCord.addAll(Arrays.asList(10,9,14,4,2,0,10,3,3, 13, 12));

        String actual = path.solve(13, 14, 10, 6, xCord, yCord);
        assertEquals("NO",actual);

    }

    @Test
    public void testSolve_3() throws Exception {
        GraphValidPath path = new GraphValidPath();
        ArrayList<Integer> xCord = new ArrayList<Integer>();
        ArrayList<Integer> yCord = new ArrayList<Integer>();
        xCord.addAll(Arrays.asList(9 ,3 ,3 ,0 ,11 ,8 ,11 ,14 ,8 ,4));
        yCord.addAll(Arrays.asList(9 ,1 ,0 ,2 ,2 ,0 ,2 ,3 ,2 ,1));

        String actual = path.solve(14, 3, 9, 0, xCord, yCord);
        assertEquals("NO",actual);

    }
    @Test
    public void testSolve_4() throws Exception {
        GraphValidPath path = new GraphValidPath();
        ArrayList<Integer> xCord = new ArrayList<Integer>();
        ArrayList<Integer> yCord = new ArrayList<Integer>();
        xCord.addAll(Arrays.asList(2 ,3 ,55));
        yCord.addAll(Arrays.asList(2 ,18, 83));

        String actual = path.solve(61 ,88, 2, 9, xCord, yCord);
        assertEquals("NO",actual);

    }

    @Test
    public void testSolve_5() throws Exception {
        GraphValidPath path = new GraphValidPath();
        ArrayList<Integer> xCord = new ArrayList<Integer>();
        ArrayList<Integer> yCord = new ArrayList<Integer>();
        xCord.addAll(Arrays.asList(5 ,17, 16, 12, 0, 40));
        yCord.addAll(Arrays.asList(5 ,52 ,61 ,61 ,25 ,31));

        String actual = path.solve(41 ,67 ,5 ,0, xCord, yCord);
        assertEquals("YES",actual);

    }



    @Test
    public void testSolve_6() throws Exception {
        GraphValidPath path = new GraphValidPath();
        ArrayList<Integer> xCord = new ArrayList<Integer>();
        ArrayList<Integer> yCord = new ArrayList<Integer>();
        xCord.addAll(Arrays.asList(6 ,25 ,33 ,28 ,16 ,15 ,11));
        yCord.addAll(Arrays.asList(6 ,19 ,7 ,3 ,24 ,17 ,2));

        String actual = path.solve(35 ,26 ,6 ,8, xCord, yCord);
        assertEquals("NO",actual);

    }


}