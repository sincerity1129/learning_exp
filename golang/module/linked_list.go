//Linked List makes when you need a node.

package use_for

import "fmt"

// LinkedList is a substructure of graph.
// The start *Node[S] represents one node so if you want to create node, you have to put the valiable.start.
// The start is the same as the valiable therefore you can change start.
// The val S means type that is int, string, any ETC.
// The s is the same as the valiable therefore you can change s.
// Single Linked List means one-way but double Linked List means two-way.
type Node[S any] struct {
	start *Node[S]
	back  *Node[S]
	val   S
}

func Append[S any](node *Node[S], start *Node[S]) *Node[S] {
	node.start = start
	return start
}

// You want to create Linked List through an iterative sentence.
func AppendMain() {
	root := &Node[any]{
		start: nil,
		back:  nil,
		val:   10,
	}
	// Here, the reason why valiable root was changed valiable node
	// because they share same pointer.
	// Put node which refers to the previous pointer in key back.
	node := root
	for i := 1; i < 5; i++ {
		node = Append[any](node,
			&Node[any]{
				start: nil,
				back:  node,
				val:   i * 15,
			})
	}
	Append[any](root.start,
		&Node[any]{
			start: root.start.start,
			back:  nil,
			val:   100,
		})
	for node := root; node != nil; node = node.start {
		fmt.Printf("node val: %v\n", node)
	}
	tail := root.start.start.start.start.start
	for back_node := tail; back_node != nil; back_node = back_node.back {
		fmt.Printf("for_back_node val: %v\n", back_node)
	}
}

func LinkedList() {
	root := &Node[any]{
		nil,
		nil,
		"first",
	}
	root.start = &Node[any]{
		nil,
		root,
		"second",
	}
	root.start.start = &Node[any]{
		nil,
		root.start,
		"end",
	}

	tail := root.start.start

	for node := root; node != nil; node = node.start {
		fmt.Printf("node val: %v\n", node)
	}
	for back_node := tail; back_node != nil; back_node = back_node.back {
		fmt.Printf("back_node val: %v\n", back_node)
	}
}
