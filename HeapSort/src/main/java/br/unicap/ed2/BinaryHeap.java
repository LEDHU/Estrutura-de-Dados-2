package br.unicap.ed2;

public class BinaryHeap {
	int[] v;
	int sizeOfTree;

	//Constructor
	public BinaryHeap(int size) {
		//Elimina o problema do vetor estar iniciar com 0 a todo momento.
        v = new int[size+1];
		this.sizeOfTree = 0;
		System.out.println("Empty Heap has been created !");
	}

	public int sizeOfArray() {
		return v.length;
	}

	public int sizeOfTree() {
		System.out.println("Size Of Tree: " + sizeOfTree);
		return sizeOfTree;
	}

	public boolean isHeapEmpty() {
		if (sizeOfTree <= 0) {
			System.out.println("Tree is empty !");
			return true;
		}else {
			System.out.println("Tree is not empty !");
			return false;
		}
	}

	public void deleteheap() {
		v = null;
		System.out.println("Heap has been deleted !");
	}

	//Insert a new value in Heap
	public void insertInHeap(int value) {
        //+1 para o tamanho da árvore sempre apontar para o último lugar ocupado do vetor
		System.out.println("Inserting " + value + " in Heap...");
		v[sizeOfTree+1] = value;
		sizeOfTree++;
		HeapifyBottomToTop(sizeOfTree);
		System.out.println("Inserted " + value + " successfully in Heap !");
		levelOrder();
	}

	// Peek into Heap
	public void peek() {
		if(sizeOfTree == 0) {
			System.out.println("Heap is empty !");
		}else {
			System.out.println("Head of the Heap is: " + v[1]);
		}
	}

	//Extract Head of Heap
	public int extractHeadOfHeap() {
		if(sizeOfTree == 0) {
			System.out.println("Heap is empty !");
			return -1;
		}else {
			System.out.println("Head of the Heap is: " + v[1]);
			System.out.println("Extracting it now...");
			int extractedValue = v[1];
			v[1] = v[sizeOfTree];
			sizeOfTree--;
			HeapifyTopToBottom(1);
			System.out.println("Successfully extracted value from Heap.");
			levelOrder();
			return extractedValue;
		}
	}

	public void HeapifyBottomToTop(int index) {
		int parent = index / 2;
		// We are at root of the tree. Hence no more Heapifying is required.
		if (index <= 1) {
			return;
		}
		// If Current value is smaller than its parent, then we need to swap
		if (v[index] < v[parent]) {
			int aux = v[index];
			v[index] = v[parent];
			v[parent] = aux;
		}
		HeapifyBottomToTop(parent);
	}

	public void HeapifyTopToBottom(int index) {
		int left  = index*2;
		int right = (index*2)+1;
		int smallestChild = 0;

		if (sizeOfTree < left) { //If there is no child of this node, then nothing to do. Just return.
			return;
		}else if (sizeOfTree == left) { //If there is only left child of this node, then do a comparison and return.
			if(v[index] > v[left]) {
				int aux = v[index];
				v[index] = v[left];
				v[left] = aux;
			}
			return;
		}else { //If both children are there
			if(v[left] < v[right]) { //Find out the smallest child
				smallestChild = left;
			}else {
				smallestChild = right;
			}
			if(v[index] > v[smallestChild]) { //If Parent is greater than smallest child, then swap
				int aux = v[index];
				v[index] = v[smallestChild];
				v[smallestChild] = aux;
			}
		}
		HeapifyTopToBottom(smallestChild);
	}



	public void levelOrder() {
		System.out.println("Printing all the elements of this Heap...");// Printing from 1 because 0th cell is dummy
		for (int i = 1; i <= sizeOfTree; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println("\n");
	}


}

  