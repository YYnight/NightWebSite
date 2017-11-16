function checkForm(){
    var username = $("#username").val();
    var password = $("#password").val();
    if(username == null || username == ""){
        $(".error_message").html("用户名不能为空！");
        return false;
    }
    if(password == null || password == ""){
        $(".error_message").html("密码不能为空！");
        return false;
    }
    return true;
}