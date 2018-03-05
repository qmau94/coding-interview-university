def insertionSort arr
  (0..arr.size-1).each do |i|
    (i.downto(1)).each do |j|
      exch(arr, j, j-1) if arr[j] < arr[j-1]
    end
  end
end

def exch arr, i, j
  temp = arr[i]
  arr[i] = arr[j]
  arr[j] = temp
end
