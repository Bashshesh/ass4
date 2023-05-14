public class Main {
    public static void main(String[] args) {
        //there the 5 assigmnent and code that we don't need, so just ignore it
        BinaryTree tree = new BinaryTree();
        tree.insert(3);
        tree.insert(4);
        tree.insert(1);
        tree.insert(15);
        tree.insert(5);
        tree.insert(2);
        tree.insert(8);
        tree.insert(7);
        tree.inOrder();
        tree.getValue(7);
        /*

                    **     **
                   *  *   *  *
                    *   *   *
                     *  N  *
                      *   *
                       * *
                        *
         */
    }
}