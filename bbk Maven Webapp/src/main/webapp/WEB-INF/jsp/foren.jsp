<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
if(session.getAttribute("username")==null){
response.sendRedirect("/Hello");
}
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>wangEditor demo</title>
</head>
<body>
	<form action="ui" method="post">
	<input type="text" name="title">
	<textarea id="cont" rows="10" cols="100" hidden="hidden" name="cont"></textarea>>
    <div id="editor">
        
    </div>
    <input type="button" onclick="cc()">
</form>
    <!-- 注意， 只需要引用 JS，无需引用任何 CSS ！！！-->
    <script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
    <script type="text/javascript" src="html/wang/wa/wangEditor.min.js"></script>
    <script type="text/javascript">
        var E = window.wangEditor
        var editor = new E('#editor')
        // 或者 var editor = new E( document.getElementById('#editor') )
        editor.customConfig.uploadImgServer = 'uploads'
        editor.customConfig.uploadFileName = 'file'
        editor.customConfig.uploadImgParams = {
   		upfile: 'abcdef12345'   // 属性值会自动进行 encode ，此处无需 encode
   		}
   		editor.customConfig.uploadImgHooks = {
   		customInsert: function (insertImg, result, editor) {
        // 图片上传并返回结果，自定义插入图片的事件（而不是编辑器自动插入图片！！！）
        // insertImg 是插入图片的函数，editor 是编辑器对象，result 是服务器端返回的结果

        // 举例：假如上传图片成功后，服务器端返回的是 {url:'....'} 这种格式，即可这样插入图片：
        var url = result.url
        insertImg(url)

        // result 必须是一个 JSON 格式字符串！！！否则报错
    }
   		}
        //editor.customConfig.uploadImgShowBase64 = true
        
        editor.create()
        function cc(){
        $("#content").text(editor.txt.html());
        $("form").submit(); 
         
        }
    </script>
</body>
</html>