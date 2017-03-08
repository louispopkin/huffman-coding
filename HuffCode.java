import java.util.*;

public class HuffCode {
	public int print;
	public static Dictionary dict = new Dictionary();
	public HuffCode(String test){
		compress(test);
	}
	public static HuffTree buildTree(int[] charF){
		PriorityQueue<HuffTree> trees = new PriorityQueue<HuffTree>();
        // initially, we have a forest of leaves
        // one for each non-empty character
        for (int i = 0; i < charF.length; i++)
            if (charF[i] > 0)
                trees.offer(new HuffLeaf(charF[i], (char)i));
 
        assert trees.size() > 0;
        // loop until there is only one tree left
        while (trees.size() > 1) {
            // two trees with least frequency
            HuffTree a = trees.poll();
            HuffTree b = trees.poll();
 
            // put into new node and re-insert into queue
            trees.offer(new HuffNode(a, b));
        }
        return trees.poll();
	}
	public static void printToDict(HuffTree tree, StringBuffer prefix) {
        assert tree != null;
        if (tree instanceof HuffLeaf) {
            HuffLeaf leaf = (HuffLeaf)tree;
 
            // print out character, frequency, and code for this leaf (which is just the prefix)
            //System.out.println(leaf.value + "\t" + leaf.frequency + "\t" + prefix);
         
            dict.add(new FreqNode((char)leaf.value,prefix.toString()));
            
            
        } else if (tree instanceof HuffNode) {
            HuffNode node = (HuffNode)tree;
 
            // traverse left
            prefix.append('0');
            printToDict(node.left, prefix);
            prefix.deleteCharAt(prefix.length()-1);
 
            // traverse right
            prefix.append('1');
            printToDict(node.right, prefix);
            prefix.deleteCharAt(prefix.length()-1);
        }
    }
	public void compress(String test){
		int[] charFreqs = new int[256];
        for (char c : test.toCharArray())
            charFreqs[c]++;
 
        HuffTree tree = HuffCode.buildTree(charFreqs);
        HuffCode.printToDict(tree, new StringBuffer());
		
	}
	public Dictionary getDict(){
		return dict;
	}
}
