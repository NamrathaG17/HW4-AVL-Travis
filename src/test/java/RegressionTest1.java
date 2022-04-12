import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        Avltree.AVLTree.Node node16 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        Avltree.AVLTree.Node node20 = aVLTree11.find((int) ' ');
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        Avltree.AVLTree.Node node25 = aVLTree21.find((int) 'a');
        aVLTree21.delete((int) (short) 10);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.insert((int) (byte) 100);
        aVLTree28.insert((int) 'a');
        Avltree.AVLTree.Node node36 = aVLTree28.find((int) (byte) 100);
        int int37 = aVLTree21.getBalance(node36);
        int int38 = aVLTree11.getBalance(node36);
        int int39 = aVLTree0.getBalance(node36);
        Avltree.AVLTree.Node node40 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(node40);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) (byte) -1);
        Avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(10);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        aVLTree0.insert((int) (short) 100);
        java.lang.Class<?> wildcardClass44 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        int int4 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.find(1);
        Avltree.AVLTree.Node node9 = aVLTree0.find(10);
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) (byte) -1);
        int int15 = aVLTree10.height();
        int int16 = aVLTree10.height();
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) '#');
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        Avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree10.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        Avltree.AVLTree.Node node38 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node38);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        Avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        Avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        int int51 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        Avltree.AVLTree.Node node54 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node55 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        Avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        Avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        Avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree25.getBalance(node28);
        aVLTree25.insert((int) (short) 100);
        Avltree.AVLTree.Node node33 = aVLTree25.find((int) ' ');
        int int34 = aVLTree25.height();
        Avltree.AVLTree.Node node35 = aVLTree25.getRoot();
        int int36 = aVLTree19.getBalance(node35);
        int int37 = aVLTree16.getBalance(node35);
        Avltree.AVLTree.Node node39 = aVLTree16.find((int) 'a');
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        Avltree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        int int46 = aVLTree40.height();
        Avltree.AVLTree.Node node48 = aVLTree40.find((int) (short) -1);
        Avltree.AVLTree.Node node49 = aVLTree40.getRoot();
        Avltree.AVLTree aVLTree50 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        aVLTree50.insert((int) (byte) 100);
        aVLTree50.insert((int) 'a');
        Avltree.AVLTree.Node node58 = aVLTree50.find((int) (byte) 100);
        Avltree.AVLTree aVLTree59 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        Avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        aVLTree59.delete(0);
        Avltree.AVLTree.Node node67 = null;
        int int68 = aVLTree59.getBalance(node67);
        int int69 = aVLTree59.height();
        Avltree.AVLTree aVLTree70 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        Avltree.AVLTree.Node node73 = aVLTree70.getRoot();
        aVLTree70.delete(100);
        aVLTree70.insert((int) (byte) 10);
        Avltree.AVLTree.Node node78 = aVLTree70.getRoot();
        int int79 = aVLTree59.getBalance(node78);
        int int80 = aVLTree50.getBalance(node78);
        int int81 = aVLTree40.getBalance(node78);
        int int82 = aVLTree16.getBalance(node78);
        int int83 = aVLTree0.getBalance(node78);
        java.lang.Class<?> wildcardClass84 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (byte) 10);
        Avltree.AVLTree.Node node14 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node12 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node9 = aVLTree0.find(10);
        aVLTree0.insert((int) '#');
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree5.find((int) (byte) 100);
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        Avltree.AVLTree.Node node28 = aVLTree0.getRoot();
        int int29 = aVLTree0.height();
        Avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        int int5 = aVLTree0.height();
        Avltree.AVLTree.Node node7 = aVLTree0.find((-1));
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        Avltree.AVLTree.Node node12 = aVLTree8.find((int) 'a');
        aVLTree8.delete((int) (short) 10);
        int int15 = aVLTree8.height();
        aVLTree8.delete((int) '#');
        aVLTree8.delete((int) (short) -1);
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.delete((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree20.getRoot();
        Avltree.AVLTree.Node node26 = null;
        int int27 = aVLTree20.getBalance(node26);
        Avltree.AVLTree.Node node29 = aVLTree20.find((int) ' ');
        aVLTree20.insert((-1));
        Avltree.AVLTree.Node node32 = aVLTree20.getRoot();
        aVLTree20.delete((int) (byte) -1);
        aVLTree20.insert(0);
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        aVLTree46.delete((int) 'a');
        Avltree.AVLTree.Node node51 = aVLTree46.getRoot();
        aVLTree46.delete(0);
        Avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree46.getBalance(node54);
        int int56 = aVLTree46.height();
        Avltree.AVLTree aVLTree57 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node59 = aVLTree57.find((int) '4');
        Avltree.AVLTree.Node node60 = aVLTree57.getRoot();
        aVLTree57.delete(100);
        aVLTree57.insert((int) (byte) 10);
        Avltree.AVLTree.Node node65 = aVLTree57.getRoot();
        int int66 = aVLTree46.getBalance(node65);
        int int67 = aVLTree37.getBalance(node65);
        Avltree.AVLTree.Node node68 = aVLTree37.getRoot();
        Avltree.AVLTree.Node node69 = aVLTree37.getRoot();
        int int70 = aVLTree20.getBalance(node69);
        Avltree.AVLTree.Node node71 = aVLTree20.getRoot();
        int int72 = aVLTree8.getBalance(node71);
        int int73 = aVLTree0.getBalance(node71);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        Avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        Avltree.AVLTree.Node node47 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node48 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        Avltree.AVLTree.Node node10 = aVLTree0.find(100);
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) '4');
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.insert((int) (short) 0);
        Avltree.AVLTree.Node node16 = aVLTree10.find(100);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        Avltree.AVLTree.Node node31 = aVLTree28.getRoot();
        aVLTree28.delete(100);
        aVLTree28.insert((int) (byte) 10);
        Avltree.AVLTree.Node node36 = aVLTree28.getRoot();
        int int37 = aVLTree17.getBalance(node36);
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        aVLTree38.delete((int) 'a');
        Avltree.AVLTree.Node node43 = aVLTree38.getRoot();
        aVLTree38.delete(0);
        Avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree38.getBalance(node46);
        int int48 = aVLTree38.height();
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        Avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.delete(100);
        aVLTree49.insert((int) (byte) 10);
        Avltree.AVLTree.Node node57 = aVLTree49.getRoot();
        int int58 = aVLTree38.getBalance(node57);
        int int59 = aVLTree17.getBalance(node57);
        int int60 = aVLTree10.getBalance(node57);
        Avltree.AVLTree.Node node61 = aVLTree10.getRoot();
        int int62 = aVLTree0.getBalance(node61);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(10);
        Avltree.AVLTree.Node node13 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        Avltree.AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        Avltree.AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        aVLTree0.insert((int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (short) 100);
        Avltree.AVLTree.Node node26 = aVLTree18.find((int) ' ');
        int int27 = aVLTree18.height();
        Avltree.AVLTree.Node node28 = aVLTree18.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        Avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert(10);
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        Avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        Avltree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        Avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node32 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        aVLTree0.insert(1);
        int int44 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find(0);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        Avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        Avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        Avltree.AVLTree.Node node50 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        aVLTree0.delete(100);
        int int55 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find(0);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (byte) 100);
        Avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node17 = aVLTree0.find((int) '4');
        int int18 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node12 = aVLTree0.find(0);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree15.getBalance(node16);
        aVLTree15.insert((int) (byte) 100);
        aVLTree15.insert((int) 'a');
        Avltree.AVLTree.Node node23 = aVLTree15.find((int) (byte) 100);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        Avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        int int34 = aVLTree24.height();
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        Avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.delete(100);
        aVLTree35.insert((int) (byte) 10);
        Avltree.AVLTree.Node node43 = aVLTree35.getRoot();
        int int44 = aVLTree24.getBalance(node43);
        int int45 = aVLTree15.getBalance(node43);
        Avltree.AVLTree.Node node46 = aVLTree15.getRoot();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node51 = aVLTree47.find((int) 'a');
        Avltree.AVLTree.Node node53 = aVLTree47.find((int) ' ');
        Avltree.AVLTree.Node node55 = aVLTree47.find(0);
        Avltree.AVLTree aVLTree56 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        aVLTree56.delete((int) 'a');
        aVLTree56.delete(1);
        aVLTree56.delete((int) '#');
        aVLTree56.delete((int) (short) -1);
        Avltree.AVLTree.Node node67 = aVLTree56.getRoot();
        Avltree.AVLTree.Node node69 = aVLTree56.find((int) (byte) 100);
        int int70 = aVLTree56.height();
        Avltree.AVLTree aVLTree71 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node73 = aVLTree71.find((int) '4');
        Avltree.AVLTree.Node node74 = aVLTree71.getRoot();
        aVLTree71.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree77 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node79 = aVLTree77.find((int) '4');
        Avltree.AVLTree.Node node81 = aVLTree77.find((int) 'a');
        aVLTree77.delete((int) (short) 10);
        Avltree.AVLTree aVLTree84 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node85 = null;
        int int86 = aVLTree84.getBalance(node85);
        aVLTree84.insert((int) (byte) 100);
        aVLTree84.insert((int) 'a');
        Avltree.AVLTree.Node node92 = aVLTree84.find((int) (byte) 100);
        int int93 = aVLTree77.getBalance(node92);
        int int94 = aVLTree71.getBalance(node92);
        int int95 = aVLTree56.getBalance(node92);
        int int96 = aVLTree47.getBalance(node92);
        int int97 = aVLTree15.getBalance(node92);
        int int98 = aVLTree0.getBalance(node92);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        Avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        Avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node18 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        aVLTree26.delete((int) 'a');
        Avltree.AVLTree.Node node31 = aVLTree26.getRoot();
        aVLTree26.delete(0);
        Avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree26.getBalance(node34);
        int int36 = aVLTree26.height();
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        Avltree.AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.delete(100);
        aVLTree37.insert((int) (byte) 10);
        Avltree.AVLTree.Node node45 = aVLTree37.getRoot();
        int int46 = aVLTree26.getBalance(node45);
        int int47 = aVLTree17.getBalance(node45);
        Avltree.AVLTree.Node node48 = aVLTree17.getRoot();
        Avltree.AVLTree.Node node49 = aVLTree17.getRoot();
        int int50 = aVLTree0.getBalance(node49);
        Avltree.AVLTree.Node node52 = aVLTree0.find((int) 'a');
        int int53 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        Avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        Avltree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        Avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node36 = aVLTree32.find((int) 'a');
        Avltree.AVLTree.Node node38 = aVLTree32.find((int) ' ');
        Avltree.AVLTree.Node node40 = aVLTree32.find(0);
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        aVLTree41.delete(1);
        aVLTree41.delete((int) '#');
        aVLTree41.delete((int) (short) -1);
        Avltree.AVLTree.Node node52 = aVLTree41.getRoot();
        Avltree.AVLTree.Node node54 = aVLTree41.find((int) (byte) 100);
        int int55 = aVLTree41.height();
        Avltree.AVLTree aVLTree56 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        Avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree62 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        Avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        Avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree56.getBalance(node77);
        int int80 = aVLTree41.getBalance(node77);
        int int81 = aVLTree32.getBalance(node77);
        int int82 = aVLTree0.getBalance(node77);
        Avltree.AVLTree.Node node84 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = node12.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree22.getRoot();
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        Avltree.AVLTree.Node node29 = aVLTree24.find((int) (short) -1);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        Avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        aVLTree30.delete(100);
        Avltree.AVLTree aVLTree43 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        Avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        Avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree30.getBalance(node51);
        int int53 = aVLTree24.getBalance(node51);
        int int54 = aVLTree22.getBalance(node51);
        int int55 = aVLTree0.getBalance(node51);
        java.lang.Class<?> wildcardClass56 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        int int11 = aVLTree0.height();
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree7.find((int) 'a');
        int int12 = aVLTree7.height();
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree13.getBalance(node38);
        int int41 = aVLTree7.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree5.find((int) (byte) 100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        Avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        int int24 = aVLTree14.height();
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        Avltree.AVLTree.Node node28 = aVLTree25.getRoot();
        aVLTree25.delete(100);
        aVLTree25.insert((int) (byte) 10);
        Avltree.AVLTree.Node node33 = aVLTree25.getRoot();
        int int34 = aVLTree14.getBalance(node33);
        int int35 = aVLTree5.getBalance(node33);
        Avltree.AVLTree.Node node36 = aVLTree5.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        int int14 = aVLTree8.height();
        Avltree.AVLTree.Node node16 = aVLTree8.find((int) (short) -1);
        Avltree.AVLTree.Node node17 = aVLTree8.getRoot();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert(0);
        aVLTree18.insert((int) (short) 10);
        int int27 = aVLTree18.height();
        aVLTree18.delete((-1));
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) (byte) -1);
        int int35 = aVLTree30.height();
        int int36 = aVLTree30.height();
        Avltree.AVLTree.Node node38 = aVLTree30.find((int) '#');
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node43 = aVLTree39.find((int) 'a');
        aVLTree39.delete((int) (short) 10);
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.insert((int) (byte) 100);
        aVLTree46.insert((int) 'a');
        Avltree.AVLTree.Node node54 = aVLTree46.find((int) (byte) 100);
        int int55 = aVLTree39.getBalance(node54);
        int int56 = aVLTree30.getBalance(node54);
        int int57 = aVLTree18.getBalance(node54);
        int int58 = aVLTree8.getBalance(node54);
        int int59 = aVLTree0.getBalance(node54);
        java.lang.Class<?> wildcardClass60 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 10);
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node18 = aVLTree14.find((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree14.find((int) ' ');
        aVLTree14.delete((int) ' ');
        int int23 = aVLTree14.height();
        aVLTree14.insert((int) (byte) 10);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        Avltree.AVLTree.Node node46 = aVLTree41.getRoot();
        Avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree41.getBalance(node47);
        Avltree.AVLTree.Node node50 = aVLTree41.find((int) ' ');
        Avltree.AVLTree aVLTree51 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node53 = aVLTree51.find((int) '4');
        Avltree.AVLTree.Node node55 = aVLTree51.find((int) 'a');
        aVLTree51.delete((int) (short) 10);
        Avltree.AVLTree aVLTree58 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node59 = null;
        int int60 = aVLTree58.getBalance(node59);
        aVLTree58.insert((int) (byte) 100);
        aVLTree58.insert((int) 'a');
        Avltree.AVLTree.Node node66 = aVLTree58.find((int) (byte) 100);
        int int67 = aVLTree51.getBalance(node66);
        int int68 = aVLTree41.getBalance(node66);
        int int69 = aVLTree32.getBalance(node66);
        int int70 = aVLTree26.getBalance(node66);
        int int71 = aVLTree14.getBalance(node66);
        int int72 = aVLTree0.getBalance(node66);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        Avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        Avltree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        Avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node36 = aVLTree32.find((int) 'a');
        Avltree.AVLTree.Node node38 = aVLTree32.find((int) ' ');
        Avltree.AVLTree.Node node40 = aVLTree32.find(0);
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        aVLTree41.delete(1);
        aVLTree41.delete((int) '#');
        aVLTree41.delete((int) (short) -1);
        Avltree.AVLTree.Node node52 = aVLTree41.getRoot();
        Avltree.AVLTree.Node node54 = aVLTree41.find((int) (byte) 100);
        int int55 = aVLTree41.height();
        Avltree.AVLTree aVLTree56 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        Avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree62 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        Avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        Avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree56.getBalance(node77);
        int int80 = aVLTree41.getBalance(node77);
        int int81 = aVLTree32.getBalance(node77);
        int int82 = aVLTree0.getBalance(node77);
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node86 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNull(node86);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert(0);
        Avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        java.lang.Class<?> wildcardClass18 = node16.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        Avltree.AVLTree.Node node28 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        Avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree29.getBalance(node32);
        Avltree.AVLTree.Node node34 = aVLTree29.getRoot();
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.insert((int) (short) 0);
        Avltree.AVLTree.Node node41 = aVLTree35.find(100);
        Avltree.AVLTree aVLTree42 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        aVLTree42.delete((int) 'a');
        Avltree.AVLTree.Node node47 = aVLTree42.getRoot();
        aVLTree42.delete(0);
        Avltree.AVLTree.Node node50 = null;
        int int51 = aVLTree42.getBalance(node50);
        int int52 = aVLTree42.height();
        Avltree.AVLTree aVLTree53 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        Avltree.AVLTree.Node node56 = aVLTree53.getRoot();
        aVLTree53.delete(100);
        aVLTree53.insert((int) (byte) 10);
        Avltree.AVLTree.Node node61 = aVLTree53.getRoot();
        int int62 = aVLTree42.getBalance(node61);
        Avltree.AVLTree aVLTree63 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        aVLTree63.delete((int) 'a');
        Avltree.AVLTree.Node node68 = aVLTree63.getRoot();
        aVLTree63.delete(0);
        Avltree.AVLTree.Node node71 = null;
        int int72 = aVLTree63.getBalance(node71);
        int int73 = aVLTree63.height();
        Avltree.AVLTree aVLTree74 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node76 = aVLTree74.find((int) '4');
        Avltree.AVLTree.Node node77 = aVLTree74.getRoot();
        aVLTree74.delete(100);
        aVLTree74.insert((int) (byte) 10);
        Avltree.AVLTree.Node node82 = aVLTree74.getRoot();
        int int83 = aVLTree63.getBalance(node82);
        int int84 = aVLTree42.getBalance(node82);
        int int85 = aVLTree35.getBalance(node82);
        int int86 = aVLTree29.getBalance(node82);
        int int87 = aVLTree0.getBalance(node82);
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node91 = aVLTree0.find((int) (byte) 1);
        Avltree.AVLTree.Node node92 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNull(node91);
        org.junit.Assert.assertNull(node92);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        Avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        Avltree.AVLTree.Node node47 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.insert((int) (short) 0);
        Avltree.AVLTree.Node node16 = aVLTree10.find(100);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        Avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree9.getBalance(node15);
        Avltree.AVLTree.Node node18 = aVLTree9.find((int) ' ');
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        Avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree9.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree38.find((int) 'a');
        Avltree.AVLTree.Node node43 = aVLTree38.getRoot();
        Avltree.AVLTree.Node node44 = aVLTree38.getRoot();
        Avltree.AVLTree.Node node45 = aVLTree38.getRoot();
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        Avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree55 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        Avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree55.getBalance(node58);
        aVLTree55.insert((int) (short) 100);
        Avltree.AVLTree.Node node63 = aVLTree55.find((int) ' ');
        int int64 = aVLTree55.height();
        Avltree.AVLTree.Node node65 = aVLTree55.getRoot();
        int int66 = aVLTree49.getBalance(node65);
        int int67 = aVLTree46.getBalance(node65);
        int int68 = aVLTree38.getBalance(node65);
        int int69 = aVLTree0.getBalance(node65);
        Avltree.AVLTree.Node node70 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        Avltree.AVLTree.Node node74 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(node74);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        Avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        Avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        Avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        Avltree.AVLTree.Node node24 = aVLTree0.find((int) (short) 0);
        Avltree.AVLTree.Node node26 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert((int) (short) 100);
        Avltree.AVLTree.Node node20 = aVLTree12.find((int) ' ');
        int int21 = aVLTree12.height();
        Avltree.AVLTree.Node node22 = aVLTree12.getRoot();
        int int23 = aVLTree5.getBalance(node22);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        Avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        int int34 = aVLTree24.height();
        aVLTree24.delete(100);
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        Avltree.AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.delete(100);
        aVLTree37.insert((int) (byte) 10);
        Avltree.AVLTree.Node node45 = aVLTree37.getRoot();
        int int46 = aVLTree24.getBalance(node45);
        int int47 = aVLTree5.getBalance(node45);
        Avltree.AVLTree.Node node48 = aVLTree5.getRoot();
        int int49 = aVLTree0.getBalance(node48);
        Avltree.AVLTree.Node node50 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = null;
        int int8 = aVLTree6.getBalance(node7);
        Avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        int int22 = aVLTree12.height();
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        Avltree.AVLTree.Node node26 = aVLTree23.getRoot();
        aVLTree23.delete(100);
        aVLTree23.insert((int) (byte) 10);
        Avltree.AVLTree.Node node31 = aVLTree23.getRoot();
        int int32 = aVLTree12.getBalance(node31);
        int int33 = aVLTree6.getBalance(node31);
        int int34 = aVLTree0.getBalance(node31);
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        int int38 = aVLTree35.height();
        aVLTree35.insert((-1));
        Avltree.AVLTree.Node node41 = aVLTree35.getRoot();
        int int42 = aVLTree0.getBalance(node41);
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.delete(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        int int18 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        int int21 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        aVLTree9.delete((int) (short) 10);
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.insert((int) (byte) 100);
        aVLTree16.insert((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree16.find((int) (byte) 100);
        int int25 = aVLTree9.getBalance(node24);
        int int26 = aVLTree0.getBalance(node24);
        aVLTree0.insert((int) (byte) 0);
        java.lang.Class<?> wildcardClass29 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((-1));
        int int11 = aVLTree8.height();
        Avltree.AVLTree.Node node12 = aVLTree8.getRoot();
        aVLTree8.insert((int) (byte) 100);
        aVLTree8.delete(100);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree17.getBalance(node27);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        Avltree.AVLTree.Node node34 = aVLTree29.getRoot();
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree29.getBalance(node35);
        Avltree.AVLTree.Node node38 = aVLTree29.find((int) ' ');
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node43 = aVLTree39.find((int) 'a');
        aVLTree39.delete((int) (short) 10);
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.insert((int) (byte) 100);
        aVLTree46.insert((int) 'a');
        Avltree.AVLTree.Node node54 = aVLTree46.find((int) (byte) 100);
        int int55 = aVLTree39.getBalance(node54);
        int int56 = aVLTree29.getBalance(node54);
        int int57 = aVLTree17.getBalance(node54);
        int int58 = aVLTree8.getBalance(node54);
        int int59 = aVLTree0.getBalance(node54);
        aVLTree0.delete((int) '#');
        java.lang.Class<?> wildcardClass62 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((-1));
        int int16 = aVLTree0.height();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass7 = node6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        Avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete((int) (short) 10);
        Avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        Avltree.AVLTree.Node node15 = aVLTree6.getRoot();
        aVLTree6.insert((int) (byte) 100);
        Avltree.AVLTree.Node node18 = aVLTree6.getRoot();
        int int19 = aVLTree0.getBalance(node18);
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree5.find((int) (byte) 100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        Avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        int int24 = aVLTree14.height();
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        Avltree.AVLTree.Node node28 = aVLTree25.getRoot();
        aVLTree25.delete(100);
        aVLTree25.insert((int) (byte) 10);
        Avltree.AVLTree.Node node33 = aVLTree25.getRoot();
        int int34 = aVLTree14.getBalance(node33);
        int int35 = aVLTree5.getBalance(node33);
        Avltree.AVLTree.Node node36 = aVLTree5.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        Avltree.AVLTree.Node node38 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node40 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        Avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        int int23 = aVLTree0.height();
        int int24 = aVLTree0.height();
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        aVLTree25.delete((int) 'a');
        Avltree.AVLTree.Node node30 = aVLTree25.getRoot();
        Avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree25.getBalance(node31);
        Avltree.AVLTree.Node node34 = aVLTree25.find((int) ' ');
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        Avltree.AVLTree.Node node39 = aVLTree35.find((int) 'a');
        aVLTree35.delete((int) (short) 10);
        Avltree.AVLTree aVLTree42 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        aVLTree42.insert((int) (byte) 100);
        aVLTree42.insert((int) 'a');
        Avltree.AVLTree.Node node50 = aVLTree42.find((int) (byte) 100);
        int int51 = aVLTree35.getBalance(node50);
        int int52 = aVLTree25.getBalance(node50);
        int int53 = aVLTree0.getBalance(node50);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete((int) (short) 1);
        aVLTree0.delete(0);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        Avltree.AVLTree.Node node13 = aVLTree7.find(100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        Avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node30 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find(0);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node15 = aVLTree11.find((int) 'a');
        int int16 = aVLTree11.height();
        aVLTree11.delete(1);
        aVLTree11.insert((int) 'a');
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        Avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        int int27 = aVLTree21.height();
        Avltree.AVLTree.Node node29 = aVLTree21.find((int) (short) -1);
        Avltree.AVLTree.Node node30 = aVLTree21.getRoot();
        Avltree.AVLTree aVLTree31 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree31.getBalance(node32);
        aVLTree31.insert((int) (byte) 100);
        aVLTree31.insert((int) 'a');
        Avltree.AVLTree.Node node39 = aVLTree31.find((int) (byte) 100);
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        aVLTree40.delete((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree40.getRoot();
        aVLTree40.delete(0);
        Avltree.AVLTree.Node node48 = null;
        int int49 = aVLTree40.getBalance(node48);
        int int50 = aVLTree40.height();
        Avltree.AVLTree aVLTree51 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node53 = aVLTree51.find((int) '4');
        Avltree.AVLTree.Node node54 = aVLTree51.getRoot();
        aVLTree51.delete(100);
        aVLTree51.insert((int) (byte) 10);
        Avltree.AVLTree.Node node59 = aVLTree51.getRoot();
        int int60 = aVLTree40.getBalance(node59);
        int int61 = aVLTree31.getBalance(node59);
        int int62 = aVLTree21.getBalance(node59);
        int int63 = aVLTree11.getBalance(node59);
        int int64 = aVLTree0.getBalance(node59);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        Avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        int int30 = aVLTree0.height();
        aVLTree0.insert(100);
        Avltree.AVLTree.Node node34 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node36 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNotNull(node36);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.delete((int) (short) -1);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.insert((int) (short) 0);
        Avltree.AVLTree.Node node27 = aVLTree21.find(100);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        Avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        aVLTree49.delete(0);
        Avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree49.getBalance(node57);
        int int59 = aVLTree49.height();
        Avltree.AVLTree aVLTree60 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        Avltree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.delete(100);
        aVLTree60.insert((int) (byte) 10);
        Avltree.AVLTree.Node node68 = aVLTree60.getRoot();
        int int69 = aVLTree49.getBalance(node68);
        int int70 = aVLTree28.getBalance(node68);
        int int71 = aVLTree21.getBalance(node68);
        int int72 = aVLTree13.getBalance(node68);
        int int73 = aVLTree0.getBalance(node68);
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.delete((int) (short) -1);
        int int13 = aVLTree0.height();
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        aVLTree14.delete((int) (byte) -1);
        aVLTree14.delete((int) (byte) 0);
        Avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        Avltree.AVLTree.Node node21 = aVLTree14.find(1);
        Avltree.AVLTree.Node node23 = aVLTree14.find(10);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.delete((int) (byte) -1);
        int int29 = aVLTree24.height();
        int int30 = aVLTree24.height();
        Avltree.AVLTree.Node node32 = aVLTree24.find((int) '#');
        Avltree.AVLTree aVLTree33 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        Avltree.AVLTree.Node node37 = aVLTree33.find((int) 'a');
        aVLTree33.delete((int) (short) 10);
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.insert((int) (byte) 100);
        aVLTree40.insert((int) 'a');
        Avltree.AVLTree.Node node48 = aVLTree40.find((int) (byte) 100);
        int int49 = aVLTree33.getBalance(node48);
        int int50 = aVLTree24.getBalance(node48);
        int int51 = aVLTree14.getBalance(node48);
        int int52 = aVLTree0.getBalance(node48);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        aVLTree7.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node17 = aVLTree13.find((int) 'a');
        aVLTree13.delete((int) (short) 10);
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert((int) 'a');
        Avltree.AVLTree.Node node28 = aVLTree20.find((int) (byte) 100);
        int int29 = aVLTree13.getBalance(node28);
        int int30 = aVLTree7.getBalance(node28);
        Avltree.AVLTree.Node node31 = aVLTree7.getRoot();
        int int32 = aVLTree0.getBalance(node31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) ' ');
        Avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree8.getRoot();
        aVLTree8.delete(0);
        Avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree8.getBalance(node16);
        int int18 = aVLTree8.height();
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree8.getBalance(node27);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        Avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.delete(100);
        int int35 = aVLTree29.height();
        Avltree.AVLTree aVLTree36 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        Avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        Avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        Avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        Avltree.AVLTree aVLTree57 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node59 = aVLTree57.find((int) '4');
        aVLTree57.delete((int) 'a');
        Avltree.AVLTree.Node node62 = aVLTree57.getRoot();
        aVLTree57.delete(0);
        Avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree57.getBalance(node65);
        int int67 = aVLTree57.height();
        Avltree.AVLTree aVLTree68 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        Avltree.AVLTree.Node node71 = aVLTree68.getRoot();
        aVLTree68.delete(100);
        aVLTree68.insert((int) (byte) 10);
        Avltree.AVLTree.Node node76 = aVLTree68.getRoot();
        int int77 = aVLTree57.getBalance(node76);
        int int78 = aVLTree36.getBalance(node76);
        int int79 = aVLTree29.getBalance(node76);
        int int80 = aVLTree8.getBalance(node76);
        int int81 = aVLTree0.getBalance(node76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node12 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        Avltree.AVLTree.Node node29 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (short) 0);
        Avltree.AVLTree.Node node33 = aVLTree0.find(0);
        Avltree.AVLTree.Node node34 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        Avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        Avltree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node27 = aVLTree0.find((int) 'a');
        int int28 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        Avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        Avltree.AVLTree.Node node24 = aVLTree15.find((int) ' ');
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree25.find((int) 'a');
        aVLTree25.delete((int) (short) 10);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        Avltree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        int int41 = aVLTree25.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        int int43 = aVLTree6.getBalance(node40);
        int int44 = aVLTree0.getBalance(node40);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        Avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        Avltree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) (short) 1);
        java.lang.Class<?> wildcardClass26 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert(100);
        Avltree.AVLTree.Node node26 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node26);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        aVLTree0.delete((int) (byte) 100);
        Avltree.AVLTree.Node node45 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node46 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        int int53 = aVLTree47.height();
        Avltree.AVLTree.Node node55 = aVLTree47.find((int) (short) -1);
        Avltree.AVLTree aVLTree56 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        Avltree.AVLTree.Node node59 = null;
        int int60 = aVLTree56.getBalance(node59);
        aVLTree56.insert(0);
        Avltree.AVLTree.Node node63 = aVLTree56.getRoot();
        int int64 = aVLTree47.getBalance(node63);
        int int65 = aVLTree0.getBalance(node63);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        Avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree6.find((int) (byte) 0);
        aVLTree6.delete((int) (byte) 10);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        int int25 = aVLTree19.height();
        aVLTree19.insert(1);
        aVLTree19.insert((int) (short) 10);
        Avltree.AVLTree.Node node31 = aVLTree19.find((int) (short) 1);
        int int32 = aVLTree6.getBalance(node31);
        int int33 = aVLTree0.getBalance(node31);
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) (byte) 100);
        Avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        Avltree.AVLTree.Node node29 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        Avltree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        Avltree.AVLTree.Node node31 = aVLTree0.find((int) (byte) 100);
        int int32 = aVLTree0.height();
        java.lang.Class<?> wildcardClass33 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        int int16 = aVLTree0.height();
        int int17 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(100);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree7.find((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree7.find((int) ' ');
        Avltree.AVLTree.Node node15 = aVLTree7.find((int) '#');
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree16.getBalance(node19);
        aVLTree16.insert((int) (short) 100);
        Avltree.AVLTree.Node node24 = aVLTree16.find((int) ' ');
        int int25 = aVLTree16.height();
        Avltree.AVLTree.Node node26 = aVLTree16.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        int int28 = aVLTree0.getBalance(node26);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        Avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        Avltree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        int int24 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((-1));
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = node18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete(100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree9.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree21.getBalance(node27);
        Avltree.AVLTree.Node node30 = aVLTree21.find((int) ' ');
        Avltree.AVLTree aVLTree31 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree31.find((int) 'a');
        aVLTree31.delete((int) (short) 10);
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.insert((int) 'a');
        Avltree.AVLTree.Node node46 = aVLTree38.find((int) (byte) 100);
        int int47 = aVLTree31.getBalance(node46);
        int int48 = aVLTree21.getBalance(node46);
        int int49 = aVLTree9.getBalance(node46);
        int int50 = aVLTree0.getBalance(node46);
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) ' ');
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        Avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        int int44 = aVLTree0.height();
        Avltree.AVLTree.Node node45 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        int int11 = aVLTree0.height();
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete((int) (short) 10);
        Avltree.AVLTree.Node node20 = aVLTree12.getRoot();
        int int21 = aVLTree12.height();
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        aVLTree22.insert((int) (short) 0);
        Avltree.AVLTree.Node node28 = aVLTree22.find(100);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        Avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.delete(100);
        aVLTree29.insert((int) (byte) 10);
        Avltree.AVLTree.Node node37 = aVLTree29.getRoot();
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree12.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        java.lang.Class<?> wildcardClass41 = node37.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        int int13 = aVLTree0.height();
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node18 = aVLTree14.find((int) 'a');
        Avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        Avltree.AVLTree.Node node20 = aVLTree14.getRoot();
        Avltree.AVLTree.Node node21 = aVLTree14.getRoot();
        aVLTree14.delete((int) (byte) 10);
        int int24 = aVLTree14.height();
        Avltree.AVLTree.Node node26 = aVLTree14.find((int) (short) 10);
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        Avltree.AVLTree.Node node30 = aVLTree27.getRoot();
        aVLTree27.delete(100);
        aVLTree27.insert((int) (byte) 10);
        Avltree.AVLTree.Node node35 = aVLTree27.getRoot();
        int int36 = aVLTree14.getBalance(node35);
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        aVLTree46.delete((int) 'a');
        Avltree.AVLTree.Node node51 = aVLTree46.getRoot();
        aVLTree46.delete(0);
        Avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree46.getBalance(node54);
        int int56 = aVLTree46.height();
        Avltree.AVLTree aVLTree57 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node59 = aVLTree57.find((int) '4');
        Avltree.AVLTree.Node node60 = aVLTree57.getRoot();
        aVLTree57.delete(100);
        aVLTree57.insert((int) (byte) 10);
        Avltree.AVLTree.Node node65 = aVLTree57.getRoot();
        int int66 = aVLTree46.getBalance(node65);
        int int67 = aVLTree37.getBalance(node65);
        Avltree.AVLTree.Node node68 = aVLTree37.getRoot();
        int int69 = aVLTree14.getBalance(node68);
        int int70 = aVLTree0.getBalance(node68);
        int int71 = aVLTree0.height();
        int int72 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.delete((int) (short) -1);
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        aVLTree16.insert((int) (short) 0);
        Avltree.AVLTree.Node node22 = aVLTree16.find(100);
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        Avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        aVLTree23.delete(0);
        Avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree23.getBalance(node31);
        int int33 = aVLTree23.height();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        Avltree.AVLTree.Node node37 = aVLTree34.getRoot();
        aVLTree34.delete(100);
        aVLTree34.insert((int) (byte) 10);
        Avltree.AVLTree.Node node42 = aVLTree34.getRoot();
        int int43 = aVLTree23.getBalance(node42);
        Avltree.AVLTree aVLTree44 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node46 = aVLTree44.find((int) '4');
        aVLTree44.delete((int) 'a');
        Avltree.AVLTree.Node node49 = aVLTree44.getRoot();
        aVLTree44.delete(0);
        Avltree.AVLTree.Node node52 = null;
        int int53 = aVLTree44.getBalance(node52);
        int int54 = aVLTree44.height();
        Avltree.AVLTree aVLTree55 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node57 = aVLTree55.find((int) '4');
        Avltree.AVLTree.Node node58 = aVLTree55.getRoot();
        aVLTree55.delete(100);
        aVLTree55.insert((int) (byte) 10);
        Avltree.AVLTree.Node node63 = aVLTree55.getRoot();
        int int64 = aVLTree44.getBalance(node63);
        int int65 = aVLTree23.getBalance(node63);
        int int66 = aVLTree16.getBalance(node63);
        int int67 = aVLTree8.getBalance(node63);
        int int68 = aVLTree0.getBalance(node63);
        Avltree.AVLTree.Node node69 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(node69);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) (short) 0);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        Avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        int int47 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree9.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree21.getBalance(node27);
        Avltree.AVLTree.Node node30 = aVLTree21.find((int) ' ');
        Avltree.AVLTree aVLTree31 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree31.find((int) 'a');
        aVLTree31.delete((int) (short) 10);
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree38.getBalance(node39);
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.insert((int) 'a');
        Avltree.AVLTree.Node node46 = aVLTree38.find((int) (byte) 100);
        int int47 = aVLTree31.getBalance(node46);
        int int48 = aVLTree21.getBalance(node46);
        int int49 = aVLTree9.getBalance(node46);
        int int50 = aVLTree0.getBalance(node46);
        int int51 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert((int) ' ');
        Avltree.AVLTree.Node node16 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        Avltree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        int int30 = aVLTree24.height();
        Avltree.AVLTree.Node node32 = aVLTree24.find((int) (short) -1);
        Avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        Avltree.AVLTree aVLTree43 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        Avltree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        Avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        Avltree.AVLTree aVLTree54 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        Avltree.AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        Avltree.AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree34.getBalance(node62);
        int int65 = aVLTree24.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        aVLTree0.insert((int) (byte) 1);
        int int69 = aVLTree0.height();
        Avltree.AVLTree.Node node70 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node76 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node76);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 0);
        Avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.insert((int) (short) 0);
        Avltree.AVLTree.Node node12 = aVLTree6.find(100);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        aVLTree24.insert((int) (byte) 10);
        Avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        int int33 = aVLTree13.getBalance(node32);
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        aVLTree34.delete((int) 'a');
        Avltree.AVLTree.Node node39 = aVLTree34.getRoot();
        aVLTree34.delete(0);
        Avltree.AVLTree.Node node42 = null;
        int int43 = aVLTree34.getBalance(node42);
        int int44 = aVLTree34.height();
        Avltree.AVLTree aVLTree45 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        Avltree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.delete(100);
        aVLTree45.insert((int) (byte) 10);
        Avltree.AVLTree.Node node53 = aVLTree45.getRoot();
        int int54 = aVLTree34.getBalance(node53);
        int int55 = aVLTree13.getBalance(node53);
        int int56 = aVLTree6.getBalance(node53);
        int int57 = aVLTree0.getBalance(node53);
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find(10);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) -1);
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree4 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node6 = aVLTree4.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree4.find((int) 'a');
        aVLTree4.insert((int) (short) -1);
        int int11 = aVLTree4.height();
        Avltree.AVLTree.Node node12 = aVLTree4.getRoot();
        int int13 = aVLTree0.getBalance(node12);
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        aVLTree6.delete((int) (short) 10);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        Avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree6.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        Avltree.AVLTree.Node node24 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        Avltree.AVLTree.Node node31 = aVLTree28.getRoot();
        aVLTree28.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        Avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree34.getBalance(node37);
        aVLTree34.insert((int) (short) 100);
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) ' ');
        int int43 = aVLTree34.height();
        Avltree.AVLTree.Node node44 = aVLTree34.getRoot();
        int int45 = aVLTree28.getBalance(node44);
        int int46 = aVLTree25.getBalance(node44);
        Avltree.AVLTree.Node node48 = aVLTree25.find((int) 'a');
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        aVLTree49.delete(1);
        aVLTree49.delete((int) '#');
        aVLTree49.delete((int) (short) -1);
        Avltree.AVLTree.Node node60 = aVLTree49.getRoot();
        aVLTree49.insert(10);
        aVLTree49.delete(1);
        Avltree.AVLTree.Node node65 = aVLTree49.getRoot();
        int int66 = aVLTree49.height();
        aVLTree49.delete((int) 'a');
        Avltree.AVLTree.Node node69 = aVLTree49.getRoot();
        int int70 = aVLTree25.getBalance(node69);
        int int71 = aVLTree0.getBalance(node69);
        int int72 = aVLTree0.height();
        Avltree.AVLTree.Node node74 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node74);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node46 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) (byte) -1);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        Avltree.AVLTree.Node node16 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        Avltree.AVLTree.Node node13 = aVLTree7.find(100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        Avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree22.getRoot();
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        Avltree.AVLTree.Node node29 = aVLTree24.find((int) (short) -1);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        Avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        aVLTree30.delete(100);
        Avltree.AVLTree aVLTree43 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        Avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        Avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree30.getBalance(node51);
        int int53 = aVLTree24.getBalance(node51);
        int int54 = aVLTree22.getBalance(node51);
        int int55 = aVLTree0.getBalance(node51);
        aVLTree0.delete((-1));
        int int58 = aVLTree0.height();
        int int59 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.insert((int) ' ');
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        aVLTree49.insert((int) (short) 1);
        aVLTree49.insert((int) '#');
        aVLTree49.delete(10);
        Avltree.AVLTree.Node node60 = aVLTree49.getRoot();
        int int61 = aVLTree0.getBalance(node60);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        Avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        aVLTree0.delete((int) (byte) 10);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree32.getBalance(node35);
        aVLTree32.insert((int) (short) 100);
        Avltree.AVLTree.Node node40 = aVLTree32.find((int) ' ');
        int int41 = aVLTree32.height();
        Avltree.AVLTree.Node node42 = aVLTree32.getRoot();
        Avltree.AVLTree aVLTree43 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        Avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        Avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        aVLTree43.insert((int) (byte) 100);
        int int54 = aVLTree43.height();
        aVLTree43.delete((int) (byte) 0);
        Avltree.AVLTree.Node node58 = aVLTree43.find(0);
        int int59 = aVLTree43.height();
        Avltree.AVLTree.Node node61 = aVLTree43.find((int) (short) 10);
        int int62 = aVLTree32.getBalance(node61);
        int int63 = aVLTree0.getBalance(node61);
        Avltree.AVLTree.Node node65 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertNull(node65);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        aVLTree0.insert((int) '#');
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        int int22 = aVLTree0.height();
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        Avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        Avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        Avltree.AVLTree.Node node46 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(node46);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) (byte) 1);
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete((int) ' ');
        Avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node15 = aVLTree11.find((int) 'a');
        aVLTree11.delete((int) (short) 10);
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.insert((int) (byte) 100);
        aVLTree18.insert((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree18.find((int) (byte) 100);
        int int27 = aVLTree11.getBalance(node26);
        Avltree.AVLTree.Node node28 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node29 = aVLTree11.getRoot();
        aVLTree11.insert((int) (short) 100);
        Avltree.AVLTree.Node node32 = aVLTree11.getRoot();
        int int33 = aVLTree0.getBalance(node32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        java.lang.Class<?> wildcardClass12 = node11.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 10);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find(0);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        Avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        Avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        Avltree.AVLTree.Node node51 = aVLTree0.find(0);
        Avltree.AVLTree.Node node53 = aVLTree0.find(1);
        int int54 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree5.getBalance(node6);
        aVLTree5.insert((int) (byte) 100);
        aVLTree5.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree5.find((int) (byte) 100);
        int int14 = aVLTree0.getBalance(node13);
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree0.getBalance(node15);
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node46 = aVLTree0.find(100);
        Avltree.AVLTree.Node node47 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node48 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node49 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        Avltree.AVLTree.Node node13 = aVLTree7.find(100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        Avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        java.lang.Class<?> wildcardClass25 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) '4');
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        Avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        Avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        Avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 0);
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node18 = aVLTree0.find((int) (short) 1);
        Avltree.AVLTree.Node node19 = aVLTree0.getRoot();
        int int20 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.find(10);
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((-1));
        int int16 = aVLTree13.height();
        Avltree.AVLTree.Node node18 = aVLTree13.find((int) (byte) 100);
        aVLTree13.delete((int) (short) 100);
        int int21 = aVLTree13.height();
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree22.getBalance(node25);
        aVLTree22.insert(0);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        Avltree.AVLTree.Node node36 = aVLTree29.getRoot();
        int int37 = aVLTree22.getBalance(node36);
        Avltree.AVLTree.Node node39 = aVLTree22.find((int) (short) 100);
        aVLTree22.delete((int) (short) -1);
        Avltree.AVLTree.Node node43 = aVLTree22.find(0);
        int int44 = aVLTree13.getBalance(node43);
        int int45 = aVLTree0.getBalance(node43);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        Avltree.AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        Avltree.AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        aVLTree0.insert((int) (short) 1);
        int int20 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        aVLTree8.delete(1);
        aVLTree8.delete((int) '#');
        aVLTree8.delete((int) (short) -1);
        Avltree.AVLTree.Node node19 = aVLTree8.getRoot();
        aVLTree8.insert(10);
        aVLTree8.delete(1);
        Avltree.AVLTree.Node node24 = aVLTree8.getRoot();
        int int25 = aVLTree8.height();
        aVLTree8.delete((int) 'a');
        Avltree.AVLTree.Node node28 = aVLTree8.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        java.lang.Class<?> wildcardClass30 = node28.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.insert(10);
        aVLTree0.delete((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) (byte) 100);
        Avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        Avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        Avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete((-1));
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        Avltree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree24.getBalance(node25);
        aVLTree24.insert((int) (byte) 100);
        aVLTree24.insert((int) 'a');
        Avltree.AVLTree.Node node32 = aVLTree24.find((int) (byte) 100);
        Avltree.AVLTree aVLTree33 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        Avltree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        Avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        int int43 = aVLTree33.height();
        Avltree.AVLTree aVLTree44 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node46 = aVLTree44.find((int) '4');
        Avltree.AVLTree.Node node47 = aVLTree44.getRoot();
        aVLTree44.delete(100);
        aVLTree44.insert((int) (byte) 10);
        Avltree.AVLTree.Node node52 = aVLTree44.getRoot();
        int int53 = aVLTree33.getBalance(node52);
        int int54 = aVLTree24.getBalance(node52);
        Avltree.AVLTree.Node node55 = aVLTree24.getRoot();
        int int56 = aVLTree0.getBalance(node55);
        Avltree.AVLTree aVLTree57 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node59 = aVLTree57.find((int) '4');
        aVLTree57.delete((int) 'a');
        Avltree.AVLTree.Node node62 = aVLTree57.getRoot();
        aVLTree57.delete(0);
        Avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree57.getBalance(node65);
        int int67 = aVLTree57.height();
        Avltree.AVLTree aVLTree68 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        Avltree.AVLTree.Node node71 = aVLTree68.getRoot();
        aVLTree68.delete(100);
        aVLTree68.insert((int) (byte) 10);
        Avltree.AVLTree.Node node76 = aVLTree68.getRoot();
        int int77 = aVLTree57.getBalance(node76);
        int int78 = aVLTree0.getBalance(node76);
        int int79 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        Avltree.AVLTree.Node node18 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree.Node node20 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((-1));
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        Avltree.AVLTree.Node node19 = aVLTree16.getRoot();
        Avltree.AVLTree.Node node21 = aVLTree16.find((int) (short) -1);
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        aVLTree22.delete((int) 'a');
        Avltree.AVLTree.Node node27 = aVLTree22.getRoot();
        aVLTree22.delete(0);
        Avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree22.getBalance(node30);
        int int32 = aVLTree22.height();
        aVLTree22.delete(100);
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        Avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.delete(100);
        aVLTree35.insert((int) (byte) 10);
        Avltree.AVLTree.Node node43 = aVLTree35.getRoot();
        int int44 = aVLTree22.getBalance(node43);
        int int45 = aVLTree16.getBalance(node43);
        Avltree.AVLTree.Node node46 = aVLTree16.getRoot();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((-1));
        int int50 = aVLTree47.height();
        Avltree.AVLTree.Node node51 = aVLTree47.getRoot();
        aVLTree47.insert((int) (byte) 100);
        aVLTree47.delete(100);
        Avltree.AVLTree aVLTree56 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        aVLTree56.delete((int) 'a');
        Avltree.AVLTree.Node node61 = aVLTree56.getRoot();
        aVLTree56.delete(0);
        Avltree.AVLTree.Node node64 = null;
        int int65 = aVLTree56.getBalance(node64);
        Avltree.AVLTree.Node node66 = null;
        int int67 = aVLTree56.getBalance(node66);
        Avltree.AVLTree aVLTree68 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        aVLTree68.delete((int) 'a');
        Avltree.AVLTree.Node node73 = aVLTree68.getRoot();
        Avltree.AVLTree.Node node74 = null;
        int int75 = aVLTree68.getBalance(node74);
        Avltree.AVLTree.Node node77 = aVLTree68.find((int) ' ');
        Avltree.AVLTree aVLTree78 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node80 = aVLTree78.find((int) '4');
        Avltree.AVLTree.Node node82 = aVLTree78.find((int) 'a');
        aVLTree78.delete((int) (short) 10);
        Avltree.AVLTree aVLTree85 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node86 = null;
        int int87 = aVLTree85.getBalance(node86);
        aVLTree85.insert((int) (byte) 100);
        aVLTree85.insert((int) 'a');
        Avltree.AVLTree.Node node93 = aVLTree85.find((int) (byte) 100);
        int int94 = aVLTree78.getBalance(node93);
        int int95 = aVLTree68.getBalance(node93);
        int int96 = aVLTree56.getBalance(node93);
        int int97 = aVLTree47.getBalance(node93);
        int int98 = aVLTree16.getBalance(node93);
        int int99 = aVLTree0.getBalance(node93);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(node93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node16 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        Avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node21 = aVLTree0.find(0);
        Avltree.AVLTree.Node node22 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(1);
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((-1));
        aVLTree13.delete(100);
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.insert((int) (byte) 100);
        aVLTree18.insert((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree18.find((int) (byte) 100);
        int int27 = aVLTree13.getBalance(node26);
        int int28 = aVLTree0.getBalance(node26);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        Avltree.AVLTree aVLTree42 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        Avltree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        Avltree.AVLTree.Node node50 = aVLTree42.getRoot();
        aVLTree42.insert((int) (byte) 100);
        int int53 = aVLTree42.height();
        aVLTree42.delete((int) (byte) 0);
        Avltree.AVLTree.Node node57 = aVLTree42.find(0);
        Avltree.AVLTree.Node node58 = aVLTree42.getRoot();
        int int59 = aVLTree0.getBalance(node58);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        Avltree.AVLTree.Node node13 = aVLTree7.find(100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        Avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        int int25 = aVLTree0.height();
        aVLTree0.delete(10);
        java.lang.Class<?> wildcardClass28 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete((int) (short) 10);
        Avltree.AVLTree.Node node20 = aVLTree12.getRoot();
        Avltree.AVLTree.Node node21 = aVLTree12.getRoot();
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.insert((int) (byte) 100);
        aVLTree22.insert((int) 'a');
        Avltree.AVLTree.Node node30 = aVLTree22.find((int) (byte) 100);
        int int31 = aVLTree12.getBalance(node30);
        int int32 = aVLTree0.getBalance(node30);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree35.getBalance(node36);
        Avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        Avltree.AVLTree.Node node46 = aVLTree41.getRoot();
        aVLTree41.delete(0);
        Avltree.AVLTree.Node node49 = null;
        int int50 = aVLTree41.getBalance(node49);
        int int51 = aVLTree41.height();
        Avltree.AVLTree aVLTree52 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        Avltree.AVLTree.Node node55 = aVLTree52.getRoot();
        aVLTree52.delete(100);
        aVLTree52.insert((int) (byte) 10);
        Avltree.AVLTree.Node node60 = aVLTree52.getRoot();
        int int61 = aVLTree41.getBalance(node60);
        int int62 = aVLTree35.getBalance(node60);
        aVLTree35.insert((int) (byte) 0);
        Avltree.AVLTree.Node node66 = aVLTree35.find(100);
        int int67 = aVLTree0.getBalance(node66);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        Avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        Avltree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        int int24 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((-1));
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        int int3 = aVLTree0.height();
        aVLTree0.insert(1);
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.insert((int) (byte) 100);
        aVLTree14.insert((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree14.find((int) (byte) 100);
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        Avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        aVLTree23.delete(0);
        Avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree23.getBalance(node31);
        int int33 = aVLTree23.height();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        Avltree.AVLTree.Node node37 = aVLTree34.getRoot();
        aVLTree34.delete(100);
        aVLTree34.insert((int) (byte) 10);
        Avltree.AVLTree.Node node42 = aVLTree34.getRoot();
        int int43 = aVLTree23.getBalance(node42);
        int int44 = aVLTree14.getBalance(node42);
        Avltree.AVLTree.Node node45 = aVLTree14.getRoot();
        Avltree.AVLTree.Node node46 = aVLTree14.getRoot();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        aVLTree47.delete((int) 'a');
        Avltree.AVLTree.Node node52 = aVLTree47.getRoot();
        aVLTree47.delete(0);
        Avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree47.getBalance(node55);
        Avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree47.getBalance(node57);
        Avltree.AVLTree aVLTree59 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        Avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        Avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree59.getBalance(node65);
        Avltree.AVLTree.Node node68 = aVLTree59.find((int) ' ');
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        Avltree.AVLTree.Node node73 = aVLTree69.find((int) 'a');
        aVLTree69.delete((int) (short) 10);
        Avltree.AVLTree aVLTree76 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        Avltree.AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        int int85 = aVLTree69.getBalance(node84);
        int int86 = aVLTree59.getBalance(node84);
        int int87 = aVLTree47.getBalance(node84);
        int int88 = aVLTree14.getBalance(node84);
        int int89 = aVLTree7.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node24 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        int int8 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        Avltree.AVLTree.Node node13 = aVLTree7.find(100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        Avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        int int25 = aVLTree0.height();
        Avltree.AVLTree.Node node27 = aVLTree0.find((int) '4');
        int int28 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        Avltree.AVLTree.Node node14 = aVLTree8.find(100);
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        Avltree.AVLTree aVLTree36 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        Avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        Avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        Avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass62 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        int int11 = aVLTree0.height();
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) '4');
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((-1));
        int int16 = aVLTree0.height();
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.insert((int) (byte) 100);
        int int23 = aVLTree17.height();
        aVLTree17.insert(1);
        aVLTree17.insert(0);
        Avltree.AVLTree.Node node28 = aVLTree17.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        Avltree.AVLTree.Node node31 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node31);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        Avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        Avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        Avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node45 = aVLTree0.find(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = null;
        int int8 = aVLTree6.getBalance(node7);
        Avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        int int22 = aVLTree12.height();
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        Avltree.AVLTree.Node node26 = aVLTree23.getRoot();
        aVLTree23.delete(100);
        aVLTree23.insert((int) (byte) 10);
        Avltree.AVLTree.Node node31 = aVLTree23.getRoot();
        int int32 = aVLTree12.getBalance(node31);
        int int33 = aVLTree6.getBalance(node31);
        int int34 = aVLTree0.getBalance(node31);
        Avltree.AVLTree.Node node35 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        Avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        int int27 = aVLTree21.height();
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        Avltree.AVLTree.Node node54 = aVLTree49.getRoot();
        aVLTree49.delete(0);
        Avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree49.getBalance(node57);
        int int59 = aVLTree49.height();
        Avltree.AVLTree aVLTree60 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        Avltree.AVLTree.Node node63 = aVLTree60.getRoot();
        aVLTree60.delete(100);
        aVLTree60.insert((int) (byte) 10);
        Avltree.AVLTree.Node node68 = aVLTree60.getRoot();
        int int69 = aVLTree49.getBalance(node68);
        int int70 = aVLTree28.getBalance(node68);
        int int71 = aVLTree21.getBalance(node68);
        int int72 = aVLTree0.getBalance(node68);
        Avltree.AVLTree.Node node73 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node74 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNull(node74);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) (short) -1);
        java.lang.Class<?> wildcardClass16 = node15.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node11 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        Avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        int int16 = aVLTree0.getBalance(node15);
        int int17 = aVLTree0.height();
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        Avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        Avltree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        int int24 = aVLTree0.height();
        Avltree.AVLTree.Node node26 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node28 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        Avltree.AVLTree.Node node6 = aVLTree0.find(100);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        Avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        Avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        Avltree.AVLTree.Node node52 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node52);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        Avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        Avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        java.lang.Class<?> wildcardClass46 = node42.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert(0);
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.insert((int) (byte) 100);
        aVLTree18.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        Avltree.AVLTree.Node node28 = aVLTree11.find((int) (short) 100);
        aVLTree11.delete((int) (short) -1);
        Avltree.AVLTree.Node node32 = aVLTree11.find(0);
        int int33 = aVLTree0.getBalance(node32);
        aVLTree0.insert(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        int int14 = aVLTree9.height();
        aVLTree9.delete(1);
        aVLTree9.insert((int) 'a');
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        int int25 = aVLTree19.height();
        Avltree.AVLTree.Node node27 = aVLTree19.find((int) (short) -1);
        Avltree.AVLTree.Node node28 = aVLTree19.getRoot();
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        Avltree.AVLTree.Node node37 = aVLTree29.find((int) (byte) 100);
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        aVLTree38.delete((int) 'a');
        Avltree.AVLTree.Node node43 = aVLTree38.getRoot();
        aVLTree38.delete(0);
        Avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree38.getBalance(node46);
        int int48 = aVLTree38.height();
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        Avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.delete(100);
        aVLTree49.insert((int) (byte) 10);
        Avltree.AVLTree.Node node57 = aVLTree49.getRoot();
        int int58 = aVLTree38.getBalance(node57);
        int int59 = aVLTree29.getBalance(node57);
        int int60 = aVLTree19.getBalance(node57);
        int int61 = aVLTree9.getBalance(node57);
        int int62 = aVLTree0.getBalance(node57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find(100);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        int int12 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        Avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node46 = aVLTree0.find((int) (short) 1);
        Avltree.AVLTree.Node node47 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass48 = node47.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        aVLTree0.delete(0);
        int int13 = aVLTree0.height();
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree13.getBalance(node19);
        Avltree.AVLTree.Node node22 = aVLTree13.find((int) ' ');
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree23.find((int) 'a');
        aVLTree23.delete((int) (short) 10);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.insert((int) (byte) 100);
        aVLTree30.insert((int) 'a');
        Avltree.AVLTree.Node node38 = aVLTree30.find((int) (byte) 100);
        int int39 = aVLTree23.getBalance(node38);
        int int40 = aVLTree13.getBalance(node38);
        Avltree.AVLTree.Node node42 = aVLTree13.find((int) (short) 0);
        aVLTree13.delete((int) (short) 0);
        Avltree.AVLTree aVLTree45 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        Avltree.AVLTree.Node node49 = aVLTree45.find((int) 'a');
        Avltree.AVLTree.Node node50 = aVLTree45.getRoot();
        Avltree.AVLTree.Node node51 = aVLTree45.getRoot();
        Avltree.AVLTree.Node node52 = aVLTree45.getRoot();
        Avltree.AVLTree aVLTree53 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree53.getBalance(node54);
        Avltree.AVLTree aVLTree56 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        Avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree62 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        Avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree62.getBalance(node65);
        aVLTree62.insert((int) (short) 100);
        Avltree.AVLTree.Node node70 = aVLTree62.find((int) ' ');
        int int71 = aVLTree62.height();
        Avltree.AVLTree.Node node72 = aVLTree62.getRoot();
        int int73 = aVLTree56.getBalance(node72);
        int int74 = aVLTree53.getBalance(node72);
        int int75 = aVLTree45.getBalance(node72);
        int int76 = aVLTree13.getBalance(node72);
        int int77 = aVLTree0.getBalance(node72);
        java.lang.Class<?> wildcardClass78 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 10);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        Avltree.AVLTree.Node node15 = aVLTree9.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        aVLTree9.delete((int) (byte) 10);
        int int19 = aVLTree9.height();
        Avltree.AVLTree.Node node21 = aVLTree9.find((int) (short) 10);
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        Avltree.AVLTree.Node node25 = aVLTree22.getRoot();
        aVLTree22.delete(100);
        aVLTree22.insert((int) (byte) 10);
        Avltree.AVLTree.Node node30 = aVLTree22.getRoot();
        int int31 = aVLTree9.getBalance(node30);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node36 = aVLTree32.find((int) 'a');
        Avltree.AVLTree.Node node38 = aVLTree32.find((int) ' ');
        Avltree.AVLTree.Node node40 = aVLTree32.find(0);
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        aVLTree41.delete(1);
        aVLTree41.delete((int) '#');
        aVLTree41.delete((int) (short) -1);
        Avltree.AVLTree.Node node52 = aVLTree41.getRoot();
        Avltree.AVLTree.Node node54 = aVLTree41.find((int) (byte) 100);
        int int55 = aVLTree41.height();
        Avltree.AVLTree aVLTree56 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        Avltree.AVLTree.Node node59 = aVLTree56.getRoot();
        aVLTree56.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree62 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        Avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        Avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree56.getBalance(node77);
        int int80 = aVLTree41.getBalance(node77);
        int int81 = aVLTree32.getBalance(node77);
        int int82 = aVLTree9.getBalance(node77);
        int int83 = aVLTree0.getBalance(node77);
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) (byte) 10);
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = node10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        Avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        Avltree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) (byte) -1);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        int int29 = aVLTree26.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        Avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.insert((int) (short) 1);
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node40 = aVLTree38.find((-1));
        int int41 = aVLTree38.height();
        Avltree.AVLTree.Node node42 = aVLTree38.getRoot();
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.delete(100);
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        aVLTree47.delete((int) 'a');
        Avltree.AVLTree.Node node52 = aVLTree47.getRoot();
        aVLTree47.delete(0);
        Avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree47.getBalance(node55);
        Avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree47.getBalance(node57);
        Avltree.AVLTree aVLTree59 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        Avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        Avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree59.getBalance(node65);
        Avltree.AVLTree.Node node68 = aVLTree59.find((int) ' ');
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        Avltree.AVLTree.Node node73 = aVLTree69.find((int) 'a');
        aVLTree69.delete((int) (short) 10);
        Avltree.AVLTree aVLTree76 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        Avltree.AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        int int85 = aVLTree69.getBalance(node84);
        int int86 = aVLTree59.getBalance(node84);
        int int87 = aVLTree47.getBalance(node84);
        int int88 = aVLTree38.getBalance(node84);
        int int89 = aVLTree30.getBalance(node84);
        int int90 = aVLTree26.getBalance(node84);
        int int91 = aVLTree0.getBalance(node84);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 100);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node17 = aVLTree13.find((int) 'a');
        int int18 = aVLTree13.height();
        aVLTree13.delete(1);
        aVLTree13.insert((int) 'a');
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        Avltree.AVLTree.Node node26 = aVLTree23.getRoot();
        aVLTree23.delete(100);
        int int29 = aVLTree23.height();
        Avltree.AVLTree.Node node31 = aVLTree23.find((int) (short) -1);
        Avltree.AVLTree.Node node32 = aVLTree23.getRoot();
        Avltree.AVLTree aVLTree33 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        aVLTree33.insert((int) (byte) 100);
        aVLTree33.insert((int) 'a');
        Avltree.AVLTree.Node node41 = aVLTree33.find((int) (byte) 100);
        Avltree.AVLTree aVLTree42 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        aVLTree42.delete((int) 'a');
        Avltree.AVLTree.Node node47 = aVLTree42.getRoot();
        aVLTree42.delete(0);
        Avltree.AVLTree.Node node50 = null;
        int int51 = aVLTree42.getBalance(node50);
        int int52 = aVLTree42.height();
        Avltree.AVLTree aVLTree53 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        Avltree.AVLTree.Node node56 = aVLTree53.getRoot();
        aVLTree53.delete(100);
        aVLTree53.insert((int) (byte) 10);
        Avltree.AVLTree.Node node61 = aVLTree53.getRoot();
        int int62 = aVLTree42.getBalance(node61);
        int int63 = aVLTree33.getBalance(node61);
        int int64 = aVLTree23.getBalance(node61);
        int int65 = aVLTree13.getBalance(node61);
        int int66 = aVLTree0.getBalance(node61);
        Avltree.AVLTree aVLTree67 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node69 = aVLTree67.find((int) '4');
        Avltree.AVLTree.Node node70 = aVLTree67.getRoot();
        aVLTree67.delete(100);
        aVLTree67.insert((int) (byte) 10);
        Avltree.AVLTree.Node node75 = aVLTree67.getRoot();
        Avltree.AVLTree.Node node77 = aVLTree67.find((int) (byte) 0);
        aVLTree67.delete((int) (byte) 10);
        Avltree.AVLTree aVLTree80 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node82 = aVLTree80.find((int) '4');
        Avltree.AVLTree.Node node83 = aVLTree80.getRoot();
        aVLTree80.insert((int) (byte) 100);
        int int86 = aVLTree80.height();
        aVLTree80.insert(1);
        aVLTree80.insert((int) (short) 10);
        Avltree.AVLTree.Node node92 = aVLTree80.find((int) (short) 1);
        int int93 = aVLTree67.getBalance(node92);
        int int94 = aVLTree0.getBalance(node92);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node82);
        org.junit.Assert.assertNull(node83);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        int int16 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        aVLTree0.delete((int) '4');
        int int21 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        Avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        int int15 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        Avltree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        int int18 = aVLTree0.height();
        Avltree.AVLTree.Node node19 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass20 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        Avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        Avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree14.getBalance(node24);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node30 = aVLTree26.find((int) 'a');
        Avltree.AVLTree.Node node31 = aVLTree26.getRoot();
        aVLTree26.delete((int) (short) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        Avltree.AVLTree.Node node35 = aVLTree26.getRoot();
        Avltree.AVLTree aVLTree36 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.insert((int) (byte) 100);
        aVLTree36.insert((int) 'a');
        Avltree.AVLTree.Node node44 = aVLTree36.find((int) (byte) 100);
        int int45 = aVLTree26.getBalance(node44);
        int int46 = aVLTree14.getBalance(node44);
        int int47 = aVLTree0.getBalance(node44);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) ' ');
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node45 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass46 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(0);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree12.getBalance(node18);
        Avltree.AVLTree.Node node21 = aVLTree12.find((int) ' ');
        aVLTree12.insert((-1));
        Avltree.AVLTree.Node node24 = aVLTree12.getRoot();
        aVLTree12.delete((int) (byte) -1);
        aVLTree12.insert(0);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        Avltree.AVLTree.Node node37 = aVLTree29.find((int) (byte) 100);
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        aVLTree38.delete((int) 'a');
        Avltree.AVLTree.Node node43 = aVLTree38.getRoot();
        aVLTree38.delete(0);
        Avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree38.getBalance(node46);
        int int48 = aVLTree38.height();
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        Avltree.AVLTree.Node node52 = aVLTree49.getRoot();
        aVLTree49.delete(100);
        aVLTree49.insert((int) (byte) 10);
        Avltree.AVLTree.Node node57 = aVLTree49.getRoot();
        int int58 = aVLTree38.getBalance(node57);
        int int59 = aVLTree29.getBalance(node57);
        Avltree.AVLTree.Node node60 = aVLTree29.getRoot();
        Avltree.AVLTree.Node node61 = aVLTree29.getRoot();
        int int62 = aVLTree12.getBalance(node61);
        Avltree.AVLTree.Node node63 = aVLTree12.getRoot();
        int int64 = aVLTree0.getBalance(node63);
        int int65 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree23.find((int) 'a');
        aVLTree23.delete((int) (short) 10);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.insert((int) (byte) 100);
        aVLTree30.insert((int) 'a');
        Avltree.AVLTree.Node node38 = aVLTree30.find((int) (byte) 100);
        int int39 = aVLTree23.getBalance(node38);
        int int40 = aVLTree17.getBalance(node38);
        Avltree.AVLTree.Node node41 = aVLTree17.getRoot();
        Avltree.AVLTree aVLTree42 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree42.getBalance(node43);
        Avltree.AVLTree aVLTree45 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        Avltree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree51 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node53 = aVLTree51.find((int) '4');
        Avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree51.getBalance(node54);
        aVLTree51.insert((int) (short) 100);
        Avltree.AVLTree.Node node59 = aVLTree51.find((int) ' ');
        int int60 = aVLTree51.height();
        Avltree.AVLTree.Node node61 = aVLTree51.getRoot();
        int int62 = aVLTree45.getBalance(node61);
        int int63 = aVLTree42.getBalance(node61);
        Avltree.AVLTree.Node node65 = aVLTree42.find((int) 'a');
        Avltree.AVLTree aVLTree66 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node68 = aVLTree66.find((int) '4');
        aVLTree66.delete((int) 'a');
        aVLTree66.delete(1);
        aVLTree66.delete((int) '#');
        aVLTree66.delete((int) (short) -1);
        Avltree.AVLTree.Node node77 = aVLTree66.getRoot();
        aVLTree66.insert(10);
        aVLTree66.delete(1);
        Avltree.AVLTree.Node node82 = aVLTree66.getRoot();
        int int83 = aVLTree66.height();
        aVLTree66.delete((int) 'a');
        Avltree.AVLTree.Node node86 = aVLTree66.getRoot();
        int int87 = aVLTree42.getBalance(node86);
        int int88 = aVLTree17.getBalance(node86);
        int int89 = aVLTree0.getBalance(node86);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        Avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        Avltree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) '#');
        int int48 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        Avltree.AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        Avltree.AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        Avltree.AVLTree.Node node19 = aVLTree0.find((int) '4');
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node22 = aVLTree20.find((-1));
        int int23 = aVLTree20.height();
        Avltree.AVLTree.Node node25 = aVLTree20.find((int) (byte) 100);
        aVLTree20.insert(0);
        Avltree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        aVLTree0.insert((int) (byte) 1);
        aVLTree0.delete((int) (byte) 1);
        Avltree.AVLTree.Node node35 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        Avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        int int30 = aVLTree0.height();
        aVLTree0.insert(100);
        Avltree.AVLTree.Node node34 = aVLTree0.find((int) ' ');
        int int35 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree14.getBalance(node17);
        aVLTree14.insert((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree14.find(100);
        Avltree.AVLTree.Node node23 = aVLTree14.getRoot();
        int int24 = aVLTree0.getBalance(node23);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        aVLTree9.delete((int) (short) 10);
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        aVLTree16.insert((int) (byte) 100);
        aVLTree16.insert((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree16.find((int) (byte) 100);
        int int25 = aVLTree9.getBalance(node24);
        int int26 = aVLTree0.getBalance(node24);
        aVLTree0.insert((int) (byte) 0);
        Avltree.AVLTree.Node node30 = aVLTree0.find((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        Avltree.AVLTree.Node node13 = aVLTree7.find(100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        Avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        int int23 = aVLTree7.getBalance(node22);
        int int24 = aVLTree0.getBalance(node22);
        aVLTree0.delete((int) (byte) -1);
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        Avltree.AVLTree.Node node32 = aVLTree27.getRoot();
        Avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree27.getBalance(node33);
        Avltree.AVLTree.Node node36 = aVLTree27.find((int) ' ');
        aVLTree27.insert((-1));
        Avltree.AVLTree.Node node39 = aVLTree27.getRoot();
        aVLTree27.delete((int) (byte) -1);
        aVLTree27.insert(0);
        Avltree.AVLTree aVLTree44 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.insert((int) (byte) 100);
        aVLTree44.insert((int) 'a');
        Avltree.AVLTree.Node node52 = aVLTree44.find((int) (byte) 100);
        Avltree.AVLTree aVLTree53 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        aVLTree53.delete((int) 'a');
        Avltree.AVLTree.Node node58 = aVLTree53.getRoot();
        aVLTree53.delete(0);
        Avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree53.getBalance(node61);
        int int63 = aVLTree53.height();
        Avltree.AVLTree aVLTree64 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node66 = aVLTree64.find((int) '4');
        Avltree.AVLTree.Node node67 = aVLTree64.getRoot();
        aVLTree64.delete(100);
        aVLTree64.insert((int) (byte) 10);
        Avltree.AVLTree.Node node72 = aVLTree64.getRoot();
        int int73 = aVLTree53.getBalance(node72);
        int int74 = aVLTree44.getBalance(node72);
        Avltree.AVLTree.Node node75 = aVLTree44.getRoot();
        Avltree.AVLTree.Node node76 = aVLTree44.getRoot();
        int int77 = aVLTree27.getBalance(node76);
        int int78 = aVLTree0.getBalance(node76);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) (short) 0);
        Avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        int int16 = aVLTree0.height();
        Avltree.AVLTree.Node node18 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        Avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        Avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        Avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        int int11 = aVLTree0.height();
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete((int) (short) 10);
        Avltree.AVLTree.Node node20 = aVLTree12.getRoot();
        int int21 = aVLTree12.height();
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        aVLTree22.insert((int) (short) 0);
        Avltree.AVLTree.Node node28 = aVLTree22.find(100);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        Avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.delete(100);
        aVLTree29.insert((int) (byte) 10);
        Avltree.AVLTree.Node node37 = aVLTree29.getRoot();
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree12.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert(0);
        Avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        aVLTree0.delete((int) (byte) 100);
        Avltree.AVLTree.Node node45 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node47 = aVLTree0.find((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        int int13 = aVLTree0.height();
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        int int13 = aVLTree0.height();
        Avltree.AVLTree.Node node15 = aVLTree0.find(10);
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        Avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        Avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        int int51 = aVLTree0.height();
        int int52 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        Avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        Avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        Avltree.AVLTree.Node node43 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree6.find((int) 'a');
        aVLTree6.delete((int) (short) 10);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        Avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree6.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        Avltree.AVLTree.Node node24 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = null;
        int int27 = aVLTree25.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        Avltree.AVLTree.Node node31 = aVLTree28.getRoot();
        aVLTree28.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        Avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree34.getBalance(node37);
        aVLTree34.insert((int) (short) 100);
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) ' ');
        int int43 = aVLTree34.height();
        Avltree.AVLTree.Node node44 = aVLTree34.getRoot();
        int int45 = aVLTree28.getBalance(node44);
        int int46 = aVLTree25.getBalance(node44);
        Avltree.AVLTree.Node node48 = aVLTree25.find((int) 'a');
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        aVLTree49.delete((int) 'a');
        aVLTree49.delete(1);
        aVLTree49.delete((int) '#');
        aVLTree49.delete((int) (short) -1);
        Avltree.AVLTree.Node node60 = aVLTree49.getRoot();
        aVLTree49.insert(10);
        aVLTree49.delete(1);
        Avltree.AVLTree.Node node65 = aVLTree49.getRoot();
        int int66 = aVLTree49.height();
        aVLTree49.delete((int) 'a');
        Avltree.AVLTree.Node node69 = aVLTree49.getRoot();
        int int70 = aVLTree25.getBalance(node69);
        int int71 = aVLTree0.getBalance(node69);
        Avltree.AVLTree.Node node73 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node73);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        int int7 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert(1);
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        Avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        Avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete((-1));
        aVLTree0.insert((int) (short) -1);
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) '4');
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        Avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        Avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        int int43 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (short) 100);
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) (byte) 100);
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        int int14 = aVLTree0.height();
        Avltree.AVLTree.Node node16 = aVLTree0.find(0);
        aVLTree0.delete((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.find(1);
        Avltree.AVLTree.Node node9 = aVLTree0.find(10);
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) (byte) -1);
        int int15 = aVLTree10.height();
        int int16 = aVLTree10.height();
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) '#');
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        Avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree10.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        int int38 = aVLTree0.height();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        Avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        int int23 = aVLTree0.height();
        int int24 = aVLTree0.height();
        int int25 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        Avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        int int30 = aVLTree0.height();
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        Avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        Avltree.AVLTree.Node node24 = aVLTree15.find((int) ' ');
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree25.find((int) 'a');
        aVLTree25.delete((int) (short) 10);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        Avltree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        int int41 = aVLTree25.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        int int43 = aVLTree6.getBalance(node40);
        int int44 = aVLTree0.getBalance(node40);
        aVLTree0.delete((-1));
        aVLTree0.insert((int) ' ');
        Avltree.AVLTree aVLTree49 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = aVLTree49.find((int) '4');
        Avltree.AVLTree.Node node52 = null;
        int int53 = aVLTree49.getBalance(node52);
        aVLTree49.insert((int) '4');
        Avltree.AVLTree.Node node57 = aVLTree49.find((int) '#');
        aVLTree49.insert(0);
        Avltree.AVLTree aVLTree60 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        aVLTree60.delete((int) 'a');
        Avltree.AVLTree.Node node65 = aVLTree60.getRoot();
        Avltree.AVLTree.Node node66 = null;
        int int67 = aVLTree60.getBalance(node66);
        Avltree.AVLTree.Node node69 = aVLTree60.find((int) ' ');
        Avltree.AVLTree aVLTree70 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        Avltree.AVLTree.Node node74 = aVLTree70.find((int) 'a');
        aVLTree70.delete((int) (short) 10);
        Avltree.AVLTree aVLTree77 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node78 = null;
        int int79 = aVLTree77.getBalance(node78);
        aVLTree77.insert((int) (byte) 100);
        aVLTree77.insert((int) 'a');
        Avltree.AVLTree.Node node85 = aVLTree77.find((int) (byte) 100);
        int int86 = aVLTree70.getBalance(node85);
        int int87 = aVLTree60.getBalance(node85);
        int int88 = aVLTree49.getBalance(node85);
        int int89 = aVLTree0.getBalance(node85);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        Avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        Avltree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        int int24 = aVLTree0.height();
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((-1));
        aVLTree0.delete((int) (byte) 0);
        int int33 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass11 = node10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        int int17 = aVLTree12.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        Avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        int int34 = aVLTree24.height();
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        Avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.delete(100);
        aVLTree35.insert((int) (byte) 10);
        Avltree.AVLTree.Node node43 = aVLTree35.getRoot();
        int int44 = aVLTree24.getBalance(node43);
        int int45 = aVLTree18.getBalance(node43);
        int int46 = aVLTree12.getBalance(node43);
        int int47 = aVLTree0.getBalance(node43);
        int int48 = aVLTree0.height();
        aVLTree0.insert(10);
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree.Node node8 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.insert((int) (short) 0);
        Avltree.AVLTree.Node node12 = aVLTree6.find(100);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        aVLTree24.insert((int) (byte) 10);
        Avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        int int33 = aVLTree13.getBalance(node32);
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        aVLTree34.delete((int) 'a');
        Avltree.AVLTree.Node node39 = aVLTree34.getRoot();
        aVLTree34.delete(0);
        Avltree.AVLTree.Node node42 = null;
        int int43 = aVLTree34.getBalance(node42);
        int int44 = aVLTree34.height();
        Avltree.AVLTree aVLTree45 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        Avltree.AVLTree.Node node48 = aVLTree45.getRoot();
        aVLTree45.delete(100);
        aVLTree45.insert((int) (byte) 10);
        Avltree.AVLTree.Node node53 = aVLTree45.getRoot();
        int int54 = aVLTree34.getBalance(node53);
        int int55 = aVLTree13.getBalance(node53);
        int int56 = aVLTree6.getBalance(node53);
        int int57 = aVLTree0.getBalance(node53);
        int int58 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 0);
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.insert((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.insert((int) (short) 0);
        Avltree.AVLTree.Node node23 = aVLTree17.find(100);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        aVLTree24.insert((int) (byte) 10);
        Avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        int int33 = aVLTree17.getBalance(node32);
        int int34 = aVLTree10.getBalance(node32);
        Avltree.AVLTree.Node node35 = aVLTree10.getRoot();
        int int36 = aVLTree0.getBalance(node35);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        Avltree.AVLTree.Node node14 = aVLTree8.find(100);
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        Avltree.AVLTree aVLTree36 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        Avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        Avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        Avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        Avltree.AVLTree.Node node63 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node63);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.find(1);
        Avltree.AVLTree.Node node9 = aVLTree0.find(10);
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.delete((int) (byte) -1);
        int int15 = aVLTree10.height();
        int int16 = aVLTree10.height();
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) '#');
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node23 = aVLTree19.find((int) 'a');
        aVLTree19.delete((int) (short) 10);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        Avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        int int35 = aVLTree19.getBalance(node34);
        int int36 = aVLTree10.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        int int38 = aVLTree0.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node43 = aVLTree39.find((int) 'a');
        aVLTree39.insert((int) (short) -1);
        Avltree.AVLTree.Node node46 = aVLTree39.getRoot();
        int int47 = aVLTree0.getBalance(node46);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        int int22 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(10);
        aVLTree0.insert((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree9.getBalance(node10);
        Avltree.AVLTree.Node node12 = aVLTree9.getRoot();
        aVLTree9.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        int int36 = aVLTree9.getBalance(node34);
        int int37 = aVLTree0.getBalance(node34);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        Avltree.AVLTree.Node node32 = aVLTree28.find((int) 'a');
        int int33 = aVLTree28.height();
        aVLTree28.delete(1);
        aVLTree28.insert((int) 'a');
        aVLTree28.insert((int) '#');
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        int int43 = aVLTree40.height();
        int int44 = aVLTree40.height();
        Avltree.AVLTree aVLTree45 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node46 = null;
        int int47 = aVLTree45.getBalance(node46);
        aVLTree45.insert((int) (byte) 100);
        aVLTree45.insert((int) 'a');
        Avltree.AVLTree.Node node53 = aVLTree45.find((int) (byte) 100);
        Avltree.AVLTree aVLTree54 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        aVLTree54.delete((int) 'a');
        Avltree.AVLTree.Node node59 = aVLTree54.getRoot();
        aVLTree54.delete(0);
        Avltree.AVLTree.Node node62 = null;
        int int63 = aVLTree54.getBalance(node62);
        int int64 = aVLTree54.height();
        Avltree.AVLTree aVLTree65 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node67 = aVLTree65.find((int) '4');
        Avltree.AVLTree.Node node68 = aVLTree65.getRoot();
        aVLTree65.delete(100);
        aVLTree65.insert((int) (byte) 10);
        Avltree.AVLTree.Node node73 = aVLTree65.getRoot();
        int int74 = aVLTree54.getBalance(node73);
        int int75 = aVLTree45.getBalance(node73);
        int int76 = aVLTree40.getBalance(node73);
        int int77 = aVLTree28.getBalance(node73);
        int int78 = aVLTree0.getBalance(node73);
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node81 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node81);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree0.find(0);
        Avltree.AVLTree.Node node15 = aVLTree0.find(1);
        int int16 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        int int5 = aVLTree0.height();
        aVLTree0.delete(1);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node13 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        int int16 = aVLTree10.height();
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (short) -1);
        Avltree.AVLTree.Node node19 = aVLTree10.getRoot();
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree20.getBalance(node21);
        aVLTree20.insert((int) (byte) 100);
        aVLTree20.insert((int) 'a');
        Avltree.AVLTree.Node node28 = aVLTree20.find((int) (byte) 100);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        aVLTree29.delete((int) 'a');
        Avltree.AVLTree.Node node34 = aVLTree29.getRoot();
        aVLTree29.delete(0);
        Avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree29.getBalance(node37);
        int int39 = aVLTree29.height();
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        Avltree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        aVLTree40.insert((int) (byte) 10);
        Avltree.AVLTree.Node node48 = aVLTree40.getRoot();
        int int49 = aVLTree29.getBalance(node48);
        int int50 = aVLTree20.getBalance(node48);
        int int51 = aVLTree10.getBalance(node48);
        int int52 = aVLTree0.getBalance(node48);
        aVLTree0.delete(10);
        int int55 = aVLTree0.height();
        Avltree.AVLTree.Node node56 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        Avltree.AVLTree.Node node16 = aVLTree10.find((int) ' ');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree19.getRoot();
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        Avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        Avltree.AVLTree.Node node26 = aVLTree21.find((int) (short) -1);
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        Avltree.AVLTree.Node node32 = aVLTree27.getRoot();
        aVLTree27.delete(0);
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree27.getBalance(node35);
        int int37 = aVLTree27.height();
        aVLTree27.delete(100);
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        Avltree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        aVLTree40.insert((int) (byte) 10);
        Avltree.AVLTree.Node node48 = aVLTree40.getRoot();
        int int49 = aVLTree27.getBalance(node48);
        int int50 = aVLTree21.getBalance(node48);
        int int51 = aVLTree19.getBalance(node48);
        int int52 = aVLTree10.getBalance(node48);
        int int53 = aVLTree0.getBalance(node48);
        int int54 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find(0);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        Avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        Avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        Avltree.AVLTree.Node node50 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass51 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree8.getBalance(node11);
        aVLTree8.insert(0);
        aVLTree8.insert((int) (short) 10);
        Avltree.AVLTree.Node node17 = aVLTree8.getRoot();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.insert((int) (byte) 100);
        aVLTree18.insert((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree18.find((int) (byte) 100);
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        Avltree.AVLTree.Node node32 = aVLTree27.getRoot();
        aVLTree27.delete(0);
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree27.getBalance(node35);
        int int37 = aVLTree27.height();
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        Avltree.AVLTree.Node node41 = aVLTree38.getRoot();
        aVLTree38.delete(100);
        aVLTree38.insert((int) (byte) 10);
        Avltree.AVLTree.Node node46 = aVLTree38.getRoot();
        int int47 = aVLTree27.getBalance(node46);
        int int48 = aVLTree18.getBalance(node46);
        int int49 = aVLTree8.getBalance(node46);
        Avltree.AVLTree.Node node51 = aVLTree8.find((int) (byte) -1);
        Avltree.AVLTree.Node node53 = aVLTree8.find((int) (byte) -1);
        aVLTree8.insert((int) '#');
        Avltree.AVLTree aVLTree56 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        aVLTree56.delete((int) 'a');
        aVLTree56.insert((int) (short) 1);
        Avltree.AVLTree.Node node64 = aVLTree56.find((int) ' ');
        aVLTree56.insert((int) (short) 10);
        aVLTree56.insert(0);
        Avltree.AVLTree.Node node69 = aVLTree56.getRoot();
        int int70 = aVLTree8.getBalance(node69);
        Avltree.AVLTree.Node node71 = aVLTree8.getRoot();
        int int72 = aVLTree0.getBalance(node71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(10);
        int int7 = aVLTree0.height();
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node18 = aVLTree14.find((int) 'a');
        aVLTree14.delete((int) (short) 10);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree21.getBalance(node22);
        aVLTree21.insert((int) (byte) 100);
        aVLTree21.insert((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree21.find((int) (byte) 100);
        int int30 = aVLTree14.getBalance(node29);
        int int31 = aVLTree8.getBalance(node29);
        Avltree.AVLTree.Node node32 = aVLTree8.getRoot();
        Avltree.AVLTree aVLTree33 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree33.getBalance(node34);
        Avltree.AVLTree aVLTree36 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        Avltree.AVLTree.Node node39 = aVLTree36.getRoot();
        aVLTree36.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree42 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        Avltree.AVLTree.Node node45 = null;
        int int46 = aVLTree42.getBalance(node45);
        aVLTree42.insert((int) (short) 100);
        Avltree.AVLTree.Node node50 = aVLTree42.find((int) ' ');
        int int51 = aVLTree42.height();
        Avltree.AVLTree.Node node52 = aVLTree42.getRoot();
        int int53 = aVLTree36.getBalance(node52);
        int int54 = aVLTree33.getBalance(node52);
        Avltree.AVLTree.Node node56 = aVLTree33.find((int) 'a');
        Avltree.AVLTree aVLTree57 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node59 = aVLTree57.find((int) '4');
        aVLTree57.delete((int) 'a');
        aVLTree57.delete(1);
        aVLTree57.delete((int) '#');
        aVLTree57.delete((int) (short) -1);
        Avltree.AVLTree.Node node68 = aVLTree57.getRoot();
        aVLTree57.insert(10);
        aVLTree57.delete(1);
        Avltree.AVLTree.Node node73 = aVLTree57.getRoot();
        int int74 = aVLTree57.height();
        aVLTree57.delete((int) 'a');
        Avltree.AVLTree.Node node77 = aVLTree57.getRoot();
        int int78 = aVLTree33.getBalance(node77);
        int int79 = aVLTree8.getBalance(node77);
        int int80 = aVLTree0.getBalance(node77);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        Avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        Avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        aVLTree0.insert((int) '#');
        int int48 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        Avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node26 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) '#');
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node17 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        Avltree.AVLTree.Node node12 = aVLTree7.find((int) (short) -1);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        aVLTree13.delete(100);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree13.getBalance(node34);
        int int36 = aVLTree7.getBalance(node34);
        Avltree.AVLTree.Node node37 = aVLTree7.getRoot();
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node40 = aVLTree38.find((-1));
        int int41 = aVLTree38.height();
        Avltree.AVLTree.Node node42 = aVLTree38.getRoot();
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.delete(100);
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        aVLTree47.delete((int) 'a');
        Avltree.AVLTree.Node node52 = aVLTree47.getRoot();
        aVLTree47.delete(0);
        Avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree47.getBalance(node55);
        Avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree47.getBalance(node57);
        Avltree.AVLTree aVLTree59 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        Avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        Avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree59.getBalance(node65);
        Avltree.AVLTree.Node node68 = aVLTree59.find((int) ' ');
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        Avltree.AVLTree.Node node73 = aVLTree69.find((int) 'a');
        aVLTree69.delete((int) (short) 10);
        Avltree.AVLTree aVLTree76 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        Avltree.AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        int int85 = aVLTree69.getBalance(node84);
        int int86 = aVLTree59.getBalance(node84);
        int int87 = aVLTree47.getBalance(node84);
        int int88 = aVLTree38.getBalance(node84);
        int int89 = aVLTree7.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        java.lang.Class<?> wildcardClass91 = node84.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        Avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        int int23 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree4 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node6 = aVLTree4.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree4.find((int) 'a');
        aVLTree4.insert((int) (short) -1);
        int int11 = aVLTree4.height();
        Avltree.AVLTree.Node node12 = aVLTree4.getRoot();
        int int13 = aVLTree0.getBalance(node12);
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree.Node node17 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        Avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        Avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree31 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree31.find((int) 'a');
        int int36 = aVLTree31.height();
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        Avltree.AVLTree.Node node40 = aVLTree37.getRoot();
        aVLTree37.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree43 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        Avltree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        Avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        Avltree.AVLTree aVLTree54 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        Avltree.AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        Avltree.AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree37.getBalance(node62);
        int int65 = aVLTree31.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        Avltree.AVLTree.Node node67 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node67);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        Avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        Avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        Avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 0);
        Avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.delete(10);
        int int14 = aVLTree0.height();
        aVLTree0.insert((int) ' ');
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        Avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree0.getBalance(node25);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        Avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        Avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree6.getBalance(node25);
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((-1));
        int int30 = aVLTree27.height();
        Avltree.AVLTree.Node node31 = aVLTree27.getRoot();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        Avltree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        aVLTree41.delete((int) 'a');
        Avltree.AVLTree.Node node46 = aVLTree41.getRoot();
        aVLTree41.delete(0);
        Avltree.AVLTree.Node node49 = null;
        int int50 = aVLTree41.getBalance(node49);
        int int51 = aVLTree41.height();
        Avltree.AVLTree aVLTree52 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        Avltree.AVLTree.Node node55 = aVLTree52.getRoot();
        aVLTree52.delete(100);
        aVLTree52.insert((int) (byte) 10);
        Avltree.AVLTree.Node node60 = aVLTree52.getRoot();
        int int61 = aVLTree41.getBalance(node60);
        int int62 = aVLTree32.getBalance(node60);
        Avltree.AVLTree.Node node63 = aVLTree32.getRoot();
        int int64 = aVLTree27.getBalance(node63);
        int int65 = aVLTree6.getBalance(node63);
        int int66 = aVLTree0.getBalance(node63);
        Avltree.AVLTree.Node node67 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(node67);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) 100);
        Avltree.AVLTree.Node node7 = aVLTree0.find(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        Avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        Avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        Avltree.AVLTree aVLTree51 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node53 = aVLTree51.find((int) '4');
        aVLTree51.delete((int) 'a');
        Avltree.AVLTree.Node node56 = aVLTree51.getRoot();
        aVLTree51.delete((int) (byte) 1);
        Avltree.AVLTree aVLTree59 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node60 = null;
        int int61 = aVLTree59.getBalance(node60);
        Avltree.AVLTree aVLTree62 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        Avltree.AVLTree.Node node65 = aVLTree62.getRoot();
        aVLTree62.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree68 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        Avltree.AVLTree.Node node71 = null;
        int int72 = aVLTree68.getBalance(node71);
        aVLTree68.insert((int) (short) 100);
        Avltree.AVLTree.Node node76 = aVLTree68.find((int) ' ');
        int int77 = aVLTree68.height();
        Avltree.AVLTree.Node node78 = aVLTree68.getRoot();
        int int79 = aVLTree62.getBalance(node78);
        int int80 = aVLTree59.getBalance(node78);
        int int81 = aVLTree51.getBalance(node78);
        int int82 = aVLTree0.getBalance(node78);
        java.lang.Class<?> wildcardClass83 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        Avltree.AVLTree.Node node6 = aVLTree0.find(100);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        aVLTree7.delete(100);
        aVLTree7.insert((int) (byte) 10);
        Avltree.AVLTree.Node node15 = aVLTree7.getRoot();
        int int16 = aVLTree0.getBalance(node15);
        int int17 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) 'a');
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete((int) (short) 10);
        Avltree.AVLTree.Node node20 = aVLTree12.getRoot();
        Avltree.AVLTree.Node node21 = aVLTree12.getRoot();
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.insert((int) (byte) 100);
        aVLTree22.insert((int) 'a');
        Avltree.AVLTree.Node node30 = aVLTree22.find((int) (byte) 100);
        int int31 = aVLTree12.getBalance(node30);
        int int32 = aVLTree0.getBalance(node30);
        Avltree.AVLTree.Node node33 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node34 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        int int21 = aVLTree0.height();
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        int int8 = aVLTree0.height();
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        Avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        Avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        Avltree.AVLTree.Node node14 = aVLTree8.find(100);
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        Avltree.AVLTree aVLTree36 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        Avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        Avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        Avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        int int60 = aVLTree0.height();
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (short) 0);
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node7 = aVLTree0.find((int) (byte) 100);
        int int8 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find(10);
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        Avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(0);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node15 = aVLTree0.find(0);
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        Avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        Avltree.AVLTree.Node node32 = aVLTree27.getRoot();
        Avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree27.getBalance(node33);
        Avltree.AVLTree.Node node36 = aVLTree27.find((int) ' ');
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node39 = aVLTree37.find((int) '4');
        Avltree.AVLTree.Node node41 = aVLTree37.find((int) 'a');
        aVLTree37.delete((int) (short) 10);
        Avltree.AVLTree aVLTree44 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.insert((int) (byte) 100);
        aVLTree44.insert((int) 'a');
        Avltree.AVLTree.Node node52 = aVLTree44.find((int) (byte) 100);
        int int53 = aVLTree37.getBalance(node52);
        int int54 = aVLTree27.getBalance(node52);
        int int55 = aVLTree18.getBalance(node52);
        Avltree.AVLTree aVLTree56 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = aVLTree56.find((int) '4');
        Avltree.AVLTree.Node node60 = aVLTree56.find((int) 'a');
        Avltree.AVLTree.Node node61 = aVLTree56.getRoot();
        Avltree.AVLTree.Node node62 = aVLTree56.getRoot();
        Avltree.AVLTree.Node node63 = aVLTree56.getRoot();
        Avltree.AVLTree aVLTree64 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree64.getBalance(node65);
        Avltree.AVLTree aVLTree67 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node69 = aVLTree67.find((int) '4');
        Avltree.AVLTree.Node node70 = aVLTree67.getRoot();
        aVLTree67.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree73 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node75 = aVLTree73.find((int) '4');
        Avltree.AVLTree.Node node76 = null;
        int int77 = aVLTree73.getBalance(node76);
        aVLTree73.insert((int) (short) 100);
        Avltree.AVLTree.Node node81 = aVLTree73.find((int) ' ');
        int int82 = aVLTree73.height();
        Avltree.AVLTree.Node node83 = aVLTree73.getRoot();
        int int84 = aVLTree67.getBalance(node83);
        int int85 = aVLTree64.getBalance(node83);
        int int86 = aVLTree56.getBalance(node83);
        int int87 = aVLTree18.getBalance(node83);
        Avltree.AVLTree.Node node88 = aVLTree18.getRoot();
        int int89 = aVLTree0.getBalance(node88);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(node81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert(0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        aVLTree8.insert((int) (short) 1);
        Avltree.AVLTree.Node node16 = aVLTree8.find((int) ' ');
        aVLTree8.insert((int) (short) 10);
        aVLTree8.delete((-1));
        Avltree.AVLTree.Node node21 = aVLTree8.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        aVLTree8.delete(1);
        aVLTree8.delete((int) '#');
        aVLTree8.delete((int) (short) -1);
        Avltree.AVLTree.Node node19 = aVLTree8.getRoot();
        Avltree.AVLTree.Node node21 = aVLTree8.find((int) (byte) 100);
        int int22 = aVLTree8.height();
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        Avltree.AVLTree.Node node26 = aVLTree23.getRoot();
        aVLTree23.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree29.find((int) 'a');
        aVLTree29.delete((int) (short) 10);
        Avltree.AVLTree aVLTree36 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = null;
        int int38 = aVLTree36.getBalance(node37);
        aVLTree36.insert((int) (byte) 100);
        aVLTree36.insert((int) 'a');
        Avltree.AVLTree.Node node44 = aVLTree36.find((int) (byte) 100);
        int int45 = aVLTree29.getBalance(node44);
        int int46 = aVLTree23.getBalance(node44);
        int int47 = aVLTree8.getBalance(node44);
        int int48 = aVLTree0.getBalance(node44);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        aVLTree0.delete((int) '#');
        java.lang.Class<?> wildcardClass47 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        Avltree.AVLTree.Node node14 = aVLTree8.find(100);
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        Avltree.AVLTree aVLTree36 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        Avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        Avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        Avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        int int60 = aVLTree0.height();
        int int61 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        aVLTree0.delete(0);
        int int13 = aVLTree0.height();
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node18 = aVLTree14.find((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree14.find((int) ' ');
        aVLTree14.delete((int) '4');
        Avltree.AVLTree.Node node24 = aVLTree14.find((-1));
        Avltree.AVLTree.Node node26 = aVLTree14.find((int) (byte) -1);
        int int27 = aVLTree14.height();
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        Avltree.AVLTree.Node node32 = aVLTree28.find((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        Avltree.AVLTree.Node node34 = aVLTree28.getRoot();
        Avltree.AVLTree.Node node35 = aVLTree28.getRoot();
        aVLTree28.delete((int) (byte) 10);
        int int38 = aVLTree28.height();
        Avltree.AVLTree.Node node40 = aVLTree28.find((int) (short) 10);
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        Avltree.AVLTree.Node node44 = aVLTree41.getRoot();
        aVLTree41.delete(100);
        aVLTree41.insert((int) (byte) 10);
        Avltree.AVLTree.Node node49 = aVLTree41.getRoot();
        int int50 = aVLTree28.getBalance(node49);
        Avltree.AVLTree aVLTree51 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node52 = null;
        int int53 = aVLTree51.getBalance(node52);
        aVLTree51.insert((int) (byte) 100);
        aVLTree51.insert((int) 'a');
        Avltree.AVLTree.Node node59 = aVLTree51.find((int) (byte) 100);
        Avltree.AVLTree aVLTree60 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node62 = aVLTree60.find((int) '4');
        aVLTree60.delete((int) 'a');
        Avltree.AVLTree.Node node65 = aVLTree60.getRoot();
        aVLTree60.delete(0);
        Avltree.AVLTree.Node node68 = null;
        int int69 = aVLTree60.getBalance(node68);
        int int70 = aVLTree60.height();
        Avltree.AVLTree aVLTree71 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node73 = aVLTree71.find((int) '4');
        Avltree.AVLTree.Node node74 = aVLTree71.getRoot();
        aVLTree71.delete(100);
        aVLTree71.insert((int) (byte) 10);
        Avltree.AVLTree.Node node79 = aVLTree71.getRoot();
        int int80 = aVLTree60.getBalance(node79);
        int int81 = aVLTree51.getBalance(node79);
        Avltree.AVLTree.Node node82 = aVLTree51.getRoot();
        int int83 = aVLTree28.getBalance(node82);
        int int84 = aVLTree14.getBalance(node82);
        int int85 = aVLTree0.getBalance(node82);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree.Node node44 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass45 = node44.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        Avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) ' ');
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node12 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        Avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        Avltree.AVLTree.Node node24 = aVLTree15.find((int) ' ');
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree25.find((int) 'a');
        aVLTree25.delete((int) (short) 10);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        Avltree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        int int41 = aVLTree25.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        int int43 = aVLTree6.getBalance(node40);
        int int44 = aVLTree0.getBalance(node40);
        java.lang.Class<?> wildcardClass45 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) ' ');
        int int7 = aVLTree0.height();
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree12.find((int) 'a');
        int int17 = aVLTree12.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete(0);
        Avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree24.getBalance(node32);
        int int34 = aVLTree24.height();
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        Avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.delete(100);
        aVLTree35.insert((int) (byte) 10);
        Avltree.AVLTree.Node node43 = aVLTree35.getRoot();
        int int44 = aVLTree24.getBalance(node43);
        int int45 = aVLTree18.getBalance(node43);
        int int46 = aVLTree12.getBalance(node43);
        int int47 = aVLTree0.getBalance(node43);
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree.Node node51 = aVLTree0.find((int) (short) 0);
        Avltree.AVLTree aVLTree52 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        Avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree52.getBalance(node55);
        aVLTree52.insert((int) '4');
        Avltree.AVLTree.Node node60 = aVLTree52.find((int) (short) 0);
        Avltree.AVLTree.Node node62 = aVLTree52.find((int) ' ');
        aVLTree52.insert((int) (short) 100);
        Avltree.AVLTree.Node node66 = aVLTree52.find((int) (short) 100);
        int int67 = aVLTree0.getBalance(node66);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.find(1);
        aVLTree0.delete((int) (byte) 10);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (short) -1);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        Avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        Avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        int int15 = aVLTree0.height();
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree16.getBalance(node17);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        Avltree.AVLTree.Node node28 = null;
        int int29 = aVLTree25.getBalance(node28);
        aVLTree25.insert((int) (short) 100);
        Avltree.AVLTree.Node node33 = aVLTree25.find((int) ' ');
        int int34 = aVLTree25.height();
        Avltree.AVLTree.Node node35 = aVLTree25.getRoot();
        int int36 = aVLTree19.getBalance(node35);
        int int37 = aVLTree16.getBalance(node35);
        Avltree.AVLTree.Node node39 = aVLTree16.find((int) 'a');
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        Avltree.AVLTree.Node node43 = aVLTree40.getRoot();
        aVLTree40.delete(100);
        int int46 = aVLTree40.height();
        Avltree.AVLTree.Node node48 = aVLTree40.find((int) (short) -1);
        Avltree.AVLTree.Node node49 = aVLTree40.getRoot();
        Avltree.AVLTree aVLTree50 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree50.getBalance(node51);
        aVLTree50.insert((int) (byte) 100);
        aVLTree50.insert((int) 'a');
        Avltree.AVLTree.Node node58 = aVLTree50.find((int) (byte) 100);
        Avltree.AVLTree aVLTree59 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        Avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        aVLTree59.delete(0);
        Avltree.AVLTree.Node node67 = null;
        int int68 = aVLTree59.getBalance(node67);
        int int69 = aVLTree59.height();
        Avltree.AVLTree aVLTree70 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node72 = aVLTree70.find((int) '4');
        Avltree.AVLTree.Node node73 = aVLTree70.getRoot();
        aVLTree70.delete(100);
        aVLTree70.insert((int) (byte) 10);
        Avltree.AVLTree.Node node78 = aVLTree70.getRoot();
        int int79 = aVLTree59.getBalance(node78);
        int int80 = aVLTree50.getBalance(node78);
        int int81 = aVLTree40.getBalance(node78);
        int int82 = aVLTree16.getBalance(node78);
        int int83 = aVLTree0.getBalance(node78);
        aVLTree0.insert(100);
        int int86 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.insert((int) (short) 0);
        Avltree.AVLTree.Node node30 = aVLTree24.find(100);
        Avltree.AVLTree aVLTree31 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        aVLTree31.delete((int) 'a');
        Avltree.AVLTree.Node node36 = aVLTree31.getRoot();
        aVLTree31.delete(0);
        Avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree31.getBalance(node39);
        int int41 = aVLTree31.height();
        Avltree.AVLTree aVLTree42 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        Avltree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        Avltree.AVLTree.Node node50 = aVLTree42.getRoot();
        int int51 = aVLTree31.getBalance(node50);
        Avltree.AVLTree aVLTree52 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        aVLTree52.delete((int) 'a');
        Avltree.AVLTree.Node node57 = aVLTree52.getRoot();
        aVLTree52.delete(0);
        Avltree.AVLTree.Node node60 = null;
        int int61 = aVLTree52.getBalance(node60);
        int int62 = aVLTree52.height();
        Avltree.AVLTree aVLTree63 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        Avltree.AVLTree.Node node66 = aVLTree63.getRoot();
        aVLTree63.delete(100);
        aVLTree63.insert((int) (byte) 10);
        Avltree.AVLTree.Node node71 = aVLTree63.getRoot();
        int int72 = aVLTree52.getBalance(node71);
        int int73 = aVLTree31.getBalance(node71);
        int int74 = aVLTree24.getBalance(node71);
        int int75 = aVLTree0.getBalance(node71);
        java.lang.Class<?> wildcardClass76 = node71.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.find(10);
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert((int) '#');
        int int14 = aVLTree0.height();
        Avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) ' ');
        java.lang.Class<?> wildcardClass17 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        Avltree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.delete(100);
        int int30 = aVLTree24.height();
        Avltree.AVLTree.Node node32 = aVLTree24.find((int) (short) -1);
        Avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        Avltree.AVLTree aVLTree43 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        Avltree.AVLTree.Node node48 = aVLTree43.getRoot();
        aVLTree43.delete(0);
        Avltree.AVLTree.Node node51 = null;
        int int52 = aVLTree43.getBalance(node51);
        int int53 = aVLTree43.height();
        Avltree.AVLTree aVLTree54 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        Avltree.AVLTree.Node node57 = aVLTree54.getRoot();
        aVLTree54.delete(100);
        aVLTree54.insert((int) (byte) 10);
        Avltree.AVLTree.Node node62 = aVLTree54.getRoot();
        int int63 = aVLTree43.getBalance(node62);
        int int64 = aVLTree34.getBalance(node62);
        int int65 = aVLTree24.getBalance(node62);
        int int66 = aVLTree0.getBalance(node62);
        aVLTree0.insert((int) (byte) 1);
        int int69 = aVLTree0.height();
        Avltree.AVLTree.Node node70 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node75 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(node75);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) '#');
        aVLTree0.insert((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        Avltree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        Avltree.AVLTree.Node node31 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node32 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node33 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        Avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        Avltree.AVLTree.Node node44 = aVLTree41.getRoot();
        aVLTree41.delete(100);
        aVLTree41.insert((int) (byte) 10);
        Avltree.AVLTree.Node node49 = aVLTree41.getRoot();
        int int50 = aVLTree30.getBalance(node49);
        int int51 = aVLTree0.getBalance(node49);
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 100);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        int int16 = aVLTree13.height();
        aVLTree13.insert((-1));
        aVLTree13.delete((int) (byte) 1);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        aVLTree21.delete((int) (byte) -1);
        aVLTree21.delete((int) (byte) 0);
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        Avltree.AVLTree.Node node28 = aVLTree21.find(1);
        Avltree.AVLTree.Node node30 = aVLTree21.find(10);
        Avltree.AVLTree aVLTree31 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = null;
        int int33 = aVLTree31.getBalance(node32);
        aVLTree31.delete((int) (byte) -1);
        int int36 = aVLTree31.height();
        int int37 = aVLTree31.height();
        Avltree.AVLTree.Node node39 = aVLTree31.find((int) '#');
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        Avltree.AVLTree.Node node44 = aVLTree40.find((int) 'a');
        aVLTree40.delete((int) (short) 10);
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node48 = null;
        int int49 = aVLTree47.getBalance(node48);
        aVLTree47.insert((int) (byte) 100);
        aVLTree47.insert((int) 'a');
        Avltree.AVLTree.Node node55 = aVLTree47.find((int) (byte) 100);
        int int56 = aVLTree40.getBalance(node55);
        int int57 = aVLTree31.getBalance(node55);
        int int58 = aVLTree21.getBalance(node55);
        int int59 = aVLTree13.getBalance(node55);
        int int60 = aVLTree0.getBalance(node55);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = aVLTree3.getRoot();
        aVLTree3.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert((int) (short) 100);
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) ' ');
        int int18 = aVLTree9.height();
        Avltree.AVLTree.Node node19 = aVLTree9.getRoot();
        int int20 = aVLTree3.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        Avltree.AVLTree.Node node23 = aVLTree0.find((int) 'a');
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        aVLTree24.delete(1);
        aVLTree24.delete((int) '#');
        aVLTree24.delete((int) (short) -1);
        Avltree.AVLTree.Node node35 = aVLTree24.getRoot();
        aVLTree24.insert(10);
        aVLTree24.delete(1);
        Avltree.AVLTree.Node node40 = aVLTree24.getRoot();
        int int41 = aVLTree24.height();
        aVLTree24.delete((int) 'a');
        Avltree.AVLTree.Node node44 = aVLTree24.getRoot();
        int int45 = aVLTree0.getBalance(node44);
        int int46 = aVLTree0.height();
        java.lang.Class<?> wildcardClass47 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 100);
        Avltree.AVLTree.Node node13 = aVLTree0.find(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        aVLTree0.delete((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        int int12 = aVLTree0.height();
        aVLTree0.insert(1);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete((int) ' ');
        int int19 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        Avltree.AVLTree.Node node35 = aVLTree30.getRoot();
        aVLTree30.delete(0);
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree30.getBalance(node38);
        int int40 = aVLTree30.height();
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        Avltree.AVLTree.Node node44 = aVLTree41.getRoot();
        aVLTree41.delete(100);
        aVLTree41.insert((int) (byte) 10);
        Avltree.AVLTree.Node node49 = aVLTree41.getRoot();
        int int50 = aVLTree30.getBalance(node49);
        int int51 = aVLTree0.getBalance(node49);
        int int52 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        Avltree.AVLTree.Node node56 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(node56);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert((int) (short) 100);
        Avltree.AVLTree.Node node26 = aVLTree18.find((int) ' ');
        int int27 = aVLTree18.height();
        Avltree.AVLTree.Node node28 = aVLTree18.getRoot();
        int int29 = aVLTree0.getBalance(node28);
        aVLTree0.delete((int) (short) -1);
        int int32 = aVLTree0.height();
        java.lang.Class<?> wildcardClass33 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = node4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node15 = aVLTree0.find(0);
        java.lang.Class<?> wildcardClass16 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree8.getBalance(node9);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        Avltree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree8.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        java.lang.Class<?> wildcardClass31 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node46 = aVLTree0.find(100);
        Avltree.AVLTree.Node node47 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node49 = aVLTree0.find((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        Avltree.AVLTree.Node node15 = aVLTree7.find((int) (byte) 100);
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        aVLTree16.delete((int) 'a');
        Avltree.AVLTree.Node node21 = aVLTree16.getRoot();
        aVLTree16.delete(0);
        Avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree16.getBalance(node24);
        int int26 = aVLTree16.height();
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        Avltree.AVLTree.Node node30 = aVLTree27.getRoot();
        aVLTree27.delete(100);
        aVLTree27.insert((int) (byte) 10);
        Avltree.AVLTree.Node node35 = aVLTree27.getRoot();
        int int36 = aVLTree16.getBalance(node35);
        int int37 = aVLTree7.getBalance(node35);
        Avltree.AVLTree.Node node38 = aVLTree7.getRoot();
        Avltree.AVLTree.Node node39 = aVLTree7.getRoot();
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        aVLTree40.delete((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree40.getRoot();
        aVLTree40.delete(0);
        Avltree.AVLTree.Node node48 = null;
        int int49 = aVLTree40.getBalance(node48);
        Avltree.AVLTree.Node node50 = null;
        int int51 = aVLTree40.getBalance(node50);
        Avltree.AVLTree aVLTree52 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        aVLTree52.delete((int) 'a');
        Avltree.AVLTree.Node node57 = aVLTree52.getRoot();
        Avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree52.getBalance(node58);
        Avltree.AVLTree.Node node61 = aVLTree52.find((int) ' ');
        Avltree.AVLTree aVLTree62 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        Avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        Avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree52.getBalance(node77);
        int int80 = aVLTree40.getBalance(node77);
        int int81 = aVLTree7.getBalance(node77);
        int int82 = aVLTree0.getBalance(node77);
        Avltree.AVLTree.Node node83 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(node83);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) (byte) 10);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        aVLTree9.insert((int) (short) -1);
        Avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        int int18 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node12 = null;
        int int13 = aVLTree9.getBalance(node12);
        aVLTree9.insert(0);
        Avltree.AVLTree.Node node16 = aVLTree9.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        aVLTree18.delete((int) 'a');
        Avltree.AVLTree.Node node23 = aVLTree18.getRoot();
        aVLTree18.delete(0);
        Avltree.AVLTree.Node node26 = null;
        int int27 = aVLTree18.getBalance(node26);
        int int28 = aVLTree18.height();
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        Avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.delete(100);
        aVLTree29.insert((int) (byte) 10);
        Avltree.AVLTree.Node node37 = aVLTree29.getRoot();
        int int38 = aVLTree18.getBalance(node37);
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((-1));
        int int42 = aVLTree39.height();
        Avltree.AVLTree.Node node43 = aVLTree39.getRoot();
        Avltree.AVLTree aVLTree44 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = null;
        int int46 = aVLTree44.getBalance(node45);
        aVLTree44.insert((int) (byte) 100);
        aVLTree44.insert((int) 'a');
        Avltree.AVLTree.Node node52 = aVLTree44.find((int) (byte) 100);
        Avltree.AVLTree aVLTree53 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        aVLTree53.delete((int) 'a');
        Avltree.AVLTree.Node node58 = aVLTree53.getRoot();
        aVLTree53.delete(0);
        Avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree53.getBalance(node61);
        int int63 = aVLTree53.height();
        Avltree.AVLTree aVLTree64 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node66 = aVLTree64.find((int) '4');
        Avltree.AVLTree.Node node67 = aVLTree64.getRoot();
        aVLTree64.delete(100);
        aVLTree64.insert((int) (byte) 10);
        Avltree.AVLTree.Node node72 = aVLTree64.getRoot();
        int int73 = aVLTree53.getBalance(node72);
        int int74 = aVLTree44.getBalance(node72);
        Avltree.AVLTree.Node node75 = aVLTree44.getRoot();
        int int76 = aVLTree39.getBalance(node75);
        int int77 = aVLTree18.getBalance(node75);
        int int78 = aVLTree0.getBalance(node75);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node67);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.insert(0);
        aVLTree0.delete((int) (byte) -1);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree30.getBalance(node33);
        aVLTree30.insert((int) (short) 100);
        Avltree.AVLTree.Node node38 = aVLTree30.find((int) ' ');
        int int39 = aVLTree30.height();
        Avltree.AVLTree.Node node40 = aVLTree30.getRoot();
        int int41 = aVLTree24.getBalance(node40);
        int int42 = aVLTree19.getBalance(node40);
        int int43 = aVLTree0.getBalance(node40);
        int int44 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.insert((int) (short) 0);
        Avltree.AVLTree.Node node14 = aVLTree8.find(100);
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        Avltree.AVLTree aVLTree36 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = aVLTree36.find((int) '4');
        aVLTree36.delete((int) 'a');
        Avltree.AVLTree.Node node41 = aVLTree36.getRoot();
        aVLTree36.delete(0);
        Avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree36.getBalance(node44);
        int int46 = aVLTree36.height();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.delete(100);
        aVLTree47.insert((int) (byte) 10);
        Avltree.AVLTree.Node node55 = aVLTree47.getRoot();
        int int56 = aVLTree36.getBalance(node55);
        int int57 = aVLTree15.getBalance(node55);
        int int58 = aVLTree8.getBalance(node55);
        int int59 = aVLTree0.getBalance(node55);
        aVLTree0.insert(1);
        Avltree.AVLTree.Node node62 = null;
        int int63 = aVLTree0.getBalance(node62);
        Avltree.AVLTree.Node node64 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(node64);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.insert((int) (short) 0);
        Avltree.AVLTree.Node node16 = aVLTree10.find(100);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.delete(100);
        aVLTree17.insert((int) (byte) 10);
        Avltree.AVLTree.Node node25 = aVLTree17.getRoot();
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        Avltree.AVLTree.Node node29 = aVLTree0.find((int) (byte) 10);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((-1));
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        Avltree.AVLTree aVLTree45 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node47 = aVLTree45.find((int) '4');
        Avltree.AVLTree.Node node48 = null;
        int int49 = aVLTree45.getBalance(node48);
        aVLTree45.insert(0);
        aVLTree45.insert((int) (short) 10);
        Avltree.AVLTree.Node node54 = aVLTree45.getRoot();
        Avltree.AVLTree aVLTree55 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node56 = null;
        int int57 = aVLTree55.getBalance(node56);
        aVLTree55.insert((int) (byte) 100);
        aVLTree55.insert((int) 'a');
        Avltree.AVLTree.Node node63 = aVLTree55.find((int) (byte) 100);
        Avltree.AVLTree aVLTree64 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node66 = aVLTree64.find((int) '4');
        aVLTree64.delete((int) 'a');
        Avltree.AVLTree.Node node69 = aVLTree64.getRoot();
        aVLTree64.delete(0);
        Avltree.AVLTree.Node node72 = null;
        int int73 = aVLTree64.getBalance(node72);
        int int74 = aVLTree64.height();
        Avltree.AVLTree aVLTree75 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node77 = aVLTree75.find((int) '4');
        Avltree.AVLTree.Node node78 = aVLTree75.getRoot();
        aVLTree75.delete(100);
        aVLTree75.insert((int) (byte) 10);
        Avltree.AVLTree.Node node83 = aVLTree75.getRoot();
        int int84 = aVLTree64.getBalance(node83);
        int int85 = aVLTree55.getBalance(node83);
        int int86 = aVLTree45.getBalance(node83);
        int int87 = aVLTree0.getBalance(node83);
        int int88 = aVLTree0.height();
        int int89 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node46 = aVLTree0.find(100);
        Avltree.AVLTree.Node node47 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node48 = aVLTree0.getRoot();
        int int49 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.find(10);
        int int9 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree10.find((int) 'a');
        aVLTree10.delete((int) (short) 10);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree17.getBalance(node18);
        aVLTree17.insert((int) (byte) 100);
        aVLTree17.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) (byte) 100);
        int int26 = aVLTree10.getBalance(node25);
        int int27 = aVLTree0.getBalance(node25);
        Avltree.AVLTree.Node node29 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert(0);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node15 = aVLTree0.find(0);
        Avltree.AVLTree.Node node17 = aVLTree0.find(100);
        java.lang.Class<?> wildcardClass18 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int12 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        Avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        Avltree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) ' ');
        java.lang.Class<?> wildcardClass50 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.delete(0);
        aVLTree0.delete(10);
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        aVLTree16.delete((int) 'a');
        Avltree.AVLTree.Node node21 = aVLTree16.getRoot();
        aVLTree16.delete(0);
        Avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree16.getBalance(node24);
        int int26 = aVLTree16.height();
        aVLTree16.delete(100);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = aVLTree29.find((int) '4');
        Avltree.AVLTree.Node node32 = aVLTree29.getRoot();
        aVLTree29.delete(100);
        aVLTree29.insert((int) (byte) 10);
        Avltree.AVLTree.Node node37 = aVLTree29.getRoot();
        int int38 = aVLTree16.getBalance(node37);
        int int39 = aVLTree0.getBalance(node37);
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        aVLTree40.insert((int) (short) 0);
        Avltree.AVLTree.Node node46 = aVLTree40.find(100);
        int int47 = aVLTree40.height();
        Avltree.AVLTree.Node node48 = aVLTree40.getRoot();
        int int49 = aVLTree0.getBalance(node48);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree7.find((int) 'a');
        int int12 = aVLTree7.height();
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree13.getBalance(node38);
        int int41 = aVLTree7.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        Avltree.AVLTree.Node node44 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node44);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) 'a');
        int int18 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        Avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        int int22 = aVLTree11.height();
        aVLTree11.delete((int) (byte) 0);
        Avltree.AVLTree.Node node26 = aVLTree11.find(0);
        int int27 = aVLTree11.height();
        Avltree.AVLTree.Node node29 = aVLTree11.find((int) (short) 10);
        int int30 = aVLTree0.getBalance(node29);
        java.lang.Class<?> wildcardClass31 = node29.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        aVLTree0.insert((-1));
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        int int30 = aVLTree19.height();
        Avltree.AVLTree.Node node32 = aVLTree19.find((int) (byte) -1);
        aVLTree19.insert((-1));
        int int35 = aVLTree19.height();
        Avltree.AVLTree.Node node36 = aVLTree19.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        Avltree.AVLTree.Node node38 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node39 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        Avltree.AVLTree.Node node42 = aVLTree0.getRoot();
        int int43 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(node9);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) 'a');
        int int9 = aVLTree0.height();
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        aVLTree0.insert((int) (short) 0);
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        Avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree7.getBalance(node13);
        Avltree.AVLTree.Node node16 = aVLTree7.find((int) ' ');
        aVLTree7.insert((-1));
        Avltree.AVLTree.Node node19 = aVLTree7.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        aVLTree0.delete((int) (short) 100);
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree5.getBalance(node8);
        aVLTree5.insert(0);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.insert((int) (byte) 100);
        aVLTree12.insert((int) 'a');
        Avltree.AVLTree.Node node19 = aVLTree12.getRoot();
        int int20 = aVLTree5.getBalance(node19);
        int int21 = aVLTree0.getBalance(node19);
        int int22 = aVLTree0.height();
        Avltree.AVLTree.Node node24 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node25 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node25);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(10);
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        int int17 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree0.getRoot();
        int int21 = aVLTree0.height();
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        aVLTree0.delete((int) (short) 1);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree9.getBalance(node15);
        Avltree.AVLTree.Node node18 = aVLTree9.find((int) ' ');
        aVLTree9.insert((-1));
        Avltree.AVLTree.Node node21 = aVLTree9.getRoot();
        aVLTree9.delete((int) (byte) -1);
        aVLTree9.insert(0);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree26.getBalance(node27);
        aVLTree26.insert((int) (byte) 100);
        aVLTree26.insert((int) 'a');
        Avltree.AVLTree.Node node34 = aVLTree26.find((int) (byte) 100);
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.delete((int) 'a');
        Avltree.AVLTree.Node node40 = aVLTree35.getRoot();
        aVLTree35.delete(0);
        Avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree35.getBalance(node43);
        int int45 = aVLTree35.height();
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        Avltree.AVLTree.Node node49 = aVLTree46.getRoot();
        aVLTree46.delete(100);
        aVLTree46.insert((int) (byte) 10);
        Avltree.AVLTree.Node node54 = aVLTree46.getRoot();
        int int55 = aVLTree35.getBalance(node54);
        int int56 = aVLTree26.getBalance(node54);
        Avltree.AVLTree.Node node57 = aVLTree26.getRoot();
        Avltree.AVLTree.Node node58 = aVLTree26.getRoot();
        int int59 = aVLTree9.getBalance(node58);
        Avltree.AVLTree.Node node60 = aVLTree9.getRoot();
        int int61 = aVLTree0.getBalance(node60);
        Avltree.AVLTree.Node node62 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node62);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        Avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree23.find((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree23.find((int) ' ');
        Avltree.AVLTree.Node node31 = aVLTree23.find(0);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        aVLTree32.delete(1);
        aVLTree32.delete((int) '#');
        aVLTree32.delete((int) (short) -1);
        Avltree.AVLTree.Node node43 = aVLTree32.getRoot();
        Avltree.AVLTree.Node node45 = aVLTree32.find((int) (byte) 100);
        int int46 = aVLTree32.height();
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node50 = aVLTree47.getRoot();
        aVLTree47.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree53 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        Avltree.AVLTree.Node node57 = aVLTree53.find((int) 'a');
        aVLTree53.delete((int) (short) 10);
        Avltree.AVLTree aVLTree60 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        aVLTree60.insert((int) (byte) 100);
        aVLTree60.insert((int) 'a');
        Avltree.AVLTree.Node node68 = aVLTree60.find((int) (byte) 100);
        int int69 = aVLTree53.getBalance(node68);
        int int70 = aVLTree47.getBalance(node68);
        int int71 = aVLTree32.getBalance(node68);
        int int72 = aVLTree23.getBalance(node68);
        int int73 = aVLTree0.getBalance(node68);
        int int74 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        Avltree.AVLTree.Node node16 = aVLTree11.getRoot();
        aVLTree11.delete(0);
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree11.getBalance(node19);
        int int21 = aVLTree11.height();
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        Avltree.AVLTree.Node node25 = aVLTree22.getRoot();
        aVLTree22.delete(100);
        aVLTree22.insert((int) (byte) 10);
        Avltree.AVLTree.Node node30 = aVLTree22.getRoot();
        int int31 = aVLTree11.getBalance(node30);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        aVLTree32.delete((int) 'a');
        Avltree.AVLTree.Node node37 = aVLTree32.getRoot();
        aVLTree32.delete(0);
        Avltree.AVLTree.Node node40 = null;
        int int41 = aVLTree32.getBalance(node40);
        int int42 = aVLTree32.height();
        Avltree.AVLTree aVLTree43 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        Avltree.AVLTree.Node node46 = aVLTree43.getRoot();
        aVLTree43.delete(100);
        aVLTree43.insert((int) (byte) 10);
        Avltree.AVLTree.Node node51 = aVLTree43.getRoot();
        int int52 = aVLTree32.getBalance(node51);
        int int53 = aVLTree11.getBalance(node51);
        int int54 = aVLTree0.getBalance(node51);
        aVLTree0.delete((int) (short) -1);
        aVLTree0.delete((int) (byte) 1);
        java.lang.Class<?> wildcardClass59 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree.Node node12 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = null;
        int int8 = aVLTree6.getBalance(node7);
        aVLTree6.insert((int) (byte) 100);
        aVLTree6.insert((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree6.find((int) (byte) 100);
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        aVLTree15.delete(0);
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree15.getBalance(node23);
        int int25 = aVLTree15.height();
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree15.getBalance(node34);
        int int36 = aVLTree6.getBalance(node34);
        Avltree.AVLTree.Node node37 = aVLTree6.getRoot();
        int int38 = aVLTree0.getBalance(node37);
        aVLTree0.delete(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        Avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.insert((int) (short) 1);
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node24 = aVLTree22.find((-1));
        int int25 = aVLTree22.height();
        Avltree.AVLTree.Node node26 = aVLTree22.getRoot();
        aVLTree22.insert((int) (byte) 100);
        aVLTree22.delete(100);
        Avltree.AVLTree aVLTree31 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        aVLTree31.delete((int) 'a');
        Avltree.AVLTree.Node node36 = aVLTree31.getRoot();
        aVLTree31.delete(0);
        Avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree31.getBalance(node39);
        Avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree31.getBalance(node41);
        Avltree.AVLTree aVLTree43 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node45 = aVLTree43.find((int) '4');
        aVLTree43.delete((int) 'a');
        Avltree.AVLTree.Node node48 = aVLTree43.getRoot();
        Avltree.AVLTree.Node node49 = null;
        int int50 = aVLTree43.getBalance(node49);
        Avltree.AVLTree.Node node52 = aVLTree43.find((int) ' ');
        Avltree.AVLTree aVLTree53 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        Avltree.AVLTree.Node node57 = aVLTree53.find((int) 'a');
        aVLTree53.delete((int) (short) 10);
        Avltree.AVLTree aVLTree60 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        aVLTree60.insert((int) (byte) 100);
        aVLTree60.insert((int) 'a');
        Avltree.AVLTree.Node node68 = aVLTree60.find((int) (byte) 100);
        int int69 = aVLTree53.getBalance(node68);
        int int70 = aVLTree43.getBalance(node68);
        int int71 = aVLTree31.getBalance(node68);
        int int72 = aVLTree22.getBalance(node68);
        int int73 = aVLTree14.getBalance(node68);
        Avltree.AVLTree aVLTree74 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node76 = aVLTree74.find((int) '4');
        Avltree.AVLTree.Node node77 = aVLTree74.getRoot();
        aVLTree74.delete(100);
        aVLTree74.insert((int) (byte) 10);
        Avltree.AVLTree.Node node82 = aVLTree74.getRoot();
        aVLTree74.insert((int) (byte) 100);
        int int85 = aVLTree74.height();
        aVLTree74.delete((int) (byte) 0);
        Avltree.AVLTree.Node node89 = aVLTree74.find(0);
        int int90 = aVLTree74.height();
        Avltree.AVLTree.Node node91 = aVLTree74.getRoot();
        int int92 = aVLTree14.getBalance(node91);
        int int93 = aVLTree0.getBalance(node91);
        java.lang.Class<?> wildcardClass94 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNull(node89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNotNull(node91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree9.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree11.find((int) (short) -1);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        aVLTree17.delete((int) 'a');
        Avltree.AVLTree.Node node22 = aVLTree17.getRoot();
        aVLTree17.delete(0);
        Avltree.AVLTree.Node node25 = null;
        int int26 = aVLTree17.getBalance(node25);
        int int27 = aVLTree17.height();
        aVLTree17.delete(100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree17.getBalance(node38);
        int int40 = aVLTree11.getBalance(node38);
        int int41 = aVLTree9.getBalance(node38);
        int int42 = aVLTree0.getBalance(node38);
        aVLTree0.delete(10);
        aVLTree0.delete((int) '#');
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node50 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node50);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = aVLTree13.getRoot();
        aVLTree13.delete(100);
        aVLTree13.insert((int) (byte) 10);
        Avltree.AVLTree.Node node21 = aVLTree13.getRoot();
        int int22 = aVLTree0.getBalance(node21);
        aVLTree0.insert((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        aVLTree0.insert((-1));
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        int int30 = aVLTree19.height();
        Avltree.AVLTree.Node node32 = aVLTree19.find((int) (byte) -1);
        aVLTree19.insert((-1));
        int int35 = aVLTree19.height();
        Avltree.AVLTree.Node node36 = aVLTree19.getRoot();
        int int37 = aVLTree0.getBalance(node36);
        Avltree.AVLTree.Node node38 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass39 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(1);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node15 = aVLTree12.getRoot();
        aVLTree12.delete(100);
        aVLTree12.delete((int) (short) -1);
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        aVLTree20.insert((int) (short) 0);
        Avltree.AVLTree.Node node26 = aVLTree20.find(100);
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        aVLTree27.delete((int) 'a');
        Avltree.AVLTree.Node node32 = aVLTree27.getRoot();
        aVLTree27.delete(0);
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree27.getBalance(node35);
        int int37 = aVLTree27.height();
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node40 = aVLTree38.find((int) '4');
        Avltree.AVLTree.Node node41 = aVLTree38.getRoot();
        aVLTree38.delete(100);
        aVLTree38.insert((int) (byte) 10);
        Avltree.AVLTree.Node node46 = aVLTree38.getRoot();
        int int47 = aVLTree27.getBalance(node46);
        Avltree.AVLTree aVLTree48 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        Avltree.AVLTree.Node node53 = aVLTree48.getRoot();
        aVLTree48.delete(0);
        Avltree.AVLTree.Node node56 = null;
        int int57 = aVLTree48.getBalance(node56);
        int int58 = aVLTree48.height();
        Avltree.AVLTree aVLTree59 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        Avltree.AVLTree.Node node62 = aVLTree59.getRoot();
        aVLTree59.delete(100);
        aVLTree59.insert((int) (byte) 10);
        Avltree.AVLTree.Node node67 = aVLTree59.getRoot();
        int int68 = aVLTree48.getBalance(node67);
        int int69 = aVLTree27.getBalance(node67);
        int int70 = aVLTree20.getBalance(node67);
        int int71 = aVLTree12.getBalance(node67);
        aVLTree12.insert(1);
        Avltree.AVLTree.Node node75 = aVLTree12.find((int) (byte) 0);
        Avltree.AVLTree.Node node76 = aVLTree12.getRoot();
        int int77 = aVLTree0.getBalance(node76);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node13 = aVLTree0.find(0);
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        int int4 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        aVLTree0.delete((int) (short) 0);
        Avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        int int16 = aVLTree0.height();
        Avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node19 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        int int11 = aVLTree0.height();
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.delete(10);
        int int14 = aVLTree0.height();
        aVLTree0.insert((int) ' ');
        int int17 = aVLTree0.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.insert((int) (byte) 100);
        int int24 = aVLTree18.height();
        aVLTree18.insert(1);
        aVLTree18.insert((int) (short) 10);
        Avltree.AVLTree.Node node30 = aVLTree18.find((int) (short) 1);
        int int31 = aVLTree0.getBalance(node30);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (short) 10);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        aVLTree0.insert((int) '#');
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 100);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        aVLTree0.delete((int) 'a');
        int int13 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        int int5 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.find((-1));
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        Avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        Avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete(0);
        aVLTree0.delete((int) ' ');
        int int55 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        aVLTree21.delete((int) 'a');
        Avltree.AVLTree.Node node26 = aVLTree21.getRoot();
        aVLTree21.delete(0);
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree21.getBalance(node29);
        int int31 = aVLTree21.height();
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree21.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        aVLTree0.delete((int) (byte) 100);
        aVLTree0.insert((int) ' ');
        Avltree.AVLTree.Node node48 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(node48);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        Avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        Avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        aVLTree0.insert((int) '#');
        Avltree.AVLTree.Node node49 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(node49);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        Avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree6.find((int) (byte) 0);
        aVLTree6.delete((int) (byte) 10);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.insert((int) (byte) 100);
        int int25 = aVLTree19.height();
        aVLTree19.insert(1);
        aVLTree19.insert((int) (short) 10);
        Avltree.AVLTree.Node node31 = aVLTree19.find((int) (short) 1);
        int int32 = aVLTree6.getBalance(node31);
        int int33 = aVLTree0.getBalance(node31);
        java.lang.Class<?> wildcardClass34 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        Avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        Avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        int int31 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree0.getBalance(node9);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        int int12 = aVLTree0.height();
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree13.getBalance(node16);
        aVLTree13.insert((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree13.find((int) '#');
        aVLTree13.insert(0);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        aVLTree24.delete((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        Avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree24.getBalance(node30);
        Avltree.AVLTree.Node node33 = aVLTree24.find((int) ' ');
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node36 = aVLTree34.find((int) '4');
        Avltree.AVLTree.Node node38 = aVLTree34.find((int) 'a');
        aVLTree34.delete((int) (short) 10);
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = null;
        int int43 = aVLTree41.getBalance(node42);
        aVLTree41.insert((int) (byte) 100);
        aVLTree41.insert((int) 'a');
        Avltree.AVLTree.Node node49 = aVLTree41.find((int) (byte) 100);
        int int50 = aVLTree34.getBalance(node49);
        int int51 = aVLTree24.getBalance(node49);
        int int52 = aVLTree13.getBalance(node49);
        int int53 = aVLTree0.getBalance(node49);
        aVLTree0.insert(10);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) 'a');
        int int5 = aVLTree0.height();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (short) 1);
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree7.getBalance(node10);
        aVLTree7.insert((int) (short) 100);
        Avltree.AVLTree.Node node15 = aVLTree7.find((int) ' ');
        int int16 = aVLTree7.height();
        Avltree.AVLTree.Node node17 = aVLTree7.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        aVLTree19.delete(100);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node34 = aVLTree32.find((int) '4');
        Avltree.AVLTree.Node node35 = aVLTree32.getRoot();
        aVLTree32.delete(100);
        aVLTree32.insert((int) (byte) 10);
        Avltree.AVLTree.Node node40 = aVLTree32.getRoot();
        int int41 = aVLTree19.getBalance(node40);
        int int42 = aVLTree0.getBalance(node40);
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.delete((int) (short) 10);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree7.getBalance(node8);
        aVLTree7.insert((int) (byte) 100);
        aVLTree7.insert((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree7.getRoot();
        int int15 = aVLTree0.getBalance(node14);
        Avltree.AVLTree.Node node17 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node21 = aVLTree0.find(0);
        Avltree.AVLTree.Node node23 = aVLTree0.find((int) ' ');
        int int24 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree17.getBalance(node20);
        aVLTree17.insert((int) (short) 100);
        Avltree.AVLTree.Node node25 = aVLTree17.find((int) ' ');
        int int26 = aVLTree17.height();
        Avltree.AVLTree.Node node27 = aVLTree17.getRoot();
        int int28 = aVLTree11.getBalance(node27);
        int int29 = aVLTree6.getBalance(node27);
        int int30 = aVLTree0.getBalance(node27);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        Avltree.AVLTree.Node node16 = aVLTree0.find((int) (short) 100);
        int int17 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        int int18 = aVLTree0.height();
        Avltree.AVLTree.Node node20 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree14.getBalance(node17);
        aVLTree14.insert((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree14.find(100);
        Avltree.AVLTree.Node node23 = aVLTree14.getRoot();
        int int24 = aVLTree0.getBalance(node23);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        Avltree.AVLTree.Node node30 = aVLTree27.getRoot();
        aVLTree27.delete(100);
        aVLTree27.insert((int) (byte) 10);
        Avltree.AVLTree.Node node35 = aVLTree27.getRoot();
        Avltree.AVLTree.Node node37 = aVLTree27.find((int) (byte) 0);
        Avltree.AVLTree.Node node39 = aVLTree27.find((int) (short) 1);
        aVLTree27.insert(0);
        Avltree.AVLTree aVLTree42 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        Avltree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        Avltree.AVLTree.Node node50 = aVLTree42.getRoot();
        Avltree.AVLTree.Node node52 = aVLTree42.find((int) (byte) 0);
        aVLTree42.delete((int) '4');
        Avltree.AVLTree.Node node55 = aVLTree42.getRoot();
        int int56 = aVLTree27.getBalance(node55);
        int int57 = aVLTree0.getBalance(node55);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        aVLTree0.delete(0);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree13.getBalance(node14);
        aVLTree13.insert((int) (byte) 100);
        aVLTree13.insert((int) 'a');
        Avltree.AVLTree.Node node21 = aVLTree13.find((int) (byte) 100);
        int int22 = aVLTree0.getBalance(node21);
        Avltree.AVLTree.Node node23 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) -1);
        java.lang.Class<?> wildcardClass26 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (byte) -1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree10.getRoot();
        int int18 = aVLTree0.getBalance(node17);
        aVLTree0.insert((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        int int22 = aVLTree11.height();
        aVLTree11.delete((int) (byte) 0);
        Avltree.AVLTree.Node node26 = aVLTree11.find(0);
        int int27 = aVLTree11.height();
        Avltree.AVLTree.Node node29 = aVLTree11.find((int) (short) 10);
        int int30 = aVLTree0.getBalance(node29);
        Avltree.AVLTree.Node node32 = aVLTree0.find((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree.Node node12 = aVLTree0.find(100);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        Avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        Avltree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) (short) -1);
        aVLTree0.delete((int) ' ');
        int int50 = aVLTree0.height();
        Avltree.AVLTree.Node node52 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(node52);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.find(0);
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find(0);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        aVLTree9.delete(1);
        aVLTree9.delete((int) '#');
        aVLTree9.delete((int) (short) -1);
        Avltree.AVLTree.Node node20 = aVLTree9.getRoot();
        Avltree.AVLTree.Node node22 = aVLTree9.find((int) (byte) 100);
        int int23 = aVLTree9.height();
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node27 = aVLTree24.getRoot();
        aVLTree24.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node34 = aVLTree30.find((int) 'a');
        aVLTree30.delete((int) (short) 10);
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        int int46 = aVLTree30.getBalance(node45);
        int int47 = aVLTree24.getBalance(node45);
        int int48 = aVLTree9.getBalance(node45);
        int int49 = aVLTree0.getBalance(node45);
        Avltree.AVLTree.Node node50 = aVLTree0.getRoot();
        aVLTree0.insert(1);
        java.lang.Class<?> wildcardClass53 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        Avltree.AVLTree.Node node6 = aVLTree0.find(100);
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.insert((int) (short) 0);
        Avltree.AVLTree.Node node13 = aVLTree7.find(100);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        aVLTree14.delete((int) 'a');
        Avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        aVLTree14.delete(0);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree14.getBalance(node22);
        int int24 = aVLTree14.height();
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        Avltree.AVLTree.Node node28 = aVLTree25.getRoot();
        aVLTree25.delete(100);
        aVLTree25.insert((int) (byte) 10);
        Avltree.AVLTree.Node node33 = aVLTree25.getRoot();
        int int34 = aVLTree14.getBalance(node33);
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        aVLTree35.delete((int) 'a');
        Avltree.AVLTree.Node node40 = aVLTree35.getRoot();
        aVLTree35.delete(0);
        Avltree.AVLTree.Node node43 = null;
        int int44 = aVLTree35.getBalance(node43);
        int int45 = aVLTree35.height();
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        Avltree.AVLTree.Node node49 = aVLTree46.getRoot();
        aVLTree46.delete(100);
        aVLTree46.insert((int) (byte) 10);
        Avltree.AVLTree.Node node54 = aVLTree46.getRoot();
        int int55 = aVLTree35.getBalance(node54);
        int int56 = aVLTree14.getBalance(node54);
        int int57 = aVLTree7.getBalance(node54);
        int int58 = aVLTree0.getBalance(node54);
        int int59 = aVLTree0.height();
        Avltree.AVLTree.Node node61 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node61);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(1);
        Avltree.AVLTree.Node node10 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        aVLTree6.delete((int) 'a');
        Avltree.AVLTree.Node node11 = aVLTree6.getRoot();
        aVLTree6.delete(0);
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree6.getBalance(node14);
        int int16 = aVLTree6.height();
        aVLTree6.delete(100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        Avltree.AVLTree.Node node22 = aVLTree19.getRoot();
        aVLTree19.delete(100);
        aVLTree19.insert((int) (byte) 10);
        Avltree.AVLTree.Node node27 = aVLTree19.getRoot();
        int int28 = aVLTree6.getBalance(node27);
        int int29 = aVLTree0.getBalance(node27);
        Avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree31 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = aVLTree31.find((-1));
        int int34 = aVLTree31.height();
        Avltree.AVLTree.Node node35 = aVLTree31.getRoot();
        aVLTree31.insert((int) (byte) 100);
        aVLTree31.delete(100);
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node42 = aVLTree40.find((int) '4');
        aVLTree40.delete((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree40.getRoot();
        aVLTree40.delete(0);
        Avltree.AVLTree.Node node48 = null;
        int int49 = aVLTree40.getBalance(node48);
        Avltree.AVLTree.Node node50 = null;
        int int51 = aVLTree40.getBalance(node50);
        Avltree.AVLTree aVLTree52 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        aVLTree52.delete((int) 'a');
        Avltree.AVLTree.Node node57 = aVLTree52.getRoot();
        Avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree52.getBalance(node58);
        Avltree.AVLTree.Node node61 = aVLTree52.find((int) ' ');
        Avltree.AVLTree aVLTree62 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node64 = aVLTree62.find((int) '4');
        Avltree.AVLTree.Node node66 = aVLTree62.find((int) 'a');
        aVLTree62.delete((int) (short) 10);
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        aVLTree69.insert((int) (byte) 100);
        aVLTree69.insert((int) 'a');
        Avltree.AVLTree.Node node77 = aVLTree69.find((int) (byte) 100);
        int int78 = aVLTree62.getBalance(node77);
        int int79 = aVLTree52.getBalance(node77);
        int int80 = aVLTree40.getBalance(node77);
        int int81 = aVLTree31.getBalance(node77);
        int int82 = aVLTree0.getBalance(node77);
        Avltree.AVLTree.Node node84 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNull(node84);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        Avltree.AVLTree.Node node12 = aVLTree7.find((int) (short) -1);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        aVLTree13.delete((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree13.getRoot();
        aVLTree13.delete(0);
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree13.getBalance(node21);
        int int23 = aVLTree13.height();
        aVLTree13.delete(100);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree26.getRoot();
        aVLTree26.delete(100);
        aVLTree26.insert((int) (byte) 10);
        Avltree.AVLTree.Node node34 = aVLTree26.getRoot();
        int int35 = aVLTree13.getBalance(node34);
        int int36 = aVLTree7.getBalance(node34);
        Avltree.AVLTree.Node node37 = aVLTree7.getRoot();
        Avltree.AVLTree aVLTree38 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node40 = aVLTree38.find((-1));
        int int41 = aVLTree38.height();
        Avltree.AVLTree.Node node42 = aVLTree38.getRoot();
        aVLTree38.insert((int) (byte) 100);
        aVLTree38.delete(100);
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        aVLTree47.delete((int) 'a');
        Avltree.AVLTree.Node node52 = aVLTree47.getRoot();
        aVLTree47.delete(0);
        Avltree.AVLTree.Node node55 = null;
        int int56 = aVLTree47.getBalance(node55);
        Avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree47.getBalance(node57);
        Avltree.AVLTree aVLTree59 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = aVLTree59.find((int) '4');
        aVLTree59.delete((int) 'a');
        Avltree.AVLTree.Node node64 = aVLTree59.getRoot();
        Avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree59.getBalance(node65);
        Avltree.AVLTree.Node node68 = aVLTree59.find((int) ' ');
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        Avltree.AVLTree.Node node73 = aVLTree69.find((int) 'a');
        aVLTree69.delete((int) (short) 10);
        Avltree.AVLTree aVLTree76 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node77 = null;
        int int78 = aVLTree76.getBalance(node77);
        aVLTree76.insert((int) (byte) 100);
        aVLTree76.insert((int) 'a');
        Avltree.AVLTree.Node node84 = aVLTree76.find((int) (byte) 100);
        int int85 = aVLTree69.getBalance(node84);
        int int86 = aVLTree59.getBalance(node84);
        int int87 = aVLTree47.getBalance(node84);
        int int88 = aVLTree38.getBalance(node84);
        int int89 = aVLTree7.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 100);
        int int14 = aVLTree0.height();
        Avltree.AVLTree.Node node16 = aVLTree0.find((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(10);
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node16 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node18 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.find((-1));
        int int7 = aVLTree0.height();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 0);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) '#');
        aVLTree0.insert((int) ' ');
        aVLTree0.insert((-1));
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree.Node node17 = aVLTree12.getRoot();
        aVLTree12.delete(0);
        Avltree.AVLTree.Node node20 = null;
        int int21 = aVLTree12.getBalance(node20);
        Avltree.AVLTree.Node node22 = null;
        int int23 = aVLTree12.getBalance(node22);
        Avltree.AVLTree aVLTree24 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node26 = aVLTree24.find((int) '4');
        Avltree.AVLTree.Node node28 = aVLTree24.find((int) 'a');
        Avltree.AVLTree.Node node29 = aVLTree24.getRoot();
        aVLTree24.delete((int) (short) 10);
        Avltree.AVLTree.Node node32 = aVLTree24.getRoot();
        Avltree.AVLTree.Node node33 = aVLTree24.getRoot();
        Avltree.AVLTree aVLTree34 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = null;
        int int36 = aVLTree34.getBalance(node35);
        aVLTree34.insert((int) (byte) 100);
        aVLTree34.insert((int) 'a');
        Avltree.AVLTree.Node node42 = aVLTree34.find((int) (byte) 100);
        int int43 = aVLTree24.getBalance(node42);
        int int44 = aVLTree12.getBalance(node42);
        int int45 = aVLTree0.getBalance(node42);
        aVLTree0.insert((int) '#');
        aVLTree0.insert((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((-1));
        Avltree.AVLTree.Node node13 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        int int14 = aVLTree0.height();
        int int15 = aVLTree0.height();
        Avltree.AVLTree aVLTree16 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node18 = aVLTree16.find((int) '4');
        Avltree.AVLTree.Node node19 = aVLTree16.getRoot();
        aVLTree16.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        Avltree.AVLTree.Node node26 = aVLTree22.find((int) 'a');
        aVLTree22.delete((int) (short) 10);
        Avltree.AVLTree aVLTree29 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree29.getBalance(node30);
        aVLTree29.insert((int) (byte) 100);
        aVLTree29.insert((int) 'a');
        Avltree.AVLTree.Node node37 = aVLTree29.find((int) (byte) 100);
        int int38 = aVLTree22.getBalance(node37);
        int int39 = aVLTree16.getBalance(node37);
        int int40 = aVLTree0.getBalance(node37);
        int int41 = aVLTree0.height();
        Avltree.AVLTree.Node node43 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNull(node43);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        aVLTree9.delete((int) 'a');
        Avltree.AVLTree.Node node14 = aVLTree9.getRoot();
        aVLTree9.delete(0);
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree9.getBalance(node17);
        int int19 = aVLTree9.height();
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        Avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        aVLTree20.delete(100);
        aVLTree20.insert((int) (byte) 10);
        Avltree.AVLTree.Node node28 = aVLTree20.getRoot();
        int int29 = aVLTree9.getBalance(node28);
        int int30 = aVLTree0.getBalance(node28);
        Avltree.AVLTree.Node node31 = aVLTree0.getRoot();
        int int32 = aVLTree0.height();
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        int int13 = aVLTree0.height();
        Avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        aVLTree7.delete((int) 'a');
        Avltree.AVLTree.Node node12 = aVLTree7.getRoot();
        aVLTree7.delete(0);
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree7.getBalance(node15);
        int int17 = aVLTree7.height();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree18.getRoot();
        aVLTree18.delete(100);
        aVLTree18.insert((int) (byte) 10);
        Avltree.AVLTree.Node node26 = aVLTree18.getRoot();
        int int27 = aVLTree7.getBalance(node26);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node30 = aVLTree28.find((int) '4');
        aVLTree28.delete((int) 'a');
        Avltree.AVLTree.Node node33 = aVLTree28.getRoot();
        aVLTree28.delete(0);
        Avltree.AVLTree.Node node36 = null;
        int int37 = aVLTree28.getBalance(node36);
        int int38 = aVLTree28.height();
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree28.getBalance(node47);
        int int49 = aVLTree7.getBalance(node47);
        int int50 = aVLTree0.getBalance(node47);
        aVLTree0.delete((-1));
        int int53 = aVLTree0.height();
        int int54 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find(100);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        aVLTree10.delete((int) 'a');
        Avltree.AVLTree.Node node15 = aVLTree10.getRoot();
        aVLTree10.delete(0);
        Avltree.AVLTree.Node node18 = null;
        int int19 = aVLTree10.getBalance(node18);
        int int20 = aVLTree10.height();
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        Avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        aVLTree21.insert((int) (byte) 10);
        Avltree.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree10.getBalance(node29);
        Avltree.AVLTree aVLTree31 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = aVLTree31.find((int) '4');
        aVLTree31.delete((int) 'a');
        Avltree.AVLTree.Node node36 = aVLTree31.getRoot();
        aVLTree31.delete(0);
        Avltree.AVLTree.Node node39 = null;
        int int40 = aVLTree31.getBalance(node39);
        int int41 = aVLTree31.height();
        Avltree.AVLTree aVLTree42 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node44 = aVLTree42.find((int) '4');
        Avltree.AVLTree.Node node45 = aVLTree42.getRoot();
        aVLTree42.delete(100);
        aVLTree42.insert((int) (byte) 10);
        Avltree.AVLTree.Node node50 = aVLTree42.getRoot();
        int int51 = aVLTree31.getBalance(node50);
        int int52 = aVLTree10.getBalance(node50);
        int int53 = aVLTree0.getBalance(node50);
        aVLTree0.insert(100);
        Avltree.AVLTree.Node node56 = aVLTree0.getRoot();
        aVLTree0.insert((int) 'a');
        int int59 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        int int19 = aVLTree0.getBalance(node18);
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree aVLTree5 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node7 = aVLTree5.find((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree5.getRoot();
        aVLTree5.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert((int) (short) 100);
        Avltree.AVLTree.Node node19 = aVLTree11.find((int) ' ');
        int int20 = aVLTree11.height();
        Avltree.AVLTree.Node node21 = aVLTree11.getRoot();
        int int22 = aVLTree5.getBalance(node21);
        int int23 = aVLTree0.getBalance(node21);
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node27 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node12 = aVLTree0.find(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = aVLTree11.getRoot();
        aVLTree11.delete(100);
        aVLTree11.insert((int) (byte) 10);
        Avltree.AVLTree.Node node19 = aVLTree11.getRoot();
        aVLTree11.insert((int) (byte) 100);
        int int22 = aVLTree11.height();
        aVLTree11.delete((int) (byte) 0);
        Avltree.AVLTree.Node node26 = aVLTree11.find(0);
        int int27 = aVLTree11.height();
        Avltree.AVLTree.Node node29 = aVLTree11.find((int) (short) 10);
        int int30 = aVLTree0.getBalance(node29);
        Avltree.AVLTree.Node node32 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(node32);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree11.getBalance(node14);
        aVLTree11.insert(0);
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = null;
        int int20 = aVLTree18.getBalance(node19);
        aVLTree18.insert((int) (byte) 100);
        aVLTree18.insert((int) 'a');
        Avltree.AVLTree.Node node25 = aVLTree18.getRoot();
        int int26 = aVLTree11.getBalance(node25);
        Avltree.AVLTree.Node node28 = aVLTree11.find((int) (short) 100);
        aVLTree11.delete((int) (short) -1);
        Avltree.AVLTree.Node node32 = aVLTree11.find(0);
        int int33 = aVLTree0.getBalance(node32);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node12 = aVLTree0.find(0);
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node15 = aVLTree0.find(0);
        int int16 = aVLTree0.height();
        aVLTree0.delete(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        aVLTree0.insert((int) '4');
        int int13 = aVLTree0.height();
        aVLTree0.insert((int) (byte) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (short) 1);
        java.lang.Class<?> wildcardClass6 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        Avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) ' ');
        Avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        int int18 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        Avltree.AVLTree.Node node16 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        Avltree.AVLTree.Node node20 = aVLTree11.find((int) ' ');
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        Avltree.AVLTree.Node node25 = aVLTree21.find((int) 'a');
        aVLTree21.delete((int) (short) 10);
        Avltree.AVLTree aVLTree28 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree28.getBalance(node29);
        aVLTree28.insert((int) (byte) 100);
        aVLTree28.insert((int) 'a');
        Avltree.AVLTree.Node node36 = aVLTree28.find((int) (byte) 100);
        int int37 = aVLTree21.getBalance(node36);
        int int38 = aVLTree11.getBalance(node36);
        int int39 = aVLTree0.getBalance(node36);
        Avltree.AVLTree.Node node41 = aVLTree0.find((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(node41);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 10);
        aVLTree0.delete((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = null;
        int int12 = aVLTree10.getBalance(node11);
        aVLTree10.insert((int) (byte) 100);
        aVLTree10.insert((int) 'a');
        Avltree.AVLTree.Node node18 = aVLTree10.find((int) (byte) 100);
        Avltree.AVLTree aVLTree19 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node21 = aVLTree19.find((int) '4');
        aVLTree19.delete((int) 'a');
        Avltree.AVLTree.Node node24 = aVLTree19.getRoot();
        aVLTree19.delete(0);
        Avltree.AVLTree.Node node27 = null;
        int int28 = aVLTree19.getBalance(node27);
        int int29 = aVLTree19.height();
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        Avltree.AVLTree.Node node33 = aVLTree30.getRoot();
        aVLTree30.delete(100);
        aVLTree30.insert((int) (byte) 10);
        Avltree.AVLTree.Node node38 = aVLTree30.getRoot();
        int int39 = aVLTree19.getBalance(node38);
        int int40 = aVLTree10.getBalance(node38);
        int int41 = aVLTree0.getBalance(node38);
        Avltree.AVLTree.Node node43 = aVLTree0.find((int) (byte) -1);
        Avltree.AVLTree.Node node45 = aVLTree0.find((int) (byte) -1);
        aVLTree0.insert((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = null;
        int int10 = aVLTree6.getBalance(node9);
        aVLTree6.insert((int) (short) 100);
        Avltree.AVLTree.Node node14 = aVLTree6.find((int) ' ');
        int int15 = aVLTree6.height();
        Avltree.AVLTree.Node node16 = aVLTree6.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        Avltree.AVLTree.Node node19 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node24 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node26 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(node26);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree aVLTree3 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node5 = aVLTree3.find((int) '4');
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree3.getBalance(node6);
        aVLTree3.insert((int) (short) 100);
        Avltree.AVLTree.Node node11 = aVLTree3.find((int) ' ');
        int int12 = aVLTree3.height();
        Avltree.AVLTree.Node node13 = aVLTree3.getRoot();
        int int14 = aVLTree0.getBalance(node13);
        aVLTree0.delete((int) (short) 1);
        int int17 = aVLTree0.height();
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        int int10 = aVLTree0.height();
        Avltree.AVLTree aVLTree11 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = aVLTree11.find((int) '4');
        aVLTree11.delete((int) 'a');
        Avltree.AVLTree.Node node16 = aVLTree11.getRoot();
        Avltree.AVLTree.Node node17 = null;
        int int18 = aVLTree11.getBalance(node17);
        Avltree.AVLTree.Node node20 = aVLTree11.find((int) ' ');
        aVLTree11.insert((-1));
        Avltree.AVLTree.Node node23 = aVLTree11.getRoot();
        aVLTree11.delete((int) (byte) -1);
        aVLTree11.insert(0);
        aVLTree11.delete((int) (byte) -1);
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node32 = aVLTree30.find((int) '4');
        aVLTree30.delete((int) 'a');
        Avltree.AVLTree aVLTree35 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node37 = aVLTree35.find((int) '4');
        Avltree.AVLTree.Node node38 = aVLTree35.getRoot();
        aVLTree35.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree41 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node43 = aVLTree41.find((int) '4');
        Avltree.AVLTree.Node node44 = null;
        int int45 = aVLTree41.getBalance(node44);
        aVLTree41.insert((int) (short) 100);
        Avltree.AVLTree.Node node49 = aVLTree41.find((int) ' ');
        int int50 = aVLTree41.height();
        Avltree.AVLTree.Node node51 = aVLTree41.getRoot();
        int int52 = aVLTree35.getBalance(node51);
        int int53 = aVLTree30.getBalance(node51);
        int int54 = aVLTree11.getBalance(node51);
        int int55 = aVLTree0.getBalance(node51);
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node7 = aVLTree0.find((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (short) 100);
        int int13 = aVLTree0.height();
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node18 = aVLTree14.find((int) 'a');
        Avltree.AVLTree.Node node19 = aVLTree14.getRoot();
        Avltree.AVLTree.Node node20 = aVLTree14.getRoot();
        Avltree.AVLTree.Node node21 = aVLTree14.getRoot();
        aVLTree14.delete((int) (byte) 10);
        int int24 = aVLTree14.height();
        Avltree.AVLTree.Node node26 = aVLTree14.find((int) (short) 10);
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((int) '4');
        Avltree.AVLTree.Node node30 = aVLTree27.getRoot();
        aVLTree27.delete(100);
        aVLTree27.insert((int) (byte) 10);
        Avltree.AVLTree.Node node35 = aVLTree27.getRoot();
        int int36 = aVLTree14.getBalance(node35);
        Avltree.AVLTree aVLTree37 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node38 = null;
        int int39 = aVLTree37.getBalance(node38);
        aVLTree37.insert((int) (byte) 100);
        aVLTree37.insert((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree37.find((int) (byte) 100);
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        aVLTree46.delete((int) 'a');
        Avltree.AVLTree.Node node51 = aVLTree46.getRoot();
        aVLTree46.delete(0);
        Avltree.AVLTree.Node node54 = null;
        int int55 = aVLTree46.getBalance(node54);
        int int56 = aVLTree46.height();
        Avltree.AVLTree aVLTree57 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node59 = aVLTree57.find((int) '4');
        Avltree.AVLTree.Node node60 = aVLTree57.getRoot();
        aVLTree57.delete(100);
        aVLTree57.insert((int) (byte) 10);
        Avltree.AVLTree.Node node65 = aVLTree57.getRoot();
        int int66 = aVLTree46.getBalance(node65);
        int int67 = aVLTree37.getBalance(node65);
        Avltree.AVLTree.Node node68 = aVLTree37.getRoot();
        int int69 = aVLTree14.getBalance(node68);
        int int70 = aVLTree0.getBalance(node68);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        int int14 = aVLTree8.height();
        Avltree.AVLTree.Node node16 = aVLTree8.find((int) (short) -1);
        Avltree.AVLTree.Node node17 = aVLTree8.getRoot();
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node20 = aVLTree18.find((int) '4');
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree18.getBalance(node21);
        aVLTree18.insert(0);
        aVLTree18.insert((int) (short) 10);
        int int27 = aVLTree18.height();
        aVLTree18.delete((-1));
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.delete((int) (byte) -1);
        int int35 = aVLTree30.height();
        int int36 = aVLTree30.height();
        Avltree.AVLTree.Node node38 = aVLTree30.find((int) '#');
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node43 = aVLTree39.find((int) 'a');
        aVLTree39.delete((int) (short) 10);
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node47 = null;
        int int48 = aVLTree46.getBalance(node47);
        aVLTree46.insert((int) (byte) 100);
        aVLTree46.insert((int) 'a');
        Avltree.AVLTree.Node node54 = aVLTree46.find((int) (byte) 100);
        int int55 = aVLTree39.getBalance(node54);
        int int56 = aVLTree30.getBalance(node54);
        int int57 = aVLTree18.getBalance(node54);
        int int58 = aVLTree8.getBalance(node54);
        int int59 = aVLTree0.getBalance(node54);
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        aVLTree6.insert((int) (byte) 10);
        Avltree.AVLTree.Node node14 = aVLTree6.getRoot();
        Avltree.AVLTree aVLTree15 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node17 = aVLTree15.find((int) '4');
        aVLTree15.delete((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree15.getRoot();
        Avltree.AVLTree.Node node21 = null;
        int int22 = aVLTree15.getBalance(node21);
        Avltree.AVLTree.Node node24 = aVLTree15.find((int) ' ');
        Avltree.AVLTree aVLTree25 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node27 = aVLTree25.find((int) '4');
        Avltree.AVLTree.Node node29 = aVLTree25.find((int) 'a');
        aVLTree25.delete((int) (short) 10);
        Avltree.AVLTree aVLTree32 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node33 = null;
        int int34 = aVLTree32.getBalance(node33);
        aVLTree32.insert((int) (byte) 100);
        aVLTree32.insert((int) 'a');
        Avltree.AVLTree.Node node40 = aVLTree32.find((int) (byte) 100);
        int int41 = aVLTree25.getBalance(node40);
        int int42 = aVLTree15.getBalance(node40);
        int int43 = aVLTree6.getBalance(node40);
        int int44 = aVLTree0.getBalance(node40);
        aVLTree0.delete((-1));
        aVLTree0.insert((int) ' ');
        java.lang.Class<?> wildcardClass49 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        aVLTree12.delete((int) 'a');
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node20 = aVLTree17.getRoot();
        aVLTree17.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        Avltree.AVLTree.Node node26 = null;
        int int27 = aVLTree23.getBalance(node26);
        aVLTree23.insert((int) (short) 100);
        Avltree.AVLTree.Node node31 = aVLTree23.find((int) ' ');
        int int32 = aVLTree23.height();
        Avltree.AVLTree.Node node33 = aVLTree23.getRoot();
        int int34 = aVLTree17.getBalance(node33);
        int int35 = aVLTree12.getBalance(node33);
        int int36 = aVLTree12.height();
        aVLTree12.delete((int) (short) -1);
        aVLTree12.insert((int) 'a');
        aVLTree12.delete((-1));
        aVLTree12.delete((int) (byte) 0);
        aVLTree12.delete(0);
        Avltree.AVLTree aVLTree47 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node49 = aVLTree47.find((int) '4');
        Avltree.AVLTree.Node node51 = aVLTree47.find((int) 'a');
        Avltree.AVLTree.Node node53 = aVLTree47.find((int) ' ');
        aVLTree47.delete((int) '4');
        aVLTree47.delete((int) (short) 100);
        Avltree.AVLTree aVLTree58 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node60 = aVLTree58.find((int) '4');
        Avltree.AVLTree.Node node62 = aVLTree58.find((int) 'a');
        Avltree.AVLTree.Node node64 = aVLTree58.find((int) ' ');
        Avltree.AVLTree.Node node66 = aVLTree58.find((int) '#');
        Avltree.AVLTree aVLTree67 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node69 = aVLTree67.find((int) '4');
        Avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree67.getBalance(node70);
        aVLTree67.insert((int) (short) 100);
        Avltree.AVLTree.Node node75 = aVLTree67.find((int) ' ');
        int int76 = aVLTree67.height();
        Avltree.AVLTree.Node node77 = aVLTree67.getRoot();
        int int78 = aVLTree58.getBalance(node77);
        int int79 = aVLTree47.getBalance(node77);
        int int80 = aVLTree12.getBalance(node77);
        int int81 = aVLTree0.getBalance(node77);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }
}

