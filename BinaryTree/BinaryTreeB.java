
import java.util.*;

public class BinaryTreeB {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {

            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree {

        static int idx = -1;

        //TC :O(n)
        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }

        public static void preOrder(Node root) {

            if (root == null) {
                //System.out.print(-1 + " ");
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }

        public static void inOrder(Node root) {

            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

        }

        public static void postOrder(Node root) {

            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }

        public static void levelOrder(Node root) {
            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.offer(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.offer(currNode.right);
                    }

                }

            }
        }

        public static int heightOfTree(Node root) {
            if (root == null) {
                return 0;

            }
            int lH = heightOfTree(root.left);
            int rH = heightOfTree(root.right);
            return Math.max(rH, lH) + 1;

        }

        public static int countOfNode(Node root) {
            if (root == null) {
                return 0;
            }
            int lSubCnt = countOfNode(root.left);
            int rSubCnt = countOfNode(root.right);

            return lSubCnt + rSubCnt + 1;
        }

        public static int sumOfNode(Node root) {
            if (root == null) {
                return 0;
            }
            int lSubCnt = sumOfNode(root.left);
            int rSubCnt = sumOfNode(root.right);

            return lSubCnt + rSubCnt + root.data;
        }

    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        // System.out.println(root.data);
        // System.out.println("PreOrder");
        // bt.preOrder(root);
        // System.out.println();
        // System.out.println("InOrder");
        // bt.inOrder(root);
        // System.out.println();
        // System.out.println("PostOrder");
        // bt.postOrder(root);

        // bt.levelOrder(root);
        // System.out.println("Height : " + bt.heightOfTree(root));
        //System.out.println("countOfNode : " + bt.countOfNode(root));
        System.out.println("sumOfNode : " + bt.sumOfNode(root));

    }
}
