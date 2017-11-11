/**
 * 根据log的id查寻log（查看详细内容）
 * @param id
 */
function findLogById(id){
    $.ajax({
        type: 'get',
        url: '/log/findLogById?id='+id,
        contentType: 'application/x-www-form-urlencoded; charset=utf-8',
        dataType: 'json',
        success: function (data) {
            console.log(data);
            var content = "<div class='logContent'><div class='header'><h2 class='hd'>"+data.title+"</h2><div class='bshare-custom icon-medium'><a title='分享到QQ空间' class='bshare-qzone'></a><a title='分享到新浪微博' class='bshare-sinaminiblog'></a><a title='分享到人人网' class='bshare-renren'></a><a title='分享到腾讯微博' class='bshare-qqmb'></a><a title='分享到网易微博' class='bshare-neteasemb'></a><a title='更多平台' class='bshare-more bshare-more-icon more-style-addthis'></a><span class='BSHARE_COUNT bshare-share-count'>0</span></div><script type='text/javascript' charset='utf-8' src='http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh'></script><script type='text/javascript' charset='utf-8' src='http://static.bshare.cn/b/bshareC0.js'></script></div>"+data.content+"</div>"
            //var obj = $.parseJSON(data);
            content+="<div class='log_lastAndNext'><p>上一篇：</p><p>下一篇</p></div>"
            $('#logContent').html(content)
        },
        error: function (error) {
            alert('error=' + error);
        }
    });
}

function findLogsByLogTypeId(id){
    var url="";
    if(id){
        url = '/log/findLogsByLogTypeId?ltid='+id
    }else{
        url = '/log/findAll'
    }
    $.get(url,function(data,status){
        if(status=='success'){
            //data = $.parseJSON(data)
            console.log(data)
            var htmlcontent = "<ul class=\"list-unstyled\">";
            for(var i = 0;i<data.length;i++){
                htmlcontent+="<li>\n" +
                    "                            <div class=\"bor2 mod_article\">\n" +
                    "                                <div class=\"hd\"><h4><a href=\"javascript:void(0);\" onclick=\"findLogById("+data[i].id+")\">"+data[i].title+"</a></h4></div>\n" +
                    "                                <div class=\"bd\">\n" +
                    "                                    <div class=\"txt_detail_info\">\n" +
                    "                                        "+data[i].summary+"\n" +
                    "                                    </div>\n" +
                    "                                </div>\n" +
                    "                                <div class=\"ft\">\n" +
                    "                                    <span class=\"c_tx3 pub_time\">2011-12-10</span>\n" +
                    "                                    <span>阅读(<span>"+data[i].readedNum+"</span>)</span>\n" +
                    "                                    <span class=\"c_tx3\">评论("+data[i].commentNum+")</span>\n" +
                    "                                </div>\n" +
                    "                            </div>\n" +
                    "                        </li>"
            }
            htmlcontent+="</ul>"
            $("#logContent").html(htmlcontent)
        }
    })
    /*$.ajax({
        type: 'get',
        url: '/log/findLogsByLogTypeId?ltid=' + id,
        contentType: 'application/x-www-form-urlencoded; charset=utf-8',
        dataType: 'json',
        success: function (data) {
            console.log(data);
        }
    });*/
}

/**
 * 根据关键字查询log
 */
function searchByKeyword(){
    var keyWord = $("#keyWord").val();
    console.log(keyWord);
    if(keyWord){
        $.get("/log/search?keyWord="+keyWord,function (data,status) {
            if(status == "success"){
                var htmlcontent = "<ul class=\"list-unstyled\">";
                for(var i = 0;i<data.length;i++){
                    htmlcontent+="<li>\n" +
                        "                            <div class=\"bor2 mod_article\">\n" +
                        "                                <div class=\"hd\"><h4><a href=\"javascript:void(0);\" onclick=\"findLogById("+data[i].id+")\">"+data[i].title+"</a></h4></div>\n" +
                        "                                <div class=\"bd\">\n" +
                        "                                    <div class=\"txt_detail_info\">\n" +
                        "                                        "+data[i].summary+"\n" +
                        "                                    </div>\n" +
                        "                                </div>\n" +
                        "                                <div class=\"ft\">\n" +
                        "                                    <span class=\"c_tx3 pub_time\">2011-12-10</span>\n" +
                        "                                    <span>阅读(<span>"+data[i].readedNum+"</span>)</span>\n" +
                        "                                    <span class=\"c_tx3\">评论("+data[i].commentNum+")</span>\n" +
                        "                                </div>\n" +
                        "                            </div>\n" +
                        "                        </li>"
                }
                htmlcontent+="</ul>"
                $("#logContent").html(htmlcontent)
            }
        })
    }
}