#!/bin/bash

function gbk2utf(){
    file="$1"
    echo "濠电姷鏁告慨鐑藉极閸涘﹥鍙忓ù鍏兼綑閸ㄥ倿鏌ｉ幘宕囧哺闁哄鐗楃换娑㈠箣閻愭鏆￠梺鍛婂灥缂嶅﹤鐣烽幎鑺ユ櫜濠㈣泛鑻粊锕傛⒑閸涘﹤濮闁哄懏绻勫褔姊绘担瑙勫仩闁稿孩绮撳畷鐔煎垂椤愵偅锛堥梻鍌氬搁崐鐑芥倿閿曞倸绠栭柛顐ｆ礀绾惧灝鈹戦悩宕囶暡闁抽攱妫冮弻娑㈠即閵娿儳浼囬梺 '$file' ..."
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
