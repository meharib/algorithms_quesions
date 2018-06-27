package trees;

        import org.junit.Test;

/**
 * Created by Mehari on 6/27/18.
 */
public class TopViewTest {
    /*
    116
37 23 108 59 86 64 94 14 105 17 111 65 55 31 79 97 78 25 50 22 66 46 104 98 81 90 68 40 103 77 74
*/
    @Test
    public void test(){
        int[] data = {37,23,108,59,86,64,94,14,105,17,111,65,55,31,79,97,78,25,50,22,66,46,104,98,81,90,68,40,103,77,74};
        Node root = TreeUtil.buildTree(data);
        TopView.topView(root);

    }

}