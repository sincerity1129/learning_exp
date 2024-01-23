// Package is module's name
package usefor

import (
	"fmt"
)

//  The name of function need to set as shown blew
func UseFor(count int) {
	for i := 0; i < count; i++ {
		fmt.Println(i)
	}
}
