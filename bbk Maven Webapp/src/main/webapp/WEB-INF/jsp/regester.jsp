<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String name="";
String password="";
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html><html><head>
   <title>Bootstrap 实例 - 水平表单</title>
   
 </script>  
   <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css">
   <script src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.min.js"></script>
   <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script></head><body>
   
   
                <h3 contenteditable="true" class="text-center">Regester</h3>
              
   
   <form class="form-horizontal" role="form" action="ss" method="post" name="myform">
   <div class="form-group">
      <label for="firstname" class="col-sm-2 control-label">Name</label>
      <div class="col-sm-10">
         <input type="text" class="form-control" id="firstname"  name="name"
            placeholder="name">
      </div>
   </div>
   <div class="form-group">
      <label for="lastname" class="col-sm-2 control-label">Password</label>
      <div class="col-sm-10">
         <input type="password" class="form-control" id="lastname" name="password" 
            placeholder="password">
      </div>
   </div>
 
   <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default" >注册</button>
         
      </div>
   </div></form>

</body></html>