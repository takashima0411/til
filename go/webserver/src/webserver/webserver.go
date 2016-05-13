package main

import (
	"fmt"
	"net/http"
	"log"
)

type Hello struct{}

func (h Hello) ServeHTTP(
w http.ResponseWriter,
r *http.Request) {
	fmt.Fprint(w, "Hello!")
}

type String string

type Struct struct {
	Greeting string
	Punct    string
	Who      string
}

func main() {
	var h Hello
	http.Handle("/string", String("I'm a frayed knot."))
	http.Handle("/struct", &Struct{"Hello", ":", "Gophers!"})
	err := http.ListenAndServe("localhost:4000", h)
	if err != nil {
		log.Fatal(err)
	}
}
