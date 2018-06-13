package datastructure;

public interface List<T> {
    public void addFirst(T i);
    public void addLast(T i);
    public T removeFirst();
    public T removeLast();
    public int size();
}
