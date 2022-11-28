#!/bin/bash
echo "Conversion process started" counter=0
for f in ../sdfs/*.sdf
#for f in ../test/*.sdf
do
    counter=$[$counter +1]
    echo "Processing $f file..."
    file=${f##*/}
    echo $file
    #filename='echo "$f" | cut -d'/' -f2 | cut -d'.' -f1' filename="$(basename $f .sdf)"
    echo $filename
    # outfile="../pdbqt/$file"_pdbqt
    outfilePDB="../pdb/$filename.pdb"
    outfilePDBQT="../pdbqt/$filename.pdbqt"
    echo $outfile
    #mv "$f" ../pdbqt/"$file"_pdbqt
    # /usr/local/bin/babel -isdf '/Users/MyComputer/Desktop/5_molcopy.sdf' -opdb
    '/Users/MyComputer/Desktop/output3d.pdb' --gen3D
    babel -isdf "$f" -opdb "$outfilePDB" --gen3D
    #/usr/local/bin/babel -ipdb '/Users/MyComputer/Desktop/output3d.pdb' -opdbqt -r
    '/Users/MyComputer/Desktop/outputTEST5.pdbqt'
    babel -ipdb "$outfilePDB" -opdbqt -r "$outfilePDBQT"
    done
    echo "total number of files processed: $counter" echo "Conversion process completed..."