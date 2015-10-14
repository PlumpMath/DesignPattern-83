package com.composite;
/**
 * ClassName: Tree 
 * @Description:组合模式（Composite）：
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便。
 * 将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 * @author Panyk
 * @date 2015年10月14日
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
