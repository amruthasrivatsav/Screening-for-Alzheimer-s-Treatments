#!/bin/bash
COUNTER=-1 FileSuffix="_mol.config" PdbqtSuffix="_mol.pdbqt"
while [ $COUNTER -lt 647 ]; do
    echo The counter is $COUNTER
    let COUNTER=COUNTER+1 ConfigFile="../pdbqt/$COUNTER$FileSuffix"
    echo "receptor=6VHLMIN.pdbqt" >> $ConfigFile
    echo "ligand=$COUNTER$PdbqtSuffix" >> $ConfigFile echo "size_x=30" >> $ConfigFile
    echo "size_y=30" >> $ConfigFile
    echo "size_z=30" >> $ConfigFile
    echo "center_x=198.098" >> $ConfigFile
    echo "center_y=135.258" >> $ConfigFile
    echo "center_z=135.924" >> $ConfigFile
done