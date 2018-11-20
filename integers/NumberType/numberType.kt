fun main(args: Array<String>) {
	// Have values between -128 to 127 (8-bit signed two's complement integer[-128,127])
	val range: Byte = 112
	println("$range")

	//values from -32768 to 32767 (16-bit signed two's complement integer).
	val temperature: Short = -11245
	println("$temperature")

	// have values from -2^31 to 2^31-1 (32-bit signed two's complement integer).
	val score: Int = 100000
	println("$score")

	// have values from -2^63 to 2^63-1 (64-bit signed two's complement integer).
	val highestScore: Long = 9999
	println("$highestScore")

	// double-precision 64-bit floating point
	val distance = 999.5
	println("$distance")

	//Float : is a single-precision 32-bit floating point
	val distance1 = 19.5
	println("$distance1")

	// char
	val letter: Char
	letter ='k'
	println("$letter")

	// Boolean
	val flag = true
	println("$flag")

	
}