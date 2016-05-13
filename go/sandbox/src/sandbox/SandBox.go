package main

import (
	"fmt"
)

func swap(a, b string) (string, string) {
	return b, a
}

func main() {
	// multiple return
	a, b := swap("hoge", "fuga")
	fmt.Println(a, b)

	// basic array
	var array [2]string
	array[0] = "hoge"
	array[1] = "fuga"

	fmt.Println(array[0], array[1])
	fmt.Println(array)

	// len(array) returns length of array
	numberArray := []int{1, 3, 5, 7, 9}
	fmt.Println("numberArray :", numberArray)

	for i := 0; i < len(numberArray); i++ {
		fmt.Printf("numberArray[%d] : %d\n", i, numberArray[i])
	}

	fmt.Println("numberArray[0:0]:", numberArray[0:0])
	fmt.Println("numberArray[:2]:", numberArray[:2])
	fmt.Println("numberArray[2:]:", numberArray[2:])
	//fmt.Println("numberArray[2:0]:", numberArray[2:0]) is compile error. invalid slice index. 2 > 0.

	// range
	for i, v := range numberArray {
		fmt.Printf("numberArray[%d] : %d\n", i, v)
	}
}
