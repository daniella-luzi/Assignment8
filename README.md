NOTE: if there are issues with the command line please follow these steps, and then it should work.
In the Git Bash terminal:
cd src
rm -f ../bin/*.class
javac -d ../bin FibonacciSequence.java
cd ../bin
java FibonacciSequence (enter a number here)
