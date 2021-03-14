package demo.suanfa;

import java.util.ArrayList;
import java.util.List;

public class BinTreeTest {
    private BinTreeTest lChild;
    private BinTreeTest rChild;
    private BinTreeTest root;
    private Object data;

    public BinTreeTest() {
        super();
    }

    public BinTreeTest(Object data) {
        this.data = data;
    }

    public BinTreeTest(BinTreeTest lChild, BinTreeTest rChild, Object data) {
        this.lChild = lChild;
        this.rChild = rChild;
        this.data = data;
    }

    private void createTree(Object[] objects) {
        List<BinTreeTest> datas = new ArrayList<>();
        for (Object obj : objects) {
            datas.add(new BinTreeTest(obj));
        }
        root = datas.get(0);
        for (int i = 0; i < objects.length / 2; i++) {
            datas.get(i).lChild = datas.get(2 * i + 1);
            if (2 * i + 2 < objects.length) {
                datas.get(i).rChild = datas.get(2 * i + 2);
            }
        }
    }

    private void visit(Object data) {
        System.out.print(data + " ");
    }

    private void preOrder(BinTreeTest root) {
        if (root != null) {
            visit(root.getData());
            preOrder(root.lChild);
            preOrder(root.rChild);
        }
    }

    private Object getData() {
        return data;
    }

    public static void main(String[] args) {
        Object[] objs = {0, 1, 2, 3, 4, 5, 6, 7};
        BinTreeTest binTreeTest = new BinTreeTest();
        binTreeTest.createTree(objs);
        binTreeTest.preOrder(binTreeTest.getRoot());
    }

    private BinTreeTest getRoot() {
        return root;
    }
}
