# DDR_PROJECT
DDR project
This project is about the implementation of prg (post/redirect/get) design pattern.
I'll try to implement this design pattern in java langauge.
It is a project of course ddr taught by sir Rahim Hasnani

I just create a form in jsp and use java spring boot to for designing and understanding PRG pattern.

I try to overcome the issue of double post or double click on registeration form.

So for setup, i did following steps.

installed eclipse latest
installed spring suite tool in eclipse version 4
create a spring starter project.
give project name 
and installed the following dependencies
=>spring web, Lombok 
and the project gets created..

we add dependency (tomacat-embed-jasper) to pom.xml which is use to compile our jsp files.
we created two packages in main java file : model and controller

then we create a class User in model and UserController in Controller.
 

then we create a folder views in web folder of main
and in views we create a jsp file named createUserAcc
and import taglib library in file. 
and create form with details mentioned in user model 

then configure applicationproperties in resources folder set suffix, prefix, and context path.
