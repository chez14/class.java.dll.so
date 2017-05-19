# Loading DLL/SO to Java.
Actually, really didn't recommend this, but a friend of my friend ask me about it, so i make him this repo.

So this will be a little refrence for me to do such a thing, maybe soon.

## Why is this really need to exists?
Well, sometimes i found so many libs on dll that can be used, instead of
translating those shits into a even more shitty things. So here's a case when
you'll consider this technique as a choice.

## Main Idea
Compile the C on the respected machine, then include it from java, then enjoy the fun.

## C++ Required configuration
`g++` no `-c` please, and please add the `-shared` one. Here's full parameter:

```shell
$ g++ -fPIC main.cpp -shared -o mylib.so
```