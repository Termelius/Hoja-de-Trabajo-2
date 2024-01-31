package Stack;

public interface UVGStack<G> {
    public void push(G item);
    public G pop();
    public G Top();
    public boolean isEmpty();
}
