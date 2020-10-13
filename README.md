# CC5114-1_Curimil_Molina
This project uses the [SimpleMatrix](http://ejml.org/javadoc/org/ejml/simple/SimpleMatrix.html) library.

Follow these steps to install it in IntelliJ:

* Go to the Project Structure settings in the File tab:

![Project Structure](media/projectStruct.png)

* In the Project Structure settings go to the Libraries tab, click the + icon and click "From Maven...":

![Libraries](media/libraries.png)

* In the "Download Library from Maven Repository" window write "org.ejml:ejml-all:0.39" and click the magnifying glass icon, then click "org.ejml:ejml-all:0.39" in the dropdown menu and hit ok. 

![Maven](media/maven.png)

After these steps the library should be ready to be used.

To see the cost curve and the confusion matrix, execute the FXLoss class.