def selectionSort arr
  (0...arr.size - 1).each do |i|
    (i..arr.size - 1).each do |j|
      exch(arr, i, j) if arr[j] < arr[i]
    end
  end
end

def exch arr, i, j
  temp = arr[i]
  arr[i] = arr[j]
  arr[j] = temp
end

