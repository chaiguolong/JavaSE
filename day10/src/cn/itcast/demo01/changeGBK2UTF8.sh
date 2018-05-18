#!/bin/bash

function gbk2utf(){
    file="$1"
    echo "婵犵數濮烽弫鍛婃叏閻戣棄鏋侀柛娑橈攻閸欏繐霉閸忓吋缍戦柛銊ュ块弻锝夊箻瀹曞洤鍝洪梺鍝勵儐閻楁鎹㈠☉銏犵闁绘劖顔栭弳锟犳⒑閸涘﹤鐏ョ紓宥咃工閻ｇ兘骞庨懞銉︽珳婵犮垼娉涢懟顖滅矈閿曞倹鈷戦柛娑橈工婵梺鍝勬噺缁诲嫬顕ｈ濮婄粯鎷呯憴鍕哗闂佺ǹ瀛╃划鎾崇暦閻旂厧鍨傛い鎰靛亝閿涘牓姊婚崒姘悂宕愰悜鑺ュ块柨鏇炲哥粻鏍煕椤愶絾绀缁炬儳鐏濋埞鎴︽偐瀹曞浂鏆￠梺鎶芥敱濡啴寮诲☉銏犲嵆闁靛ǹ鍎虫导鍥⒑ '$file' ..."
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
