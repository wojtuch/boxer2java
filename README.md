boxer2java
==========

This repository contains a class hierarchy that corresponds to `xdrs.dtd` file from `src/data/boxer` directory.

It allows to quickly deserialize the annotated XML Boxer output to a Java object.

Prerequisites are maven (for resolving the [XML parser dependency](http://simple.sourceforge.net)) and built and working [C&C Tools](http://svn.ask.it.usyd.edu.au/trac/candc/) (for the output).
After modifying the properties file and specifying the paths to the CCG Parser, Boxer and the models, you can call the C&C Tools from within your program and play with the output by yourself (see `Examples.java`).
