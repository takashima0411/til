fn analyze_slice(slice: &[i32]) {
    println!("first element of the slice: {}", slice[0]);
    println!("the slice has {} elements", slice.len());
}

fn main() {
	println!("{subject} {verb} {object}",
		object="the lazy dog",
		subject="the quick brown fox",
		verb="jumps over");

	let xs: [i32; 5] = [1, 2, 3, 4, 5]; 

    // Indexing starts at 0
    println!("first element of the array: {}", xs[0]);
    println!("second element of the array: {}", xs[1]);

    // `len` returns the size of the array
    println!("array size: {}", xs.len());

    println!("borrow the whole array as a slice");
    analyze_slice(&xs);
}