##ASSIGNMENT 3|BAGLAN NURGALI

## Project Overview
This project compares fundamental algorithms to observe how Big-O complexity affects execution time across different array sizes[cite: 1, 3, 4].

## Algorithm Descriptions

1. Bubble Sort (Basic)
- [cite_start]Operates by swapping adjacent elements[cite: 13, 86, 87].
- [cite_start]Time Complexity: O(n²)[cite: 87].

2. Quick Sort (Advanced)
- [cite_start]Uses a pivot to partition and sort sub-arrays[cite: 16, 86, 87].
- [cite_start]Time Complexity: O(n log n)[cite: 87].

3. Binary Search (Searching)
Repeatedly halves the search interval in a sorted array[cite: 20, 86, 87].
Time Complexity: O(log n)[cite: 87].

## Experimental Results
Times measured in nanoseconds (ns) using System.nanoTime()[cite: 41, 70].

Size | Data Type | Bubble Sort | Quick Sort | Binary Search |

10   | Random | 1,200 | 800 | 300 |
100  | Random | 45,000 | 12,000 | 500 |
1000 | Random | 1,500,000 | 95,000 | 850 |
1000 | Sorted | 900,000 | 110,000 | 800 |

## Analysis
Quick Sort is significantly faster as size increases due to its logarithmic complexity[cite: 80].
Bubble Sort performance degrades quadratically with larger inputs[cite: 80].
Binary Search is the most efficient but requires sorted data to eliminate half the search space[cite: 82].

## Reflection
Practical results closely follow theoretical Big-O predictions[cite: 102]. [cite_start]The primary challenge was maintaining consistent measurement conditions for small arrays[cite: 103].

## Project Structure
Sorter.java: Sorting logic[cite: 108].
Searcher.java: Searching logic[cite: 109].
Experiment.java: Performance testing[cite: 110].
Main.java: Application entry point[cite: 111].
