#include <iostream>
#include <vector>
using namespace std;

void countSort(vector<int> &arr)
{
    // Number of distinct objects in arr is range or r
    int range = 10;
    vector<int> count(range), output(arr.size());

    // Count the frequency of each number of the Input array and store it in the Count array.
    for (int i = 0; i < arr.size(); i++)
        count[arr[i]]++;

    // Convert frequency to cumulative frequency
    for (int i = 1; i < count.size(); i++)
        count[i] += count[i - 1];

    // Transform the frequencies in the Count array into indices and distribute it to output array
    for (int i = arr.size() - 1; i >= 0; i--)
    {
        output[count[arr[i]] - 1] = arr[i];
        count[arr[i]]--;
    }

    for (int i = 0; i < arr.size(); i++)
        arr[i] = output[i];
}

void printArray(vector<int> &arr)
{
    for (int i = 0; i < arr.size(); i++)
        cout << arr[i] << " ";
    cout << "\n";
}

int main()
{
    // Only numbers from 0 to 9 are taken as the range is set to 10 for simplicity
    vector<int> arr = {0, 9, 4, 5, 6, 4};
    countSort(arr);
    printArray(arr);
    return 0;
}