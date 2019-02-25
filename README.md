

参考：

[Android 实现ListView的A-Z字母排序和过滤搜索功能，实现汉字转成拼音
](https://github.com/leerduo/SortListView)

[listview-联系人列表](https://blog.csdn.net/sinat_31057219/article/details/54379291)

# 汉字转拼音

### CharacterParser类

使用ASCII码和拼音的映射

优点：零依赖，只有一个Class，使用简单

缺点：只支持常见的一级汉字，对于一些汉字（比如嫦娥）则无法正确获取拼音

### pinyin4j

优点：使用简单，实用性好

缺点：需要依赖第三方jar包


### TinyPinyin

https://github.com/promeG/TinyPinyin

适用于Java和Android的快速、低内存占用的汉字转拼音库。

生成的拼音不包含声调，均为大写；

支持自定义词典，支持简体中文、繁体中文；

执行效率很高(Pinyin4J的4~16倍)；

很低的内存占用（不添加词典时小于30KB）。





