// C++ implementation of insertion sort
# include <iostream>
# include <vector>
using namespace std;

// Function to sort an array using insertion sort
void insertionSort(vector<int> &arr, int n)
{
	int i, key, j;
	for (i = 1; i < n; i++)
	{
		key = arr[i];
		j = i - 1;

		/* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their
        current position so that the current element can fit in without deleting other number*/
		while (j >= 0 && arr[j] > key)
		{
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[j + 1] = key;
	}
}

// A utility function to print the array of size n
void printArray(vector<int> &arr, int n)
{
	int i;
	for (i = 0; i < n; i++)
		cout << arr[i] << " ";
	cout << endl;
}

// Driver code
int main()
{
	vector<int> arr = { 6, 10, 23, 10, 6, 5 };
	int n = arr.size();
	insertionSort(arr, n);
	printArray(arr, n);

	return 0;
}