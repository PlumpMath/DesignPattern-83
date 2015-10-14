package com.composite;
/**
 * ClassName: Tree 
 * @Description:���ģʽ��Composite����
 * ���ģʽ��ʱ�ֽв���-����ģʽ�ڴ����������νṹ������ʱ�ȽϷ��㡣
 * ��������������һ����в����������ڱ�ʾ���νṹ�У���������������ȡ�
 * @author Panyk
 * @date 2015��10��14��
 */
public class Tree {
	TreeNode root = null;
	public Tree(String name) {
		super();
		root = new TreeNode(name);
	}
	@Override
	public String toString() {
		return "Tree [root=" + root + "]";
	}
	public static void main(String[] args) {
		Tree tree = new Tree("root");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println(tree);
	}
}
