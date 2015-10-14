package com.composite;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private String name;
	private TreeNode parent;
	private List children = new ArrayList();
	public TreeNode(String name){
		this.name = name;
	}
	public void add(TreeNode node){
		children.add(node);
	}
	public void remove(TreeNode node){
		children.remove(node);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	public List getChildren() {
		return children;
	}
	public void setChildren(List children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "TreeNode [name=" + name + ", parent=" + parent + ", children=" + children + "]";
	}
}