package br.unicap.ed2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class Testes {

    @Test
    public void test01shell(){
        int[] vetor = {17, 25, 49, 12, 18, 23, 45, 38, 53, 42, 27, 13, 11, 28, 10, 14};
        int[] H = {1, 2, 4, 8};
        int[] expected = {10, 11, 12, 13, 14, 17, 18, 23, 25, 27, 28, 38, 42, 45, 49, 53};

        Shell shell = new Shell(vetor, H);
        shell.sort();
        int[] actual = shell.getVetor();
        assertArrayEquals( expected, actual );
    }

    @Test
    public void test01heap(){
      int [] vetor = {12, 9, 13, 25, 18, 10, 22};
      int [] expected = {9, 10, 12, 13, 18, 22, 25};
  
      Heap heap = new Heap(vetor);
      heap.sort();
      int [] actual = heap.getVetor();
      assertArrayEquals(expected, actual);
    }

}
