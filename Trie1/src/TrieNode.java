import java.util.HashMap;
import java.util.Map;

class TrieNode {
    public boolean isWord;
    public Map<Character, TrieNode> childrenMap = new HashMap<>();

}
