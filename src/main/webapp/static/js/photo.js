

function openMask(){
    $(".mask").css("display",'block');
}

function closeMask(){
    $(".mask").css("display",'none');
}

function showImage(path){
    var content="<img src='/"+path+"'/>"
    $(".mask .maskContent .neirong").html(content)
    openMask();
}