#!/bin/bash

function gbk2utf(){
    file="$1"
    echo "婵犮垼娉涚氼噣骞冩繝鍥ф闁搞儻闄勯 '$file' ..."
    iconv -f gb18030 -t UTF-8 -c "$file" > tmp
    mv -f tmp "$file"
}

function getdir(){
    for element in `ls $1`
    do
        dir_or_file=$1"/"$element
        echo $dir_or_file
        if [ -d $dir_or_file ]
        then
            getdir $dir_or_file
        else
            gbk2utf $dir_or_file
        fi
    done
}
getdir $1
