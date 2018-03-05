def mergeSort arr
  a = Array.new
  sort arr, a,0, arr.size - 1
end

def merge arr, a, lo, mid, hi
  i = lo
  j = mid + 1
  (lo..hi).each do |k|
    if (i > mid)
      a[k] = arr[j]
      j+=1
    elsif (j > hi)
      a[k] = arr[i]
      i+=1
    elsif(arr[i] < arr[j])
      a[k] = arr[i]
      i+=1
    else
      a[k] = arr[j]
      j+=1
    end
  end
  arr[lo..hi] = a[lo..hi]
end


def sort arr, a, lo, hi
  return if hi <= lo
  mid = lo + (hi-lo)/2
  sort arr, a,  lo, mid
  sort arr, a, mid + 1, hi
  merge arr, a, lo, mid, hi
end
