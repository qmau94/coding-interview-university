def shellSort arr
  h = 1
  while h < arr.size/3
    h = 3*h + 1
  end
  while h >= 1
    (h..arr.size-1).each do |i|
      j = i
      while j>= h
        exch(arr, j, j-h) if arr[j] < arr[j-h]
        j -= h
      end
    end
    h = h/3
  end
end

def exch arr, i, j
  temp = arr[i]
  arr[i] = arr[j]
  arr[j] = temp
end
