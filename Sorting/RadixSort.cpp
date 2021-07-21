// C++ implementation of Radix Sort
#include <iostream>
#include <vector>
using namespace std;

// A utility function to get maximum value in arr[]
int getMax(vector<int> &arr, int n)
{
	int mx = arr[0];
	for (int i = 1; i < n; i++)
		if (arr[i] > mx)
			mx = arr[i];
	return mx;
}

// A function to perform counting sort of arr[] according to the digit represented by exp.
void countSort(vector<int> &arr, int n, int exp)
{
	int output[n];
	int i, count[10] = { 0 };

	// Count the frequency of least significant number of the Input array.
	for (i = 0; i < n; i++)
		count[(arr[i] / exp) % 10]++;

	// Change count[i] so that count[i] now contains actual position of this digit in output[]
	for (i = 1; i < 10; i++)
		count[i] += count[i - 1];

	// Transform the frequencies in the Count array into indices and distribute it to output array
	for (i = n - 1; i >= 0; i--) {
		output[count[(arr[i] / exp) % 10] - 1] = arr[i];
		count[(arr[i] / exp) % 10]--;
	}

	// Copy the output array to arr[], so that arr[] now
	// contains sorted numbers according to current digit
	for (i = 0; i < n; i++)
		arr[i] = output[i];
}

// Radix Sort
void radixsort(vector<int> &arr, int n)
{
	int m = getMax(arr, n);
    // Counting sort is used to making radix sort truely non-comparison based. 
    // Insertion sort could be used to speed up the process.
	
    // Do counting sort for every digit. Note that instead
	// of passing digit number, exp is passed. exp is 10^i
	// where i is current digit number
	for (int exp = 1; m / exp > 0; exp *= 10)
		countSort(arr, n, exp);
}

// A utility function to print an array
void print(vector<int> &arr, int n)
{
	for (int i = 0; i < n; i++)
		cout << arr[i] << " ";
}

// Driver Code
int main()
{
	vector<int> arr = { 64, 24, 152, 3, 5, 100 };
	int n = arr.size();
	
	radixsort(arr, n);
	print(arr, n);
	return 0;
}
