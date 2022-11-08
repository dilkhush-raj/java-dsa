# Arrays

List of elements of the same type placed in a contiguous memory location.

![7-2.png](Arrays%209657e63d18534d41a97f8f2ace7457fc/7-2.png)

## Operations in Arrays

- Create
- Input
- Output
- Update

### Creating an Array

```java
dataType arrayName[] = new dataType[size];

//creating an array

int marks[] = new int[50]; //size of an array is static
int numbers[] = {1, 2, 3};
int moreNumbers[] = {4, 5, 6}
String fruits[] = {"apple", "mango", "orange"};

```

```java
import java.util.*;

public class ArrayCC {
    public static void main (String args[]) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of physics : ");
        marks[0] = sc.nextInt();
        System.out.print("Enter marks of chemistry : ");
        marks[1] = sc.nextInt();
        System.out.print("Enter marks of math : ");
        marks[2] = sc.nextInt();

        System.out.println("------------------------");
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Math : " + marks[2]);
        System.out.println("------------------------");
    }
}
```

### Passing arrays as argument

```java
// Call by refrence 

import java.util.*;

public class Arguments {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);

        //print our marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
```

## Linear Search

![images.png](Arrays%209657e63d18534d41a97f8f2ace7457fc/images.png)

find the index of element in a given array

```java
import java.util.*;

public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 6, 8, 13, 16 };
        int key = 13;

        int index = linearSearch(numbers, key);
        if(index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("key is at index : " + index);
        }
    }
}

// Linear Search time complexity is O(n).
```

find the index of element in a given array of string

```java
// Homework
public class StringLinearSearch {

    public static int linearSearch(String cities[], String key){
        for(int i=0; i<cities.length; i++){
            if(cities[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String cities[] = { "patna", "jaipur", "delhi", "mumbai" };
        String key = "delhi";

        int index = linearSearch(cities, key);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index : " + index);
        }

    }
}
```

### Largest and Smallest Number

find the largest and smallest number in a given array

```java
import java.util.*;

public class GetLargest {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest Value is : " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 6, 3, 5 };
        System.out.println("Largest value is : " + getLargest(numbers));
    }
}
```

## Binary Search

![BinarySearch.png](Arrays%209657e63d18534d41a97f8f2ace7457fc/BinarySearch.png)

Pre-requisite - Sorted arrays

### Pseudo Code of Binary Search

```java
start=0, end=n-1
while(start<=end)
	find mid // (start + end)/2
	compare mid & key
		mid == key → FOUND
		mid > key → LEFT
		mid < key → RIGHT
```

```java
public class BinarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 9, 12, 14 };
        int key = 9;
        System.out.println("Index for key is : " + binarySearch(numbers, key));
    }
}
```

### Reverse an Array

```java
public class ReverseArray {

    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 8, 10 };

        reverse(numbers);

        // print
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
```

## Pairs in an Array

2, 4) (2,6) (2, 8) (2,10)
(4, 6) (4,8) (4, 10)
(6, 8) (6,10)
(8, 10)

| 2 | 4 | 6 | 8 | 10 |
| --- | --- | --- | --- | --- |

```java
public class Pairs {

    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        printPairs(numbers);
    }
}
```

### Print Subarrays

a continuous part of array 

```java
public class Subarrays {

    public static void printSubarrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);
    }
}   
```

## Max Subarray Sum

![Untitled](Arrays%209657e63d18534d41a97f8f2ace7457fc/Untitled.png)

```java
public class MaxSubarrays{

    public static void maxSubarrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        maxSubarrays(numbers);
    }
}
```