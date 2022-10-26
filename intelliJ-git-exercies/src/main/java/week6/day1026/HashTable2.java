package week6.day1026;

import java.util.ArrayList;
import java.util.List;

public class HashTable2 {
    class Node{
        private String key;
        private int value;

        public Node(String key, int value){
            this.key=key;
            this.value=value;
        }

        public String getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }
    private List<Node>[] table=new ArrayList[1000];


    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 1000;
    }
    public void insert(String key, Integer value){
        int hashCode=hash(key);
        if(this.table[hashCode]==null){
            this.table[hashCode]=new ArrayList<>();
        }
        this.table[hashCode].add(new Node(key, value));
    }

    public Integer get(String key){
        List<Node> nodes=this.table[hash(key)];
        for(Node node:nodes){
            if(key.equals(node.getKey())){
                return node.value;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashTable2 ht = new HashTable2();
        ht.insert("Yoonseo", 1);
        ht.insert("Seoyoon", 2);

        int result = ht.get("Yoonseo");
        if (result == 1) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

        result = ht.get("Seoyoon");
        if (result == 2) {
            System.out.println("테스트 성공");
        } else {
            System.out.printf("테스트 실패 value:%d", result);
        }

    }
}

