Merge Sort
Explanation
Merge Sort algorithm to efficiently sort an array by recursively dividing it into smaller parts, sorting those parts, and merging them back together to produce a sorted array.
Pseudocode Explanation
ALGORITHM Mergesort(arr)
DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
DECLARE i <-- 0
DECLARE j <-- 0
DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
Visual Step Through with Sample Array
Let's walk through the Merge Sort algorithm using the input array [8, 4, 23, 42, 16, 15].

Initial State Input array: [8, 4, 23, 42, 16, 15]
Mergesort is called with the entire array.

It divides the array into left and right subarrays.

left subarray: [8, 4, 23] right subarray: [42, 16, 15]

Recursive Steps We now recursively apply Mergesort on both left and right subarrays.
Sorting left subarray Input array: [8, 4, 23]

Mergesort is called with the left subarray.

It further divides it into left and right subarrays.

left subarray: [8] right subarray: [4, 23]

Recursively sort the left and right subarrays. The left subarray is already sorted, and the right subarray is further divided.
left subarray: [4] right subarray: [23]

Recursively sort the left and right subarrays. Both are single elements and are already sorted.
left subarray: [4] right subarray: [23]

Merge the sorted left and right subarrays back into [4, 23].
Sorting right subarray Input array: [42, 16, 15]
The steps are similar to the ones applied to the left subarray.

Merge the sorted left and right subarrays back into [15, 16, 42]. Merging left and right into arr Input arrays: left: [4, 23] right: [15, 16, 42]
Merge the sorted left and right subarrays back into the original array arr. Resulting sorted array: [4, 15, 16, 23, 42]