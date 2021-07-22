# Sorting algorithms
A quick and easy summary of all popular sorting algorithms under a single umbrella.
<br>

# Insertion sort
Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time and places it in the correct position by comparing it with the previous items till the current item is greater than or equal previous. Insertion sort is very efficient for small data sets than its competition algorithms as it evades extra overhead from the recursive function calls. It is also very space efficient (in-place) and stable. 
- Worst complexity: `n^2`
- Average complexity: `n^2`
- Best complexity: `n`
- Space complexity: `1`

# Timsort - Tim Peters
A hybrid sorting algorithm that combines the power of Insertion sort to sort small fragments and the power of Merge sort to parallely merge the sorted fragments. This sorting technique is a default in Java’s Arrays.sort() as well as Python’s sorted() and sort(). I personally love this algorithm due to its stable nature and best in class time complexity without disintegration like quicksort.
- Worst complexity: `n*log(n)`
- Average complexity: `n*log(n)`
- Best complexity: `n`
- Space complexity: `n`

# Counting sort
Counting sort is a non-comparison based sorting technique that works by counting the number of objects having distinct 'key' values (kind of hashing) and performing an arithmetic calculation to find its correct position. Considering execution time, counting sort is good if the range is smaller compared to the input size.
- Worst complexity: `n+r`
- Average complexity: `n+r`
- Best complexity: `n+r`
- Space complexity: `n+r`

# Radix sort
Radix sort is a non-comparison based sorting technique that works by creating and distributing elements into buckets according to their radix. For elements with more than one significant digit, this bucketing process is repeated for each digit, while preserving the ordering of the prior step, until all digits have been considered. For this reason, radix sort has also been called bucket sort and digital sort.<br>
d is the maximum number of digits; n is the number of input integers; b is the base for representing numbers
- Worst complexity: `d*(n+b)`
- Space complexity: `n+d`