public class Main {

    public sealed interface Tree {
        public record Node(int val, Tree left, Tree right) implements Tree {}

        public record Leaf(int val) implements Tree {}
    }

    public static void main(String[] args) {
        Tree t = new Tree.Node(1,
                    new Tree.Leaf(0),
                    new Tree.Node(3,
                            new Tree.Leaf(2),
                            new Tree.Leaf(4)
                    )
        );

        System.out.println(sum(t));
    }

    // Java 18くらいでコンパイルできるようになる予定
    // https://bugs.openjdk.java.net/browse/JDK-8260244
    public static int sum(Tree t) {
        return switch (t) {
            case Tree.Leaf(int v) -> v;
            case Tree.Node(int n, Tree l, Tree r) -> n + sum(l) + sum(r);
        };
    }
}
