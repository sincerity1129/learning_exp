package use_for

import "fmt"

// If you create struct, first letter must be capital letter.
type TestType struct {
	Value any
	Count any
}

func TestProcess(T *TestType, text string) {
	fmt.Printf("%p, %#v, %s\n", T, T, text)
}
