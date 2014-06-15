MetaAndroid
=============
code generator for android.Designs your application and get the code.




Description:
=============
In this example we have a metamodel of a App Android. A model created for a library based on it.From this model we will generate a  native android app.

Dependencies:
=============
In eclipse :EMF,XPAND

Folders: 
=============


  --1)AndroidGenerator:
  - Project to create models and apply transformations(Model -> Code). In this project: 
  - the folder src-gen contains the code generated. 

  - the folder src contains : a copy of metamodel (.ecore), my model based on metamodel, the files that includes                                        transformation-rules and workflow.mwe is the engine(you must run it).
    

--2)Plugins:
 - These plugins must be installed in Eclipse(Folder dropins>plugins>XXXXX.jar) .We will generate them exporting the
  following projects.

--3)AndroidMetamodel:
- Project EMF that contains the metamodel. 

--4,5,6)AndroidMetamodel{diagram,edit,editor}: 
 - projects necessary to create models ( will be created automatically by
                                          generatormodel). 


Enjoy!
