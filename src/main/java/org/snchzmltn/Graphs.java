package org.snchzmltn;

import java.util.*;

public class Graphs {
    public HashMap<String, String[]> adjacencyMap = new HashMap<>();

    public void fillAdjacencyMapWithExample1() {
        adjacencyMap.put("you", List.of("alice", "bob", "claire").toArray(String[]::new));
    }

    public void fillAdjacencyMapWithExample2() {
        adjacencyMap.put("bob", List.of("anuj", "peggy").toArray(String[]::new));
        adjacencyMap.put("alice", List.of("peggy").toArray(String[]::new));
        adjacencyMap.put("claire", List.of("thom", "jonny").toArray(String[]::new));

        adjacencyMap.put("anuj", Collections.emptyList().toArray(String[]::new));
        adjacencyMap.put("peggy", Collections.emptyList().toArray(String[]::new));
        adjacencyMap.put("thom", Collections.emptyList().toArray(String[]::new));
        adjacencyMap.put("jonny", Collections.emptyList().toArray(String[]::new));
    }


    public void printAdjacencyMap() {
        for (String key :
                this.adjacencyMap.keySet()) {
            System.out.println(key + " neighbors --> " + Arrays.toString(adjacencyMap.get(key)));
        };
    }

    public void printMapUsingBFS() {
        //TODO: first attempt was dubious try to IMPLEMENT BFS
    }
}
