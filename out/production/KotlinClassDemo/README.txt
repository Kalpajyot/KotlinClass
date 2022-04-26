Kotlin introduced an operator that we can use to handle Nullable types. It’s called the
safe-call operator, which is written as the question mark symbol followed by a dot ?.
We can replace the entire if block, which performs the null checking, with just one
statement:
arr?.forEach { i -> println(i) }
What the safe call does is to first check if arr is null; if it is, it won’t go through the
forEach operation. Only when arr is not null will the array be traversed.