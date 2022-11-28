# Screening-for-Alzheimer-s-Treatments
Code used to run an computational high throughput molecular docking to identify 3 potential Alzheimer's Disease Treatments

This folder contains the code I used in a research project I designed and conducted independently in 2021-2022.

This work used molecular docking to screen a library of a mass set of FDA approved drugs to identify ones that could potentially slow the progression of Alzheimer's disease, specifically by binding with certain regions of two main proteins involved. Generally, molecular docking studies are done with 1 target and 1 drug. In order to screen a mass set, I wrote the scripts in this folder. More information about the project itself can be found on the research paper:

This folder contains scripts in Java and Bash to: 1) Parse the drug library into individual files 2) Convert each drug file into the proper format (with hydrogen atoms and charges added in appropriate areas using OpenBabel commands) 3) Generate configuration files for each protein-drug complex with the binding site of the amyloid beta protein (first protein) 4)  Generate configuration files for each protein-drug complex with the binding site of the tau protein (first protein) 5) Run docking for each configuration (using AutoDock Vina commands)

*If using these scripts, please make sure to change the folder/file names to match those on your computer.
