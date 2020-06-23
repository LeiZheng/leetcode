package graph;

import arrayAndString.MinimumWindowSubstring;

public class MIndex<T> {
    public T getV1() {
        return v1;
    }

    public void setV1(T v1) {
        this.v1 = v1;
    }

    public T getV2() {
        return v2;
    }

    public void setV2(T v2) {
        this.v2 = v2;
    }

    private T v1;
    private T v2;

    private MIndex(){

    }
    public MIndex(T v1, T v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public int hashCode() {
        return v1.hashCode() + v2.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        MIndex<T> obj2 = (MIndex<T>) obj;
        return v1.equals(obj2.v1) && v2.equals(obj2.v2)
                || v1.equals(obj2.v2) && v2.equals(obj2.v1);
    }

    public MIndex<T> replaceKey(T fromKey, T toKey) {
        MIndex<T> newKey = new MIndex<T>(v1, v2);
        if(v1.equals(fromKey)) {
            newKey.v1 = toKey;
        }
        if(v2.equals(fromKey)) {
            newKey.v2 = toKey;
        }
        return newKey;
    }

    public boolean has(T currKey) {
        return v1.equals(currKey) || v2.equals(currKey);

    }
}
