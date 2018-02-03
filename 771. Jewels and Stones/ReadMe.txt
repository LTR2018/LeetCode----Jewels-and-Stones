该目录中的java程序是问题 ‘Jewels and Stones' 的解答。

本人程序用到的主要技术为对String的各类操作，如下：
1.public char charAt(int index)函数，用于返回位于字符串的指定索引处的字符。索引从0开始。
2.For循环语句（我认为这有待提升，可以提出更好的方法）。

我参考了LeetCode上他人的解答，有如下收获：
1.可以利用HashSet，将J中的字符存入HashSet。
  hashset.add(E e)
  hashset.clear()
  hashset.remove(Object o)
  hashset.isEmpty()
  hashset.contains(Object o)
  hashset.size()
2.学到了for（char c:chars）这一函数的使用方法，在本题中可以利用String.toCharArray（）将字符串转化为char的集合
然后遍历字符c。