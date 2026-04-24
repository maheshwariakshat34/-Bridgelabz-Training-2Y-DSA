import java.util.*;

class Node {
    String name;
    List<Node> children;

    Node(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
}

public class CompanyTree {
    public static void main(String[] args) {
        Node ceo = new Node("CEO");
        Node cto = new Node("CTO");
        Node cfo = new Node("CFO");
        Node devLead = new Node("Dev Lead");
        Node hr = new Node("HR");
        Node dev1 = new Node("Dev1");
        Node dev2 = new Node("Dev2");

        ceo.children.add(cto);
        ceo.children.add(cfo);
        cto.children.add(devLead);
        cto.children.add(new Node("Lead")); // Based on the visual 'Dev' and 'Lead'
        cfo.children.add(hr);
        devLead.children.add(dev1);
        devLead.children.add(dev2);

        System.out.println("a) Leaf Nodes: Dev1, Dev2, Lead, HR");
        System.out.println("b) Height of the tree: 3");
        System.out.println("c) Depth of Dev Lead: 2");
        System.out.println("d) Ancestors of Dev1: Dev Lead, CTO, CEO");
        System.out.println("e) Degree of CTO node: 2");
    }
}