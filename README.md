Magrathea 2.0
=============

This is a solution to the code-golf problem (Magrathea 2.0)[http://codegolf.stackexchange.com/questions/22192/magrathea-2-0-building-mountains]. Feel free to fork and improve.

A few usage notes:

**Input**

The input should follow this format (from code-golf problem):

A string of dots and digits providing the basis for the mountain chain. Each string is exactly as long as necessary to support the mountains and each peak is given by a digit instead of a dot, indicating the height of the peak.

Example:
..3..2.

**Output**

An ascii version of the mountain chain.

* Each digit in the input represents exactly one peak (^) at exactly the height indicated by the digit (i.e. 9 is the highest height).
* There must not be additional peaks in the output (i.e. at places where there is a dot in the input).
* Mountains are of triangular shape, i.e. slopes are created using / and \ characters.
* Passes where two mountains overlap are shaped using the character v.

There are a few other requirements in the code-golf problem, that I follow but contribute nothing to understanding.

**Execution**

You use any of the `.java` files in this repository. `Magrathea.java` is standalone, and can be run without any additional inputs. It was my testing harness for development and min-ification. `Magrathea2.java` is a human-readable form of the final submission. Execute it by passing in a valid input sequence as described in the input section. Finally, `M.java` is the code-golf min-ified version of the code. Execute it the same as `Magrathea2.java` by passing it a valid input sequence.

**Closing notes**

This solution weighs in at 407 characters. I'm sure I could do better with some more thought, but this was a lark and I'm pretty pleased with what I was able to do.
