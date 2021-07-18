package Hashing;

public class HashOperations {

    public static final int LoadFactor = 20;

    HashTable createHashTable(int size){
        HashTable hashTable = new HashTable();
        hashTable.setSize(size/LoadFactor);
        for (int i = 0; i <hashTable.getSize(); i++) {
            hashTable.getTable()[i].setStartNode(null);
        }
        return hashTable;
    }

    public int hashSearch(HashTable hashTable, int data){
        //ListNode temp;

        //temp = hashTable.getTable();
        return 1;
    }
}
