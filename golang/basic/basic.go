// Need to command go mod -u when structure of package change
package main

import (
	use_for "basic/module"
	"fmt"
)

func main() {
	// count := 5
	// use_for.UseFor(count)
	// use_for.LinkedList()
	// use_for.AppendMain()
	// use_for.Array()
	testValue := &use_for.TestType{
		Value: "a",
		Count: 1,
	}
	fmt.Printf("%p, %#v\n", testValue, testValue)
	use_for.TestProcess(testValue, "b")
}
