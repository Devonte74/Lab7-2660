class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    UnweightedGraph<String> graph = new UnweightedGraph<>();

    graph.addVertex("Liberal Arts");
    graph.addVertex("Student Services");
    graph.addVertex("Health Careers & Sciences");
    graph.addVertex("Health Technologies Center");
    graph.addVertex("Recreation Center");
    graph.addVertex("Technology Learning Center");
    graph.addVertex("Business & Technology");
    graph.addVertex("Theatre ");

    // 2-Define Edges
    graph.addEdge(0, 1);
    graph.addEdge(0, 7);
    graph.addEdge(1, 0);
    graph.addEdge(1, 2);
    graph.addEdge(1, 4);
    graph.addEdge(2, 1);
    graph.addEdge(2, 3);
    graph.addEdge(2, 4);
    graph.addEdge(3, 2);
    graph.addEdge(3, 5);
    graph.addEdge(4, 1);
    graph.addEdge(4, 2);
    graph.addEdge(4, 5);
    graph.addEdge(5, 3);
    graph.addEdge(5, 4);
    graph.addEdge(5, 6);
    graph.addEdge(6, 5);
    graph.addEdge(6, 7);
    graph.addEdge(7, 6);
    graph.addEdge(7, 0);

    
    // 3. Create the graph (name "graph") using the vertices and edges
    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    UnweightedGraph<String>.SearchTree dfsTree = graph.dfs(6);

    // 5. Retrieve and print the search order of the DFS traversal
    System.out.println("DFS Search Order:" + dfsTree.getSearchOrder());

    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    System.out.println("DFS Parent-Child Relationships:");

    for (int i = 0; i < graph.getSize(); i++) {
    int parent = dfsTree.getParent(i);
    if (parent != -1) {
        System.out.println(graph.getVertex(parent) + " -> " + graph.getVertex(i));
    }}

    for (int i = 0; i < graph.getSize(); i++) {
    System.out.println(i + " " + graph.getVertex(i) + " -> " + graph.getNeighbors(i));
}
    dfsTree.printParentChild();

    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    
    System.out.println("Path to Health Technologies Center:");
    dfsTree.printPath(3);

    System.out.println("Path to Student Services:");
    dfsTree.printPath(1);

    System.out.println("Path to Recreation Center:");
    dfsTree.printPath(4);
     // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
     
    System.out.println("DFS Tree:");
    dfsTree.printTree();
  }
}