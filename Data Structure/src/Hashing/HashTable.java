package Hashing;


class ListNode{
    int data;
    int key;
    ListNode next;


    public void setData(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setKey(int key){
        this.key = key;
    }

    public int getKey(){
        return key;
    }

    public void setNext(ListNode next){
        this.next = next;
    }

    public ListNode getNext(){
        return next;
    }

}

class HashTableNode{
    int blockCount;
    ListNode startNode;

    public void setBlockCount(int blockCount){
        this.blockCount = blockCount;
    }

    public int getBlockCount(){
        return blockCount;
    }

    public void setStartNode(ListNode startNode){
        this.startNode = startNode;
    }

    public ListNode getStartNode(){
        return startNode;
    }
}



public class HashTable{

    int size;
    int count;
    HashTableNode[] table;

    public void setSize(int size){
        this.size = size;
        table = new HashTableNode[size];
    }

    public int getSize(){
        return size;
    }

    public void setCount(int count){
        this.count = count;

    }

    public int getCount(){
        return count;
    }

    public void setTable(HashTableNode[] table){
        this.table = table;
    }

    public HashTableNode[] getTable(){
        return table;
    }

}

