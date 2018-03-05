require '../sorting/insertionSort'
require '../sorting/mergeSort'
require '../sorting/selectionSort'
require '../sorting/shellSort'

arr = Array.new(10000) { rand(1...100000000) }


startTime = Time.now
arr1 = arr.clone
selectionSort(arr1)
p arr1
p "Selection sort: #{(Time.now - startTime).to_s}"


startTime = Time.now
arr2 = arr.clone
insertionSort(arr2)
p arr2
p "Insertion sort: #{(Time.now - startTime).to_s}"


startTime = Time.now
arr3 = arr.clone
shellSort(arr)
p arr3
p "Shell sort: #{(Time.now - startTime).to_s}"


startTime = Time.now
arr4 = arr.clone
mergeSort(arr)
p arr4
p "Merge sort: #{(Time.now - startTime).to_s}"
