#!/bin/bash
COUNTER=-1 FileSuffix="_mol.config" PdbqtSuffix="_mol.pdbqt"
while [ $COUNTER -lt 647 ]; do
    echo The counter is $COUNTER
    let COUNTER=COUNTER+1 ConfigFile="../pdbqt/$COUNTER$FileSuffix"
    echo "receptor=5OQVMIN.pdbqt" >> $ConfigFile
    echo "ligand=$COUNTER$PdbqtSuffix" >> $ConfigFile echo "size_x=30" >> $ConfigFile
    echo "size_y=30" >> $ConfigFile
    echo "size_z=30" >> $ConfigFile
    echo "center_x=41.079" >> $ConfigFile
    echo "center_y=70.436" >> $ConfigFile
    echo "center_z=50.353" >> $ConfigFile
done