package main

import (
	"fmt"
	test "roharon/m/module"
)

func main() {
	count := 0
	fmt.Println(count)
	test.UseFor()
	fmt.Println(count)
}
