package Stack;
public interface IStack<G> {
    void push(G x);
    G pop();
    G top();
    boolean isEmpty();
}
