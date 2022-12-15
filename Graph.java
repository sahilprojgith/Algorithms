package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Graph
{
	int V;
    LinkedList<Integer> adj[];
    Queue<Integer> queue;
    
    public Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }
    
}
