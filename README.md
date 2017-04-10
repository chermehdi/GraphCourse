# Graphs :
### topics :
* Graph Representation
* Graph Traversal 
* Shortest Paths and minimum spaning trees
- Graphs are mathematical structures that represent pairwise relationships between objects. A graph is a flow structure that represents the relationship between various objects. It can be visualized by using the following two basic components: 
  - **Nodes**: These are the most important components in any graph. Nodes are entities whose relationships are expressed using edges. If a graph comprises 2 nodes 
  A
  A and 
  B
  B and an undirected edge between them, then it expresses a bi-directional relationship between the nodes and edge.
  - **Edges**: Edges are the components that are used to represent the relationships between various nodes in a graph. An edge between two nodes expresses a one-way or two-way relationship between the nodes.
there are a lot of types and classes of graphs we can split them into two basic types directed and undirected and for the edges can be weighted or not 
there is a lot of ways to represent a graph in memory 
we can state two major ones :
- **Adjacency Matrix** : 
  an NxN binary matrix that represents a the state of the current graph between every pair of node the matrix is set to 1 if their is an edge between the two nodes 0 otherwise .
  ![alt text](https://image.slidesharecdn.com/graphrepresentation-120903115144-phpapp01/95/graph-representation-11-728.jpg?cb=1346673176 "Adjacency Matrix")
  
- **Adjacency List**
  for every element in the graph we asign a list of it's adjacent components ( you understand better in code )
   ![alt text](https://algocoding.files.wordpress.com/2014/08/graph11.png "Adjacency Matrix")
  ~~~
  
  adjacency list example 
  
  [0] => [1] -> [2]
  [1] => [2] -> [3]
  [2] => [4]
  [3] => [4] -> [5]
  [4] => [5]
  [5]
  ~~~
 
