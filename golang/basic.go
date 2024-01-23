// Need to command go mod -u when structure of package change
package main

import (
	usefor "basic/module"
)

func main() {
	count := 5
	usefor.UseFor(count)
}
