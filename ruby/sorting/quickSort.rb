def quickSort arr
  arr.shuffle!
  sort(arr, 0, arr.size - 1)
end

def sort arr, lo, hi
  return if hi < lo
  int j = partition(a,lo,hi)
  sort(arr, lo, j-1)
  sort(arr, j + 1, hi)
end

def partition arr, lo, hi
  i = lo
  j = hi
  pivot = a[lo]

  while true
    while (a[i] < pivot)
      i++
      break if(i == hi)
    end
    while (a[j] > pivot)
      j--
      break if (j == lo)
    end

    break if (i >= j)
    exch(arr, i, j)
  end

  exch(a, lo, j);
  return j;
end

def exch arr, i, j
  temp = arr[i]
  arr[i] = arr[j]
  arr[j] = temp
end



arr = Array.new(10000) { rand(1...100000000) }


startTime = Time.now
arr5 = arr.clone
quickSort(arr5)
p arr5
p "Quick sort: #{(Time.now - startTime).to_s}"
