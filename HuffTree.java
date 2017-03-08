import java.util.*;

public class HuffTree implements Comparable<HuffTree> {
	
	public final int frequency; // the frequency of this tree
    public HuffTree(int freq) { frequency = freq; }
 
    // compares on the frequency
    public int compareTo(HuffTree tree) {
        return frequency - tree.frequency;
    }
}
 
class HuffLeaf extends HuffTree {
    public final char value; // the character this leaf represents
 
    public HuffLeaf(int freq, char Char) {
        super(freq);
        value = Char;
    }
}
 
class HuffNode extends HuffTree {
    public final HuffTree left, right; // subtrees
 
    public HuffNode(HuffTree l, HuffTree r) {
        super(l.frequency + r.frequency);
        left = l;
        right = r;
    }
}


