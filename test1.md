## 定期テスト対策

### 正規表現

reprece.ALL  
置き換え


```java
replaceAll("[at]", "!");
// at > !

replaceAll("[^at]", “#");
// at 以外 #

replaceAll("a.", "AB");
// aとaに続く文字

replaceAll("\\d", "%");
// 数字１文字を

replaceAll("\\D", "%");
// 大文字は否定

replaceAll("\\s", "/");
// 数字ひともじ

``
```