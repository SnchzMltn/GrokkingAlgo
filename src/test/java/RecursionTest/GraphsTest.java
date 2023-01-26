package RecursionTest;

import org.junit.jupiter.api.Test;
import org.snchzmltn.Graphs;

public class GraphsTest {
    private Graphs underTest = new Graphs();

    @Test
    public void shouldPrintGraphs() {
        underTest.fillAdjacencyMapWithExample1();
        underTest.printAdjacencyMap();
    }

    @Test
    public void shouldPrintGraphs2() {
        underTest.fillAdjacencyMapWithExample1();
        underTest.fillAdjacencyMapWithExample2();
        underTest.printAdjacencyMap();
    }

    @Test
    public void BDS() {
        underTest.fillAdjacencyMapWithExample1();
        underTest.printMapUsingBFS();
        underTest.fillAdjacencyMapWithExample2();
        underTest.printMapUsingBFS();
    }

}
