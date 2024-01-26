package Stack;

public interface IStack<G> {
    public void push(G item);
    public G pop();
    public G Top();
    public boolean isEmpty();
}
