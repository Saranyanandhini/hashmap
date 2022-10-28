class MyHashMap {

int[] arr;

boolean[] arrr;

public MyHashMap() {
    
    this. arr = new int[1000001];
    
    this.arrr = new boolean[1000001];
    
}

public void put(int key, int value) {
    
    if(!arrr[key]){
        
        arrr[key] = true;
        
    }
    
    arr[key] = value;
    
}

public int get(int key) {
    
    if(arrr[key]==false){
        
        return -1;
        
    }
    
    return arr[key];
    
}

public void remove(int key) {
    
    arrr[key] = false;
    
}
}