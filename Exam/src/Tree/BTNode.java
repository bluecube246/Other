package Tree;

public final class BTNode {
	public int data;
	public BTNode left;
	public BTNode right;
	
	public BTNode (int data){
		this.data = data;
	
	}
	
	public BTNode () {

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BTNode getLeft() {
		return left;
	}

	public void setLeft(BTNode left) {
		this.left = left;
	}

	public BTNode getRight() {
		return right;
	}

	public void setRight(BTNode right) {
		this.right = right;
	}
	
	public BTNode minimalBST(int[] array) {
		return minimalBST(array, 0 , array.length-1);
		
	}
	
	public BTNode minimalBST(int[] array, int start, int end) {
		if(end < start)
			return null;
		int mid = (start + end)/2;
		BTNode node = new BTNode(array[mid]);
		node.setLeft(minimalBST(array, start, mid-1));
		node.setRight(minimalBST(array,mid+1, end));
		return node;		
	}
	
	public void inorder() {
		if(left != null)
			left.inorder();
		
		System.out.println(data);
		
		if(right != null) {
			right.inorder();
		}
		
	}
	
	public int add() {
		if(left != null) {
			System.out.println("Before add: " + data);
			data += left.add();
			System.out.println("After add: " + data);
		}
		if(right != null) {
			System.out.println("Before add: " + data);
			data += right.add();
			System.out.println("After add: " + data);
		}
		
		return data;
	}
	
	public void rotate(String dot) {
		if(right != null)
			right.rotate(dot + "..");
		
		System.out.println(dot + data);
		
		if(left != null)
			left.rotate(dot + "..");
	}
}
