# Sorting algorithms
Sorting algorithms that are not easy to find are displayed here with explanation.
<br>

# Timsort - Tim Peters
A hybrid sorting algorithm that combines the power of Insertion sort to sort small fragments and the power of Merge sort to parallely merge the sorted fragments. This sorting technique is a default in Java’s Arrays.sort() as well as Python’s sorted() and sort(). I personally love this algorithm due to its stable nature and best in class time complexity without disintegration like quicksort.
- Worst complexity: `n*log(n)`
- Average complexity: `n*log(n)`
- Best complexity: `n`
- Space complexity: `n`
