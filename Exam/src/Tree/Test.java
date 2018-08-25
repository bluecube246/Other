package Tree;

public class Test {
	public static void main(String[] args) {
		int array[] = { 5, 10, 15, 20, 25, 30, 35};

		BTNode root = new BTNode();
		
		root = root.minimalBST(array);
		
		root.inorder();
		
		System.out.println();
		
		//System.out.println(root.add());
		
		root.rotate("");
	}

	public static BTNode minimalBST(int[] array) {
		return minimalBST(array, 0, array.length-1);

	}

	public static BTNode minimalBST(int[] array, int start, int end) {
		int mid = (start + end) / 2;
		BTNode node = new BTNode(array[mid]);
		node.setLeft(minimalBST(array, start, mid - 1));
		node.setRight(minimalBST(array, mid + 1, end));
		return node;
	}

}
