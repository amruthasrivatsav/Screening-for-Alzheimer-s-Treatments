#!/bin/bash
COUNTER=-1 
FileSuffix="_mol.config" 
PdbqtSuffix="_mol.pdbqt"
while [ $COUNTER -lt 646 ]; do
    echo The counter is $COUNTER
    let COUNTER=COUNTER+1 
    ConfigFile="$COUNTER$FileSuffix" 
    ~/Desktop/vina/bin/vina --config $ConfigFile
done