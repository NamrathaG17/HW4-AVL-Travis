import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
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
        Avltree.AVLTree.Node node55 = aVLTree0.find(100);
        int int56 = aVLTree0.height();
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
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        java.lang.Class<?> wildcardClass30 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        Avltree.AVLTree.Node node29 = aVLTree0.getRoot();
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
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) '#');
        java.lang.Class<?> wildcardClass12 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree0.getBalance(node15);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 100);
        Avltree.AVLTree aVLTree9 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node11 = aVLTree9.find((int) '4');
        Avltree.AVLTree.Node node13 = aVLTree9.find((int) 'a');
        Avltree.AVLTree.Node node15 = aVLTree9.find((int) ' ');
        Avltree.AVLTree.Node node17 = aVLTree9.find((int) (byte) 100);
        Avltree.AVLTree aVLTree18 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree18.getRoot();
        Avltree.AVLTree aVLTree20 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node22 = aVLTree20.find((int) '4');
        Avltree.AVLTree.Node node23 = aVLTree20.getRoot();
        Avltree.AVLTree.Node node25 = aVLTree20.find((int) (short) -1);
        Avltree.AVLTree aVLTree26 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node28 = aVLTree26.find((int) '4');
        aVLTree26.delete((int) 'a');
        Avltree.AVLTree.Node node31 = aVLTree26.getRoot();
        aVLTree26.delete(0);
        Avltree.AVLTree.Node node34 = null;
        int int35 = aVLTree26.getBalance(node34);
        int int36 = aVLTree26.height();
        aVLTree26.delete(100);
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node42 = aVLTree39.getRoot();
        aVLTree39.delete(100);
        aVLTree39.insert((int) (byte) 10);
        Avltree.AVLTree.Node node47 = aVLTree39.getRoot();
        int int48 = aVLTree26.getBalance(node47);
        int int49 = aVLTree20.getBalance(node47);
        int int50 = aVLTree18.getBalance(node47);
        int int51 = aVLTree9.getBalance(node47);
        aVLTree9.delete(10);
        Avltree.AVLTree aVLTree54 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node56 = aVLTree54.find((int) '4');
        Avltree.AVLTree.Node node57 = null;
        int int58 = aVLTree54.getBalance(node57);
        aVLTree54.insert(0);
        aVLTree54.insert((int) (short) 10);
        Avltree.AVLTree.Node node63 = aVLTree54.getRoot();
        Avltree.AVLTree aVLTree64 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node65 = null;
        int int66 = aVLTree64.getBalance(node65);
        aVLTree64.insert((int) (byte) 100);
        aVLTree64.insert((int) 'a');
        Avltree.AVLTree.Node node72 = aVLTree64.find((int) (byte) 100);
        Avltree.AVLTree aVLTree73 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node75 = aVLTree73.find((int) '4');
        aVLTree73.delete((int) 'a');
        Avltree.AVLTree.Node node78 = aVLTree73.getRoot();
        aVLTree73.delete(0);
        Avltree.AVLTree.Node node81 = null;
        int int82 = aVLTree73.getBalance(node81);
        int int83 = aVLTree73.height();
        Avltree.AVLTree aVLTree84 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node86 = aVLTree84.find((int) '4');
        Avltree.AVLTree.Node node87 = aVLTree84.getRoot();
        aVLTree84.delete(100);
        aVLTree84.insert((int) (byte) 10);
        Avltree.AVLTree.Node node92 = aVLTree84.getRoot();
        int int93 = aVLTree73.getBalance(node92);
        int int94 = aVLTree64.getBalance(node92);
        int int95 = aVLTree54.getBalance(node92);
        int int96 = aVLTree9.getBalance(node92);
        int int97 = aVLTree0.getBalance(node92);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertNull(node87);
        org.junit.Assert.assertNotNull(node92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        java.lang.Class<?> wildcardClass15 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        java.lang.Class<?> wildcardClass8 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
        int int13 = aVLTree0.height();
        Avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node16 = aVLTree14.find((int) '4');
        Avltree.AVLTree.Node node17 = aVLTree14.getRoot();
        aVLTree14.delete(100);
        aVLTree14.insert((int) (byte) 10);
        Avltree.AVLTree.Node node22 = aVLTree14.getRoot();
        Avltree.AVLTree aVLTree23 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node25 = aVLTree23.find((int) '4');
        aVLTree23.delete((int) 'a');
        Avltree.AVLTree.Node node28 = aVLTree23.getRoot();
        Avltree.AVLTree.Node node29 = null;
        int int30 = aVLTree23.getBalance(node29);
        Avltree.AVLTree.Node node32 = aVLTree23.find((int) ' ');
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
        int int50 = aVLTree23.getBalance(node48);
        int int51 = aVLTree14.getBalance(node48);
        Avltree.AVLTree aVLTree52 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node54 = aVLTree52.find((int) '4');
        Avltree.AVLTree.Node node56 = aVLTree52.find((int) 'a');
        Avltree.AVLTree.Node node57 = aVLTree52.getRoot();
        Avltree.AVLTree.Node node58 = aVLTree52.getRoot();
        Avltree.AVLTree.Node node59 = aVLTree52.getRoot();
        Avltree.AVLTree aVLTree60 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node61 = null;
        int int62 = aVLTree60.getBalance(node61);
        Avltree.AVLTree aVLTree63 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        Avltree.AVLTree.Node node66 = aVLTree63.getRoot();
        aVLTree63.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node71 = aVLTree69.find((int) '4');
        Avltree.AVLTree.Node node72 = null;
        int int73 = aVLTree69.getBalance(node72);
        aVLTree69.insert((int) (short) 100);
        Avltree.AVLTree.Node node77 = aVLTree69.find((int) ' ');
        int int78 = aVLTree69.height();
        Avltree.AVLTree.Node node79 = aVLTree69.getRoot();
        int int80 = aVLTree63.getBalance(node79);
        int int81 = aVLTree60.getBalance(node79);
        int int82 = aVLTree52.getBalance(node79);
        int int83 = aVLTree14.getBalance(node79);
        int int84 = aVLTree0.getBalance(node79);
        int int85 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(node58);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNull(node77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find(10);
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        int int14 = aVLTree8.height();
        Avltree.AVLTree.Node node16 = aVLTree8.find((int) (short) -1);
        aVLTree8.insert(0);
        Avltree.AVLTree.Node node19 = aVLTree8.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        Avltree.AVLTree.Node node20 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        int int8 = aVLTree0.height();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        org.junit.Assert.assertNull(node46);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree.Node node15 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree aVLTree14 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree14.getBalance(node15);
        aVLTree14.insert((int) (byte) 100);
        aVLTree14.insert((int) 'a');
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        Avltree.AVLTree.Node node24 = null;
        int int25 = aVLTree21.getBalance(node24);
        aVLTree21.insert((int) (short) 100);
        Avltree.AVLTree.Node node29 = aVLTree21.find((int) ' ');
        int int30 = aVLTree21.height();
        Avltree.AVLTree.Node node31 = aVLTree21.getRoot();
        int int32 = aVLTree14.getBalance(node31);
        Avltree.AVLTree aVLTree33 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        aVLTree33.delete((int) 'a');
        Avltree.AVLTree.Node node38 = aVLTree33.getRoot();
        aVLTree33.delete(0);
        Avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree33.getBalance(node41);
        int int43 = aVLTree33.height();
        aVLTree33.delete(100);
        Avltree.AVLTree aVLTree46 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node48 = aVLTree46.find((int) '4');
        Avltree.AVLTree.Node node49 = aVLTree46.getRoot();
        aVLTree46.delete(100);
        aVLTree46.insert((int) (byte) 10);
        Avltree.AVLTree.Node node54 = aVLTree46.getRoot();
        int int55 = aVLTree33.getBalance(node54);
        int int56 = aVLTree14.getBalance(node54);
        int int57 = aVLTree0.getBalance(node54);
        java.lang.Class<?> wildcardClass58 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node49);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.insert((int) (short) 1);
        aVLTree0.insert((int) '#');
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node15 = aVLTree0.find((int) (byte) 0);
        aVLTree0.delete((int) ' ');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        Avltree.AVLTree.Node node11 = aVLTree8.getRoot();
        aVLTree8.delete(100);
        aVLTree8.insert((int) (byte) 10);
        Avltree.AVLTree.Node node16 = aVLTree8.getRoot();
        int int17 = aVLTree0.getBalance(node16);
        Avltree.AVLTree.Node node19 = aVLTree0.find((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        Avltree.AVLTree.Node node64 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node65 = aVLTree0.getRoot();
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
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node65);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
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
        java.lang.Class<?> wildcardClass17 = node16.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 1);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        Avltree.AVLTree aVLTree30 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node31 = null;
        int int32 = aVLTree30.getBalance(node31);
        aVLTree30.insert((int) (byte) 100);
        aVLTree30.insert((int) 'a');
        Avltree.AVLTree.Node node38 = aVLTree30.find((int) (byte) 100);
        Avltree.AVLTree.Node node39 = aVLTree30.getRoot();
        Avltree.AVLTree aVLTree40 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = null;
        int int42 = aVLTree40.getBalance(node41);
        aVLTree40.insert((int) (byte) 100);
        aVLTree40.insert((int) 'a');
        Avltree.AVLTree.Node node47 = aVLTree40.getRoot();
        int int48 = aVLTree30.getBalance(node47);
        int int49 = aVLTree0.getBalance(node47);
        Avltree.AVLTree.Node node51 = aVLTree0.find((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(node51);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = aVLTree0.getRoot();
        int int2 = aVLTree0.height();
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        int int7 = aVLTree0.height();
        aVLTree0.insert((int) 'a');
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.find(10);
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (short) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        aVLTree0.delete((int) 'a');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        java.lang.Class<?> wildcardClass84 = node77.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        java.lang.Class<?> wildcardClass43 = node38.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 10);
        Avltree.AVLTree.Node node14 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        aVLTree0.delete(100);
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
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 1);
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
        int int34 = aVLTree0.getBalance(node32);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
        Avltree.AVLTree.Node node51 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(node51);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.delete((int) ' ');
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) ' ');
        int int9 = aVLTree0.height();
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass55 = node54.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        java.lang.Class<?> wildcardClass20 = node18.getClass();
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
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
        aVLTree0.delete((int) (byte) -1);
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
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree.Node node14 = aVLTree0.getRoot();
        int int15 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        aVLTree0.insert(1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(1);
        aVLTree0.delete(10);
        Avltree.AVLTree.Node node14 = null;
        int int15 = aVLTree0.getBalance(node14);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.insert((-1));
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.find(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
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
        Avltree.AVLTree aVLTree39 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node41 = aVLTree39.find((int) '4');
        Avltree.AVLTree.Node node43 = aVLTree39.find((int) 'a');
        Avltree.AVLTree.Node node45 = aVLTree39.find((int) ' ');
        Avltree.AVLTree.Node node47 = aVLTree39.find(0);
        Avltree.AVLTree aVLTree48 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        aVLTree48.delete(1);
        aVLTree48.delete((int) '#');
        aVLTree48.delete((int) (short) -1);
        Avltree.AVLTree.Node node59 = aVLTree48.getRoot();
        Avltree.AVLTree.Node node61 = aVLTree48.find((int) (byte) 100);
        int int62 = aVLTree48.height();
        Avltree.AVLTree aVLTree63 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node65 = aVLTree63.find((int) '4');
        Avltree.AVLTree.Node node66 = aVLTree63.getRoot();
        aVLTree63.insert((int) (byte) 100);
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
        int int86 = aVLTree63.getBalance(node84);
        int int87 = aVLTree48.getBalance(node84);
        int int88 = aVLTree39.getBalance(node84);
        int int89 = aVLTree7.getBalance(node84);
        int int90 = aVLTree0.getBalance(node84);
        Avltree.AVLTree.Node node91 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
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
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNull(node47);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNull(node65);
        org.junit.Assert.assertNull(node66);
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
        org.junit.Assert.assertNull(node91);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
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
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        int int4 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(node11);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        int int3 = aVLTree0.height();
        aVLTree0.delete((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        Avltree.AVLTree.Node node46 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass47 = node46.getClass();
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
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.insert((int) '#');
        int int12 = aVLTree0.height();
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node5);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree2 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node4 = aVLTree2.find((int) '4');
        Avltree.AVLTree.Node node5 = aVLTree2.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree2.find((int) (short) -1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree8.getRoot();
        aVLTree8.delete(0);
        Avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree8.getBalance(node16);
        int int18 = aVLTree8.height();
        aVLTree8.delete(100);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        Avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        aVLTree21.insert((int) (byte) 10);
        Avltree.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree8.getBalance(node29);
        int int31 = aVLTree2.getBalance(node29);
        int int32 = aVLTree0.getBalance(node29);
        Avltree.AVLTree.Node node34 = aVLTree0.find((int) (short) -1);
        int int35 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete((int) ' ');
        int int7 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        int int10 = aVLTree0.height();
        aVLTree0.delete(100);
        aVLTree0.insert(10);
        Avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(node15);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node8 = aVLTree0.find(0);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
        aVLTree0.delete(10);
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
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) '4');
        java.lang.Class<?> wildcardClass14 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        java.lang.Class<?> wildcardClass91 = aVLTree0.getClass();
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
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) '#');
        int int12 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
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
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.delete(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        java.lang.Class<?> wildcardClass38 = node36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node13 = aVLTree10.getRoot();
        aVLTree10.delete(100);
        int int16 = aVLTree10.height();
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
        Avltree.AVLTree aVLTree61 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node63 = aVLTree61.find((int) '4');
        aVLTree61.delete((int) 'a');
        Avltree.AVLTree.Node node66 = aVLTree61.getRoot();
        aVLTree61.delete((int) (byte) 1);
        Avltree.AVLTree aVLTree69 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = null;
        int int71 = aVLTree69.getBalance(node70);
        Avltree.AVLTree aVLTree72 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node74 = aVLTree72.find((int) '4');
        Avltree.AVLTree.Node node75 = aVLTree72.getRoot();
        aVLTree72.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree78 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node80 = aVLTree78.find((int) '4');
        Avltree.AVLTree.Node node81 = null;
        int int82 = aVLTree78.getBalance(node81);
        aVLTree78.insert((int) (short) 100);
        Avltree.AVLTree.Node node86 = aVLTree78.find((int) ' ');
        int int87 = aVLTree78.height();
        Avltree.AVLTree.Node node88 = aVLTree78.getRoot();
        int int89 = aVLTree72.getBalance(node88);
        int int90 = aVLTree69.getBalance(node88);
        int int91 = aVLTree61.getBalance(node88);
        int int92 = aVLTree10.getBalance(node88);
        int int93 = aVLTree0.getBalance(node88);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
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
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(node74);
        org.junit.Assert.assertNull(node75);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNull(node86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
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
        Avltree.AVLTree.Node node15 = aVLTree0.find(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (short) -1);
        aVLTree0.delete((int) ' ');
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        Avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        Avltree.AVLTree.Node node15 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        aVLTree0.delete((int) (short) 1);
        aVLTree0.insert(0);
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        Avltree.AVLTree.Node node34 = aVLTree0.getRoot();
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
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
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
        aVLTree0.delete((int) 'a');
        int int59 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
        aVLTree0.insert((int) 'a');
        int int20 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 10);
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree0.find((-1));
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) -1);
        Avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) ' ');
        aVLTree0.delete(100);
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        Avltree.AVLTree.Node node7 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert(0);
        Avltree.AVLTree.Node node19 = aVLTree12.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        aVLTree0.delete((int) (short) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) -1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree10 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node12 = aVLTree10.find((int) '4');
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree10.getBalance(node13);
        aVLTree10.insert(0);
        aVLTree10.insert((int) (short) 10);
        int int19 = aVLTree10.height();
        aVLTree10.delete((-1));
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = null;
        int int24 = aVLTree22.getBalance(node23);
        aVLTree22.delete((int) (byte) -1);
        int int27 = aVLTree22.height();
        int int28 = aVLTree22.height();
        Avltree.AVLTree.Node node30 = aVLTree22.find((int) '#');
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
        int int48 = aVLTree22.getBalance(node46);
        int int49 = aVLTree10.getBalance(node46);
        int int50 = aVLTree0.getBalance(node46);
        java.lang.Class<?> wildcardClass51 = node46.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        int int9 = aVLTree0.height();
        aVLTree0.delete((-1));
        // The following exception was thrown during execution in test generation
        try {
            aVLTree0.insert((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: duplicate Key!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        aVLTree0.delete((int) ' ');
        java.lang.Class<?> wildcardClass32 = aVLTree0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.delete((int) (byte) -1);
        int int5 = aVLTree0.height();
        int int6 = aVLTree0.height();
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) '#');
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        java.lang.Class<?> wildcardClass10 = aVLTree0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
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
        int int52 = aVLTree0.height();
        int int53 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
        aVLTree0.insert((int) 'a');
        aVLTree0.delete((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (byte) 1);
        aVLTree0.insert((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree2 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node4 = aVLTree2.find((int) '4');
        Avltree.AVLTree.Node node5 = aVLTree2.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree2.find((int) (short) -1);
        Avltree.AVLTree aVLTree8 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node10 = aVLTree8.find((int) '4');
        aVLTree8.delete((int) 'a');
        Avltree.AVLTree.Node node13 = aVLTree8.getRoot();
        aVLTree8.delete(0);
        Avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree8.getBalance(node16);
        int int18 = aVLTree8.height();
        aVLTree8.delete(100);
        Avltree.AVLTree aVLTree21 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node23 = aVLTree21.find((int) '4');
        Avltree.AVLTree.Node node24 = aVLTree21.getRoot();
        aVLTree21.delete(100);
        aVLTree21.insert((int) (byte) 10);
        Avltree.AVLTree.Node node29 = aVLTree21.getRoot();
        int int30 = aVLTree8.getBalance(node29);
        int int31 = aVLTree2.getBalance(node29);
        int int32 = aVLTree0.getBalance(node29);
        Avltree.AVLTree.Node node34 = aVLTree0.find(10);
        int int35 = aVLTree0.height();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        aVLTree0.delete((int) (short) -1);
        aVLTree0.insert(10);
        java.lang.Class<?> wildcardClass13 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
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
        Avltree.AVLTree.Node node18 = aVLTree0.find(0);
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
        int int52 = aVLTree0.getBalance(node48);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
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
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (short) 10);
        int int7 = aVLTree0.height();
        aVLTree0.delete(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
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
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
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
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
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
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) -1);
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
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
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert(10);
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
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
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        int int4 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
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
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
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
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
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
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
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
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
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
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
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
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
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
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
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
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
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
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
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
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
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
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
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
        aVLTree0.delete((-1));
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
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
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        int int10 = aVLTree0.height();
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 1);
        Avltree.AVLTree.Node node14 = aVLTree0.find((int) (short) 100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) ' ');
        aVLTree0.delete((int) '4');
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        Avltree.AVLTree.Node node8 = null;
        int int9 = aVLTree0.getBalance(node8);
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) (short) 10);
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        aVLTree0.insert(10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        aVLTree0.delete((int) (byte) -1);
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.find(10);
        int int10 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.insert((int) (short) 0);
        aVLTree0.insert((int) '4');
        java.lang.Class<?> wildcardClass7 = aVLTree0.getClass();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
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
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
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
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
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
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
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
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
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
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
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
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
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
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree6 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node8 = aVLTree6.find((int) '4');
        Avltree.AVLTree.Node node9 = aVLTree6.getRoot();
        aVLTree6.delete(100);
        int int12 = aVLTree6.height();
        Avltree.AVLTree.Node node14 = aVLTree6.find((int) (short) -1);
        Avltree.AVLTree.Node node15 = aVLTree6.getRoot();
        Avltree.AVLTree.Node node16 = aVLTree6.getRoot();
        aVLTree6.insert((int) (byte) 1);
        Avltree.AVLTree.Node node19 = aVLTree6.getRoot();
        int int20 = aVLTree0.getBalance(node19);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
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
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
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
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
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
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
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
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
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
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
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
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert(0);
        aVLTree0.insert((int) (short) 10);
        int int9 = aVLTree0.height();
        int int10 = aVLTree0.height();
        aVLTree0.delete((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.insert((int) (short) -1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        aVLTree0.delete((int) (byte) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
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
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
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
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
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
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
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
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
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
        Avltree.AVLTree aVLTree48 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node50 = aVLTree48.find((int) '4');
        aVLTree48.delete((int) 'a');
        aVLTree48.insert((int) (short) 1);
        Avltree.AVLTree.Node node56 = aVLTree48.find((int) ' ');
        aVLTree48.insert((int) (short) 10);
        aVLTree48.insert(0);
        Avltree.AVLTree.Node node61 = aVLTree48.getRoot();
        int int62 = aVLTree0.getBalance(node61);
        Avltree.AVLTree.Node node63 = aVLTree0.getRoot();
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
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
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
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
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
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
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
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
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
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
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
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
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
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
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
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node4 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert(1);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find((int) '#');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        Avltree.AVLTree.Node node11 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
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
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
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
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
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
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
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
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
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
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
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
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
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
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
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
        int int67 = aVLTree0.height();
        aVLTree0.delete(0);
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
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
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
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
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
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
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
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
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
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
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
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
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
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
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
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
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
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
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
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
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
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
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
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
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
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
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
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
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
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
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
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
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
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
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
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
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
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
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
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 0);
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
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
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
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
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
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
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
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
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
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
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
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
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
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
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
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
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int11 = aVLTree0.height();
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node14 = aVLTree12.find((int) '4');
        Avltree.AVLTree.Node node15 = null;
        int int16 = aVLTree12.getBalance(node15);
        aVLTree12.insert((int) '4');
        Avltree.AVLTree.Node node20 = aVLTree12.find(100);
        Avltree.AVLTree.Node node21 = aVLTree12.getRoot();
        Avltree.AVLTree aVLTree22 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node24 = aVLTree22.find((int) '4');
        aVLTree22.delete((int) 'a');
        Avltree.AVLTree.Node node27 = aVLTree22.getRoot();
        aVLTree22.delete(0);
        Avltree.AVLTree.Node node30 = null;
        int int31 = aVLTree22.getBalance(node30);
        int int32 = aVLTree22.height();
        Avltree.AVLTree aVLTree33 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node35 = aVLTree33.find((int) '4');
        Avltree.AVLTree.Node node36 = aVLTree33.getRoot();
        aVLTree33.delete(100);
        aVLTree33.insert((int) (byte) 10);
        Avltree.AVLTree.Node node41 = aVLTree33.getRoot();
        int int42 = aVLTree22.getBalance(node41);
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
        int int64 = aVLTree22.getBalance(node62);
        int int65 = aVLTree12.getBalance(node62);
        Avltree.AVLTree.Node node66 = aVLTree12.getRoot();
        int int67 = aVLTree0.getBalance(node66);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
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
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
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
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
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
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
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
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
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
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
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
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 0);
        aVLTree0.insert((int) (byte) 1);
        int int11 = aVLTree0.height();
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
        int int74 = aVLTree12.height();
        Avltree.AVLTree.Node node75 = aVLTree12.getRoot();
        int int76 = aVLTree0.getBalance(node75);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
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
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
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
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
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
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
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
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
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
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
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
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
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
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
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
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
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
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
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
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
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
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
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
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
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
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
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
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
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
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
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
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
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
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
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
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
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
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
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
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
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
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
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
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
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
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
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
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
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
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        aVLTree0.delete(0);
        aVLTree0.insert((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
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
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
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
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
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
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
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
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
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
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
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
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
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
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
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
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
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
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
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
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        Avltree.AVLTree.Node node6 = aVLTree0.find((int) '#');
        int int7 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        aVLTree0.delete((int) '4');
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        int int8 = aVLTree0.height();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        aVLTree0.insert(0);
        Avltree.AVLTree aVLTree12 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node13 = null;
        int int14 = aVLTree12.getBalance(node13);
        aVLTree12.insert((int) (byte) 100);
        aVLTree12.insert((int) 'a');
        Avltree.AVLTree.Node node20 = aVLTree12.find((int) (byte) 100);
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
        int int42 = aVLTree12.getBalance(node40);
        Avltree.AVLTree.Node node43 = aVLTree12.getRoot();
        Avltree.AVLTree aVLTree44 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node46 = aVLTree44.find((int) '4');
        Avltree.AVLTree.Node node48 = aVLTree44.find((int) 'a');
        Avltree.AVLTree.Node node50 = aVLTree44.find((int) ' ');
        Avltree.AVLTree.Node node52 = aVLTree44.find(0);
        Avltree.AVLTree aVLTree53 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node55 = aVLTree53.find((int) '4');
        aVLTree53.delete((int) 'a');
        aVLTree53.delete(1);
        aVLTree53.delete((int) '#');
        aVLTree53.delete((int) (short) -1);
        Avltree.AVLTree.Node node64 = aVLTree53.getRoot();
        Avltree.AVLTree.Node node66 = aVLTree53.find((int) (byte) 100);
        int int67 = aVLTree53.height();
        Avltree.AVLTree aVLTree68 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node70 = aVLTree68.find((int) '4');
        Avltree.AVLTree.Node node71 = aVLTree68.getRoot();
        aVLTree68.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree74 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node76 = aVLTree74.find((int) '4');
        Avltree.AVLTree.Node node78 = aVLTree74.find((int) 'a');
        aVLTree74.delete((int) (short) 10);
        Avltree.AVLTree aVLTree81 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node82 = null;
        int int83 = aVLTree81.getBalance(node82);
        aVLTree81.insert((int) (byte) 100);
        aVLTree81.insert((int) 'a');
        Avltree.AVLTree.Node node89 = aVLTree81.find((int) (byte) 100);
        int int90 = aVLTree74.getBalance(node89);
        int int91 = aVLTree68.getBalance(node89);
        int int92 = aVLTree53.getBalance(node89);
        int int93 = aVLTree44.getBalance(node89);
        int int94 = aVLTree12.getBalance(node89);
        int int95 = aVLTree0.getBalance(node89);
        Avltree.AVLTree.Node node97 = aVLTree0.find((int) (short) 1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNull(node46);
        org.junit.Assert.assertNull(node48);
        org.junit.Assert.assertNull(node50);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(node66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertNull(node97);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
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
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
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
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
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
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
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
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
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
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
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
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
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
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
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
        int int61 = aVLTree0.height();
        Avltree.AVLTree.Node node63 = aVLTree0.find((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(node63);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        int int9 = aVLTree0.height();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
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
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
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
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
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
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
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
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
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
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
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
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.insert(10);
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = null;
        int int7 = aVLTree0.getBalance(node6);
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        int int11 = aVLTree0.height();
        Avltree.AVLTree.Node node13 = aVLTree0.find((int) (byte) 0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
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
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
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
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
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
        aVLTree0.delete(0);
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
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
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
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
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
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
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
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
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
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
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
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        Avltree.AVLTree.Node node5 = aVLTree0.find((int) (byte) 100);
        aVLTree0.delete((int) (short) 100);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (byte) 10);
        Avltree.AVLTree.Node node12 = aVLTree0.find(100);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
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
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
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
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
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
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
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
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node11 = aVLTree0.find(10);
        Avltree.AVLTree.Node node12 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node13 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
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
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
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
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
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
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
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
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
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
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
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
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        aVLTree0.delete((int) (short) 10);
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = null;
        int int11 = aVLTree0.getBalance(node10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
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
        Avltree.AVLTree.Node node48 = aVLTree0.find(100);
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
        org.junit.Assert.assertNull(node48);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.insert((int) (byte) 100);
        int int6 = aVLTree0.height();
        aVLTree0.delete((int) (byte) 10);
        aVLTree0.delete((int) (byte) 1);
        aVLTree0.delete((int) ' ');
        Avltree.AVLTree.Node node14 = aVLTree0.find((int) (byte) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
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
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
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
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
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
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
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
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
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
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
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
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
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
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
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
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
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
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
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
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        aVLTree0.delete((int) '4');
        aVLTree0.insert((int) '4');
        org.junit.Assert.assertNull(node2);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
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
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        aVLTree0.insert((int) '4');
        Avltree.AVLTree.Node node8 = aVLTree0.find(100);
        aVLTree0.delete((int) (short) -1);
        int int11 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
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
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
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
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
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
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
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
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
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
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
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
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
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
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
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
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
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
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
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
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
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
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
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
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
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
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
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
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
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
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node1 = null;
        int int2 = aVLTree0.getBalance(node1);
        aVLTree0.insert((int) (byte) 100);
        aVLTree0.insert((int) 'a');
        Avltree.AVLTree.Node node8 = aVLTree0.find((int) (byte) 100);
        Avltree.AVLTree.Node node9 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node10 = aVLTree0.getRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(node10);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
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
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
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
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
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
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree7 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node9 = aVLTree7.find((int) '4');
        Avltree.AVLTree.Node node10 = aVLTree7.getRoot();
        aVLTree7.insert((int) (byte) 100);
        Avltree.AVLTree aVLTree13 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node15 = aVLTree13.find((int) '4');
        Avltree.AVLTree.Node node16 = null;
        int int17 = aVLTree13.getBalance(node16);
        aVLTree13.insert((int) (short) 100);
        Avltree.AVLTree.Node node21 = aVLTree13.find((int) ' ');
        int int22 = aVLTree13.height();
        Avltree.AVLTree.Node node23 = aVLTree13.getRoot();
        int int24 = aVLTree7.getBalance(node23);
        Avltree.AVLTree.Node node26 = aVLTree7.find((int) '4');
        Avltree.AVLTree aVLTree27 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node29 = aVLTree27.find((-1));
        int int30 = aVLTree27.height();
        Avltree.AVLTree.Node node32 = aVLTree27.find((int) (byte) 100);
        aVLTree27.insert(0);
        Avltree.AVLTree.Node node35 = aVLTree27.getRoot();
        int int36 = aVLTree7.getBalance(node35);
        aVLTree7.insert((int) (byte) 1);
        Avltree.AVLTree.Node node39 = aVLTree7.getRoot();
        int int40 = aVLTree0.getBalance(node39);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
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
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
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
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
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
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
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
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
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
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
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
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
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
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
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
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
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
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
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
        Avltree.AVLTree.Node node54 = aVLTree52.find((-1));
        int int55 = aVLTree52.height();
        Avltree.AVLTree.Node node56 = aVLTree52.getRoot();
        Avltree.AVLTree aVLTree57 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node58 = null;
        int int59 = aVLTree57.getBalance(node58);
        aVLTree57.insert((int) (byte) 100);
        aVLTree57.insert((int) 'a');
        Avltree.AVLTree.Node node65 = aVLTree57.find((int) (byte) 100);
        Avltree.AVLTree aVLTree66 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node68 = aVLTree66.find((int) '4');
        aVLTree66.delete((int) 'a');
        Avltree.AVLTree.Node node71 = aVLTree66.getRoot();
        aVLTree66.delete(0);
        Avltree.AVLTree.Node node74 = null;
        int int75 = aVLTree66.getBalance(node74);
        int int76 = aVLTree66.height();
        Avltree.AVLTree aVLTree77 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node79 = aVLTree77.find((int) '4');
        Avltree.AVLTree.Node node80 = aVLTree77.getRoot();
        aVLTree77.delete(100);
        aVLTree77.insert((int) (byte) 10);
        Avltree.AVLTree.Node node85 = aVLTree77.getRoot();
        int int86 = aVLTree66.getBalance(node85);
        int int87 = aVLTree57.getBalance(node85);
        Avltree.AVLTree.Node node88 = aVLTree57.getRoot();
        int int89 = aVLTree52.getBalance(node88);
        int int90 = aVLTree31.getBalance(node88);
        int int91 = aVLTree0.getBalance(node88);
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
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(node44);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertNull(node68);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNull(node79);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
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
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
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
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
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
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
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
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
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
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
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
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
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
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
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
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
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
        Avltree.AVLTree.Node node16 = aVLTree0.getRoot();
        Avltree.AVLTree aVLTree17 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node19 = aVLTree17.find((int) '4');
        Avltree.AVLTree.Node node21 = aVLTree17.find((int) 'a');
        aVLTree17.insert((int) (short) -1);
        Avltree.AVLTree.Node node24 = aVLTree17.getRoot();
        int int25 = aVLTree0.getBalance(node24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node3 = null;
        int int4 = aVLTree0.getBalance(node3);
        Avltree.AVLTree.Node node5 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node6 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node8 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
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
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        aVLTree0.delete((int) 'a');
        aVLTree0.delete(1);
        aVLTree0.delete((int) '#');
        Avltree.AVLTree.Node node10 = aVLTree0.find((int) (short) 1);
        Avltree.AVLTree.Node node12 = aVLTree0.find((int) (short) 100);
        aVLTree0.delete((int) (short) 100);
        Avltree.AVLTree.Node node16 = aVLTree0.find((int) (byte) -1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(node17);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
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
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
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
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
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
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
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
        Avltree.AVLTree.Node node17 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node18 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
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
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        int int3 = aVLTree0.height();
        aVLTree0.insert(0);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
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
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
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
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((int) '4');
        Avltree.AVLTree.Node node4 = aVLTree0.find((int) 'a');
        aVLTree0.delete((int) (byte) 0);
        aVLTree0.insert((int) (short) 10);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
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
        Avltree.AVLTree.Node node18 = aVLTree0.find(0);
        Avltree.AVLTree.Node node19 = aVLTree0.getRoot();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node19);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
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
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
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
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
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
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
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
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
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
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
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
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
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
        int int33 = aVLTree0.height();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
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
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
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
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
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
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
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
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
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
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
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
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
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
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
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
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
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
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
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
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
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
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        Avltree.AVLTree aVLTree0 = new Avltree.AVLTree();
        Avltree.AVLTree.Node node2 = aVLTree0.find((-1));
        aVLTree0.delete(100);
        aVLTree0.insert((int) (short) 1);
        Avltree.AVLTree.Node node7 = aVLTree0.getRoot();
        Avltree.AVLTree.Node node9 = aVLTree0.find((int) ' ');
        aVLTree0.insert((int) (byte) -1);
        aVLTree0.insert((int) '#');
        int int14 = aVLTree0.height();
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
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
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
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
        Avltree.AVLTree.Node node30 = aVLTree0.getRoot();
        int int31 = aVLTree0.height();
        int int32 = aVLTree0.height();
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
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
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
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
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
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
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
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
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
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
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
        aVLTree0.delete(100);
        aVLTree0.delete((int) (byte) -1);
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
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
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
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
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
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
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
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
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
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
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
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
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
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
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
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
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
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
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
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
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
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
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
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
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
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
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
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
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
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
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
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
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
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
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
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
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
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
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
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
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
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
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
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
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
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
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
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
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
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
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
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
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
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
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
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
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
}

