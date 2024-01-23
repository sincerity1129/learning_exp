package use_for

import "fmt"

func Array() {
	var a [10]int = [10]int{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
	//If the array is set to default, the value is dispalyed as zero.
	var b [11]int
	for index, num := range a {
		fmt.Printf("인덱스: %d value: %d\n", index, num)
	}
	copy(b[:], a[0:5])
	b[7] = 35
	fmt.Printf("a: %v b: %v\n", a, b)
}
