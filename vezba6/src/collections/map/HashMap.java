package collections.map;

public class HashMap<TKey,TValue> {
    private Entry<TKey, TValue>[] entries;
    private int mapSize;

    public HashMap(){
        this.entries = new Entry[11];
    }

    public HashMap(int capacity){
        this.entries = new Entry[capacity];
    }

    public void put(TKey key, TValue value){
        int targetBucket = hash(key);

        if(this.entries[targetBucket] == null){
            Entry<TKey, TValue> entry = new Entry<>(key, value);
            this.entries[targetBucket] = entry;
            mapSize++;
        }
        else{
            Entry<TKey, TValue> currentEntry = this.entries[targetBucket];

            while (currentEntry.getNext() != null){
                if(currentEntry.getKey().hashCode() == key.hashCode() && currentEntry.getKey().equals(key)){
                    currentEntry.setValue(value);
                    return;
                }
                currentEntry = currentEntry.getNext();
            }

            if(currentEntry.getKey().hashCode() == key.hashCode() && currentEntry.getKey().equals(key)){
                currentEntry.setValue(value);
            }
            else{
                Entry<TKey, TValue> entry = new Entry<>(key, value);
                currentEntry.setNext(entry);
                mapSize++;
            }
        }
    }

    public int hash(TKey key){
        int hashCode = key.hashCode();
        int targetBucket = Math.abs(hashCode % this.entries.length);
        return targetBucket;
    }

    public int size(){
        return this.mapSize;
    }
}
