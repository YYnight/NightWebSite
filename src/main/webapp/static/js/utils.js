function wordLimit(cname,wordLength){
    var tags = $(cname);
    console.log(tags)
    for(var i = 0;i<tags.length;i++){
        var length = tags[i].innerText.length;
        console.log(length)
        if(length>wordLength){
            console.log(tags[i].innerText.substr(0,wordLength)+"...")
            tags[i].innerText=tags[i].innerText.substr(0,wordLength)+"...";
            console.log(tags[i].innerHTML)
        }
    }
}