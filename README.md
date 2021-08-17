# JVM学习笔记


作者：[Grey](https://www.cnblogs.com/greyzeng)


## Java从编码到执行的过程


1. Java文件通过javac生成class文件，
1. class文件在执行java命令的时候，通过ClassLoader将其load到内存（同时还有相关的Java类库）
1. ClassLoader调用字节码的解释器或者即时编译器（JIT）来进行解释或者编译
1. 通过执行引擎开始执行。

![image.png](https://cdn.nlark.com/yuque/0/2020/png/757806/1608653212241-9a3a60ff-0cbb-4ade-a382-84dcdb7450c8.png#align=left&display=inline&height=535&margin=%5Bobject%20Object%5D&name=image.png&originHeight=535&originWidth=501&size=36580&status=done&style=none&width=501)

任何语言，只要能变成class文件，就可以在JVM上执行。


JVM是一种规范

当前（2020-12-20）最新的规范：

[https://docs.oracle.com/javase/specs/jvms/se15/jvms15.pdf](https://docs.oracle.com/javase/specs/jvms/se15/jvms15.pdf)


## Class File Format


通过IDEA的BinEd插件可以查看class文件，一般用16进制格式查看class文件
通过IDEA的jclasslib插件可以查看class解析后的信息，更为清晰


关注：
常量池里面的内容
Code中的指令
具体指令见虚拟机规范


JVM中的八大原子指令


- lock
- read
- load
- use
- assign
- write
- unlock



Writes and reads of volatile long and double values are always atomic.   ----jls15 17.7

## 自定义类加载器


