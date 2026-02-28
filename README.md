# Nitzanim — Java exercises and sequence classes

Small Java project with exercise implementations and simple sequence classes.

## Contents
- `Main.java` — demo runner that exercises the exercises and sequence classes.
- `ex1/` — string utilities (ex1_1).
- `ex2/` — matrix exercises (ex2_1, ex2_2).
- `ex3/` — recursive exercises (ex3_1, ex3_2).
- `ex4/` — sequence classes: `Sequence`, `ArithmeticSequence`, `GeometricSequence`.

## Prerequisites
- Java JDK 17 or later installed and on `PATH`.

## Build (Windows PowerShell)
Create an output directory and compile all Java sources into it:

```powershell
mkdir -Force bin
javac -d bin ex1\*.java ex2\*.java ex3\*.java ex4\*.java Main.java
```

If you add new packages or files, include them in the `javac` command or use a recursive file list.

## Run
Run the demo `Main` class which prints simple tests and demos:

```powershell
java -cp bin Main
```

You can also run individual demos (they have `main` methods) by their fully-qualified class name. Examples:

```powershell
# Run ex2_2 (interactive)
java -cp bin ex2.ex2_2

# Run ex3_1 demo
java -cp bin ex3.ex3_1
```

## What the demos do
- `ex1.ex1_1.invertCase` — inverts letter case in a string.
- `ex2.ex2_1.isZeroSubmatrix` — checks whether a rectangular submatrix sums to zero.
- `ex2.ex2_2` — generates a random matrix and counts zero-sum submatrices.
- `ex3.ex3_1.minRecursive` — recursively finds minimum in an array.
- `ex3.ex3_2.recursiveSelectionSort` — recursive selection sort.
- `ex4.ArithmeticSequence`, `ex4.GeometricSequence` — sequence classes with `elements()`, `sum()`, `average()` and `toString()`.

## Notes
- Some classes are in packages (`ex1`, `ex2`, `ex3`, `ex4`); `Main.java` is in the default package and references them with their package-qualified names.
- If you use an IDE (Eclipse/VSCode), import the folder as a Java project instead of running the `javac` command manually.

If you'd like, I can compile and run the demos now and show the output.