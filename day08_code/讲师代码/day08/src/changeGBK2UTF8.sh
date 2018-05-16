#!/bin/bash

function gbk2utf(){
    file="$1"
    echo "濠电姷鏁告慨浼村垂閻撳簶鏋栨繛鎴炵閸戝綊宕抽敐澶屽祦闁告劏鏅濈弧闂佹悶鍎滈崟鍨棨闂傚倷鐒﹂幃鍫曞磿婵犳碍鈷旈柛鏇ㄥ灱閺 '$file' ..."
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
